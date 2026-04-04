def call()
{
    pipeline
    {
        agent{label 'EC2Instance'}
        stages{
            stage('Install Chrome')
                  {
                      steps{installChrome()}
                  }
            }
    }
}
