# ParseApp
Android app using Parse SDK as backend with a Facebook Login.

Demonstration of an app that uses Parse Android SDK to help maintain a backend server 
for the app. Also integrated is Facebook's SDK in order to initiate a Facebook log in.
The Facebook SDK is used to pull relevant user data required for sign up, then push
this data and store it in Parse. 

When a returning user logs in, we pull their data
from Parse and display.

NOTE: Be sure to replace your Facebook AppID in strings.xml,
Parse Application ID and Client Key in MyApp.java.
