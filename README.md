# Miwok Language App With RecyclerView and MediaPlayer
An Android app that displays a list of words/phrases in the Miwok language and their English translations, and plays the audio of the Miwok pronounciation when a word is selected

Miwok is an endangered language, belonging to the identically named Native American group “Miwok” who lived in what is now Northern California. 
This app is an attempt to keep the language alive and helps people learn how to translate basic words/phrases from Miwok to English.

The first screen of the app displays four categories for the user to choose from. 
Selecting any of these categories takes the user to a new screen with a RecyclerView displaying the Miwok word/phrase, the English translation, and for most categories, an image associated with the word.
When a word is selected, the audio file with the Miwok translation of the word is played.
An instance MediaPlayer is used for the audio, and released when the audio file has completed.

*Based on the Miwok app in Udacity's "Android Basics: Multiscreen Apps" course. However, they don't use a RecyclerView in their app*

![Screenshot of app](https://github.com/alj968/UdacityMultiscreenApps_MiwokAppWithRecyclerView/blob/master/MiwokCategories.png "Screenshot 1 of app, Initial Screen - Categories")

![Screenshot of app](https://github.com/alj968/UdacityMultiscreenApps_MiwokAppWithRecyclerView/blob/master/MiwokNumbers1.png "Screenshot 2 of app, Numbers Category")

![Screenshot of app](https://github.com/alj968/UdacityMultiscreenApps_MiwokAppWithRecyclerView/blob/master/MiwokNumbers2.png "Screenshot 3 of app, Numbers Category, Scrolled Down to Bottom")

![Screenshot of app](https://github.com/alj968/UdacityMultiscreenApps_MiwokAppWithRecyclerView/blob/master/MiwokFamily.png "Screenshot 4 of app, Family Members Category")

![Screenshot of app](https://github.com/alj968/UdacityMultiscreenApps_MiwokAppWithRecyclerView/blob/master/MiwokColors.png "Screenshot 5 of app, Colors Category")

![Screenshot of app](https://github.com/alj968/UdacityMultiscreenApps_MiwokAppWithRecyclerView/blob/master/MiwokPhrases.png "Screenshot 6 of app, Phrases Category")
