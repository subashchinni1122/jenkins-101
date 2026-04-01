
def call()
{
  def scriptContent=libraryResource('scripts/install_chrome.sh')
    sh 'chmod +x ./install_chrome.sh'
}
