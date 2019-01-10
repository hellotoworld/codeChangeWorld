public static boolean isHostConnectable(String host, int port) {
        Socket socket = new Socket();
        try {
            socket.connect(new InetSocketAddress(host, port));
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return true;
    }
    
    public static boolean isHostReachable(String host, Integer timeOut) {
        try {
            return InetAddress.getByName(host).isReachable(timeOut);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    
    /**
	 * unicode转汉字
	 * @param unicodeString
	 * @return
	 */
	private String unicodeToString(String unicodeString) {
    logger.info("unicodeString is " + unicodeString);
		for(char c : unicodeString.toCharArray()){  
            return String.valueOf(c);  
        }
		return "";
	}
