import java.util.Scanner;
	public class NokiaOne{
		public static void main(String [] args){
			Scanner input = new Scanner(System.in);
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
				
				ENTER A NUMBER:
			""";

			System.out.println(prompt);
			int menuinput = input.nextInt();
			switch(menuinput){
				case 1->{ String phonebook ="""
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

						ENTER A NUMBER:



					""";
					System.out.print(phonebook);
					int phonebookinput = input.nextInt();
					switch(phonebookinput){
						case 1->System.out.print("Search");
						case 2->System.out.print("service nos");
						case 3->System.out.print("Add name");			
						case 4->System.out.print("Erase");
						case 5->System.out.print("Edit");
						case 6->System.out.print("Assign tone");
						case 7->System.out.print("send b'card");			
						case 8->{ String option ="""
										OPTIONS
										1-> Type of view
										2-> Memory status
										ENTER A NUMBER:

										""";
										System.out.print(option);
										int optioninput = input.nextInt();
										
										switch(optioninput){
										
											case 1->System.out.print("Type of view");
											case 2->System.out.print("Memory status");
											default->System.out.print("enter a valid number");
											
										}
						}
				
						case 9->System.out.print("Speed dials");
						case 10->System.out.print("Voice tags");
						default->System.out.print("enter a valid number");
					}
				}

				case 2->{ String messages="""



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
					""";
					System.out.print(messages);
					int messagesinput = input.nextInt();
					switch(messagesinput){
						case 1->System.out.print("Write messages");
						case 2->System.out.print("inbox");
						case 3->System.out.print("outbox");			
						case 4->System.out.print("picture messages");
						case 5->System.out.print("templates");
						case 6->System.out.print("smileys");
						case 7->{
							String messagessettings ="""

								MESSAGES SETTINGS

								1-> Set
								2-> common
								ENTER A NUMBER:
	
							""";
							System.out.print(messagessettings);
							int messageinput = input.nextInt();
							switch(messageinput){
								case 1->{ String set = """
										SET
										
										1->Message centre number
										2->Message sent as
										3->Message validity
										ENTER A NUMBER:
										""";
									System.out.print(set);
									int setinput = input.nextInt();
									switch(setinput){
										case 1->System.out.print("Messages centre number");
										case 2->System.out.print("Messages sent as");
										case 3->System.out.print("Messages Validity");
										default->System.out.print("enter a valid number");
									}
								}
							
								case 2->{String common = """
										COMMMON
										
										1->Delivery reports
										2->Reply via same centre
										3->Character support
										ENTER A NUMBER :
										""";
									System.out.print(common);
									int commoninput = input.nextInt();
									switch(commoninput){
										case 1->System.out.print("Delivery reports");
										case 2->System.out.print("Reply via same centre");
										case 3->System.out.print("Character support");
										default->System.out.print("enter a valid number");

									}
							}	}
						}

						case 8->System.out.print("info service");
						case 9->System.out.print("Voice mailbox number");
						case 10->System.out.print("service command editor");
						default->System.out.print("enter a valid number");
						
					}
					


				}

				case 3->System.out.print("Chat");
				case 4->{ String call =		"""

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
					int callinput = input.nextInt();
					switch(callinput){
						case 1->System.out.print("Missed calls");
						case 2->System.out.print("Rececieved calls");
						case 3->System.out.print("Dialled numbers");		
						case 4->System.out.print("Erase recent call lists");
						case 5->{
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
							int showcallinput = input.nextInt();
							switch(showcallinput){
							case 1->System.out.print("last call duration");
							case 2->System.out.print("all calls calls");
							case 3->System.out.print("Receievd calls numbers");
							case 4->System.out.print("Dialed call duration");
							case 5->System.out.print("Clear timers");
							default->System.out.print("enter a valid number");
							}
						}		
						case 6->{ String callcost="""
								SHOW CALL COST
								1->last call cost
								2->all call's cost
								3->clear counters

								ENTER A NUMBER:
								""";
							System.out.print(callcost);
							int callcostinput = input.nextInt();
							switch(callcostinput){
							case 1->System.out.print("last call cost");
							case 2->System.out.print("all calls cost");
							case 3->System.out.print("clear counters");
							default->System.out.print("enter a valid number");	
							}

						}
						case 7->{String costsettings="""
								CALL COST SETTINGS
								1->call cost limit
								2->show costs in

								ENTER A NUMBER:
							""";
								System.out.print(costsettings);
								int costsettingsinput = input.nextInt();
								switch(costsettingsinput){
								case 1->System.out.print("call cost limit");
								case 2->System.out.print("show costs in");
								default->System.out.print("enter a valid number");
								}
						}
						case 8->System.out.print("Prepaid credit");
						default->System.out.print("enter a valid number");
				
					}

				}
				case 5->{String tones ="""
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
						
						ENTER A NUMBER:
					""";
					System.out.print(tones);
					int tonesinput= input.nextInt();
					switch(tonesinput){
						case 1->System.out.print("Ringing tone");
						case 2->System.out.print("Ringing volume");
						case 3->System.out.print("incoming call alert");
						case 4->System.out.print("composer");
						case 5->System.out.print("Message alert tone");
						case 6->System.out.print("Keypad tones");
						case 7->System.out.print("Warning and game tones");
						case 8->System.out.print("Vibrating alert");
						case 9->System.out.print("screen saver");
						default->System.out.print("enter a valid number");

					} 


				}
				case 6->{ String settings = """
						SETTINGS
						1->Call ssettings
						2->security settings
						3->phone settings
						4->Restore factory settings
						
						ENTER A NUMBER: 
					""";
					

						System.out.print(settings);
						int settingsinput= input.nextInt();
						switch(settingsinput){
							case 1->{ String callsettings = """
									CALL SETTINGS
									1->Automatic redial
									2->Speed dialling
									3->Call waiting options
									4->Own number sending
									5->phone line in use
									6-> Automatic answer


									ENTER A NUMBER:
								""";
								System.out.print(callsettings);
								int callinput = input.nextInt();
								switch(callinput){
									case 1->System.out.print("Automatic redial");
									case 2->System.out.print("Speed dailling");
									case 3->System.out.print("Call waiting options");
									case 4->System.out.print("Own number sending");
									case 5->System.out.print("Phone line in use");
									case 6->System.out.print("Automatic answer");
									default->System.out.print("enter a valid number");

								}

								
							}
							case 2->{String phonesettings = """
									PHONE SEETINGS
									1->language
									2->cell info display
									3->welcome note
									4->network selection
									5->lights
									6->confirm sim service actions
							
									ENTER A NUMBER:
									""";

								System.out.print(phonesettings);
								int phoneinput = input.nextInt();
								switch(phoneinput){
									case 1->System.out.print("language");
									case 2->System.out.print("cell info display");
									case 3->System.out.print("welcome note");
									case 4->System.out.print("Network selection");
									case 5->System.out.print("lights");
									case 6->System.out.print("Confirm SIM service actions");
									default->System.out.print("enter a valid number");
								
	
								}


							}
							case 3->{String Securitysettings = """
									PHONE SEETINGS
									1->PIN code request
									2->Call barring service
									3->Fixed dialling
									4->Closed user group
									5->phone security
									6->Change access code
							
									ENTER A NUMBER:
									""";

								System.out.print(Securitysettings);
								int Securityinput = input.nextInt();
								switch(Securityinput){
									case 1->System.out.print("PIN code request");
									case 2->System.out.print("call barring service");
									case 3->System.out.print("Fixed dailling");
									case 4->System.out.print("Closed user group");
									case 5->System.out.print("phone security");
									case 6->System.out.print("Change access code");
									default->System.out.print("enter a valid number");
								
	
								}


							}
							case 4-> System.out.print("Restore factory settings");
							default->System.out.print("enter a valid number");
					}		
				}
				case 7-> System.out.print("Call divert");
				case 8-> System.out.print("Games");
				case 9-> System.out.print("calculator");
				case 10-> System.out.print("Reminders");
				case 11->{String clock = """
						CLOCK
						1->Alarm clock
						2->Clock settings
						3->Date settings
						4->Stopwatch
						5->Countdown timer
						6->Auto update of date and time
						

						ENTER A NUMBER:
						""";
						System.out.print(clock);
						int clockinput = input.nextInt();
						switch(clockinput){
							case 1->System.out.print("Alarm clock");
							case 2->System.out.print("Clock settings");
							case 3->System.out.print("Date setting");
							case 4->System.out.print("Stopwatch");
							case 5->System.out.print("Countdown timer");
							case 6->System.out.print("Auto update of date and time");
							default->System.out.print("enter a valid number");


						}
				}
							
				case 12-> System.out.print("Profiles");
				case 13-> System.out.print("Sim services");
				default->System.out.print("enter a valid number");

		}


	}
}