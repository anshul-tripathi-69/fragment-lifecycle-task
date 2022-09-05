# scenarios
- on starting the app


2022-08-24 10:33:08.907 5892-5892/com.example.fragmentlifecycle D/MainActivity: onCreate called
2022-08-24 10:33:08.920 5892-5892/com.example.fragmentlifecycle D/MyFragment: onAttach called
2022-08-24 10:33:08.920 5892-5892/com.example.fragmentlifecycle D/MyFragment: onCreate called
2022-08-24 10:33:08.920 5892-5892/com.example.fragmentlifecycle D/MyFragment: onCreateView called
2022-08-24 10:33:08.923 5892-5892/com.example.fragmentlifecycle D/MyFragment: onViewCreated called
2022-08-24 10:33:08.925 5892-5892/com.example.fragmentlifecycle D/MyFragment: onActivityCreated called
2022-08-24 10:33:08.925 5892-5892/com.example.fragmentlifecycle D/MyFragment: onViewStateRestored called
2022-08-24 10:33:08.926 5892-5892/com.example.fragmentlifecycle D/MyFragment: onStart called
2022-08-24 10:33:08.927 5892-5892/com.example.fragmentlifecycle D/MainActivity: onStart called
2022-08-24 10:33:08.928 5892-5892/com.example.fragmentlifecycle D/MainActivity: onResume called
2022-08-24 10:33:08.928 5892-5892/com.example.fragmentlifecycle D/MyFragment: onResume called


- on pressing home button

2022-08-24 10:23:04.005 5238-5238/com.example.fragmentlifecycle D/MyFragment: onPause called
2022-08-24 10:23:04.006 5238-5238/com.example.fragmentlifecycle D/MainActivity: onPause called
2022-08-24 10:23:04.436 5238-5238/com.example.fragmentlifecycle D/MyFragment: onStop called
2022-08-24 10:23:04.437 5238-5238/com.example.fragmentlifecycle D/MainActivity: onStop called
2022-08-24 10:23:04.442 5238-5238/com.example.fragmentlifecycle D/MyFragment: onSaveInstanceState called
2022-08-24 10:23:04.443 5238-5238/com.example.fragmentlifecycle D/MainActivity: onSaveInstanceState called


- on coming back to the app 

2022-08-24 10:23:33.251 5238-5238/com.example.fragmentlifecycle D/MainActivity: onRestart called
2022-08-24 10:23:33.253 5238-5238/com.example.fragmentlifecycle D/MyFragment: onStart called
2022-08-24 10:23:33.253 5238-5238/com.example.fragmentlifecycle D/MainActivity: onStart called
2022-08-24 10:23:33.254 5238-5238/com.example.fragmentlifecycle D/MainActivity: onResume called
2022-08-24 10:23:33.254 5238-5238/com.example.fragmentlifecycle D/MyFragment: onResume called


- on pressing the app switch button (and coming back to the app)

* Nothing *

- on clearing the app from memory

2022-08-24 10:17:34.861 4885-4885/com.example.fragmentlifecycle D/MyFragment: onPause called
2022-08-24 10:17:34.861 4885-4885/com.example.fragmentlifecycle D/MainActivity: onPause called
2022-08-24 10:17:34.868 4885-4885/com.example.fragmentlifecycle D/MyFragment: onStop called
2022-08-24 10:17:34.868 4885-4885/com.example.fragmentlifecycle D/MainActivity: onStop called
2022-08-24 10:17:34.869 4885-4885/com.example.fragmentlifecycle D/MyFragment: onSaveInstanceState called


- on pressing the app switch button and navigating to another app

2022-08-24 10:30:23.868 5707-5707/com.example.fragmentlifecycle D/MyFragment: onPause called
2022-08-24 10:30:23.868 5707-5707/com.example.fragmentlifecycle D/MainActivity: onPause called
2022-08-24 10:30:24.251 5707-5707/com.example.fragmentlifecycle D/MyFragment: onStop called
2022-08-24 10:30:24.251 5707-5707/com.example.fragmentlifecycle D/MainActivity: onStop called
2022-08-24 10:30:24.252 5707-5707/com.example.fragmentlifecycle D/MyFragment: onSaveInstanceState called
2022-08-24 10:30:24.252 5707-5707/com.example.fragmentlifecycle D/MainActivity: onSaveInstanceState called

- on coming back to the app from another app

2022-08-24 10:30:48.634 5707-5707/com.example.fragmentlifecycle D/MainActivity: onRestart called
2022-08-24 10:30:48.635 5707-5707/com.example.fragmentlifecycle D/MyFragment: onStart called
2022-08-24 10:30:48.635 5707-5707/com.example.fragmentlifecycle D/MainActivity: onStart called
2022-08-24 10:30:48.635 5707-5707/com.example.fragmentlifecycle D/MainActivity: onResume called
2022-08-24 10:30:48.635 5707-5707/com.example.fragmentlifecycle D/MyFragment: onResume called

- on pressing volume keys

* Nothing *

- on pulling notification drawer

* Nothing *

- on using the app in split screen

2022-08-24 10:31:44.237 5707-5707/com.example.fragmentlifecycle D/MyFragment: onPause called
2022-08-24 10:31:44.237 5707-5707/com.example.fragmentlifecycle D/MainActivity: onPause called
2022-08-24 10:31:44.254 5707-5707/com.example.fragmentlifecycle D/MyFragment: onStop called
2022-08-24 10:31:44.254 5707-5707/com.example.fragmentlifecycle D/MainActivity: onStop called
2022-08-24 10:31:44.254 5707-5707/com.example.fragmentlifecycle D/MyFragment: onSaveInstanceState called
2022-08-24 10:31:44.254 5707-5707/com.example.fragmentlifecycle D/MainActivity: onSaveInstanceState called
2022-08-24 10:31:45.878 5707-5707/com.example.fragmentlifecycle D/MyFragment: onDestroyView called
2022-08-24 10:31:45.880 5707-5707/com.example.fragmentlifecycle D/MyFragment: onDestroy called
2022-08-24 10:31:45.882 5707-5707/com.example.fragmentlifecycle D/MainActivity: onDestroy called
2022-08-24 10:31:45.919 5707-5707/com.example.fragmentlifecycle D/MyFragment: onAttach called
2022-08-24 10:31:45.920 5707-5707/com.example.fragmentlifecycle D/MyFragment: onCreate called
2022-08-24 10:31:45.921 5707-5707/com.example.fragmentlifecycle D/MainActivity: onCreate called
2022-08-24 10:31:45.922 5707-5707/com.example.fragmentlifecycle D/MyFragment: onCreateView called
2022-08-24 10:31:45.923 5707-5707/com.example.fragmentlifecycle D/MyFragment: onViewCreated called
2022-08-24 10:31:45.924 5707-5707/com.example.fragmentlifecycle D/MyFragment: onActivityCreated called
2022-08-24 10:31:45.924 5707-5707/com.example.fragmentlifecycle D/MyFragment: onViewStateRestored called
2022-08-24 10:31:45.924 5707-5707/com.example.fragmentlifecycle D/MyFragment: onStart called
2022-08-24 10:31:45.924 5707-5707/com.example.fragmentlifecycle D/MainActivity: onStart called
2022-08-24 10:31:45.924 5707-5707/com.example.fragmentlifecycle D/MainActivity: onResume called
2022-08-24 10:31:45.925 5707-5707/com.example.fragmentlifecycle D/MyFragment: onResume called

- on switching back to single screen from split screen

2022-08-24 10:44:06.138 6356-6356/com.example.fragmentlifecycle D/MyFragment: onPause called
2022-08-24 10:44:06.138 6356-6356/com.example.fragmentlifecycle D/MainActivity: onPause called
2022-08-24 10:44:06.139 6356-6356/com.example.fragmentlifecycle D/MyFragment: onStop called
2022-08-24 10:44:06.139 6356-6356/com.example.fragmentlifecycle D/MainActivity: onStop called
2022-08-24 10:44:06.140 6356-6356/com.example.fragmentlifecycle D/MyFragment: onSaveInstanceState called
2022-08-24 10:44:06.141 6356-6356/com.example.fragmentlifecycle D/MainActivity: onSaveInstanceState called
2022-08-24 10:44:06.143 6356-6356/com.example.fragmentlifecycle D/MyFragment: onDestroyView called
2022-08-24 10:44:06.143 6356-6356/com.example.fragmentlifecycle D/MyFragment: onDestroy called
2022-08-24 10:44:06.144 6356-6356/com.example.fragmentlifecycle D/MainActivity: onDestroy called
2022-08-24 10:44:06.175 6356-6356/com.example.fragmentlifecycle D/MyFragment: onAttach called
2022-08-24 10:44:06.175 6356-6356/com.example.fragmentlifecycle D/MyFragment: onCreate called
2022-08-24 10:44:06.177 6356-6356/com.example.fragmentlifecycle D/MainActivity: onCreate called
2022-08-24 10:44:06.179 6356-6356/com.example.fragmentlifecycle D/MyFragment: onCreateView called
2022-08-24 10:44:06.181 6356-6356/com.example.fragmentlifecycle D/MyFragment: onViewCreated called
2022-08-24 10:44:06.181 6356-6356/com.example.fragmentlifecycle D/MyFragment: onActivityCreated called
2022-08-24 10:44:06.181 6356-6356/com.example.fragmentlifecycle D/MyFragment: onViewStateRestored called
2022-08-24 10:44:06.182 6356-6356/com.example.fragmentlifecycle D/MyFragment: onAttach called
2022-08-24 10:44:06.182 6356-6356/com.example.fragmentlifecycle D/MyFragment: onCreate called
2022-08-24 10:44:06.182 6356-6356/com.example.fragmentlifecycle D/MyFragment: onCreateView called
2022-08-24 10:44:06.183 6356-6356/com.example.fragmentlifecycle D/MyFragment: onViewCreated called
2022-08-24 10:44:06.183 6356-6356/com.example.fragmentlifecycle D/MyFragment: onActivityCreated called
2022-08-24 10:44:06.183 6356-6356/com.example.fragmentlifecycle D/MyFragment: onViewStateRestored called
2022-08-24 10:44:06.184 6356-6356/com.example.fragmentlifecycle D/MyFragment: onDestroyView called
2022-08-24 10:44:06.184 6356-6356/com.example.fragmentlifecycle D/MyFragment: onDestroy called
2022-08-24 10:44:06.184 6356-6356/com.example.fragmentlifecycle D/MyFragment: onStart called
2022-08-24 10:44:06.184 6356-6356/com.example.fragmentlifecycle D/MainActivity: onStart called
2022-08-24 10:44:06.186 6356-6356/com.example.fragmentlifecycle D/MainActivity: onResume called
2022-08-24 10:44:06.186 6356-6356/com.example.fragmentlifecycle D/MyFragment: onResume called

- on pressing back button

2022-08-24 10:45:18.111 6356-6356/com.example.fragmentlifecycle D/MyFragment: onPause called
2022-08-24 10:45:18.111 6356-6356/com.example.fragmentlifecycle D/MainActivity: onPause called
2022-08-24 10:45:18.564 6356-6356/com.example.fragmentlifecycle D/MyFragment: onStop called
2022-08-24 10:45:18.564 6356-6356/com.example.fragmentlifecycle D/MainActivity: onStop called
2022-08-24 10:45:18.564 6356-6356/com.example.fragmentlifecycle D/MyFragment: onSaveInstanceState called
2022-08-24 10:45:18.565 6356-6356/com.example.fragmentlifecycle D/MainActivity: onSaveInstanceState called

- on coming back to app after pressing back button

2022-08-24 12:16:16.588 7768-7768/com.example.fragmentlifecycle D/MainActivity: onRestart called
2022-08-24 12:16:16.588 7768-7768/com.example.fragmentlifecycle D/MyFragment: onStart called
2022-08-24 12:16:16.588 7768-7768/com.example.fragmentlifecycle D/MainActivity: onStart called
2022-08-24 12:16:16.589 7768-7768/com.example.fragmentlifecycle D/MainActivity: onResume called
2022-08-24 12:16:16.590 7768-7768/com.example.fragmentlifecycle D/MyFragment: onResume called

- on rotation

2022-08-24 12:16:33.374 7768-7768/com.example.fragmentlifecycle D/MyFragment: onPause called
2022-08-24 12:16:33.374 7768-7768/com.example.fragmentlifecycle D/MainActivity: onPause called
2022-08-24 12:16:33.382 7768-7768/com.example.fragmentlifecycle D/MyFragment: onStop called
2022-08-24 12:16:33.382 7768-7768/com.example.fragmentlifecycle D/MainActivity: onStop called
2022-08-24 12:16:33.383 7768-7768/com.example.fragmentlifecycle D/MyFragment: onSaveInstanceState called
2022-08-24 12:16:33.383 7768-7768/com.example.fragmentlifecycle D/MainActivity: onSaveInstanceState called
2022-08-24 12:16:33.384 7768-7768/com.example.fragmentlifecycle D/MyFragment: onDestroyView called
2022-08-24 12:16:33.385 7768-7768/com.example.fragmentlifecycle D/MyFragment: onDestroy called for fragment number - 
2022-08-24 12:16:33.385 7768-7768/com.example.fragmentlifecycle D/MainActivity: onDestroy called
2022-08-24 12:16:33.415 7768-7768/com.example.fragmentlifecycle D/MyFragment: onAttach called
2022-08-24 12:16:33.416 7768-7768/com.example.fragmentlifecycle D/MyFragment: onCreate called
2022-08-24 12:16:33.417 7768-7768/com.example.fragmentlifecycle D/MainActivity: onCreate called
2022-08-24 12:16:33.419 7768-7768/com.example.fragmentlifecycle D/MyFragment: onCreateView called
2022-08-24 12:16:33.421 7768-7768/com.example.fragmentlifecycle D/MyFragment: onViewCreated called
2022-08-24 12:16:33.421 7768-7768/com.example.fragmentlifecycle D/MyFragment: onActivityCreated called
2022-08-24 12:16:33.421 7768-7768/com.example.fragmentlifecycle D/MyFragment: onViewStateRestored called
2022-08-24 12:16:33.422 7768-7768/com.example.fragmentlifecycle D/MyFragment: onStart called
2022-08-24 12:16:33.422 7768-7768/com.example.fragmentlifecycle D/MainActivity: onStart called
2022-08-24 12:16:33.423 7768-7768/com.example.fragmentlifecycle D/MainActivity: onResume called
2022-08-24 12:16:33.423 7768-7768/com.example.fragmentlifecycle D/MyFragment: onResume called
