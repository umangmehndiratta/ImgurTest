# Android application using Imgur API
Loading Imgur images using clean architecture

## Prereqs

- Android Studio 4.0.1
- SDK 21+

## Features

Application that allows searching images using https://apidocs.imgur.com/. Internet availability validation,Filter button is used for searches for the top images of the week from
the Imgur gallery and displays them in a list witholding characteristics like various list types as Grid,List, Staggered and title, date of the post in local time, number of additional images in the post.

## Overall Architecture 

App is based on **MVVM** architecture. Structure is broken down by the general purpose of contained source files. Below are the dependencies used in the project

1. **Clean Architecture** : Used for structuring the project.
2. **Coroutines** : Used for asynchronous or non-blocking programming.
3. **RoomDB** : Used for storing images and populating when no internet is available.
4. **Retrofit2** : Used for calling Imgur Gallery API.
5. **LiveData** : Used for reactive programming
6. **Glide** : Used for loading gallery images.
