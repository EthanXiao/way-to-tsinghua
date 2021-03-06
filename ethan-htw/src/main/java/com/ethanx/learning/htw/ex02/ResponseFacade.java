package com.ethanx.learning.htw.ex02;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletResponse;

/**
 * Created by xiaoxin on 2018/2/25.
 */
public class ResponseFacade implements ServletResponse {

  private Response response;

  public ResponseFacade(Response response) {
    this.response = response;
  }

  public String getCharacterEncoding() {
    return response.getCharacterEncoding();
  }

  public String getContentType() {
    return response.getContentType();
  }

  public ServletOutputStream getOutputStream() throws IOException {
    return response.getOutputStream();
  }

  public PrintWriter getWriter() throws IOException {
    return response.getWriter();
  }

  public void setCharacterEncoding(String charset) {
    response.setCharacterEncoding(charset);
  }

  public void setContentLength(int len) {
    response.setContentLength(len);
  }

  public void setContentLengthLong(long len) {
    response.setContentLengthLong(len);
  }

  public void setContentType(String type) {
    response.setContentType(type);
  }

  public void setBufferSize(int size) {
    response.setBufferSize(size);
  }

  public int getBufferSize() {
    return response.getBufferSize();
  }

  public void flushBuffer() throws IOException {
    response.flushBuffer();
  }

  public void resetBuffer() {
    response.resetBuffer();
  }

  public boolean isCommitted() {
    return response.isCommitted();
  }

  public void reset() {
    response.reset();
  }

  public void setLocale(Locale loc) {
    response.setLocale(loc);
  }

  public Locale getLocale() {
    return response.getLocale();
  }
}
