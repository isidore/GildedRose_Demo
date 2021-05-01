set theResponse to display dialog "Commit Message?" default answer "" with icon note buttons {"Cancel", "Continue"} default button "Continue"
--> {button returned:"Continue", text returned:"Jen"}
log (text returned of theResponse)