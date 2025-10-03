def get_variable(x):
		return f"{x}\n 0->  BACK \n ENTER A NUMBER"



menu_input = "100"
while menu_input != "0":

	prompt ="""
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
	"""
	print(prompt)

	
	menu_input = input()
	match(menu_input):
		case "1":
			phone_book_input = "100"
			while phone_book_input != "0":
				phone_book ="""
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
"""
				print(phone_book)
				phone_book_input = input()
				match phone_book_input:
				
					case "1":
						search_input = "100"
						while search_input!= "0":
							print(get_variable("SEARCH"))
							search_input = input()
							match search_input:
								case "0": print("goodbye from search")
								case _: print("invalid input")
					case "2": 
						service_input = "100"
						while service_input!= "0":
							print(get_variable("SERVICE"))
							service_input = input()
							match service_input:
								case "0": print("goodbye from service nos")
								case _: print("invalid input")

					case "3": 
						Add_input = "100"
						while Add_input!= "0":
							print(get_variable("ADD"))
							service_input = input()
							match Add_input:
								case "0": print("goodbye from add name")
								case _: print("invalid input")		
					case "4": 
						Erase_input = "100"
						while Erase_input!= "0":
							print(get_variable("ERASE"))
							Erase_input = input()
							match Erase_input:
								case "0": print("goodbye from Erase")
								case _: print("invalid input")		
					case "5": 
						Edit_input = "100"
						while Edit_input!= "0":
							print(get_variable(" EDIT"))
							Edit_input = input()
							match Edit_input:
								case "0": print("goodbye from Edit")
								case _: print("invalid input") 
					case "6": 
						Assign_input = "100"
						while Assign_input!= "0":
							print(get_variable(" ASSIGN TONE"))
							Assign_input = input()
							match Assign_input:
								case "0": print("goodbye from Assign tone")
								case _: print("invalid input")

					case "7":
						send_input = "100"
						while send_input!= "0":
							print(get_variable(" SEND B' CARD"))
							send_input = input()
							match send_input:
								case "0": print("goodbye from send b'card")
								case _: print("invalid input")
			
					case "8":
						option_input ="100"
						while option_input != "0": 
							option ="""
OPTIONS
1-> Type of view
2-> Memory status
ENTER A NUMBER:
 """
							print(option)
							option_input = input()
							match option_input:
								case "1":
									Type_input = "100"
									while Type_input!= "0":
										print(get_variable(" TYPE OF VIEW"))
										Type_input = input()
										match Type_input:
											case "0": print("goodbye from Type of view")
											case _: print("invalid input")
								case "2":	
									Memory_input = "100"
									while Memory_input!= "0":
										print(get_variable(" MEMORY STATUS"))
										Memory_input = input()
										match Memory_input:
											case "0": print("goodbye from Memory status")
											case _: print("invalid input")
								case _: print("enter a valid number")

					case "9":	
						speed_input = "100"
						while speed_input!= "0":
							print(get_variable(" SPEED DIALS"))
							speed_input = input()
							match speed_input:
								case "0": print("goodbye from Speed dials")
								case _: print("invalid input")
					case "10":
						tags_input = "100"
						while tags_input!= "0":
							print(get_variable(" SPEED TAGS"))
							tags_input = input()
							match tags_input:
								case "0": print("goodbye from Speed tags")
								case _: print("invalid input")
					case _: print("enter a valid number")


									
					