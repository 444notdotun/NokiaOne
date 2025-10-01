import java.util.Scanner;
	public class NokiaTwo{
		public static void main(String [] args){
			Scanner input = new Scanner(System.in);
			String menuinput = "100";
			
			while(!menuinput.equalsIgnoreCase ("0")){
			
			
			
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
			 menuinput = input.next();
			switch(menuinput){
				case "1"->{ 
				String phonebookinput = "100";
				while (!phonebookinput .equalsIgnoreCase ("0")){ 
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
					phonebookinput = input.next();
					switch(phonebookinput){
						case "1"->{ String searchinput = "100";
								while(!searchinput.equalsIgnoreCase("0")){
								String searchprompt = """
								SEARCH
								0-> back
							""";
							System.out.print(searchprompt);
							searchinput = input.next();
							switch(searchinput){
								
								case "0"-> System.out.println("goodbye from seacrh");
								default ->System.out.println("invalid number");
							}
							}
						}
						case "0"-> System.out.println ("Goodbye from phonebook");
						case "2"->{ String serviceinput = "100";
								while(!serviceinput.equalsIgnoreCase("0")){
								String serviceprompt = """
								SEARCH NOS
								0-> back
							""";
							System.out.print(serviceprompt);
							serviceinput = input.next();
							switch(serviceinput){
								
								case "0"-> System.out.println("goodbye from service nos");
								default ->System.out.println("invalid number");
							}
							}
						}
						case "3"->{ String addnameinput = "100";
								while(!addnameinput.equalsIgnoreCase("0")){
								String addnameprompt = """
								ADD NAME
								0-> back
							""";
							System.out.print(addnameprompt);
							addnameinput = input.next();
							switch(addnameinput){
								
								case "0"-> System.out.println("goodbye from Add name");
								default ->System.out.println("invalid number");
							}
							}
						}			
						case "4"->{String Eraseinput = "100";
								while(!Eraseinput.equalsIgnoreCase("0")){
								String Eraseprompt = """
								ERASE 
								0-> back
							""";
							System.out.print(Eraseprompt);
							Eraseinput = input.next();
							switch(Eraseinput){
								
								case "0"-> System.out.println("goodbye from Erase");
								default ->System.out.println("invalid number");
							}
							}
						}
						case "5"->{String Editinput = "100";
								while(!Editinput.equalsIgnoreCase("0")){
								String Editprompt = """
								EDIT
								0-> back
							""";
							System.out.print(Editprompt);
							Editinput = input.next();
							switch(Editinput){
								
								case "0"-> System.out.println("goodbye from Edit");
								default ->System.out.println("invalid number");
							}
							}
						}
						case "6"->{String Assigninput = "100";
								while(!Assigninput.equalsIgnoreCase("0")){
								String Assignprompt = """
								ASSIGN TONE
								0-> back
							""";
							System.out.print(Assignprompt);
							Assigninput = input.next();
							switch(Assigninput){
								
								case "0"-> System.out.println("goodbye from Assign tone");
								default ->System.out.println("invalid number");
							}
							}
						}
						case "7"->{String cardinput = "100";
								while(!cardinput .equalsIgnoreCase("0")){
								String cardprompt = """
								SEND B CARD
								0-> back
							""";
							System.out.print(cardprompt);
							cardinput = input.next();
							switch(cardinput){
								
								case "0"-> System.out.println("goodbye from send b'card");
								default ->System.out.println("invalid number");
							}
							}
						}
			
						case "8"->{
							String optioninput = "100";
							while(!optioninput.equalsIgnoreCase ("0")){
							String option ="""
										OPTIONS
										1-> Type of view
										2-> Memory status
										0-> back
										ENTER A NUMBER:

										""";
										System.out.print(option);
										optioninput = input.next();
										
										switch(optioninput){
											case "1"->{String typeinput = "100";
								while(!typeinput.equalsIgnoreCase ("0")){
								String typeprompt = """
								TYPE OF VIEW
								0-> back
							""";
							System.out.print(typeprompt);
							typeinput = input.next();
							switch(typeinput){
								
								case "0"-> System.out.println("goodbye from Type of view");
								default ->System.out.println("invalid number");
							}
							}
						}
											case "2"->{String  memoryinput = "100";
								while(!memoryinput.equalsIgnoreCase ("0")){
								String memoryprompt = """
								MEMORY STATUS
								0-> back
							""";
							System.out.print(memoryprompt);
							memoryinput = input.next();
							switch(memoryinput){
								
								case "0"-> System.out.println("goodbye from memory status");
								default ->System.out.println("invalid number");
							}
							}
						}
											case "0"->System.out.println("goodbye from options");
											default->System.out.println("invalid number");
											
										}
										}
						}
				
						case "9"->{String speedinput = "100";
								while(!speedinput .equalsIgnoreCase("0")){
								String speedprompt = """
								SPEED DIALS
								0-> back
							""";
							System.out.print(speedprompt);
							speedinput = input.next();
							switch(speedinput){
								
								case "0"-> System.out.println("goodbye from speed dials");
								default ->System.out.println("invalid number");
							}
							}
						}

						case "10"->{ String  voiceinput = "100";
								while(!voiceinput.equalsIgnoreCase("0")){
								String voiceprompt = """
								VOICE TAGS
								0-> back
							""";
							System.out.print(voiceprompt);
							voiceinput = input.next();
							switch(voiceinput){
								
								case "0"-> System.out.println("goodbye from voice tags");
								default ->System.out.println("invalid number");
							}
							}
						}

						default->System.out.println("enter a valid number");
					}
				}
				}
				case "2"->{ 
					String  messagesinput = "100";
					while(!messagesinput .equalsIgnoreCase("0")){


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
					messagesinput = input.next();
					switch(messagesinput){
						case "1"->{String writeinput = "100";
								while(!writeinput.equalsIgnoreCase("0")){
								String writeprompt = """
								WRITE MESSSAGES
								0-> back
							""";
							System.out.print(writeprompt);
							writeinput = input.next();
							switch(writeinput){
								
								case "0"-> System.out.println("goodbye from write messages");
								default ->System.out.println("invalid number");
							}
							}
						}

						case "2"->{String inboxinput = "100";
								while(!inboxinput.equalsIgnoreCase("0")){
								String inboxprompt = """
								INBOX
								0-> back
							""";
							System.out.print(inboxprompt);
							inboxinput = input.next();
							switch(inboxinput){
								
								case "0"-> System.out.println("goodbye from inbox");
								default ->System.out.println("invalid number");
							}
							}
						}

						case "3"->{ String outboxinput = "100";
								while(!outboxinput.equalsIgnoreCase("0")){
								String outboxprompt = """
								OUTBOX
								0-> back
							""";
							System.out.print(outboxprompt);
							outboxinput = input.next();
							switch(outboxinput){
								
								case "0"-> System.out.println("goodbye from outbox");
								default ->System.out.println("invalid number");
							}
							}
						}			
						case "4"->{ String pictureinput = "100";
								while(!pictureinput.equalsIgnoreCase("0")){
								String pictureprompt = """
								PICTURE MESSAGES
								0-> back
							""";
							System.out.print(pictureprompt);
							pictureinput = input.next();
							switch(pictureinput){
								
								case "0"-> System.out.println("goodbye from picture messages");
								default ->System.out.println("invalid number");
							}
							}
						}
						case "5"->{ String templateinput = "100";
								while(!templateinput.equalsIgnoreCase("0")){
								String templateprompt = """
								TEMPLATES
								0-> back
							""";
							System.out.print(templateprompt);
							templateinput = input.next();
							switch(templateinput){
								
								case "0"-> System.out.println("goodbye from templates");
								default ->System.out.println("invalid number");
							}
							}
						}
						case "6"->{ String smileysinput = "100";
								while(!smileysinput.equalsIgnoreCase("0")){
								String smileysprompt = """
								TEMPLATES
								0-> back
							""";
							System.out.print(smileysprompt);
							smileysinput = input.next();
							switch(smileysinput){
								
								case "0"-> System.out.println("goodbye from smileys");
								default ->System.out.println("invalid number");
							}
							}
						}
						case "0"->System.out.println("goodbye from messaeges");
						case "7"->{String messageinput= "100";
							while(!messageinput .equalsIgnoreCase("0")){
							String messagessettings ="""

								MESSAGES SETTINGS

								1-> Set
								2-> common
								0-> back
								ENTER A NUMBER:
	
							""";
							System.out.print(messagessettings);
							messageinput = input.next();
							switch(messageinput){
								case "1"->{ String setinput = "100";
									  while(!setinput.equalsIgnoreCase("0")){

									 String set = """
										SET
										
										1->Message centre number
										2->Message sent as
										3->Message validity
										0-> back
										ENTER A NUMBER:
										""";
									System.out.print(set);
									setinput = input.next();
									switch(setinput){
										case "1"->{ String centreinput = "100";
								while(!centreinput.equalsIgnoreCase("0")){
								String centreprompt = """
								CENTRE
								0-> back
							""";
							System.out.print(centreprompt);
							centreinput = input.next();
							switch(centreinput){
								
								case "0"-> System.out.println("goodbye from Messages centre number");
								default ->System.out.println("invalid number");
							}
							}
						}
										case "2"->{ String asinput = "100";
								while(!asinput.equalsIgnoreCase("0")){
								String asprompt = """
								MESSAGES SENT AS
								0-> back
							""";
							System.out.print(asprompt);
							asinput = input.next();
							switch(asinput){
								
								case "0"-> System.out.println("goodbye from Messages sent as");
								default ->System.out.println("invalid number");
							}
							}
						}
										case "3"->{ String validityinput = "100";
								while(!validityinput.equalsIgnoreCase("0")){
								String validityprompt = """
								MESSAGES SENT AS
								0-> back
							""";
							System.out.print(validityprompt);
							validityinput = input.next();
							switch(validityinput){
								
								case "0"-> System.out.println("goodbye from Messages Validity ");
								default ->System.out.println("invalid number");
							}
							}
						}
										case "0"->System.out.println("goodbye from set");
										default->System.out.println("enter a valid number");
									}
									}
								}
							
								case "2"->{String  commoninput = "100";
									while(commoninput .equalsIgnoreCase("0")){

									
									String common = """
										COMMMON
										
										1->Delivery reports
										2->Reply via same centre
										3->Character support
										0->back
										ENTER A NUMBER :
										""";
									System.out.print(common);
									commoninput = input.next();
									switch(commoninput){
										case "1"->{ String Deliveryinput = "100";
								while(!Deliveryinput.equalsIgnoreCase("0")){
								String Deliveryprompt = """
								DELIVERY REPORTS
								0-> back
							""";
							System.out.print(Deliveryprompt);
							Deliveryinput = input.next();
							switch(Deliveryinput){
								
								case "0"-> System.out.println("goodbye from Delivery reports ");
								default ->System.out.println("invalid number");
							}
							}
						}
										case "2"->{ String sameinput = "100";
								while(!sameinput.equalsIgnoreCase("0")){
								String sameprompt = """
								REPLY VIA SAME CENTRE
								0-> back
							""";
							System.out.print(sameprompt);
							sameinput = input.next();
							switch(sameinput){
								
								case "0"-> System.out.println("Reply via same centre");
								default ->System.out.println("invalid number");
							}
							}
						}
										case "3"->{ String Characterinput = "100";
								while(!Characterinput.equalsIgnoreCase("0")){
								String Characterprompt = """
								CHARACTER SUPPORT
								0-> back
							""";
							System.out.print(Characterprompt);
							Characterinput = input.next();
							switch(Characterinput){
								
								case "0"-> System.out.println("Character support");
								default ->System.out.println("invalid number");
							}
							}
						}
										case "0"->System.out.println("goodbye to common"); 
										default->System.out.println("enter a valid number");

									}
								}}
							}	}
						}

						case "8"->{ String infoinput = "100";
								while(!infoinput.equalsIgnoreCase("0")){
								String infoprompt = """
								INFO SERVICE
								0-> back
							""";
							System.out.print(infoprompt);
							infoinput = input.next();
							switch(infoinput){
								
								case "0"-> System.out.println("info service");
								default ->System.out.println("invalid number");
							}
							}
						}
						case "9"->{ String mailboxinput = "100";
								while(!mailboxinput.equalsIgnoreCase("0")){
								String mailboxprompt = """
								VOICE MAILBOX NUMBER
								0-> back
							""";
							System.out.print(mailboxprompt);
							mailboxinput = input.next();
							switch(mailboxinput){
								
								case "0"-> System.out.println("Voice mailbox number");
								default ->System.out.println("invalid number");
							}
							}
						}
						case "10"->{ String serviceinput = "100";
								while(!serviceinput.equalsIgnoreCase("0")){
								String serviceprompt = """
								SERVICE COMMAND EDITOR
								0-> back
							""";
							System.out.print(serviceprompt);
							serviceinput = input.next();
							switch(serviceinput){
								
								case "0"-> System.out.println("Voice mailbox number");
								default ->System.out.println("invalid number");
							}
							}
						}
						default->System.out.println("enter a valid number");
						}	
					}
					


				}

				case "3"->{ String chatinput = "100";
								while(!chatinput.equalsIgnoreCase("0")){
								String chatprompt = """
								CHAT
								0-> back
							""";
							System.out.print(chatprompt);
							chatinput = input.next();
							switch(chatinput){
								
								case "0"-> System.out.println("chat");
								default ->System.out.println("invalid number");
							}
							}
						}
				case "4"->{ String callinput = "100";
					while(callinput.equalsIgnoreCase("0")){


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
					callinput = input.next();
					switch(callinput){
						case "1"->{ String missedinput = "100";
								while(!missedinput.equalsIgnoreCase("0")){
								String missedprompt = """
								MISSED CALLS
								0-> back
							""";
							System.out.print(missedprompt);
							missedinput = input.next();
							switch(missedinput){
								
								case "0"-> System.out.println("goodbye from Missed calls");
								default ->System.out.println("invalid number");
							}
							}
						}
						case "2"->{
						 String Rececievedinput = "100";
								while(!Rececievedinput.equalsIgnoreCase("0")){
								String Rececievedprompt = """
								RECEIVED CALLS
								0-> back
							""";
							System.out.print(Rececievedprompt);
							Rececievedinput = input.next();
							switch(Rececievedinput){
								
								case "0"-> System.out.println("goodbye from recevied calls");
								default ->System.out.println("invalid number");
							}
							}
						}
						case "3"->{
						 String Dialledinput = "100";
								while(!Dialledinput.equalsIgnoreCase("0")){
								String Dialledprompt = """
								DIALLED CALLS
								0-> back
							""";
							System.out.print(Dialledprompt);
							Dialledinput = input.next();
							switch(Dialledinput){
								
								case "0"-> System.out.println("goodbye from dialled calls");
								default ->System.out.println("invalid number");
							}
							}
						}		
						case "4"->{
						 String recentinput = "100";
								while(!recentinput.equalsIgnoreCase("0")){
								String recentprompt = """
								DIALLED CALLS
								0-> back
							""";
							System.out.print(recentprompt);
							recentinput = input.next();
							switch(recentinput){
								
								case "0"-> System.out.println("Erase recent call lists");
								default ->System.out.println("invalid number");
							}
							}
						}
						case "5"->{String showcallinput = "100";
							while(showcallinput.equalsIgnoreCase("0")){

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
							showcallinput = input.next();
							switch(showcallinput){
							case "1"->{
						 String durationinput = "100";
								while(!durationinput.equalsIgnoreCase("0")){
								String durationprompt = """
								DIALLED CALLS
								0-> back
							""";
							System.out.print(durationprompt);
							durationinput = input.next();
							switch(durationinput){
								
								case "0"-> System.out.println("goodbye to last call duration");
								default ->System.out.println("invalid number");
							}
							}
						}
							case "2"->{
						 String allinput = "100";
								while(!allinput.equalsIgnoreCase("0")){
								String allprompt = """
								ALL CALLS 
								0-> back
							""";
							System.out.print(allprompt);
							allinput = input.next();
							switch(allinput){
								
								case "0"-> System.out.println("goodbye to all calls ");
								default ->System.out.println("invalid number");
							}
							}
						}
							case "3"->{
						 String numbersinput = "100";
								while(!numbersinput.equalsIgnoreCase("0")){
								String numbersprompt = """
								RECIEVED CALL NUMBERS
								0-> back
							""";
							System.out.print(numbersprompt);
							numbersinput = input.next();
							switch(numbersinput){
								
								case "0"-> System.out.println("goodbye to recievd calls numbers");
								default ->System.out.println("invalid number");
							}
							}
						}
							case "4"->{
						 String Dialedinput = "100";
								while(!Dialedinput.equalsIgnoreCase("0")){
								String Dialedprompt = """
								DIALED CALL DURATION
								0-> back
							""";
							System.out.print(Dialedprompt);
							Dialedinput = input.next();
							switch(Dialedinput){
								
								case "0"-> System.out.println("goodbye to Dialed cal duration");
								default ->System.out.println("invalid number");
							}
							}
						}
							case "5"->{
						 String timesinput = "100";
								while(!timesinput.equalsIgnoreCase("0")){
								String timesprompt = """
								CLEAR TIMES
								0-> back
							""";
							System.out.print(timesprompt);
							timesinput = input.next();
							switch(timesinput){
								
								case "0"-> System.out.println("goodbye to Clear timers");
								default ->System.out.println("invalid number");
							}
							}
						}
							default->System.out.println("enter a valid number");
							}}
						}		
						case "6"->{ String callcostinput = "100";
							while(callcostinput .equalsIgnoreCase(" 0")){
							String callcost="""
								SHOW CALL COST
								1->last call cost
								2->all call's cost
								3->clear counters
								0-> back
								ENTER A NUMBER:
								""";
							System.out.print(callcost);
							callcostinput = input.next();
							switch(callcostinput){
							case "1"->{
						 String lastcallinput = "100";
								while(!lastcallinput.equalsIgnoreCase("0")){
								String lastcallprompt = """
								LAST CALL COST
								0-> back
							""";
							System.out.print(lastcallprompt);
							lastcallinput = input.next();
							switch(lastcallinput){
								
								case "0"-> System.out.println("goodbye to last call cost");
								default ->System.out.println("invalid number");
							}
							}
						}
							case "2"->{
						 String allcallinput = "100";
								while(!allcallinput.equalsIgnoreCase("0")){
								String allcallprompt = """
								ALL CALLS COST
								0-> back
							""";
							System.out.print(allcallprompt);
							allcallinput = input.next();
							switch(allcallinput){
								
								case "0"-> System.out.println("goodbye to all calls cost");
								default ->System.out.println("invalid number");
							}
							}
						}
							case "3"->{
						 String countersinput = "100";
								while(!countersinput.equalsIgnoreCase("0")){
								String countersprompt = """
								CLEAR COUNTERS
								0-> back
							""";
							System.out.print(countersprompt);
							countersinput = input.next();
							switch(countersinput){
								
								case "0"-> System.out.println("goodbye to clear counters");
								default ->System.out.println("invalid number");
							}
							}
						}
							case "0"->System.out.println("");
							default->System.out.println("enter a valid number");	
							}
							}

						}
						case "7"->{ String costsettingsinput = "100";
							while(costsettingsinput .equalsIgnoreCase("0")){

								String costsettings="""
								CALL COST SETTINGS
								1->call cost limit
								2->show costs in
								0-> back
								ENTER A NUMBER:
							""";
								System.out.print(costsettings);
								costsettingsinput = input.next();
								switch(costsettingsinput){
								case "1"->{
						 String costinput = "100";
								while(! costinput.equalsIgnoreCase("0")){
								String  costprompt = """
								CALL COST LIMIT
								0-> back
							""";
							System.out.print( costprompt);
							 costinput = input.next();
							switch( costinput){
								
								case "0"-> System.out.println("goodbye to call cost limit");
								default ->System.out.println("invalid number");
							}
							}
						}
								case "2"->{
						 String ininput = "100";
								while(! ininput.equalsIgnoreCase("0")){
								String  inprompt = """
								SHOW COSTS IN
								0-> back
							""";
							System.out.print( inprompt);
							ininput = input.next();
							switch( ininput){
								
								case "0"-> System.out.println("goodbye to show costs in");
								default ->System.out.println("invalid number");
							}
							}
						}
								case "0" ->System.out.println("");
								default->System.out.println("enter a valid number");
								}
							}
						}
						case "8"->{
						 String Prepaidinput = "100";
								while(! Prepaidinput.equalsIgnoreCase("0")){
								String  Prepaidprompt = """
								PREPAID CREDIT 
								0-> back
							""";
							System.out.print( Prepaidprompt);
							Prepaidinput = input.next();
							switch( Prepaidinput){
								
								case "0"-> System.out.println("goodbye to Prepaid credit");
								default ->System.out.println("invalid number");
							}
							}
						}
						default->System.out.println("enter a valid number");
						}
					}

				}
				case "5"->{String  tonesinput = "100";
					while(tonesinput .equalsIgnoreCase("0")){



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
					tonesinput= input.next();
					switch(tonesinput){
						case "1"->{
						 String Ringinginput = "100";
								while(! Ringinginput.equalsIgnoreCase("0")){
								String  Ringingprompt = """
								RINGING TONE 
								0-> back
							""";
							System.out.print( Ringingprompt);
							Ringinginput = input.next();
							switch( Ringinginput){
								
								case "0"-> System.out.println("goodbye to Ringing tone");
								default ->System.out.println("invalid number");
							}
							}
						}
						case "2"->{
						 String volumeinput = "100";
								while(! volumeinput.equalsIgnoreCase("0")){
								String  volumeprompt = """
								RINGING VOLUME 
								0-> back
							""";
							System.out.print( volumeprompt);
							volumeinput = input.next();
							switch( volumeinput){
								
								case "0"-> System.out.println("goodbye to Ringing volume");
								default ->System.out.println("invalid number");
							}
							}
						}
						case "3"->{
						 String incominginput = "100";
								while(! incominginput.equalsIgnoreCase("0")){
								String  incomingprompt = """
								INCOMING CALL ALERT
								0-> back
							""";
							System.out.print( incomingprompt);
							incominginput = input.next();
							switch( incominginput){
								
								case "0"-> System.out.println("goodbye to incoming call alert");
								default ->System.out.println("invalid number");
							}
							}
						}
						case "4"->{
						 String composerinput = "100";
								while(! composerinput.equalsIgnoreCase("0")){
								String  composerprompt = """
								COMPOSER
								0-> back
							""";
							System.out.print(composerprompt);
							composerinput = input.next();
							switch( composerinput){
								
								case "0"-> System.out.println("goodbye to composer");
								default ->System.out.println("invalid number");
							}
							}
						}
						case "5"->{
						 String alerttoneinput = "100";
								while(!alerttoneinput.equalsIgnoreCase("0")){
								String  alerttoneprompt = """
								MESSAGE ALERT TONE
								0-> back
							""";
							System.out.print(alerttoneprompt);
							alerttoneinput = input.next();
							switch( alerttoneinput){
								
								case "0"-> System.out.println("goodbye to Message alert tone");
								default ->System.out.println("invalid number");
							}
							}
						}
						case "6"->{
						 String Keypadinput = "100";
								while(!Keypadinput.equalsIgnoreCase("0")){
								String  Keypadprompt = """
								KEYPAD TONES
								0-> back
							""";
							System.out.print(Keypadprompt);
							Keypadinput = input.next();
							switch( Keypadinput){
								
								case "0"-> System.out.println("goodbye to Keypad tones");
								default ->System.out.println("invalid number");
							}
							}
						}
						case "7"->{
						 String warninginput = "100";
								while(!warninginput.equalsIgnoreCase("0")){
								String  warningprompt = """
								WARNING AND GAME TONES
								0-> back
							""";
							System.out.print(warningprompt);
							warninginput = input.next();
							switch( warninginput){
								
								case "0"-> System.out.println("goodbye to warning and games tones");
								default ->System.out.println("invalid number");
							}
							}
						}
						case "8"->{
						 String Vibratinginput = "100";
								while(!Vibratinginput.equalsIgnoreCase("0")){
								String  Vibratingprompt = """
								VIBRATING ALERT
								0-> back
							""";
							System.out.print(Vibratingprompt);
							Vibratinginput = input.next();
							switch( Vibratinginput){
								
								case "0"-> System.out.println("goodbye to  Vibrating alert");
								default ->System.out.println("invalid number");
							}
							}
						}
						case "9"->{
						 String screeninput = "100";
								while(!screeninput.equalsIgnoreCase("0")){
								String  screenprompt = """
								SCREEN SAVER
								0-> back
							""";
							System.out.print(screenprompt);
							screeninput = input.next();
							switch( screeninput){
								
								case "0"-> System.out.println("goodbye to screen saver");
								default ->System.out.println("invalid number");
							}
							}
						}
						case "0"->System.out.println("");
						default->System.out.println("enter a valid number");

					} 
					}

				}
				case "6"->{ String  settingsinput = "100";
					while(!settingsinput .equalsIgnoreCase ("0")){
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
						settingsinput= input.next();
						switch(settingsinput){
							case "1"->{String callinput = "100";
								while(!callinput.equalsIgnoreCase ("0")){
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
								callinput = input.next();
								switch(callinput){
									case "1"->{
						 String Automaticinput = "100";
								while(!Automaticinput.equalsIgnoreCase("0")){
								String  Automaticprompt = """
								AUTOMATIC REDIAL
								0-> back
							""";
							System.out.print(Automaticprompt);
							Automaticinput = input.next();
							switch( Automaticinput){
								
								case "0"-> System.out.println("goodbye to automatic redial");
								default ->System.out.println("invalid number");
							}
							}
						}
									case "2"->{
						 String Speeddaillinginput = "100";
								while(!Speeddaillinginput.equalsIgnoreCase("0")){
								String  Speeddaillingprompt = """
								SPEED DAILING
								0-> back
							""";
							System.out.print(Speeddaillingprompt);
							Speeddaillinginput = input.next();
							switch(Speeddaillinginput){
								
								case "0"-> System.out.println("goodbye to Speed dailing");
								default ->System.out.println("invalid number");
							}
							}
						}
									case "3"->{
						 String optionsinput = "100";
								while(!optionsinput.equalsIgnoreCase("0")){
								String  optionsprompt = """
								CALL WAITING OPTIONS
								0-> back
							""";
							System.out.print(optionsprompt);
							optionsinput = input.next();
							switch(optionsinput){
								
								case "0"-> System.out.println("goodbye to Call waiting options");
								default ->System.out.println("invalid number");
							}
							}
						}
									case "4"->{
						 String Owninput = "100";
								while(!Owninput.equalsIgnoreCase("0")){
								String  Ownprompt = """
								OWN NUMBER SENDING
								0-> back
							""";
							System.out.print(Ownprompt);
							Owninput = input.next();
							switch(Owninput){
								
								case "0"-> System.out.println("goodbye to Own number sending");
								default ->System.out.println("invalid number");
							}
							}
						}
									case "5"->{
						 String lineinput = "100";
								while(!lineinput.equalsIgnoreCase("0")){
								String  lineprompt = """
								PHONE LINE IN USE
								0-> back
							""";
							System.out.print(lineprompt);
							lineinput = input.next();
							switch(lineinput){
								
								case "0"-> System.out.println("goodbye to Phone line in use");
								default ->System.out.println("invalid number");
							}
							}
						}
									case "6"->{
						 String ansinput = "100";
								while(!ansinput.equalsIgnoreCase("0")){
								String  ansprompt = """
								AUTOMATIC ANSWER
								0-> back
							""";
							System.out.print(ansprompt);
							ansinput = input.next();
							switch(ansinput){
								
								case "0"-> System.out.println("goodbye to Automatic answer");
								default ->System.out.println("invalid number");
							}
							}
						}
									case "0"->System.out.println("");
									default->System.out.println("enter a valid number");

								}
								}
								}
							
							case "2"->{String phoneinput = "100";
								while(phoneinput .equalsIgnoreCase(" 0")){
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
								phoneinput = input.next();
								switch(phoneinput){
									case "1"->{
						 String languageinput = "100";
								while(!languageinput.equalsIgnoreCase("0")){
								String  languageprompt = """
								LANGUAGE
								0-> back
							""";
							System.out.print(languageprompt);
							languageinput = input.next();
							switch(languageinput){
								
								case "0"-> System.out.println("goodbye to language");
								default ->System.out.println("invalid number");
							}
							}
						}
									case "2"->{
						 String cellinfoinput = "100";
								while(!cellinfoinput.equalsIgnoreCase("0")){
								String  cellinfoprompt = """
								CELL INFO DISPLAY
								0-> back
							""";
							System.out.print(cellinfoprompt);
							cellinfoinput = input.next();
							switch(cellinfoinput){
								
								case "0"-> System.out.println("goodbye to cell info display");
								default ->System.out.println("invalid number");
							}
							}
						}
									case "3"->{
						 String cellinfoinput = "100";
								while(!cellinfoinput.equalsIgnoreCase("0")){
								String  cellinfoprompt = """
								CELL INFO DISPLAY
								0-> back
							""";
							System.out.print(cellinfoprompt);
							cellinfoinput = input.next();
							switch(cellinfoinput){
								
								case "0"-> System.out.println("goodbye to cell info display");
								default ->System.out.println("invalid number");
							}
							}
						}
									case "4"->{
						 String Networkinput = "100";
								while(!Networkinput.equalsIgnoreCase("0")){
								String  Networkprompt = """
								Network selection
								0-> back
							""";
							System.out.print(Networkprompt);
							Networkinput = input.next();
							switch(Networkinput){
								
								case "0"-> System.out.println("goodbye to Network selection");
								default ->System.out.println("invalid number");
							}
							}
						}
									case "5"->{
						 String lightsinput = "100";
								while(!lightsinput.equalsIgnoreCase("0")){
								String  lightsprompt = """
								LIGHTS
								0-> back
							""";
							System.out.print(lightsprompt);
							lightsinput = input.next();
							switch(lightsinput){
								
								case "0"-> System.out.println("goodbye to lights");
								default ->System.out.println("invalid number");
							}
							}
						}
									case "6"->{
						 String Siminput = "100";
								while(!Siminput.equalsIgnoreCase("0")){
								String  Simprompt = """
								COMFIRM SIM SERVICE ACTIONS
								0-> back
							""";
							System.out.print(Simprompt);
							Siminput = input.next();
							switch(Siminput){
								
								case "0"-> System.out.println("goodbye tosim service actions");
								default ->System.out.println("invalid number");
							}
							}
						}
									case "0"->System.out.println("goodbye");
									default->System.out.println("enter a valid number");
								
	
								}

								}
							}
							case "3"->{
								String Securityinput = "100";
								while(Securityinput.equalsIgnoreCase("0")){



									String Securitysettings = """
									PHONE SETINGS
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
								Securityinput = input.next();
								switch(Securityinput){
									case "1"->{
						 String codeinput = "100";
								while(!codeinput.equalsIgnoreCase("0")){
								String codeprompt = """
								PIN CODE REQUEST
								0-> back
							""";
							System.out.print(codeprompt);
							codeinput = input.next();
							switch(codeinput){
								
								case "0"-> System.out.println("goodbye to pin code request");
								default ->System.out.println("invalid number");
							}
							}
						}
									case "2"->{
						 String barringinput = "100";
								while(!barringinput.equalsIgnoreCase("0")){
								String barringprompt = """
								CALL BARRING SERVICE
								0-> back
							""";
							System.out.print(barringprompt);
							barringinput = input.next();
							switch(barringinput){
								
								case "0"-> System.out.println("goodbye to call barring service");
								default ->System.out.println("invalid number");
							}
							}
						}
									case "3"->{
						 String fixedinput = "100";
								while(!fixedinput.equalsIgnoreCase("0")){
								String fixedprompt = """
								FIXED DIALLING
								0-> back
							""";
							System.out.print(fixedprompt);
							fixedinput = input.next();
							switch(fixedinput){
								
								case "0"-> System.out.println("goodbye to Fixed dailing");
								default ->System.out.println("invalid number");
							}
							}
						}
									case "4"->{
						 String userinput = "100";
								while(!userinput.equalsIgnoreCase("0")){
								String userprompt = """
								CLOSED USER GROUP
								0-> back
							""";
							System.out.print(userprompt);
							userinput = input.next();
							switch(userinput){
								
								case "0"-> System.out.println("goodbye to Closed user group");
								default ->System.out.println("invalid number");
							}
							}
						}
									case "5"->{
						 String securityinput = "100";
								while(!securityinput.equalsIgnoreCase("0")){
								String securityprompt = """
								PHONE SECURITY	
								0-> back
							""";
							System.out.print(securityprompt);
							securityinput = input.next();
							switch(securityinput){
								
								case "0"-> System.out.println("goodbye to phone security");
								default ->System.out.println("invalid number");
							}
							}
						}
									case "6"->{
						 String accessinput = "100";
								while(!accessinput.equalsIgnoreCase("0")){
								String accessprompt = """
								CHANGE ACCESS CODE	
								0-> back
							""";
							System.out.print(accessprompt);
							accessinput = input.next();
							switch(accessinput){
								
								case "0"-> System.out.println("goodbye toChange access code");
								default ->System.out.println("invalid number");
							}
							}
						}
									case "0"->System.out.println("bye");
									default->System.out.println("enter a valid number");
								
	
								}
								}

							}
							case "4"-> {
						 String factoryinput = "100";
								while(!factoryinput.equalsIgnoreCase("0")){
								String factoryprompt = """
								RESTORE FACTORY SETTINGS	
								0-> back
							""";
							System.out.print(factoryprompt);
							factoryinput = input.next();
							switch(factoryinput){
								
								case "0"-> System.out.println("goodbye to  Restore factory settings");
								default ->System.out.println("invalid number");
							}
							}
						}
							
							default->System.out.println("enter a valid number");
					}		}
				}
				case "7"-> {
						 String divertinput = "100";
								while(!divertinput.equalsIgnoreCase("0")){
								String divertprompt = """
								CALL DIVERT	
								0-> back
							""";
							System.out.print(divertprompt);
							divertinput = input.next();
							switch(divertinput){
								
								case "0"-> System.out.println("goodbye to  call divert");
								default ->System.out.println("invalid number");
							}
							}
						}
				case "8"-> {
						 String Gamesinput = "100";
								while(!Gamesinput.equalsIgnoreCase("0")){
								String Gamesprompt = """
								GAMES	
								0-> back
							""";
							System.out.print(Gamesprompt);
							Gamesinput = input.next();
							switch(Gamesinput){
								
								case "0"-> System.out.println("goodbye to  Games");
								default ->System.out.println("invalid number");
							}
							}
						} 
				case "9"-> {
						 String calculatorinput = "100";
								while(!calculatorinput.equalsIgnoreCase("0")){
								String calculatorprompt = """
								CALCULATOR	
								0-> back
							""";
							System.out.print(calculatorprompt);
							calculatorinput = input.next();
							switch(calculatorinput){
								
								case "0"-> System.out.println("goodbye to  calculator");
								default ->System.out.println("invalid number");
							}
							}
						} 
				case "10"-> {
						 String Remindersinput = "100";
								while(!Remindersinput.equalsIgnoreCase("0")){
								String Remindersprompt = """
								REMINDER	
								0-> back
							""";
							System.out.print(Remindersprompt);
							Remindersinput = input.next();
							switch(Remindersinput){
								
								case "0"-> System.out.println("goodbye to  Reminders");
								default ->System.out.println("invalid number");
							}
							}
						} 
				case "11"->{String clockinput = "100";
					while(clockinput .equalsIgnoreCase( "0")){
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
						clockinput = input.next();
						switch(clockinput){
							case "1"-> {
						 String alarminput = "100";
								while(!alarminput.equalsIgnoreCase("0")){
								String alarmprompt = """
								ALARM		
								0-> back
							""";
							System.out.print(alarmprompt);
							alarminput = input.next();
							switch(alarminput){
								
								case "0"-> System.out.println("goodbye to Alarm clock");
								default ->System.out.println("invalid number");
							}
							}
						} 
							case "2"->{
						 String cksettinginput = "100";
								while(!cksettinginput.equalsIgnoreCase("0")){
								String cksettingprompt = """
								CLOCK SETTINGS		
								0-> back
							""";
							System.out.print(cksettingprompt);
							cksettinginput = input.next();
							switch(cksettinginput){
								
								case "0"-> System.out.println("goodbye to Clock settings");
								default ->System.out.println("invalid number");
							}
							}
						} 
							case "3"->{
						 String dateinput = "100";
								while(!dateinput.equalsIgnoreCase("0")){
								String dateprompt = """
								DATE SETTINGS		
								0-> back
							""";
							System.out.print(dateprompt);
							dateinput = input.next();
							switch(dateinput){
								
								case "0"-> System.out.println("goodbye to Date setting");
								default ->System.out.println("invalid number");
							}
							}
						} 
							case "4"->{
						 String Stopwatchinput = "100";
								while(!Stopwatchinput.equalsIgnoreCase("0")){
								String Stopwatchprompt = """
								STOPWATCH		
								0-> back
							""";
							System.out.print(Stopwatchprompt);
							Stopwatchinput = input.next();
							switch(Stopwatchinput){
								
								case "0"-> System.out.println("goodbye to Stopwatch");
								default ->System.out.println("invalid number");
							}
							}
						} 
							case "5"->{
						 String Countdowninput = "100";
								while(!Countdowninput.equalsIgnoreCase("0")){
								String Countdownprompt = """
								COUNTDOWN TIMER		
								0-> back
							""";
							System.out.print(Countdownprompt);
							Countdowninput = input.next();
							switch(Countdowninput){
								
								case "0"-> System.out.println("goodbye to Countdown timer");
								default ->System.out.println("invalid number");
							}
							}
						} 
							case "6"->{
						 String updateinput = "100";
								while(!updateinput.equalsIgnoreCase("0")){
								String updateprompt = """
								AUTO UPDATE OF TIME AND DATE		
								0-> back
							""";
							System.out.print(updateprompt);
							updateinput = input.next();
							switch(updateinput){
								
								case "0"-> System.out.println("goodbye to Auto update of date and time");
								default ->System.out.println("invalid number");
							}
							}
						}
							case "0"->System.out.println("");
							default->System.out.print("enter a valid number");

					}
						}
				}
							
				case "12"-> {
						 String Profilesinput = "100";
								while(!Profilesinput.equalsIgnoreCase("0")){
								String Profilesprompt = """
								PROFILES		
								0-> back
							""";
							System.out.print(Profilesprompt);
							Profilesinput = input.next();
							switch(Profilesinput){
								
								case "0"-> System.out.println("goodbye to Profiles");
								default ->System.out.println("invalid number");
							}
							}
						}
				case "13"-> {
						 String servicesinput = "100";
								while(!servicesinput.equalsIgnoreCase("0")){
								String servicesprompt = """
								SIM SERVICE		
								0-> back
							""";
							System.out.print(servicesprompt);
							servicesinput = input.next();
							switch(servicesinput){
								
								case "0"-> System.out.println("goodbye to Sim services");
								default ->System.out.println("invalid number");
							}
							}
						}
				case "0"-> System.out.println("Good bye");
				default->System.out.println("enter a valid number");

}
}
}
}



