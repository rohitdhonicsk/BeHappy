package com.mycompany.behappy;

import java.io.*;
import java.util.*;
import javax.swing.JFileChooser;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author SAURABH KUMAR
 */
public class RManager {

    private ArrayList<MotivationalStory> MS;
    private ArrayList<MotivationalQuote> MQ;
    private ArrayList<SoothingMusic> MSG;
    JFileChooser fileChooser;
    FileInputStream fileInputStream;
    BufferedInputStream bufferedInputStream;
    File myFile = null;
    String filename;
    String filePath;
    long totalLength;
    long pause;
    Player player;
    Thread playThread;
    Thread resumeThread;

    public RManager() {
        init();
    }

    public void init() {
        MS = new ArrayList<>();
        MQ = new ArrayList<>();
        MSG = new ArrayList<>();
        String line = "";
        String splitBy = ",";
        try {
            BufferedReader br = new BufferedReader(new FileReader("MotivationalStory.csv"));
            line = br.readLine();
            int count = 0;
            while ((line = br.readLine()) != null) //returns a Boolean value  
            {
                String[] Info = line.split(splitBy);
                MotivationalStory ms = new MotivationalStory();
                ms.setStoryTitle(Info[2]);
                ms.setWriterName(Info[1]);
                StringBuilder tmp = new StringBuilder(Info[3]);
                for (int i = 0; i < tmp.length(); i++) {
                    if (tmp.charAt(i) == ';') {
                        tmp.setCharAt(i, ',');
                    }
                }
                ms.setShortDes(tmp.toString());
                String tmp2 = Info[4];
                for (int i = 5; i < Info.length; i++) {
                    tmp2 += ("," + Info[i]);
                }
                ms.setStory(tmp2);
                MS.add(ms);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        line = null;
        try {
            BufferedReader br = new BufferedReader(new FileReader("MotivationalQuote.csv"));
            line = br.readLine();
            int count = 0;
            while ((line = br.readLine()) != null) //returns a Boolean value  
            {
                String[] Info = line.split(splitBy);
                MotivationalQuote mq = new MotivationalQuote();
                String tmp2 = Info[1];
                for (int i = 2; i < Info.length - 1; i++) {
                    tmp2 += ("," + Info[i]);
                }
                mq.setQuote(tmp2);
                mq.setAuthorName(Info[Info.length - 1]);
                MQ.add(mq);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        line = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("MotivationalSong.csv"));
            line = br.readLine();
            int count = 0;
            while ((line = br.readLine()) != null) //returns a Boolean value  
            {
                String[] Info = line.split(splitBy);
                SoothingMusic msg = new SoothingMusic();
                msg.setMusicName(Info[1]);
                msg.setComposer(Info[2]);
                msg.setDuration(Info[3]);
                MSG.add(msg);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList getListOfStories() {
        return MS;
    }

    public ArrayList getListOfQuotes() {
        return MQ;
    }

    public ArrayList getListOfMusic() {
        return MSG;
    }

    public ArrayList getSearchedStory(String title) {
        ArrayList<MotivationalStory> temp = new ArrayList<>();
        for (int i = 0; i < MS.size(); i++) {
            if ((MS.get(i).getStoryTitle().toLowerCase().contains(title.toLowerCase())) || (MS.get(i).getWriterName().toLowerCase().contains(title.toLowerCase()))) {
                temp.add(MS.get(i));
            }
        }
        return temp;
    }

    public ArrayList getSearchedQuote(String title) {
        ArrayList<MotivationalQuote> temp = new ArrayList<>();
        for (int i = 0; i < MQ.size(); i++) {
            if ((MQ.get(i).getQuote().toLowerCase().contains(title.toLowerCase())) || (MQ.get(i).getAuthorName().toLowerCase().contains(title.toLowerCase()))) {
                temp.add(MQ.get(i));
            }
        }
        return temp;
    }

    public ArrayList getSearchedMusic(String title) {
        ArrayList<SoothingMusic> temp = new ArrayList<>();
        for (int i = 0; i < MSG.size(); i++) {
            if ((MSG.get(i).getMusicName().toLowerCase().contains(title.toLowerCase())) || (MSG.get(i).getComposer().toLowerCase().contains(title.toLowerCase()))) {
                temp.add(MSG.get(i));
            }
        }
        return temp;
    }

    public MotivationalStory getSelectedStory(String title) {
        for (int i = 0; i < MS.size(); i++) {
            if (MS.get(i).getStoryTitle().equals(title)) {
                return MS.get(i);
            }
        }
        return null;
    }

    public SoothingMusic getSelectedMusic(String title) {
        for (int i = 0; i < MSG.size(); i++) {
            if (MSG.get(i).getMusicName().equals(title)) {
                return MSG.get(i);
            }
        }
        return null;
    }

    public void startPlayingMusic(String title) {
        fileChooser = new JFileChooser();
        fileChooser.setSelectedFile(new File(title + ".mp3"));
        myFile = fileChooser.getSelectedFile();
        filename = fileChooser.getSelectedFile().getName();
        filePath = fileChooser.getSelectedFile().getPath();
        if (player != null) {
            player.close();
            playThread.interrupt();
            resumeThread.interrupt();
        }
        playThread = new Thread(runnablePlay);
        resumeThread = new Thread(runnableResume);
        playThread.start();
    }

    public void pauseMusic() {
        if (player != null) {
            try {
                pause = fileInputStream.available();
                player.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }

    public void resumeMusic() {
        if (player != null) {
            resumeThread = new Thread(runnableResume);
            resumeThread.start();
        }
    }

    public void stopMusic() {
        if (player != null) {
            player.close();
        }
    }
    Runnable runnablePlay = new Runnable() {
        @Override
        public void run() {
            try {
                //code for play button
                fileInputStream = new FileInputStream(myFile);
                bufferedInputStream = new BufferedInputStream(fileInputStream);
                player = new Player(bufferedInputStream);
                totalLength = fileInputStream.available();
                player.play();//starting music
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (JavaLayerException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    };

    Runnable runnableResume = new Runnable() {
        @Override
        public void run() {
            try {
                //code for resume button

                fileInputStream = new FileInputStream(myFile);
                bufferedInputStream = new BufferedInputStream(fileInputStream);
                player = new Player(bufferedInputStream);
                fileInputStream.skip(totalLength - pause);
                player.play();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (JavaLayerException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    };

}
