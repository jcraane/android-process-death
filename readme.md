Simple app which demonstrates how to receover from process death. Process death means your app can be killed at any time
by the OS if it is in paused or stopped state.

To simulate process death:
1. Start your app
2. Press the HOME button
3. Press the Terminate application button in the Logcat (make sure your app is selected in the process selector)
4. Open the task list and select your application. Your app resumes the activity where it left of.

As developer you are responsible for saving any state that is not persisted when process death occurs. One way to do this
is using the viewModels SavedStateHandle. That method is demonstrated in this sample app, specifically in the MyViewModel class.