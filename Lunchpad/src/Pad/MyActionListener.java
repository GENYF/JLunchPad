package Pad;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListener extends MySound implements ActionListener{
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("����")) {
			RemoveSound();
		}
		if(e.getActionCommand().equals("����")) {
			PrintSound();
			
			for(int i = 0; i < SoundList.size(); i++){
				playMusic(SoundList.get(i));
			}
		}
		if(e.getActionCommand().equals("����")) {
			System.exit(0);
		}
		
		if(e.getActionCommand().equals("����") != true && e.getActionCommand().equals("����") != true && e.getActionCommand().equals("����") != true){
			SaveSound(e.getActionCommand());
			playMusic(e.getActionCommand());
		}
	}
}
