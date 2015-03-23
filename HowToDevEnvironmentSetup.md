# Introduction #

  1. Download and install the [JDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk-7u3-download-1501626.html) appropriate for your platform.
  1. Download and install the [Eclipse IDE for Java Developers](http://www.eclipse.org/downloads/packages/eclipse-ide-java-developers/indigosr2) appropriate for your platform.
  1. Using the built-in Eclipse software installer (Help...->Install New Software...).

![http://andrew.unet.maine.edu/eclipsesetup/image1.png](http://andrew.unet.maine.edu/eclipsesetup/image1.png)

Select "All Available Sites" from the "work with" field, and enter "git" in the filter text field.  Check the box for "Eclipse Egit" under the collaboration branch, and click "Finish" at the bottom to install it.

![http://andrew.unet.maine.edu/eclipsesetup/image2.png](http://andrew.unet.maine.edu/eclipsesetup/image2.png)


# Details #

## Obtaining the repository ##
  1. Select the "Git Repository" perspective.

![http://andrew.unet.maine.edu/eclipsesetup/image3.png](http://andrew.unet.maine.edu/eclipsesetup/image3.png)

You may get a message complaining that HOME is not set.  Decide if you want to do anything about it.  In my case I felt the default behavior was acceptable, so I continued without correcting it.
  1. Click "Clone a Git repository".

![http://andrew.unet.maine.edu/eclipsesetup/image4.png](http://andrew.unet.maine.edu/eclipsesetup/image4.png)

  1. In the URI field, enter: `https://\<your-gmail-username>@code.google.com/p/media-player-sync/`.
  1. In the password field, enter the Google code password obtained for your account here: http://code.google.com/hosting/settings.
  1. Optionally check the "Store in Secure Store" box, then click "Next".

![http://andrew.unet.maine.edu/eclipsesetup/image5.png](http://andrew.unet.maine.edu/eclipsesetup/image5.png)

  1. Make sure the master branch is selected, and click "Next"

![http://andrew.unet.maine.edu/eclipsesetup/image6.png](http://andrew.unet.maine.edu/eclipsesetup/image6.png)

  1. To save doing it later, select the checkbox for "Import all existing projects after clone finishes".  Then click "Finish".

![http://andrew.unet.maine.edu/eclipsesetup/image7.png](http://andrew.unet.maine.edu/eclipsesetup/image7.png)

  1. Switch back to the Java perspective.  You should see the newly imported project "media-player-sync" in the project list.

![http://andrew.unet.maine.edu/eclipsesetup/image10.png](http://andrew.unet.maine.edu/eclipsesetup/image10.png)


## Syncing your changes ##

After modifying or creating new source files, you'll want to put those changes back in to the repository for other developers to see.  It is easy.

  1. Right-click the project name, go to the "Team" menu, and click "Commit..."

![http://andrew.unet.maine.edu/eclipsesetup/image8.png](http://andrew.unet.maine.edu/eclipsesetup/image8.png)

Your changes have now been saved to your local copy of the repository.  You still need to push your local repository changes to the online repository.
  1. Right-click the project name, go to the "Team" menu again, and this time click "Push to upstream".

![http://andrew.unet.maine.edu/eclipsesetup/image9.png](http://andrew.unet.maine.edu/eclipsesetup/image9.png)

This will send your local copy of the repository away to be committed with the official repository.

Note there are multiple ways to do this process.  You might prefer to use "Synchronize Workspace" instead of the above separate steps.  Fundamentally, though, the concepts are the same: you work on the project files, you sync to your local copy of the repository, and then you sync your local copy of the repository with "upstream", i.e. the "official" online code repository.