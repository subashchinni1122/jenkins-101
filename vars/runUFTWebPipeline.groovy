def call()
{
    pipeline
    {
        agent{label 'EC2Instance'}
        stages{
            stage(Install Chrome')
                  {
                      steps{installChrome()}
                  }
            }
    }
    #sh 'echo Hi this is from Devops and its a Shared Library'
}
