EECS 481 Software Engineering Fall 2013
Homework 2

Message Recorder App by Christopher Dyer, University of Michigan, Ann Arbor, Class of '14
Last Edited 9/23/2013

===================================================================================
************************************README File************************************
===================================================================================

This README contains information regarding the overall operation of the 
Message Recorder app, dealing mostly with the high-level design. There is also info
concerning where the code is stored and how it can be accessed and built. 
For specifics about implementation, see comments in-code.

===================================================================================
	Overall Functionality
===================================================================================

Message Recorder does just that-- records messages that the user inputs. Upon
starting the app, the user is prompted to enter a message in the appropriate text
field. Upon doing so, and after clicking the record button, the message is added to
a list of messages the user has recorded so far, and the button changes momentarily
to indicate the recording was a success. Clicking the "Display Messages" button will
display a log of the user's previous messages in ascending time order, numbered and
timestamped at the moment of recording.


===================================================================================
	Accessing the Source Code
===================================================================================

Message Recorder's source code is located for public viewing and download on my
"eecs481" repository on Github. To access the code, follow these instructions:

1) Download and install the latest version of Git from http://git-scm.com/downloads
2) Open the Git GUI, either through a GUI or on the Git Bash CLI using the 
	command "git gui".
3) You will be prompted for a source from which to create your local repository. 
	Choose to clone an existing repository.
4) On the next dialogue, enter the HTTPS link to my repository--
	
	https://github.com/AdmiralBetas/eecs481.git
	
	in the field "Source Location". Enter your desired location for the files to go
	in "Target Directory". Make sure to specify a new folder.
5) Press the appropriate button, and the Git GUI will clone my repository's files
	to a local repository on your machine, and will then shift into a new layout with
	various information about the repository.
6) Click "Repository" on the main menu, and then "Explore Working Copy" to open the
	folder containing Message Recorder's source files.
	
====================================================================================
	Building the Code
====================================================================================

Once you have downloaded the source code, you may run Message Recorder yourself. 
Note: it is meant to be built as an Android app in the Eclipse IDE. Please download
and install this free IDE and relevant Android SDK Tools before continuing:

1) Open Eclipse. Click "File" in the main menu bar.
2) In the drop down menu that appears, click "Import".
3) Follow the on-screen dialog, inputting the path to the source code folder.
4) Click "Finish".
5) The folder now appears in your Package Explorer. Right-click it, then click the 
"Run as" option, and then the "1 Android Application" option.
6) If you have a virtual Android device configured, the app should now run.


====================================================================================
************************************************************************************
====================================================================================
That's it. Hope you enjoy the app!
~Chris 