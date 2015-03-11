# Final-Project
Web UI Reporting Every time you check in a HTML code to the repo, we automatically run your web page and capture a screenshot and send it to you, so that you can see the current status of your page. This could be connected with 6.2 Keywords: Web UI, Automated Reporting, Screenshot Capture


Built a Web Service
Web Service Listens to GitHub
Anytime Developers Push to GitHub
Web Service Responds and Trigger the Script




The following includes:
1- Webhook unique payload object that is determined by its event type such as PushEvent
2- Life cycle process of (creating, initializing,destroying)
1- Webhook unique payload object that is determined by its event type such as PushEvent
Triggered when a repository branch is pushed to. 
Note: the example payload below is from a webhook delivery. The Event API PushEvent payload will differ. In our case only 1 event in the array is needed.
Flowing I provide a summary:
Event name push
Payload
Key Type Description
head string The SHA of the HEAD commit on the repository.
ref string The full Git ref that was pushed. Example: “refs/heads/master”
size integer The number of commits in the push.
commits array An array of commit objects describing the pushed commits. (The array includes a maximum of 20 commits. If necessary, you can use the Commits API to fetch additional commits. This limit is applied to timeline events only and isn’t applied to webhook deliveries.)
commits[][sha] string The SHA of the commit.
commits[][message] string The commit message.
commits[][author] object The git author of the commit.
commits[][author][name] string The git author’s name.
commits[][author][email] string The git author’s email address.
commits[][url] url Points to the commit API resource.
commits[][distinct] boolean Whether this commit is distinct from any that have been pushed before.
2- Life cycle process of (creating, initializing,destroying)
Here I explain the whole process of creating and initializing the servlet, using it and destroying it when it is no longer needed. In the GenericServlet abstract class (which is extended by all the other servlet implementations, like the popular HttpServlet), there are three basic methods that achieve the above. 
init(): This method is automatically called whenever a servlet is initialized. The developer does not explicitly call the init() method, instead, it is automatically called the first time the servlet is called through a URL request. Only one instance of each servlet is created and used, and each folowing request creates a new thread that handles it.
service(): This is the main method of handling the requests to the server. This method determines the type of the request (POST, GET, etc) and acts accordingly, by calling the specified methods like doPost() and doGet().
destroy(): The destroy method is working similarly to init(), but trying to achieve the opposite result. It is not a method that is explicitly called by the developer. Instead, when the server (servlet container) decides that the servlet is no longer in use, and its resources should be collected and used somewhere else, the destroy() method is automatically called. In that case we use destroy() to close connections, free resources and generally finalize whatever needs to be finalized for a smooth shutdown of the servlet and no memory leaks. After the servlet is destroyed, the garbage collector collects all the previously held resources.


