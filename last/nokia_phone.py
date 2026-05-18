print(">>>>> NOKIA PHONE <<<<<")
print("1: Phone book")
print("2: Messages")
print('3: Chat')
print('4: Call register')
print('5: Tones')
print('6: Settings')
print('7: Phone settings')
print('8: Games')
print('9: Calculator')
print('10: Reminders')
print('11: Clock')
print('12: Profiles')
print('13: SIM services')
options = int(input('\nEnter option 1 to 13: '))


match (options) :                                       #START
    case 1 :
        print("\n== PHONE BOOK ==")
        print("1: Search")
        print("2: Service Nos")
        print("3: Add name")
        print("4: Erase")
        print("5: Edit")
        print("6: Assign tone")
        print("7: Send b'card")
        print("8: Options")
        print("9: Speed dials")
        print("10: Voice tags")

        phone = (int(input("\nSelect option 1 to 10: ")))
        match (phone) :
            case 1 :
                print("\n> Search")
            case 2 :
                print("\n> Service Nos")
            case 3 :
                print("\n> Add name")
            case 4 :
                print("\n> Erase")
            case 5 :
                print("\n> Edit")
            case 6 :
                print("\n> Assign tone")
            case 7 :
                print("\n> Send b'card")
            case 8 :
                print("\n= Options =")  
                print("1: Type of view")  
                print("2: Memory status")    
                option_eight = (int(input("Choose option 1 or 2: ")))
                match (option_eight) :
                    case 1:
                        print("\n> Type of view")
                    case 2:
                        print("\n> Memory status")

            case 9 :
                print("\n> Speed dails")
            case 10 :
                print("\n> Voice tags")
            case _ :
                print("\n> Invalid input try again")    #STOP


    case 2 :                                                                            #START
         print("\n== MESSAGES ==")
         print("1: Write messages")
         print("2: Inbox")
         print("3: Outbox")
         print("4: Picture messages")
         print("5: Template")
         print("6: Smileys")
         print("7: Message Settings")
         print("8: Info service")
         print("9: Voice mailbox number")
         print("10: Service command editor")

         message = (int(input("\nSelect option 1 to 10: ")))
         match (message) :
            case 1 :
                print("\n> Write messages")
            case 2 :
                print("\n> Inbox")
            case 3 :
                print("\n> Outbox")
            case 4 :
                print("\n> Picture messages")
            case 5 :
                print("\n> Template")
            case 6 :
                print("\n> Smileys")
            case 7 :
                print("\n= Messages Settings =")
                print("1: Set")  
                print("2: Common")    
                option_seven = (int(input("Choose option 1 or 2: ")))
                match (option_seven) :
                    case 1:
                        print("\n> Set <")
                        print("1: Message centre number")  
                        print("2: Messages sent as") 
                        print("3: Message validity")
                        seven = (int(input("Choose option 1 or 2: ")))
                        match (seven) : 
                            case 1 :
                                print("\n> Message centre number")  
                            case 2 :
                                print("\n> Messages sent as") 
                            case 3 :
                                print("\n> Message validity")     
                            case _ :
                                print("Invalid input try again")                   
                    case 2:
                        print("\n> Common <")
                        print("1: Delivery reports")  
                        print("2: Reply via same centre") 
                        print("3: Character support")
                        common = (int(input("Choose option 1 or 2: ")))
                        match (common) :
                            case 1 :
                                print("\n> Delivery reports")  
                            case 2 :
                                print("\n> Reply via same centre") 
                            case 3 :
                                print("\n> Character support")
                            case _ :
                                print("Invalid input try again") 

            case 8 :
                print("\n> Info services")  
            case 9 :
                print("\n> Voice mailbox number")
            case 10 :
                print("\n> Service command editor")
            case _ :
                print("\n> Invalid input try again")                                  #STOP




    case 3 :
        print('\n== CHAT  ==')


    case 4:                                                                                     #START
        print('\n== CALL REGISTER ==')
        print("1: Missed calls")
        print("2: Recieve calls")
        print("3: Dialled numbers")
        print("4: Erase recent call lists")
        print("5: Show call duration")
        print("6: Show call costs")
        print("7: Call cost Settings")
        print("8: Prepaid credit")

        call_register = int(input("\n> Select option 1 to 8: "))
        match(call_register) :
            case 1 :
                print("\n> Missed calls")
            case 2 :
                print("\n> Recieve calls")
            case 3 :
                print("\n> Dailed numbers")
            case 4 :
                print("\n> Erase recent call lists")
            case 5 :
                print("\n= Show call duration =")
                print("1: Last call duration")
                print("2: All calls duration")
                print("3: Recieved calls duration")
                print("4: Dialled calls duration")
                print("5: Clear timers")
                duration = int(input("\nChoose from 1 to 5: "))
                match (duration) :
                    case 1 :
                        print("\n> Last call duration")
                    case 2 :
                        print("\n> All calls duration")
                    case 3 :
                        print("\n> Recieved calls duration")
                    case 4 :
                        print("\n> Dialled calls duration")
                    case 5 :
                        print("\n> Clear timers")
                    case _ :
                        print("\n> Invalid input try again")   

            case 6 :
                print("\n= Call cost settings =")
                print("1: Last call cost")
                print("2: All calls' cost")
                print("3: Clear counters")

                call_cost = int(input("\nChoose from 1 to 3: "))
                match (call_cost) :
                    case 1 :
                        print("\n> Last call cost")
                    case 2 :
                        print("\n> All calls' cost")
                    case 3 :
                        print("\n> Clear counters")
                    case _ :
                        print("\n> Invalid input try again")   


            case 7 :
                print("\n= Send b'card =")
                print("1: Call cost limit")
                print("2: Show cost in")

                send = int(input("\nChoose from 1 to 3: "))
                match (send) :
                    case 1 :
                        print("\n> Call cost limit")
                    case 2 :
                        print("\n> Show cost in")
                    case _ :
                        print("\n> Invalid input try again")

            case 8 :
                print("\n> Prepaid credi")  
            case _ :
                print("\n> Invalid input try again")    #STOP


    case 5:
        print('\n== TONES ==')
        print("1: Ringing tone")
        print("2: Ringing volume")
        print("3: Incoming call alert")
        print("4: Composer")
        print("5: Message alert tone")
        print("6: Keypad tones")
        print("7: Warning and game tones")
        print("8: Vibrating alert")
        print("9. Screen saver")
        tone = int(input("\nSelect from 1 to 9: "))
        match (tone) :
            case 1 :
                print("\n> RInging tone")
            case 2 :
                print("\n> Ringing volume")
            case 3 :
                print("\n> Incoming call alert")
            case 4 :
                print("\n> Composer")
            case 5 :
                print("\n> Message alert tone")
            case 6 :
                print("\n> Keypad tones")
            case 7 :
                print("\n> Warning and games tones")
            case 8 :
                print("\n> Vibrating alert")  
            case 9 :
                print("\n> Screen saver")  
            case _ :
                print("\n> Invalid input try again")    #STOP


    case 6:
        print('\n== SETTINGS ==')
        print('1: Call settings')
        print('2: Phone settings')
        print('3: Security settings')
        print('4: Restore factory settings')
        set = int(input('\nEnter option: '))
        match(set):
            case 1 :
                print('\n> Call settings <')
                print('1: Automatic redail')
                print('2: Speed dialling')
                print('3: Call waiting options')
                print('4: Own number sending')
                print('5: Phone line in use')
                print('6: Automatic answer')
                call_setting = int(input('\nSelect options: '))
                match(call_setting):
                    case 1 :
                        print('\n> Automatic redail')
                    case 2 :
                        print('\n> Speed dialling')
                    case 3 :
                        print('\n> Call waiting options')
                    case 4 :
                        print('\n> Own number sending')
                    case 5 :
                        print('\n> Phone line in use')
                    case 6 :
                        print('\n> Automatic answer')
                    case _:
                        print('\n> Invalid input try again')

            case 2 :
                print('\n> Phone settings <')
                print('1: Language')
                print('2: Cell info display')
                print('3: Welcome note')
                print('4: Network selection')
                print('5: Lights')
                print('6: Confirm SIM service actions')
                phone_set = int(input('\nEnter option: '))
                match(phone_set):
                    case 1 :
                        print('\n> Language')
                    case 2 :
                        print('\n> Cell info display')
                    case 3 :
                        print('\n> Welcome note')
                    case 4 :
                        print('\n> Network selection')
                    case 5 :
                        print('\n> Lights')
                    case 6 :
                        print('\n> Confirm SIM service actions')
                    case _:
                        print('\n> Invalid input')


            case 3 :
                print('\n> Security settings <')
                print('1: PIN code request')
                print('2: Call baring service')
                print('3: Fixed dialling')
                print('4: Closed user group')
                print('5: Phone security')
                print('6: Change access codes')
                secure = int(input('\nSelect option: '))
                match(secure):
                    case 1 :
                        print('\n> PIN code request')
                    case 2 :
                        print('\n> Call baring service')
                    case 3 :
                        print('\n> Fixed dialling')
                    case 4 :
                        print('\n> Closed user group')
                    case 5 :
                        print('\n> Phone security')
                    case 6 : 
                        print('\n> Change access codes')
                    case _:
                        print('\n> Invalid input try again')

            case 4 :
                print('\n> Restore factory settings')


    case 7 :
        print('\n== PHONE SETTINGS ==')
    case 8 :
        print('\n== GAMES ==')
    case 9 :
        print('\n== CALCULATOR ==')
    case 10 :
        print('\n== REMINDERS ==')
    case 11 :
        print('\n== CLOCK ==')
        print('1: Alarm clock')
        print('2: Clock settings')
        print('3: Date setting')
        print('4: Stopwatch')
        print('5: Countdown timer')
        print('6: Auto update of date and time')
        clock = int(input('Enter option: '))
        match(clock):
            case 1 :
                print('\n> Alarm clock')
            case 2 :
                print('\n> Clock settings')
            case 3 :
                print('\n> Date setting')
            case 4 :
                print('\n> Stopwatch')
            case 5 :
                print('\n> Countdown timer')
            case 6 :
                print('\n> Auto update of date and time')
            case _:
                print('\n> Invalid input try again')

    case 12 :
        print('\n== PROFILES ==')
    case 13 :
        print('\n== SIM SERVICES ==')

    case _ :
        print("\nInvalid input try again")



