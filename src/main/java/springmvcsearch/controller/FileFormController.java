package springmvcsearch.controller;

import java.io.File;
import java.io.FileOutputStream;

import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileFormController {

	@RequestMapping(path = "/fileform", method = RequestMethod.GET)
	public String showFileForm() {

		return "fileform";
	}

	@RequestMapping(path = "/upload", method = RequestMethod.POST)
	public String uploadFile(@RequestParam("image") CommonsMultipartFile file, HttpSession session, Model m ) {
		System.out.println("file upload successful");
		
		String test = null;	
		System.out.println(test.length());
		
		System.out.println(file.getSize());
		System.out.println(file.getContentType());
		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getStorageDescription());

		byte[] data = file.getBytes();

		// save this file to server

		String path = session.getServletContext().getRealPath("/") + "WEB-INF"+File.separator+"resources"+File.separator+"images"+File.separator+file.getOriginalFilename();
		System.out.println(path);
		try {

			FileOutputStream fos = new FileOutputStream(path);
			fos.write(data);
			fos.close();
			System.out.println("File uploaded");
			m.addAttribute("filename", file.getOriginalFilename());
			m.addAttribute("msg", "Uploaded successfully");

		} catch (Exception e) {
			e.printStackTrace();
			m.addAttribute("msg", "Uploading error");
		}

		return "filesuccess";
	}

}
