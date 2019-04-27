package com.example.filedemo.payload;

public class UploadFileResponse {

    private String fileName;
    private String fileDownloadUri;
    private String fileType;
    private long size;

	public UploadFileResponse(String fileName, String fileDownloadURI, String contentType, long size) {
        this.fileName = fileName;
        this.fileDownloadUri = fileDownloadURI;
        this.fileType = contentType;
        this.size = size;
    }

    /**
     * @return the fileName
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * @param fileName the fileName to set
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * @return the fileDownloadUri
     */
    public String getFileDownloadUri() {
        return fileDownloadUri;
    }

    /**
     * @param fileDownloadUri the fileDownloadUri to set
     */
    public void setFileDownloadUri(String fileDownloadUri) {
        this.fileDownloadUri = fileDownloadUri;
    }

    /**
     * @return the fileType
     */
    public String getFileType() {
        return fileType;
    }

    /**
     * @param fileType the fileType to set
     */
    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    /**
     * @return the size
     */
    public long getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(long size) {
        this.size = size;
    }
    
    @Override
    public String toString() {
        return super.toString();
    }

}