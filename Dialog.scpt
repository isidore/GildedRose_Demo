set theResponse to display dialog "Commit Message?" default answer "" with icon note buttons {"Cancel", "Continue"} default button "Continue"
--> {button returned:"Continue", text returned:"Jen"}
copy (text returned of theResponse) to stdout