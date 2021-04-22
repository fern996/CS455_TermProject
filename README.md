# Elements

## Project Description:
Elements is an periodic table, android app. The main goal of this
project is to use best android practices to develop an app that is both
functional and usable.

The app is simple and easy to use.

![Na Gif](https://media.giphy.com/media/2y2ZqSLwLYocfHyfFY/giphy.gif)
![Hf Gif](https://media.giphy.com/media/4y58N7FpfTpT4zWfaw/giphy.gif)

### Design:
The app was originally based of the MVC design pattern. The model was
going to be a database using the Room database library. But due to time
and difficulties implementing the database, I pivoted to putting all the
elemental data into an activity. This helped me to create a working app
but, I believe, also reduced the number of ways I could use the data.
For e.g., filtering, search functions.

The project makes extensive use of activity and activity intents to pass
data along. Another quirk of building the app was the use of repeated
text views in the layout. They number 118 in total. Android Studio does
give an optimization warning, but I believe it was necessary for me to
complete the project. Also, along with creating 118 text views I had to
create 118 other things to support it. Entering data for all the
elements took some time to complete.

## Installation:
1. Download the .apk file onto your android device, preferably a phone.
2. Navigate to your phone settings menu and go to the securities
   settings. Enable Install from Unknown Sources option.
3. Using a file browser, open the .apk to install.
4. The app should be safely installed.

**OR**

1. Clone the repository.
2. Using Android Studio build and run on an emulator.

## Operating Instructions:
+ The app will open by default in landscape.
+ Tap on the different elements on the table to view their details.
+ Tap the back button to go back to the periodic table.

## Manifest:
- Layout:
  - activity_element_details.xml
  - activity_main.xml
- Activity:
  - ElementDetail.kt
  - MainActivity.kt
- Values:
  - colors.xml
  - elementStyle.xml
  - Strings.xml
- Assets:
  - app icon.jpeg
- Drawable:
  - *Contains .jpg for each element*

## Contact:
For bug fixes or pest control please email me at: sfz421@uregina.ca

## Licensing:
This project is licensed under GNU GENERAL PUBLIC LICENSE Version 3.
Please read LICENSE for more information.




