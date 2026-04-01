set -e
echo "installing google chrome"
        CHROME_VERSION="stable"
        ARCH="x86_64"
        CHROME_RPM="google-chrome-${CHROME_VERSION}_current_${ARCH}.rpm"
        CHROME_URL="https://d1.google.com/linux/direct/${CHROME_RPM}"
        curl -O "$CHROME_URL"
        echo "instaling chrome"
        sudo yum install -y "./$CHROME_RPM"
        CHROMEDRIVER_PATH= '/usr/local/bin'
        #echo "Chrome driver will be installed on $chrome_version"
