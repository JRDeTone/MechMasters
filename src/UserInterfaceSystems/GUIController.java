package UserInterfaceSystems;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIController {
	
	private LauncherWindow launcherWindow;
	private boolean idleState = true;
//	private LaunchListener launchlistener = new LaunchListener();
//	private CreateCharacterListener createCharacterListener;
	
	public GUIController(LauncherWindow inputLauncherWindow) {
		this.launcherWindow = inputLauncherWindow;
		this.launcherWindow.addLaunchButtonListener(new LaunchListener());
		
		while(this.idleState) {
			try {
				if(launcherWindow.getIsCharacterCreation() == false) {
					Thread.sleep(2000);
				}
				else {
					System.out.println("Exit Idle");
					break;
				}
			} 
			catch (InterruptedException idleError) {
			}
		}
		
		this.launcherWindow.addCreateCharacterButtonListener(new CreateCharacterListener());
	}
	
	class LaunchListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("button click");
			launcherWindow.setJPanel(CharacterCreationPanel.characterCreationPanel());
			System.out.println("panel was made");
			launcherWindow.setFrameTransition();
			launcherWindow.setIsGameSetup();
		}	
	}
	
	class CreateCharacterListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println(launcherWindow.getCharacterNameField());
		}	
	}

}
