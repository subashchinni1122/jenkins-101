def call()
{
    def scriptContent=libraryResource('scripts/install_chrome.sh')
    sh 'chmod +x ./install_chrome.sh'
    #sh 'echo Hi this is from Devops and its a Shared Library'
}
