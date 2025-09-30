import java.util.Scanner;
	public class NokiaTwo{
		public static void main(String [] args){
			Scanner input = new Scanner(System.in);
			int menuinput = 100;
			
			while(menuinput != 0 ){
			String prompt ="""
				WELCOME TO NOKIA
				LIST OF MENU FUNCTIONS
				1-> Phonebook
				2-> Messages
				3-> Chat
				4-> Call register
				5-> Tones
				6-> Settings
				7-> Call divert
				8-> Games
				9-> Calculator
				10-> Reminders
				11-> Clock
				12-> Profiles
				13-> Sim services 
				0-> Exit
				
				ENTER A NUMBER:
			""";

			System.out.println(prompt);
			 menuinput = input.nextInt();
			switch(menuinput){
				case 1->{ 
				int phonebookinput = 100;
				while (phonebookinput != 0){ 
					String phonebook ="""
						PHONEBOOK


						1-> Search
						2-> Service Nos
						3-> Add name
						4-> Erase
						5-> Edit
						6-> Assign tone
						7-> send b'card
						8-> Options
						9-> Speed dials
						10-> Voice tags
						0-> back
						ENTER A NUMBER:



					""";
					System.out.print(phonebook);
					phonebookinput = input.nextInt();
					switch(phonebookinput){
						case 1->System.out.println("Search");
						case 0-> System.out.println ("Goodbye from phonebook");
						case 2->System.out.println("service nos");
						case 3->System.out.println("Add name");			
						case 4->System.out.println("Erase");
						case 5->System.out.println("Edit");
						case 6->System.out.println("Assign tone");
						case 7->System.out.println("send b'card");			
						case 8->{
							int optioninput = 100;
							while(optioninput != 0){
							String option ="""
										OPTIONS
										1-> Type of view
										2-> Memory status
										0-> back
										ENTER A NUMBER:

										""";
										System.out.print(option);
										optioninput = input.nextInt();
										
										switch(optioninput){
											case 1->System.out.println("Type of view");
											case 2->System.out.println("Memory status");
											case 0->System.out.println("goodbye from options");
											default->System.out.println("enter a valid number");
											
										}
										}
						}
				
						case 9->System.out.println("Speed dials");
						case 10->System.out.println("Voice tags");
						default->System.out.println("enter a valid number");
					}
				}
				}
				case 2->{ 
					int messagesinput = 100;
					while(messagesinput != 0){


					String messages="""



					MESSAGES
					1->Write messages
					2->inbox
					3->Outbox
					4->Picture messages
					5->Templates
					6->Smileys
					7->Messages settings
					8->info Service
					9->Voice mailbox number
					10->Service command editor
					0-> back
					""";
					System.out.print(messages);
					messagesinput = input.nextInt();
					switch(messagesinput){
						case 1->System.out.println("Write messages");
						case 2->System.out.println("inbox");
						case 3->System.out.println("outbox");			
						case 4->System.out.println("picture messages");
						case 5->System.out.println("templates");
						case 6->System.out.println("smileys");
						case 0->System.out.println("goodbye from messaeges");
						case 7->{int messageinput= 100;
							while(messageinput != 0){
							String messagessettings ="""

								MESSAGES SETTINGS

								1-> Set
								2-> common
								0-> back
								ENTER A NUMBER:
	
							""";
							System.out.print(messagessettings);
							messageinput = input.nextInt();
							switch(messageinput){
								case 1->{ int setinput = 100;
									  while(setinput != 0){

									 String set = """
										SET
										
										1->Message centre number
										2->Message sent as
										3->Message validity
										0-> back
										ENTER A NUMBER:
										""";
									System.out.print(set);
									setinput = input.nextInt();
									switch(setinput){
										case 1->System.out.println("Messages centre number");
										case 2->System.out.println("Messages sent as");
										case 3->System.out.println("Messages Validity");
										case 0->System.out.println("goodbye from set");
										default->System.out.println("enter a valid number");
									}
									}
								}
							
								case 2->{int commoninput = 100;
									while(commoninput != 0){

									
									String common = """
										COMMMON
										
										1->Delivery reports
										2->Reply via same centre
										3->Character support
										0->back
										ENTER A NUMBER :
										""";
									System.out.print(common);
									commoninput = input.nextInt();
									switch(commoninput){
										case 1->System.out.println("Delivery reports");
										case 2->System.out.println("Reply via same centre");
										case 3->System.out.println("Character support");
										case 0->System.out.println("goodbye to cmmon"); 
										default->System.out.println("enter a valid number");

									}
								}}
							}	}
						}

						case 8->System.out.println("info service");
						case 9->System.out.println("Voice mailbox number");
						case 10->System.out.println("service command editor");
						default->System.out.println("enter a valid number");
						}	
					}
					


				}

				case 3->System.out.print("Chat");
				case 4->{ int callinput = 100;
					while(callinput != 0){


					String call =		"""

					CALL REGISTER

					1-> missed calls
					2->Received calls
					3->Dialled numbers
					4->Erase recent call lists
					5->show call duration
					6-> show call cost
					7-> call cost settings
					8-> prepaid credit

					""";
					System.out.print(call);
					callinput = input.nextInt();
					switch(callinput){
						case 1->System.out.println("Missed calls");
						case 2->System.out.println("Rececieved calls");
						case 3->System.out.println("Dialled numbers");		
						case 4->System.out.println("Erase recent call lists");
						case 5->{int showcallinput = 100;
							while(showcallinput != 0){

							String showcall = """
								SHOW CALL DURATION
								1->last call duration
								2->all call's duration
								3->Received calls duration
								4->Dialled calls duration
								5->call timers
				
								ENTER A NUMBER: 
						
							""";
							System.out.print(showcall);
							showcallinput = input.nextInt();
							switch(showcallinput){
							case 1->System.out.println("last call duration");
							case 2->System.out.println("all calls calls");
							case 3->System.out.println("Receievd calls numbers");
							case 4->System.out.println("Dialed call duration");
							case 5->System.out.println("Clear timers");
							default->System.out.println("enter a valid number");
							}}
						}		
						case 6->{ int callcostinput = 100;
							while(callcostinput != 0){
							String callcost="""
								SHOW CALL COST
								1->last call cost
								2->all call's cost
								3->clear counters
								0-> back
								ENTER A NUMBER:
								""";
							System.out.print(callcost);
							callcostinput = input.nextInt();
							switch(callcostinput){
							case 1->System.out.println("last call cost");
							case 2->System.out.println("all calls cost");
							case 3->System.out.println("clear counters");
							case 0->System.out.println("");
							default->System.out.println("enter a valid number");	
							}
							}

						}
						case 7->{ int costsettingsinput = 100;
							while(costsettingsinput != 0){

								String costsettings="""
								CALL COST SETTINGS
								1->call cost limit
								2->show costs in
								0-> back
								ENTER A NUMBER:
							""";
								System.out.print(costsettings);
								costsettingsinput = input.nextInt();
								switch(costsettingsinput){
								case 1->System.out.println("call cost limit");
								case 2->System.out.println("show costs in");
								case 0 ->System.out.println("");
								default->System.out.println("enter a valid number");
								}
							}
						}
						case 8->System.out.println("Prepaid credit");
						default->System.out.println("enter a valid number");
						}
					}

				}
				case 5->{int tonesinput = 100;
					while(tonesinput != 0){



						String tones ="""
						TONES
						1->Ringing tone
						2->Ringinf=g volume
						3->incoming call alert
						4->composer
						5->Message alert tone
						6->Keypad tones
						7-> Warning and game tones
						8->Vibrating alert
						9->screen saver
						0-> back
						ENTER A NUMBER:
					""";
					System.out.print(tones);
					tonesinput= input.nextInt();
					switch(tonesinput){
						case 1->System.out.println("Ringing tone");
						case 2->System.out.println("Ringing volume");
						case 3->System.out.println("incoming call alert");
						case 4->System.out.println("composer");
						case 5->System.out.println("Message alert tone");
						case 6->System.out.println("Keypad tones");
						case 7->System.out.println("Warning and game tones");
						case 8->System.out.println("Vibrating alert");
						case 9->System.out.println("screen saver");
						case 0->System.out.println("");
						default->System.out.println("enter a valid number");

					} 
					}

				}
				case 6->{ int settingsinput = 100;
					while(settingsinput != 0){
						String settings = """
						SETTINGS
						1->Call ssettings
						2->security settings
						3->phone settings
						4->Restore factory settings
						0-> back
						ENTER A NUMBER: 
					""";
					

						System.out.print(settings);
						settingsinput= input.nextInt();
						switch(settingsinput){
							case 1->{int callinput = 100;
								while(callinput != 0){
								String callsettings = """
									CALL SETTINGS
									1->Automatic redial
									2->Speed dialling
									3->Call waiting options
									4->Own number sending
									5->phone line in use
									6-> Automatic answer
									0-> back

									ENTER A NUMBER:
								""";
								System.out.print(callsettings);
								callinput = input.nextInt();
								switch(callinput){
									case 1->System.out.println("Automatic redial");
									case 2->System.out.println("Speed dailling");
									case 3->System.out.println("Call waiting options");
									case 4->System.out.println("Own number sending");
									case 5->System.out.println("Phone line in use");
									case 6->System.out.println("Automatic answer");
									case 0->System.out.println("");
									default->System.out.println("enter a valid number");

								}
								}
								}
							
							case 2->{int phoneinput = 100;
								while(phoneinput != 0){
									String phonesettings = """
									PHONE SETTINGS
									1->language
									2->cell info display
									3->welcome note
									4->network selection
									5->lights
									6->confirm sim service actions
									0-> back
									ENTER A NUMBER:
									""";

								System.out.print(phonesettings);
								phoneinput = input.nextInt();
								switch(phoneinput){
									case 1->System.out.println("language");
									case 2->System.out.println("cell info display");
									case 3->System.out.println("welcome note");
									case 4->System.out.println("Network selection");
									case 5->System.out.println("lights");
									case 6->System.out.println("Confirm SIM service actions");
									case 0->System.out.println("Confirm SIM service actions");
									default->System.out.println("enter a valid number");
								
	
								}

								}
							}
							case 3->{int Securityinput = 100;
								while(Securityinput != 0){



									String Securitysettings = """
									PHONE SEETINGS
									1->PIN code request
									2->Call barring service
									3->Fixed dialling
									4->Closed user group
									5->phone security
									6->Change access code
									0->back
									ENTER A NUMBER:
									""";

								System.out.print(Securitysettings);
								Securityinput = input.nextInt();
								switch(Securityinput){
									case 1->System.out.println("PIN code request");
									case 2->System.out.println("call barring service");
									case 3->System.out.println("Fixed dailling");
									case 4->System.out.println("Closed user group");
									case 5->System.out.println("phone security");
									case 6->System.out.println("Change access code");
									case 0->System.out.println("");
									default->System.out.println("enter a valid number");
								
	
								}
								}

							}
							case 4-> System.out.println("Restore factory settings");
							default->System.out.println("enter a valid number");
					}		}
				}
				case 7-> System.out.println("Call divert");
				case 8-> System.out.println("Games");
				case 9-> System.out.println("calculator");
				case 10-> System.out.println("Reminders");
				case 11->{int clockinput = 100;
					while(clockinput != 0){
						String clock = """
						CLOCK
						1->Alarm clock
						2->Clock settings
						3->Date settings
						4->Stopwatch
						5->Countdown timer
						6->Auto update of date and time
						0-> back

						ENTER A NUMBER:
						""";
						System.out.print(clock);
						clockinput = input.nextInt();
						switch(clockinput){
							case 1->System.out.println("Alarm clock");
							case 2->System.out.println("Clock settings");
							case 3->System.out.println("Date setting");
							case 4->System.out.println("Stopwatch");
							case 5->System.out.println("Countdown timer");
							case 6->System.out.println("Auto update of date and time");
							case 0->System.out.println("");
							default->System.out.print("enter a valid number");

					}
						}
				}
							
				case 12-> System.out.println("Profiles");
				case 13-> System.out.println("Sim services");
				case 0-> System.out.println("Good bye");
				default->System.out.println("enter a valid number");

		}

}
	}
}