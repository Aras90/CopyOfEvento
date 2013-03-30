/*
 * Copyright 2006 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package Evento.action;

import com.opensymphony.xwork2.ActionSupport;
import java.util.Date;
import com.opensymphony.xwork2.conversion.annotations.Conversion;
import com.opensymphony.xwork2.conversion.annotations.TypeConversion;

import java.util.List;
import Evento.model.Picture;
import Evento.bean.MainClass;

/**
 * 
 */
@Conversion()
public class MojeAlbumyAction extends ActionSupport {
    
    private Date now = new Date(System.currentTimeMillis());
    private List<Picture> listaPictures;
    private String cycki = "https://photos-1.dropbox.com/t/0/AAC2EfPBYFLpt9yOySppjbqMRo1OUk4ST_s0URFXEdQH6g/12/119820711/jpeg/32x32/3/1364662800/0/2/cycki.jpg/NXqSm__xCPUrnEQG0rCXJMOEDoYCVXVyrhHIHWnWIw0?size=1024x768";
    @TypeConversion(converter = "Evento.DateConverter")
    public Date getDateNow() { return now; }
    public String getCycki() { return cycki;}
    
    public void setListaPictures(){
    	MainClass mc = new MainClass();
    	listaPictures = mc.getUserPicturesData(1);
    }
    
    public String execute() throws Exception {
        now = new Date(System.currentTimeMillis());
        //setListaPictures();
        return SUCCESS;
    }
    

    
}