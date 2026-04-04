def call()
{
    pipeline
    {
        agent{label 'Built-In Node'}
        stages{
            stage('Install Chrome')
                  {
                      steps{installChrome()}
                  }
            }
    }
}
