package com.fototwist.app;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Environment;
import android.util.Log;

/**
 * @author NICKIT
 *
 */
public final class ConfigUtilString {

	public static final String PREFS_NAME = "fototwist";

	//New modification
	public final static String PREF_FIRST_START = "FIRST_START";
	public final static Boolean D_VALUE_PREF_FIRST_START = false;
	
	public static String captured_image_path = "";
	
	
	public static Bitmap CAMERA_BITMAP=null;
	public static Uri CAMERA_BITMAP_uri=null;
	
	public static Boolean finish = false;
	
	public static Boolean fb_login = false;
	
	public static boolean have_mytags=false; 
	//------End-------


	public static boolean OP_ONLINE = false;

	public static boolean PROP_P_SET = false;
	public static String PROP__PNAME = "";
	public static String PROP_EVENT_NAME = "";
	
	public static int PROP_PRINT = -1;
	public static int PROP_CAMERA = -1;
	public static int PROP_FBSHARE = -1;
	public static String PROP_P_ID = "1";
	public static String PROP_U_ID = "1";
	public static boolean PROP_OPMODEONLINE = true;

	public final static String PREF_POPERTY_U_ID = "U_ID";
	public final static String PREF_POPERTY_P_SET = "P_CONFIG";
	public final static String PREF_POPERTY_P_ID = "P_ID";
	public final static String PREF_POPERTY_DEFAULT_PNAME = "P_NAME";
	public final static String PREF_POPERTY_EVENT_NAME = "EVENT_NAME";
	public final static String PREF_POPERTY_PRINT = "PRINT";
	public final static String PREF_POPERTY_CAMERA = "CAMERA";
	public final static String PREF_POPERTY_FBSHARE = "FBSHARE";
	public final static String PREF_POPERTY_OPMODE = "OPMODE";
	public final static String PREF_POPERTY_FBSTATUS_MSG = "FBSTATMSG";
	public final static String PREF_POPERTY_BT_ADDRESS= "BT_ADDRESS";
	
	public final static String DEFAULT_FBSTATUS_MSG = "Spotted in Auto Expo 2014, at Delhi !";
	public static String PROP_FBSTATUS_MSG = DEFAULT_FBSTATUS_MSG;
	public static final String APPTAG="NICKPHOTOBOOTH";
	public static final String APP_ID ="415400488472400";//NickIT;
	public static final String FBCAPTION =DEFAULT_FBSTATUS_MSG;//+ PROP_FBSTATUS_MSG
		
	/*public static final String APP_ID ="427768983905600";//UB
	public static final String FBCAPTION ="Taken via Spiritz And More Photo Booth.";*/
	
	/*public static final String DOWNLOAD_URL = "http://www.mapmyoffer.com/PBSyncR/resources/FetchData.action";
	public static final String UPLOAD_URL = "http://www.mapmyoffer.com/UploadFileListener/UploadServlet";
	public static final String Sync_URL ="http://www.mapmyoffer.com/PB/SyncAuth";
	public static final String GetProjectList_URL ="http://www.mapmyoffer.com/PBSyncR/resources/FetchProject.action";*/
	
	/*public static final String DOWNLOAD_URL = "http://192.168.0.2:8088/PBSyncR/resources/FetchData.action";
	public static final String UPLOAD_URL = "http://192.168.0.2:8088/UploadFileListener/UploadServlet";
	public static final String Sync_URL ="http://192.168.0.2:8088/PB/SyncAuth";
	public static final String GetProjectList_URL ="http://192.168.0.2:8088/PBSyncR/resources/FetchProject.action";*/
	
	public static final String DOWNLOAD_URL = "http://www.mapmyoffer.com/ftPBSyncR/resources/FetchData.action";
	//public static final String UPLOAD_URL = "http://www.mapmyoffer.com/ftUploadFileListener/UploadServlet";
	public static final String UPLOAD_URL = "http://www.mapmyoffer.com/fototwistservices/UploadServlet";
	public static final String Sync_URL ="http://www.mapmyoffer.com/fototwist/SyncAuth";
	public static final String GetProjectList_URL ="http://www.mapmyoffer.com/ftPBSyncR/resources/FetchProject.action";
	
	public static final String NEW_UPLOAD_URL = "http://www.mapmyoffer.com/fototwistservices/UploadServlet";
	//public static final String NEW_UPLOAD_URL = "http://www.fototwist.com/fototwistservices/UploadServlet";
	
	
	
	public static long last_tapped_time=0;
	public static long recent_tapped_time=0;
	
	/**
	 * Flash Mode
	 */
	public static Boolean FLASH_MODE=false;
	
	/**
	 * Bluetooth Host address attached with printer
	 */
	public static String BT_ADDRESS="00:02:5B:0A:C2:7F";
	public static Boolean UPDATE_BT_ADDRESS=false;
	/**
	 * Frame save photo name prefix
	 */
	public static final String imgPrefix="img_";
	
	/**
	 * Frame save photo Directory
	 */
	public static final String ROOT_Dir=Environment.getExternalStorageDirectory().getPath();//"/mnt/sdcard/myfototwistimg/";
	public static final String APP_ROOT_Dir=ROOT_Dir+"/fototwist/";
	
	/**
	 * Frame save photo Directory
	 */
	public static final String photoDir=ROOT_Dir+"/myfototwistimg/";
	/**
	 * Frame temp Directory
	 */
	public static final String tmpDir=APP_ROOT_Dir+"/.myfototwist/temp/";
	
	/**
	 * Frame ROOT Directory
	 */
	public static final String frameDir=APP_ROOT_Dir+"/.myfototwist/Frame/";

	/**
	 * Props ROOT Directory
	 */
	public static final String propRootDir=APP_ROOT_Dir+"/.myfototwist/Prop/";

	/**
	 * Testing Directory
	 */
	
	public static final String propFemaleRootDir=APP_ROOT_Dir+"/Prop/Female/";
	public static final String propMaleRootDir=APP_ROOT_Dir+"/Prop/Male/";
	
	/*public static final String propFemaleRootDir="/mnt/sdcard/.PB/Prop/Female/";
	public static final String propMaleRootDir="/mnt/sdcard/.PB/Prop/Male/";*/

	/**
	 * Female Props Sub category directory
	 */
	public static final String propFemaleglassesDir=propFemaleRootDir+"glasses/";
	public static final String propFemalehatDir=propFemaleRootDir+"hat/";
	public static final String propFemalemaskdir=propFemaleRootDir+"mask/";
	public static final String propFemalewigDir=propFemaleRootDir+"wig/";


	/**
	 * Male Props Sub category directory	
	 */
	public static final String propMalebeardDir=propMaleRootDir+"beard/";
	public static final String propMaleglassesDir=propMaleRootDir+"glasses/";
	public static final String propMalehatDir=propMaleRootDir+"hat/";
	public static final String propMalewigDir=propMaleRootDir+"wig/";

	/**
	 * Props category String	
	 */
	public final String propCatMaleStr="M_PROPS";
	public final String propCatFemaleStr="F_PROPS";

	/**
	 * Props Sub category String Male	
	 */
	public final String propSubCatMaleBeardStr="M_BEARD";
	public final String propSubCatMaleHatStr="M_HAT";
	public final String propSubCatMaleGlassesStr="M_GLASSES";
	public final String propSubCatMaleWigStr="M_WIG";

	/**
	 * Props Sub category String Female	
	 */
	public final String propSubCatFemaleMaskStr="F_MASK";
	public final String propSubCatFemaleHatStr="F_HAT";
	public final String propSubCatFemaleGlassesStr="F_GLASSES";
	public final String propSubCatFemaleWigStr="F_WIG";

	/**
	 * Cutom Res ID i.e., image id to identify dynamic image from file
	 */
	private static int appCustomResID=1111;

	/**
	 * To contain all the dynamic props 
	 * HashMap<Male/Female, HashMap<SubCategory, HashMap<imageid, imagepath>>>
	 */
	public static HashMap<Integer, Bitmap> globalpropmap=new HashMap<Integer, Bitmap>();
	public static HashMap<Integer, Drawable> globalpropmapdrawable=new HashMap<Integer, Drawable>();
	public HashMap<String, HashMap<String, HashMap<Integer, Bitmap>>>
	propMap=new HashMap<String, HashMap<String,HashMap<Integer,Bitmap>>>();

	/**
	 * To contain all the dynamic frames 
	 *  HashMap<imageid, imagepath>
	 */
	public HashMap<Integer, Bitmap> frameMap=new HashMap<Integer, Bitmap>();

	/**
	 *  HashMap<subcatname, subcatdir>
	 */
	public HashMap<String, String> subCat_FemaleDirMap=new HashMap<String, String>();
	public HashMap<String, String> subCat_MaleDirMap=new HashMap<String, String>();

	/**
	 *  HashMap<subcatname, subcatdir>
	 */
	private HashMap<String,HashMap<String, String>> Cat_DirMap=new HashMap<String,HashMap<String, String>>();


	public ConfigUtilString()
	{
		init();
	}

	/**
	 *  Initialize Data Structures
	 */
	private void init()
	{
		subCat_FemaleDirMap.put(propSubCatFemaleMaskStr, propFemalemaskdir);
		subCat_FemaleDirMap.put(propSubCatFemaleHatStr, propFemalehatDir);
		subCat_FemaleDirMap.put(propSubCatFemaleGlassesStr, propFemaleglassesDir);
		subCat_FemaleDirMap.put(propSubCatFemaleWigStr, propFemalewigDir);

		subCat_MaleDirMap.put(propSubCatMaleHatStr, propMalehatDir);
		subCat_MaleDirMap.put(propSubCatMaleGlassesStr, propMaleglassesDir);
		subCat_MaleDirMap.put(propSubCatMaleWigStr, propMalewigDir);
		subCat_MaleDirMap.put(propSubCatMaleBeardStr, propMalebeardDir);

		Cat_DirMap.put(propCatFemaleStr, subCat_FemaleDirMap);
		Cat_DirMap.put(propCatMaleStr, subCat_MaleDirMap);
	}

	/**
	 * Read SD card directory and generate file List
	 */
	public static List<String> ReadSDCard(String sdCardPath)
	{
		List<String> tFileList = new ArrayList<String>();

		//It have to be matched with the directory in SDCard
		new File(sdCardPath).mkdir();
		File f = new File(sdCardPath);
		Log.d(APPTAG, " File path "+sdCardPath);
		File[] files=f.listFiles();
		if(files!=null && files.length>0)
		{
			for(int i=0; i<files.length; i++)
			{
				try {
					File file = files[i];
					/**
					 * It's assumed that all file in the path
					 * are in supported type*/
					Log.d(APPTAG, file.getPath());
					tFileList.add(file.getPath());
				} catch (Exception e) {
					// TODO: handle exception
					Log.e(APPTAG, "Unsupported file");
				}

			}
		}
		else
		{
			Log.d(APPTAG, "Invalid Path..");
		}

		return tFileList;
	}

	
	
	/**
	 * Convert fileimage store in SD card to Bitmap
	 */

	public Bitmap file2bitmap(String fPath)
	{
		return BitmapFactory.decodeFile(fPath);
	}

	/**
	 * Load all Dynamic content of frame
	 */
	public HashMap<Integer, Bitmap> prepareFrameBitmap()
	{
		HashMap<Integer, Bitmap> tmpMap=new HashMap<Integer, Bitmap>();
		List<String> tmpfilelist=ReadSDCard(frameDir);
		if(tmpfilelist!=null && tmpfilelist.size()>0)
		{
			for(String files:tmpfilelist)
			{
				Bitmap tmpBmp=file2bitmap(files);
				if(tmpBmp!=null)
				{
					tmpMap.put(appCustomResID++, tmpBmp);
				}
			}
		}
		return tmpMap;
	}

	/**
	 * Load all Dynamic content of props by directory or catagory
	 */
	public HashMap<Integer, Bitmap> preparePropBitmap(String fPath)
	{
		Log.i("Prop Loading", "File Path "+fPath);
		HashMap<Integer, Bitmap> tmpMap=new HashMap<Integer, Bitmap>();
		List<String> tmpfilelist=ReadSDCard(fPath);
		try
		{
			if(tmpfilelist!=null && tmpfilelist.size()>0)
			{
				for(String files:tmpfilelist)
				{
					Bitmap tmpBmp=file2bitmap(files);
					if(tmpBmp!=null)
					{
						tmpMap.put(appCustomResID++, tmpBmp);
					}
				}
			}
			return tmpMap;
		}
		catch (Exception e) {
			// TODO: handle exception
			return null;
		}
		/*finally
		{
			Log.i(APPTAG, tmpMap.toString());
			tmpMap.clear();
			tmpMap=null;
		}*/
		
	}
	
	
	public HashMap<Integer, Drawable> preparePropDrawable(String fPath)
	{
		HashMap<Integer, Drawable> tmpMap=new HashMap<Integer, Drawable>();
		List<String> tmpfilelist=ReadSDCard(fPath);
		try
		{
			if(tmpfilelist!=null && tmpfilelist.size()>0)
			{
				for(String files:tmpfilelist)
				{
					Drawable tmpBmp = Drawable.createFromPath(files);
					if(tmpBmp!=null)
					{
						tmpMap.put(appCustomResID++, tmpBmp);
					}
				}
			}
			return tmpMap;
		}
		catch (Exception e) {
			// TODO: handle exception
			return null;
		}
		/*finally
		{
			Log.i(APPTAG, tmpMap.toString());
			tmpMap.clear();
			tmpMap=null;
		}*/
		
	}
	
	/**
	 * Load all Dynamic content of Props
	 */
	public HashMap<String, HashMap<String, HashMap<Integer, Bitmap>>> 
	preparePropBitmap()
	//preparePropBitmap(HashMap<String,HashMap<String, String>> Cat_DirMap)
	{
		HashMap<String, HashMap<String, HashMap<Integer, Bitmap>>> returnmap=new HashMap<String, HashMap<String,HashMap<Integer,Bitmap>>>();
		List<String> tmpfilelist;
		HashMap<String,HashMap<Integer,Bitmap>> propSubCatMap=new HashMap<String,HashMap<Integer, Bitmap>>();

		for (Map.Entry<String, HashMap<String, String>> e : Cat_DirMap.entrySet())
		{
			System.out.println(e.getKey() + ": " + e.getValue());
			for (Entry<String, String> e1 : e.getValue().entrySet())
			{
				System.out.println(e1.getKey() + ": " + e1.getValue());
				tmpfilelist=ReadSDCard(e1.getValue());


				if(tmpfilelist!=null && tmpfilelist.size()>0)
				{
					HashMap<Integer, Bitmap> tmpMap=new HashMap<Integer, Bitmap>();
					for(String files:tmpfilelist)
					{
						Bitmap tmpBmp=file2bitmap(files);
						if(tmpBmp!=null)
						{
							tmpMap.put(appCustomResID++, tmpBmp);
						}
					}
					if(tmpMap!=null && tmpMap.size()>0)
					{
						propSubCatMap.put(e1.getKey(), tmpMap);
					}
				}
			}
			if(propSubCatMap!=null && propSubCatMap.size()>0)
			{
				returnmap.put(e.getKey(), propSubCatMap);
			}
		}
		return returnmap;

	}

	public void deleteAllFrame()
	{
		List<String> tmpfilelist=ReadSDCard(frameDir);
		if(tmpfilelist!=null && tmpfilelist.size()>0)
		{
			for(String files:tmpfilelist)
			{
				try {
					File file=new File(files);
					boolean deletedFile=file.delete();
					Log.i(APPTAG,""+ deletedFile);
				} catch (Exception e) {
					// TODO: handle exception
					Log.i(APPTAG,"Error "+ e.toString());
				}

			}
		}
	}

	/*public static boolean createExcelFile(Context context, String fileName, Cursor cur) { 

		// check if available and not read only 
		if (!isExternalStorageAvailable() || isExternalStorageReadOnly()) { 
	            Log.w("FileUtils", "Storage not available or read only"); 
	            return false; 
	        } 
		 
		new FileChecker().deleteFile(ConfigUtilString.photoDir,".xls");
		int rowCount=0;
		int colCount=0;
		int cellCount=0;

		boolean success = false; 

		//New Workbook
		HSSFWorkbook wb = new HSSFWorkbook();

		Cell c = null;

		//Cell style for header row
		CellStyle cs = wb.createCellStyle();
		cs.setFillForegroundColor(HSSFColor.LIME.index);
		cs.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
		cs.setAlignment(HSSFCellStyle.ALIGN_CENTER);

		//New Sheet
		Sheet sheet1 = null;
		sheet1 = wb.createSheet("log");

		// Generate column headings
		Row row = sheet1.createRow(rowCount++);

		c = row.createCell(cellCount++);
		c.setCellValue("SL No.");
		c.setCellStyle(cs);

		c = row.createCell(cellCount++);
		c.setCellValue("Name");
		c.setCellStyle(cs);

		c = row.createCell(cellCount++);
		c.setCellValue("Mobile No.");
		c.setCellStyle(cs);

		c = row.createCell(cellCount++);
		c.setCellValue("E-mail");
		c.setCellStyle(cs);

		c = row.createCell(cellCount++);
		c.setCellValue("Sex");
		c.setCellStyle(cs);

		c = row.createCell(cellCount++);
		c.setCellValue("Print");
		c.setCellStyle(cs);

		c = row.createCell(cellCount++);
		c.setCellValue("FB Share");
		c.setCellStyle(cs);

		c = row.createCell(cellCount++);
		c.setCellValue("FB Share Status");
		c.setCellStyle(cs);

		c = row.createCell(cellCount++);
		c.setCellValue("Image");
		c.setCellStyle(cs);

		c = row.createCell(cellCount++);
		c.setCellValue("Date & Time");
		c.setCellStyle(cs);
		
		c = row.createCell(cellCount++);
		c.setCellValue("U_ID");
		c.setCellStyle(cs);
		
		c = row.createCell(cellCount++);
		c.setCellValue("P_ID");
		c.setCellStyle(cs);

		sheet1.setColumnWidth(colCount++, (5 * 500));
		sheet1.setColumnWidth(colCount++, (15 * 500));
		sheet1.setColumnWidth(colCount++, (15 * 500));
		sheet1.setColumnWidth(colCount++, (15 * 500));
		sheet1.setColumnWidth(colCount++, (5 * 500));
		sheet1.setColumnWidth(colCount++, (5 * 500));
		sheet1.setColumnWidth(colCount++, (5 * 500));
		sheet1.setColumnWidth(colCount++, (5 * 500));
		sheet1.setColumnWidth(colCount++, (15 * 500));
		sheet1.setColumnWidth(colCount++, (15 * 500));
		sheet1.setColumnWidth(colCount++, (5 * 500));
		sheet1.setColumnWidth(colCount++, (5 * 500));
		sheet1.setColumnWidth(colCount++, (15 * 500));
		
		//dump Data

		if(cur!=null){
			if  (cur.moveToFirst()) {
				do {
					cellCount=0;
					String name = cur.getString(cur.getColumnIndex(DatabaseHelper.colName));
					String mob = cur.getString(cur.getColumnIndex(DatabaseHelper.colMob));
					String email = cur.getString(cur.getColumnIndex(DatabaseHelper.colEmail));
					String sex = cur.getString(cur.getColumnIndex(DatabaseHelper.colSex));
					String print = cur.getString(cur.getColumnIndex(DatabaseHelper.colPrint));
					String share = cur.getString(cur.getColumnIndex(DatabaseHelper.colShare));
					String picurl = cur.getString(cur.getColumnIndex(DatabaseHelper.colPicUrl));
					String datetime = cur.getString(cur.getColumnIndex(DatabaseHelper.colDateTime));
					int uid=cur.getInt(cur.getColumnIndex(DatabaseHelper.colU_Id));
					int pid=cur.getInt(cur.getColumnIndex(DatabaseHelper.colP_Id));
					String cardNo = cur.getString(cur.getColumnIndex(DatabaseHelper.colCardNo));
					Log.i("DBHelper",","+name+","+mob+","+email+","+sex+","
							+print+","+share+","+picurl+","+datetime+","+cardNo);
					row = sheet1.createRow(rowCount++);

					c = row.createCell(cellCount++);
					c.setCellType(Cell.CELL_TYPE_NUMERIC);
					c.setCellValue(rowCount-1);

					c = row.createCell(cellCount++);
					c.setCellValue(name);

					c = row.createCell(cellCount++);
					c.setCellValue(mob);

					c = row.createCell(cellCount++);
					c.setCellValue(email);

					c = row.createCell(cellCount++);
					c.setCellValue(sex);

					c = row.createCell(cellCount++);
					c.setCellValue(print);

					c = row.createCell(cellCount++);
					c.setCellValue(share);

					c = row.createCell(cellCount++);
					c.setCellValue("NA");

					c = row.createCell(cellCount++);
					c.setCellValue(picurl);

					c = row.createCell(cellCount++);
					c.setCellValue(datetime);
					
					c = row.createCell(cellCount++);
					c.setCellType(Cell.CELL_TYPE_NUMERIC);
					c.setCellValue(uid);
					
					c = row.createCell(cellCount++);
					c.setCellType(Cell.CELL_TYPE_NUMERIC);
					c.setCellValue(pid);
					
					c = row.createCell(cellCount++);
					c.setCellValue(cardNo);
					
				}while (cur.moveToNext());
			} 

		}

		// Create a path where we will place our List of objects on external storage 
		File file = new File( fileName); 

		//File file = new File(context.getExternalFilesDir(null), fileName); 
		FileOutputStream os = null; 

		try { 
			os = new FileOutputStream(file);
			wb.write(os);

			Log.w("FileUtils", "Writing file" + file); 
			success = true; 
			
		} catch (IOException e) { 
			Log.w("FileUtils", "Error writing " + file, e);
			success=false;
		} catch (Exception e) { 
			Log.w("FileUtils", "Failed to save file", e);
			success=false;
		} finally { 
			try { 
				if (null != os) 
					os.close(); 
			} catch (Exception ex) { 
				success=false;
			} 
		} 

		return success; 
	} */

	public static void copyFolder(File src, File dest)
			throws IOException{

		
		if(src.isDirectory()){

			//if directory not exists, create it
			if(!dest.exists()){
				dest.mkdir();
				System.out.println("Directory copied from " 
						+ src + "  to " + dest);
			}

			//list all the directory contents
			String files[] = src.list();

			for (String file : files) {
				//construct the src and dest file structure
				File srcFile = new File(src, file);
				File destFile = new File(dest, file);
				//recursive copy
				copyFolder(srcFile,destFile);
			}

		}else{
			//if file, then copy it
			//Use bytes stream to support all file types
			InputStream in = new FileInputStream(src);
			OutputStream out = new FileOutputStream(dest); 

			byte[] buffer = new byte[1024];

			int length;
			//copy the file content in bytes 
			while ((length = in.read(buffer)) > 0){
				out.write(buffer, 0, length);
			}

			in.close();
			out.close();
			System.out.println("File copied from " + src + " to " + dest);
		}
	}

	
	public static boolean deleteFolder(File fileToDelete) {
        if (fileToDelete == null || !fileToDelete.exists()) {
            return true;
        } else {            boolean result = deleteChildren(fileToDelete);
            result &= fileToDelete.delete();
            return result;
        }
    }
    public static boolean deleteChildren(File parent) {
        if (parent == null || !parent.exists())
            return false;
        boolean result = true;
        if (parent.isDirectory()) {
            File files[] = parent.listFiles();
            if (files == null) {
                result = false;
            } else {
                for (int i = 0; i < files.length; i++) {
                    File file = files[i];
                    if (file.getName().equals(".") || file.getName().equals(".."))
                        continue;
                    if (file.isDirectory())
                        result &= deleteFolder(file);
                    else
                        result &= file.delete();
                }

            }
        }
        return result;
    }
}
