/*
 * Mr.Mantou - On the importance of taste
 * Copyright (C) 2015  XiNGRZ <xxx@oxo.ooo>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package ooo.oxo.mr.net;

import com.avos.avoscloud.AVFile;
import com.avos.avoscloud.AVOSCloud;

import java.util.Locale;

public class QiniuUtil {

    public static String getUrl(String url, int width) {
        return String.format(Locale.US, "%s?imageView2/2/w/%d/format/webp", url, width);
    }

    public static String getUrl(AVFile file, int width) {
        if (AVOSCloud.getStorageType() == AVOSCloud.StorageType.StorageTypeQiniu) {
            return getUrl(file.getUrl(), width);
        } else {
            return file.getUrl();
        }
    }

}