package com.douban.book

import com.douban.base.DoubanActivity
import android.os.Bundle
import android.widget.ImageView
import uk.co.senab.photoview.{PhotoViewAttacher, PhotoView}

/**
 * Copyright by <a href="http://crazyadam.net"><em><i>Joseph J.C. Tang</i></em></a> <br/>
 * Email: <a href="mailto:jinntrance@gmail.com">jinntrance@gmail.com</a>
 * @author joseph
 * @since 10/7/13 9:45 PM
 * @version 1.0
 */
class ImagePopupActivity(img: ImageView) extends DoubanActivity {
  override def onCreate(b: Bundle) {
    setContentView(R.layout.image_popup)
    val img=find[ImageView](R.id.image_popup)
    img.setImageDrawable(img.getDrawable)
    new PhotoViewAttacher(img)
  }
}
