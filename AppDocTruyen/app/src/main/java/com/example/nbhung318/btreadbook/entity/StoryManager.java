package com.example.nbhung318.btreadbook.entity;


import android.util.Log;

import com.example.nbhung318.btreadbook.R;

import java.util.ArrayList;
import java.util.List;

public class StoryManager {
    private List<StoryVietName> storiesVietNam = new ArrayList<>();
    private List<StoryWorld> storiesWorld = new ArrayList<>();

    public StoryManager() {

    }

    public void addStoryVietNam() {
        storiesVietNam.add(new StoryVietName(R.drawable.img_laclongquan, "Truyền Thuyết Lạc Long Quân Và Âu Cơ",
                "Ngày xửa ngày xưa, có người tên Lộc Tục, lấy hiệu là Kinh Dương Vương, là thủ lĩnh ở vùng Lĩnh Nam. Kinh Dương Vương có sức khỏe hơn người, còn có biệt tài là đi lại ở dưới nước giống như là đi lại trên cạn vậy.\n" +
                        "\n" +
                        "Vào một ngày, Kinh Dương Vương đến hồ Động Đình dạo chơi, vô tình gặp được Long Nữ vốn là con gái của Long Vương, nảy sinh tình cảm, họ trở thành vợ thành chồng, không lâu sau thì sinh ra một người con trai và đặt tên đứa bé ấy là Sùng Lâm." + "Khi trưởng thành, Sùng Lâm cũng rất khỏe mạnh, chàng có thể chỉ dùng một tay để nhấc bổng tảng đá lớn lên cao. Và cũng giống như cha của mình, Sùng Lâm cũng có tài đi lại được ở dưới nước. Đến khi chàng nối nghiệp của cha mình thì lấy hiệu cho mình là Lạc Long Quân.\n" +
                        "\n" +
                        "Đất Lĩnh Nam bấy giờ còn rất hoang vu, chẳng nơi nào là được yên ổn cả, vì thế Lạc Long Quân mới quyết định sẽ đi du ngoạn ở khắp mọi nơi.\n" +
                        "\n" +
                        "Khi đến vùng biển Đông Nam thì Lạc Long Quân bắt gặp con cá khổng lồ. Con cá này cũng đã sống được rất lâu đời rồi, mình của nó phải dài đến ngoài năm mươi trượng, cái đuôi của nó trông như cánh buồm lớn, còn miệng của nó rộng đến mức có thể một lúc nuốt chửng mười người. Lúc nó bơi có thể khiến sóng nổi lên ngất trời, tất cả những thuyền bè đi lại qua đó đều bị làm cho chìm ngỉm, còn người ở trên thuyền thì đều bị nuốt sống cả.\n" +
                        "\n" +
                        "Con quái vật này khiến cho dân chài vùng ấy vô cùng khiếp sợ. Họ thường gọi là Ngư tinh. Còn chỗ ở của con Ngư tinh ấy chính là một hang động rất lớn ăn sâu dưới đáy biển, bên trên hang thì có dãy núi cao chia đôi miền duyên hải.\n" +
                        "\n" +
                        "Khi biết tin thì Lạc Long Quân vô cùng tức giận, quyết tâm lập chí giết chết loài yêu ma quỷ quái ấy để trừ hại cho nhân dân. Chàng tự đóng cho mình một chiếc thuyền lớn và chắc chắn, sau đó rèn lấy một khối sắt với những cạnh sắc bén rồi đem đi nung đỏ. Chàng đem theo khối sắt, chèo thuyền tiến thẳng tới chỗ của Ngư tinh. Khi đến gần con quái vật kia, Lạc Long Quân liền giơ khối sắt giả như là cầm ngang một người định ném cho nó. Tưởng thật, Ngư tinh liền há to miệng ra để đớp mồi. Nhân cơ hội đó, Lạc Long Quân dùng sức phi khối sắt đang nóng bỏng ấy vào miệng con quái vật.\n" +
                        "\n" +
                        "Ngư tinh vì thế bị cháy cả họng, nó vùng vẫy chống cự, nó quật chiếc đuôi lớn của mình vào chiếc thuyền. Lạc Long Quân nhanh nhẹn dùng gươm sắc chém con Ngư tinh ấy thành ba khúc. Phần đầu của nó liền biến thành một con chó biển định chạy trốn. Nhưng lạc Long Quân lại nâng đá chặn đường để giết con chó biển ấy, rồi chặt đầu nó ném lên trên núi, ngày nay người ta gọi nó là núi Cẩu Đầu Sơn. Còn phần mình của con Ngư tinh thì cứ thế trôi ra tận xứ Mạn Cẩu, ngày nay mang tên Cẩu Đầu Thủy. Còn lại phần đuôi thì Lạc Long Quân liền lột da rồi đem phủ lên trên hòn đảo ở giữa biển, ngày nay người ta gọi đảo ấy là đảo Bạch Long Vĩ.\n" +
                        "\n" +
                        "Khi đã trừ xong Ngư tinh thì Lạc Long Quân lại tới vùng Long Biên. Nơi này nghe nói có một con cáo chín đuôi đã sống hơn ngàn năm và thành tinh rồi. Nó sống trong một cái hang sâu ở dưới chân hòn núi phía tây của Long Biên. Hằng ngày con yêu quái này thường biến thành người, rồi trà trộn vào trong xóm làng để mà dụ dỗ bắt cóc con gái nhà lành, sau đó đem về trong hang để hãm hại. Từ vùng Long Biên cho đến vùng núi Tản Viên, nơi nào cũng bị con Hồ tinh này ra tay hãm hại không biết bao nhiêu là người. Nhân dân sống ở hai miền này đều vô cùng sợ hãi, có không ít người đành bỏ ruộng đồng, bỏ nương rẫy đem nhau đến nơi khác để làm ăn, sinh sống.\n" +
                        "\n" +
                        "Vì thương dân nên Lạc Long Quân bèn một thân một mình đem theo gươm sắc tới chỗ hang của Hồ tinh để tìm cách mà diệt nó trừ hại. Khi mà Lạc Long Quân tới được cửa hang, Hồ tinh trú bên trong thấy có bóng người lập tức xông ra ngoài. Lạc Long Quân lập tức làm phép hô mưa gọi gió, làm sấm sét để vây chặt con yêu hồ. Lạc Long quân cùng Hồ tinh giao chiến liên tục ba ngày và ba đêm, sau đó con yêu quái cũng dần kiệt sức, nó muốn tìm đường để thoát thân. Nhưng Lạc Long Quân đã nhanh hơn, đuổi theo mà chặt đứt đầu của nó. Hồ tinh chết đi hiện lại nguyên hình vốn là con cáo chín đuôi khổng lồ.\n" +
                        "\n" +
                        "Lạc Long Quân vội vàng vào trong hang để cứu người nào còn sống, sau đó chàng sai thủy tộc cùng dâng nước ở sông Cái lên xoáy hang của yêu quái thành một cái vực rất sâu, người ta quen gọi nơi ấy là đầm Xác Cáo, ngày nay thì gọi tên Tây Hồ.\n" +
                        "\n" +
                        "Khi nạn Hồ tinh đã được dẹp yên thì nhân dân ở hai vùng này lại được trở về với cuộc sống cày cấy thanh bình, họ dựng xóm lập nhà ở trên khu vực đất cao nhất trong vùng và gọi đó là làng Hồ, ngày nay vẫn còn lại những dấu tích cổ.\n" +
                        "\n" +
                        "Khi đã thấy được nhân dân ở vùng Long Biên làm ăn yên ổn rồi, Lạc Long Quân lại đi ngược lên trên vùng rừng núi thuộc đất Phong Châu. Vùng này nổi tiếng có cây cổ thụ mà người đời gọi tên là cây chiên đàn, cây cao mấy nghìn trượng, ngày trước thì cành lá của nó rất xum xuê và tươi tốt, những tán lá vươn ra che kín khoảng đất lớn. Tuy nhiên, nhiều năm sau thì cây đã khô héo và trở thành yêu quái, nhân dân gọi nó là Mộc tinh.\n" +
                        "\n" +
                        "Không như những con yêu quái khác, Mộc tinh hung ác nhưng lại rất quỷ quyệt. Nó chẳng ở nơi nào cố định cả, nay thì nó ở khu rừng này, nhưng mai lại đổi sang khu rừng khác ngay. Không chỉ thế, nó thường hay biến hình thay dạng và ẩn nấp ở khắp mọi nơi, rồi dồn bắt con người để mà ăn thịt. Dù đi đến đâu thì cũng có thể nghe thấy được tiếng than khóc vô cùng thảm thiết của người dân. Vì thế nên Lạc Long Quân mới quyết tâm phải diệt trừ cho bằng được con yêu quái này, loại bỏ nguy hại cho nhân dân.\n" +
                        "\n" +
                        "Bắt tay vào truy lùng con yêu quái, Lạc Long Quân đã phải luồn lách không biết bao nhiêu khu rừng, qua không biết bao nhiêu ngày đêm gian khổ thì mới có thể tìm ra được nơi ở của Mộc tinh. Sau đó Lạc Long Quân cùng giao chiến với Mộc tinh đủ trăm ngày trăm đêm, khiến cho trời long đất lở, khắp nơi đều là khói bụi mù mịt nhưng vẫn không cách nào thắng được con yêu quái kia. Sau cùng không còn cách nào khác, Lạc Long Quân đành dùng nhạc cụ có trống, chiêng để làm Mộc tinh khiếp sợ, dồn nó chạy đến phía Tây Nam và cứ sống quanh quẩn ở vùng ấy không dám đi đâu. Người ta đổi lại gọi nó là Quỷ Xương Cuồng.\n" +
                        "\n" +
                        "Khi trừ xong nạn yêu ma quỷ quái ở đây, Lạc Long Quân lại trông thấy người dân ở vùng này đói khổ và thiếu thốn nhiều, không có quần áo mặc nên phải dùng vỏ cây để che thân, phải dùng cỏ tranh tết thành ổ để nằm. Vì vậy chàng liền dạy họ cách trồng ra lúa nếp, lại dạy cách dùng ống tre để thổi cơm, sau đó còn dạy cách đốn gỗ dựng nhà sàn ở phòng những thú dữ ở nơi rừng hoang. Lạc Long Quân cũng dạy cho họ biết cách ở cho đúng vợ chồng, cha con.\n" +
                        "\n" +
                        "Nhân dân muốn cảm ơn công đức ấy của chàng, liền cùng nhau xây dựng một cung điện vô cùng nguy nga, tráng lệ trên đỉnh núi cao cho Lạc Long Quân. Nhưng chàng cũng không ở lại nơi này, mà thường trở về quê mẹ ở dưới thủy phủ, nhưng vẫn dặn dò dân chúng là: “Hễ ở trên này có điều thì tai biến hãy gọi ta, thì ta sẽ lập tức trở về!”.\n" +
                        "\n" +
                        "Khi ấy Đế Lai ở phương Bắc mang theo quân tràn xuống vùng phía Nam. Và Đế Lai còn mang theo người con gái xinh đẹp mà mình yêu chiều nhất là Âu Cơ cùng voo số thị nữ cùng xuống. Vì thấy vùng Lĩnh Nam này phong cảnh xinh đẹp, có nhiều muông thú cùng gỗ quý nên Đế Lai liền lệnh cho đám quân của mình đắp lũy dựng thành định ở đây lâu dài.\n" +
                        "\n" +
                        "Kể từ khi Đế Lai tràn xuống, nhân dân Lĩnh Nam phải phục dịch vô cùng cực khổ, mãi rồi cũng không chịu được nên họ liền hướng về phía biển Đông mà gọi lớn: “Bố ơi! Mau về cứu dân chúng con!”. Vừa dứt tiếng gọi thì Lạc Long Quân lập tức trở về.\n" +
                        "\n" +
                        "Sau khi Lạc Long Quân nghe dân kể lại toàn bộ câu chuyện thì chàng lập tức biến thành một chàng trai khôi ngô tuấn tú, đem theo hàng trăm người đầy tớ, vừa đi lại vừa hát tiến về phía lâu đài của Đế Lai. Nhưng khi đến nơi, Lạc Long Quân lại chẳng gặp được Đế Lai, ở đó chỉ có một thiếu nữ xinh đẹp tuyệt trần đang ở cùng vô vàn thị tỳ, binh lính hầu hạ. Cô gái ấy chính là Âu Cơ.\n" +
                        "\n" +
                        "Vì nhìn thấy Lạc Long Quân tuấn tú uy nghi nên nàng đem lòng mà say mê, quyết xin được theo Lạc Long Quân. Vì vậy Lạc Long Quân liền đưa nàng Âu Cơ đến cung điện mà nhân dân dựng cho mình ở tận trên núi cao.\n" +
                        "\n" +
                        "Đến khi Đế Lai trở về lâu đài thì chẳng thấy con gái yêu của mình đâu, lo lắng cho con nên lập tức hạ lệnh cho quân lính của mình đi khắp nơi tìm kiếm, cứ như vậy hết ngày này lại qua ngày khác không ngơi nghỉ. Nhưng Lạc Long Quân lại sai hàng ngàn hàng vạn ác thú chặn đường và xé xác hết quân lính khiến cho chúng khiếp đảm mà bỏ chạy. Sau cùng, không làm được gì nên Đế Lai đành phải rút quân trở về phương Bắc.\n" +
                        "\n" +
                        "Lạc Long Quân cùng Âu Cơ ở với nhau được một thời gian thì Âu Cơ mang thai, sau sinh ra được một cái bọc. Bảy ngày qua đi, cái bọc ấy nở ra được một trăm quả trứng. Và mỗi quả trứng lại nở ra được một người con trai. Một trăm người con trai ấy lớn nhanh như thổi, ai ai cũng đều khỏe mạnh, xinh đẹp và đều thông minh tuyệt trần.\n" +
                        "\n" +
                        "Thời gian qua hàng chục năm, Lạc Long Quân có cuộc sống hạnh phúc đầm ấm cùng vợ và đàn con của mình. Tuy nhiên thì lòng chàng vẫn nhớ nhung nơi thủy phủ. Vào một ngày kia, Lạc Long Quân liền nói lời từ giã với Âu Cơ và một trăm người con trai, chàng hóa thành rồng và bay vụt lên mây, trở về với biển cả bao la.\n" +
                        "\n" +
                        "Âu Cơ cùng với đàn con cũng rất muốn được theo Lạc Long Quân, nhưng vì không đi được nên đành buồn bã trở lại đỉnh núi. Và ngày này qua tháng khác, mọi người đều mỏi mắt mà mong chờ Lạc Long Quân trở về, nhưng mà chàng vẫn biền biệt chẳng thấy tăm hơi đâu cả.\n" +
                        "\n" +
                        "Chờ mãi chẳng thấy Lạc Long quân về, vì nhớ chồng nên Âu Cơ lên trên đỉnh núi cao, nàng hướng về phía biển Đông mà gọi to: “Bố nó ơi! Sao chàng mãi không về để cho mẹ con thiếp sầu khổ mãi thế này!”.\n" +
                        "\n" +
                        "Ngay tức khắc Lạc Long Quân xuất hiện. Âu Cơ liền trách: “Thiếp vốn được sinh ra nơi động lớn núi cao, ăn ở cùng chàng sinh ra trăm người con trai. Ấy vậy mà chàng nỡ lòng nào bỏ đi, bỏ mặc cho thiếp cùng các con phải khổ não bơ vơ.\n" +
                        "\n" +
                        "Lạc Long Quân lại nói: “Ta vốn là loài rồng, còn nàng lại là giống tiên, chúng ta khó mà ăn ở được với nhau lâu dài. Ta tính như vậy, nay ta sẽ đem theo năm mươi con về nơi miền biển, còn nàng sẽ dẫn năm mươi con lên miền núi, chúng ta cùng chia nhau để trị vì mọi nơi, người lên núi, kẻ xuống biển, nếu như mà có gặp nguy hiểm gì thì lập tức báo cho người kia biết để mà giúp đỡ nhau, chớ đừng quên”.\n" +
                        "\n" +
                        "Nói chuyện xong xuôi, cả hai cùng từ biệt, trăm người con của họ liền tỏa đi khắp các nơi. Và họ chính là tổ tiên của người Bách Việt. Người con trưởng của họ ở lại trị vì đất Phong Châu, trở thành vua của nước Văn Lang và hiệu là Hùng Vương. Sau đó Hùng vương lại chia thành mười năm bộ, đặt ra tướng văn tướng võ là lạc hầu và lạc tướng. Còn con trai của vua thì được gọi là Quan Lang, còn con gái sẽ gọi là Mỵ Nương. Danh hiệu của vua được truyền từ đời này sang đời khác đều gọi chung là Hùng Vương.\n" +
                        "\n" +
                        "Và Lạc Long Quân chính là người có công mở mang đất Lĩnh Nam, mang lại cho nhân dân sự yên ổn. Hùng Vương là người có công dựng nước, và truyền nối ngôi vua được mười tám đời. Bởi vì sự tích về Lạc Long Quân và Âu Cơ, dân tộc Việt Nam thường kể mình chính là con rồng cháu tiên.",
                "Truyện cổ tích"));
        storiesVietNam.add(new StoryVietName(R.drawable.img_banhchung, "Sự tích bánh chưng và bánh dày", "Bấy giờ là thời kì trị vì của vua Hùng. Nhưng vì tuổi vua càng ngày càng già hơn, thời gian ngồi ngai vàng cũng đã đằng đẵng biết bao năm trời. Có thể thấy được sức khỏe của bản thân ngày càng suy yếu hơn trước, nhà vua muốn chọn lấy một người để nối ngôi của mình. Nhà vua có tất cả là hai mươi người con trai. Và họ đều đã khôn lớn cả rồi. Vua nghĩ bụng:\n" +
                "\n" +
                "– Nói về tài năng thì cũng nhiều đứa trội. Chính vì vậy nên ta phải lựa chọn thật cẩn thận mới được. Đặc biệt là phải làm sao cho bọn chúng không tranh giành với nhau." + "Đó chính là điều mà nhà vua quan tâm, lo lắng nhất. Sau cùng, may là nhờ viên quân hầu hiến kế, nhà vua liền ra quyết định sẽ mở cuộc thi, căn cứ vào kết quả để mà lựa chọn người thừa kế ngai vàng. Vua Hùng cho gọi tất cả hoàng tử đến. Khi mà mọi người đã tề tựu đông đủ thì nhà vua mới phán rằng:\n" +
                "\n" +
                "– Cha cũng biết mình sắp gần đất xa trời rồi. Nay cha muốn chọn một người trong số các con để truyền ngôi lại. Bây giờ các con, mỗi người hãy kiếm hoặc là tự làm lấy một món ăn để dâng lên cúng tổ tiên. Người nào có được món ăn ngon và vừa với ý ta nhất thì ta sẽ chọn người đó.\n" +
                "\n" +
                "Sau khi nghe xong lời vua cha nói thì đám hoàng tử lập tức đua nhau sai người đi đến khắp mọi nơi để mà tìm lấy thức ăn quý. Bọn họ hết lên ngàn rồi lại xuống biển, lần mò chẳng sót một nơi. Bất kể là nghe nói có thứ gì ngon, lạ thì họ sẽ cố gắng tìm cho ra.\n" +
                "\n" +
                "Trong số các hoàng tử thì có chàng hoàng tử thứ mười tám tên là Liêu. Từ khi còn nhỏ đã mồ côi mẹ, vì thế Liêu phải sống những ngày rất cô đơn cho đến tận khi trưởng thành. Trong khi anh em của chàng vội vã chạy đôn chạy đáo khắp nơi để tìm lấy những thứ của ngon vật lạ khắp nhân gian, thì chàng Liêu lại vẫn ung dung nằm khểnh tại nhà.\n" +
                "\n" +
                "Không phải là chàng không muốn đi tìm, mà là chẳng có người nào giúp đỡ. Từ nay đến ngày thi chỉ còn lại đúng ba ngày, nhưng chàng Liêu vẫn chưa chuẩn bị được thứ gì cả.\n" +
                "\n" +
                "Đêm hôm ấy, chàng Liêu vắt tay ngang trán rồi cố nhớ lại mấy bữa ăn ngon mà chàng từng được đến tham dự. Chàng cứ mải mê suy nghĩ mà ngủ quên từ lúc nào chẳng hay. Chàng mơ màng trông thấy mình và hai mươi mốt người anh em đang thi làm bánh cùng với nhau. Mỗi người đều có được một gian bếp nhỏ do nhà vua chuẩn bị sẵn.\n" +
                "\n" +
                "Liêu cũng chưa biết là nên làm việc gì đầu tiên, đột nhiên từ trên trời có một vị nữ thần bay xuống và giúp chàng. Nữ thần nói với chàng:\n" +
                "\n" +
                "– To lớn nhất thiên hạ chẳng gì sánh được với trời đất, mà quý báu nhất trên trần gian này chẳng gì bằng được gạo cả. Ta cũng đừng làm quá nhiều, chỉ cần làm đủ hai thứ bánh mang ý nghĩa nhất là được rồi. Hãy nhặt cho tôi chỗ nếp ấy, sau đó tìm cho tôi thêm ít đậu nữa.\n" +
                "\n" +
                "Và rồi Liêu trông thấy nữ thần cứ lần lượt lấy ra từng tàu lá xanh và rộng. Sau đó nữ thần vừa gói bánh lại vừa giảng giải cho chàng:\n" +
                "\n" +
                "– Bánh này là tượng trưng cho đất. Mà đất thì có cây, có núi rừng, có đồng ruộng nên màu phải xanh và hình dáng thì phải vuông vắn mới được. Trong bánh thì phải cho thịt, cho đỗ, ý nghĩa chính là đất có cỏ cây, có muông thú… Sau đó thì lấy nếp thơm kia đồ cho thật dẻo và giã ra để làm thứ bánh tượng trưng cho trời, có màu trắng, và hình dáng phải tròn mà khum khum như là vòm trời vậy…\n" +
                "\n" +
                "Đến khi tỉnh giấc, Liêu bắt tay vào làm hai món bánh mà nữ thần đã dạy chàng ở trong mộng.\n" +
                "\n" +
                "Cái ngày mà các hoàng tử đua nhau đem các món ăn về Phong Châu dự thi là ngày vô cùng náo nhiệt và đông vui ở đây. Người đến xem đông ngùn ngụt. Dân chúng ở khắp mọi miền đất nước đều đổ xô về để được tham dự cái Tết hiếm có này: mở đầu là cuộc thi về các món ăn giữa hai mươi hai vị hoàng tử, và kết thúc chính là lễ đăng quang ngai vàng của vị vua mới.\n" +
                "\n" +
                "Khi mặt trời vừa mọc, vua Hùng ngồi trên kiệu đi tới để làm lễ tế gia tiên. Nơi này cờ quạt, chiêng trống tưng bừng đến mức khiến mọi người đều cảm thấy nhức mắt rộn tai. Tất cả mọi người đều rất trông chờ, mong ngóng cho đến khi các giám khảo kia bình giá món ăn mà các hoàng tử dâng lên.\n" +
                "\n" +
                "Giờ phút mà mọi người mong đợi cuối cùng cũng đến. Nhưng tất cả chả phượng, nem công, gan tê, tay gấu… mà các vị hoàng tử khác dâng lên đều chẳng thể sánh với hai món bánh có vẻ quê mùa của chàng hoàng tử Liêu.\n" +
                "\n" +
                "Ban đầu lúc chàng dâng cỗ lên thì tất cả mọi người đều bĩu môi, lắc đầu, khuôn mặt ai cũng bày ra vẻ chê bai rõ rệt. Tuy nhiên, khi mà nếm xong thì thái độ của họ hoàn toàn thay đổi, không có bất cứ người nào lại không gật đầu mà tán thưởng cả. Ông Lạc tướng cũng phải xoa tay mà khen ngợi rằng:\n" +
                "\n" +
                "– Đây chính là hương vị khác thường mà lại được làm từ chính những thứ tầm thường nhất.\n" +
                "\n" +
                "Còn vua Hùng lại vô cùng ngạc nhiên khi nếm được miếng bánh lạ này. Nhà vua cũng ngắm nghía kĩ lưỡng tất cả những tấm bánh chưa được bóc khác. Sau đó thì vua cho gọi Liêu lên điện, rồi hỏi chàng về cách thức để làm ra những chiếc bánh này. Chàng thành thật tâu lên toàn bộ, kể cả giấc mộng hôm ấy nữa.\n" +
                "\n" +
                "Đến quá trưa ngày hôm ấy thì vua Hùng công bố kết quả cuộc thi với tất cả con trai của mình: hoàng tử thứ mười tám đã giành được giải nhất và cũng sẽ là người nối ngôi vua. Vua Hùng đem hai món bánh kia giơ lên cao cho tất cả mọi người cùng nhìn xem, vua cũng nói rõ hết căn cớ, lí do mà mình lựa chọn món ấy là món đứng đầu trong tất cả các mâm cỗ ngày hôm nay. Nhà vua phán:\n" +
                "\n" +
                "– Thứ bánh này chẳng những quý và ngon, nó còn mang rất nhiều ý nghĩa vô cùng đặc biệt nữa. Nó không chỉ bày tỏ được lòng hiếu thảo của con cái, tôn trọng kính yêu cha mẹ như là trời đất, mà nó còn chứa đựng tình thương yêu đối với ruộng đồng quê hương. Hơn nữa loại bánh này lại rất dễ làm, nó được làm từ những hạt ngọc quý giá nhất trong số những hạt ngọc trong trời đất này, mà tất cả những hạt ngọc này mọi người lại đều có thể tự làm ra được. Người có thể nghĩ ra được loại bánh này thì hẳn phải là người rất có tài…\n" +
                "\n" +
                "Kể từ đó trở về sau thì hằng năm mỗi khi Tết đến là mọi người lại theo tục lệ mà làm hai thứ bánh ấy, họ gọi đó là bánh chưng và bánh dầy để dâng lên thờ cúng cho gia tiên.\n" +
                "\n" +
                "Còn hoàng tử Liêu khi lên ngôi vua, lấy hiệu là Tiết Liêu Vương, là Hùng Vương đời thứ mười bảy. Nhưng vì cuộc thi ấy mà có không ít hoàng tử sinh ra lòng ghen ghét, ác cảm và đố kị với chàng Lang Liêu. Bởi vậy nên khi vua cha qua đời, người nào cũng giữ khư khư phần đất của mình. Sau đó họ còn làm hàng rào gỗ để rào xung quanh phần đất của mình làm kế cố thủ, cũng có ý muốn tranh giành cùng Tiết Liêu Vương.", "Truyện cổ tích"));
        storiesVietNam.add(new StoryVietName(R.drawable.img_traucau, "Sự tích trầu cau và vôi", "Ngày xửa ngày xưa, ở nhà nọ có hai anh em ruột, người anh tên là Tân, còn người em tên là Lang. Đặc biệt nhất chính là Tân và Lang có khuôn mặt và dáng người giống hệt nhau, đến cả người nhà của họ cũng không ít lần nhầm lẫn họ với nhau. Cha của họ là người cao và to nhất ở trong vùng này, ông đã được vua Hùng cho triệu kiến về Phong Châu để ban thưởng, cũng đặt tên cho là Cao. Kể từ ngày đó trở đi thì mọi người trong gia đình bắt đầu lấy tiếng “Cao” trở thành tên họ cho mình.\n" +
                "\n" +
                "Khi hai anh em họ vừa lớn lên thì cả cha lẫn mẹ đều nối tiếp nhau mà qua đời. Vì vậy nên cả người anh lẫn người em đều hết sức quyến luyến nhau, cũng không chịu rời nhau lấy nửa bước. Trước lúc người cha qua đời thì có đem Tân gửi gắm cho người đạo sĩ trong làng họ Lưu.Tuy nhiên, lúc Tân tới để theo học, Lang chẳng chịu được việc phải ở nhà một mình nên cũng cố cầu xin vị đạo sĩ họ Lưu kia cho phép mình được học cùng với anh trai. Ở nhà của họ Lưu ấy có cô con gái đồng lứa với hai người họ.\n" +
                "\n" +
                "Cô gái họ Lưu này muốn tìm hiểu xem trong hai người thì người nào mới là anh, còn người nào là em. Một ngày nọ, cô mới nghĩ ra được mẹo nhỏ để thử. Đúng lúc cả hai anh em đều đang đói thì nàng mới đem dọn đồ ăn ra, nhưng mà nàng chỉ đem ra có duy nhất một bát cháo cùng với một đôi đũa mà thôi. Sau đó nàng đứng nấp ở ngay sau khe vách, và nàng cũng rõ ràng nhìn thấy được người nhường bát cháo kia cho người còn lại. Nàng thì thầm:\n" +
                "\n" +
                "– À, hóa ra người anh chính là anh chàng vui tính kia!\n" +
                "\n" +
                "Cũng kể từ khi đó thì Tân cùng với cô gái họ Lưu ấy có thêm rất nhiều những buổi gặp gỡ khác. Lâu dần giữa họ nảy sinh tình cảm, và tình yêu cứ càng ngày lại càng khăng khít hơn.\n" +
                "\n" +
                "Thấy vậy thì vị đạo sĩ họ Lưu cũng vui lòng mà đem gả con gái mình cho Tân. Về sau thì cả hai vợ chồng dọn đến ở một căn nhà mới, tất nhiên là có cả Lang cùng sống chung.\n" +
                "\n" +
                "Kể từ ngày có vợ, tuy rằng Tân vẫn như trước chiều chuộng e trai, nhưng mà lại chẳng âu yếm nữa. Ngày trước thì Lang thường nhận được sự quan tâm, chăm sóc tỉ mỉ của anh trai, nhưng giờ thì chàng lại phải chịu rất nhiều ngày chìm trong sự cô đơn, lẻ loi. Hơn nữa, Lang cũng dần nhận ra rằng có nhiều lúc Tân dường như muốn lánh mình, vì vậy trong lòng chàng lại tràn đầy nỗi buồn bực, chán nản:\n" +
                "\n" +
                "– Cũng phải thôi, anh ấy bây giờ chỉ mê vợ mà quên mất ta rồi!\n" +
                "\n" +
                "Vào một ngày nọ, Tân cùng với Lang đi lên nương làm việc đến tận khi trời đã tối mịt thì hai anh em mới trở về. Lang về đến nhà trước. Khi chàng vừa đưa chân đặt lên trên ngưỡng cửa, bỗng nhiên vợ của Tân đang ở trong buồng chạy vụt ra, chẳng nói chẳng rằng mà ôm chầm lấy Lang. Chàng giật mình kêu lên. Sự nhầm lẫn này của chị dâu khiến cho cả hai cùng cảm thấy ngượng nghịu và xấu hổ vô cùng. Đúng lúc ấy thì Tân lại bước vào trong nhà.\n" +
                "\n" +
                "Và cũng kể từ lúc ấy thì Lang biết thêm được một tính tình rất mới của anh trai. Tân ghen với em trai mình. Cái ghen này lại càng làm cho sự hờ hững của Tân với chàng càng thêm nhiều. Thấy vậy thì Lang cảm thấy vừa giận lại vừa thẹn. Lúc này thì chàng chỉ muốn được bỏ nhà đi chõ bõ cái ghét của mình.\n" +
                "\n" +
                "Vào một hôm, khi trời chỉ mới vừa mờ sáng thì Lang đã quyết định phải khởi hành đi xa. Chàng men theo con đường mòn mà đi mãi, giờ đây trong lòng của chàng tràn đầy nỗi bực bội, cùng sự oán trách người anh trai vốn trước đây vô cùng thương yêu mình lại có thể thay đổi nhiều đến thế.\n" +
                "\n" +
                "Chàng cứ thế đi liền mấy ngày đường. Chàng đi mãi, đi mãi và dừng chân ở bên bờ của một con sông rất lớn. Nước sông chảy rất xiết, khiến chàng cảm thấy có chút ngại ngùng.\n" +
                "\n" +
                "Ở chung quanh đây cũng chẳng thể nào nghe được tiếng chó sủa hay gà gáy nào. Tuy nhiên thì Lang nhất định không muốn trở lại nhà. Tủi thân, chàng ngồi gục ngay cạnh bờ mà khóc. Rồi chàng cứ khóc mãi như vậy, khóc đến mức mà những chú chim bay đi kiếm ăn khuya mà vẫn có thể nghe được tiếng khóc nức nở của chàng. Đến sáng ngày hôm sau thì chàng Lang của chúng ta đã là cái xác vô hồn. Và chàng đã hóa thành đá.\n" +
                "\n" +
                "Còn về phần Tân, chàng ở nhà không thấy em đâu thì lúc đầu cũng chẳng chú ý mấy. Nhưng mãi sau vẫn chẳng thấy em mình trở về, đến lúc này chàng mới vội vàng tìm đến mấy nhà quen biết, nhưng mà cũng chẳng tìm thấy bóng dáng Lang đâu cả. Tân cũng biết rõ em trai bỏ đi là vì giận dỗi với mình, lúc này cảm thấy hối hận vô cùng.\n" +
                "\n" +
                "Đến hôm sau vẫn chẳng thấy Lang về, Tân hốt hoảng lắm, đành phải bỏ vợ ở nhà một mình cất bước để đi tìm em. Mấy ngày đường ròng rã, Tân tới được bờ của con sông lớn.\n" +
                "\n" +
                "Tìm mãi nhưng cũng chẳng tìm được cách nào để có thể qua được con sông này, Tân đành phải đi men theo bờ sông, sau cùng thì nhìn thấy em trai mình đã hóa đá tự bao giờ. Tân đứng lặng người ở bên hòn đá ấy, chàng bật khóc, khóc cho đến khi khắp không gian chỉ còn lại có tiếng dòng nước đang chảy cuồn cuộn ở dưới sông mà thôi. Và Tân chết đi, chàng biến thành một cái cây có thân thẳng đứng lên trên trời, mọc ngay cạnh bên hòn đá kia.\n" +
                "\n" +
                "Vợ của Tân ở nhà chờ đợi mãi mà chẳng thấy chồng mình về, nàng sốt ruột lắm, sau không đợi được nữa nên cũng bỏ nhà mà đi tìm chồng. Nhưng sau cùng thì bước chân nàng cũng bị con sông lớn ngăn cản. Sau đó thì nàng ngồi cạnh cái cây cao rồi khóc đến cạn hết nước mắt. Nàng chết đi hóa thành loại cây dây và quấn quanh thân cây cao lớn kia.\n" +
                "\n" +
                "Chờ mãi mà chả thấy người nào trở về, vợ chồng vị đạo sĩ họ Lưu liền đi nhờ tất cả mọi người ở trong làng cùng nhau chia đường tìm kiếm. Đến nơi hòn đá cùng với hai loại cây lạ thì mọi người cũng chỉ còn biết bảo nhau lập miếu để thờ cả ba người ở ngay bên ven sông. Tất cả nhân dân xung quanh vùng ấy đều gọi miếu đó là “Anh em thuận hòa, vợ chồng nghĩa tiết”.\n" +
                "\n" +
                "Sau này, có một năm trời hạn hán dữ dội. Tất cả cỏ cây, hoa lá trong vùng đều khô héo hết. Nhưng riêng hai loại cây mọc ở bên cạnh hòn đá ngay trước miếu thì vẫn xanh tươi mơn mởn. Tất cả mọi người đều cho đó là một điều linh dị.\n" +
                "\n" +
                "Có hôm vua Hùng ngự giá ngang qua vùng đó. Lúc đi qua miếu thì vua khá ngạc nhiên vì nhìn thấy có cảnh lạ và cây lạ. Vua hỏi:\n" +
                "\n" +
                "– Miếu nơi này là thờ thần nào? Còn mấy loại cây lạ này cũng là lần đầu ta trông thấy?\n" +
                "\n" +
                "Lạc tướng thấy vua hỏi thì liền gọi tới mấy cụ già ở trong vùng đến để trả lời. Khi nghe mấy cụ già kể lại câu chuyện xưa, càng nghe thì vua Hùng lại càng cảm thấy cảm động.\n" +
                "\n" +
                "Nhà vua liền vạch lá để trèo lên trên cao, nhìn ngắm quang cảnh chung quanh. Sau đó thì vua hạ lệnh cho một cận vệ trèo lên trên cây để hái quả xuống cho mình nếm thử. Vua ăn quả thấy có vị chát, nhưng cũng chẳng có gì là lạ cả. Tuy nhiên, khi nhà vua nhai quả ấy cùng lá của cây dây leo kia thì lại thấy có vị gì là lạ ở nơi đầu lưỡi. Cái vị này nó vừa thơm cay lại vừa ngon ngọt.\n" +
                "\n" +
                "Đột nhiên có viên quan hầu bên cạnh hét lớn:\n" +
                "\n" +
                "– Trời ơi là trời! Có máu!\n" +
                "\n" +
                "Tất cả mọi người đều đứng giãn ra, vẻ mặt vô cùng kinh ngạc. Hóa ra là mấy thứ bã khi nhai quả cùng với lá của hai loại cây kia, một khi nhổ xuống đá thì đổi màu đỏ ối như là máu vậy.\n" +
                "\n" +
                "Nhà vua lập tức sai người lấy ba thứ đó nhai lẫn cùng với nhau, và đột nhiên thấy cả người như nóng hừng hực, cảm giác như là có ít hơi men trong người, môi thì đỏ tươi, còn sắc mặt thì rất hồng hào. Vua liền bảo:\n" +
                "\n" +
                "– Đúng là linh dị mà! Chính là bọn họ! Tình thương yêu của họ vô cùng nồng nàn và thắm đỏ.\n" +
                "\n" +
                "Kể từ đó trở đi thì vua Hùng liền ra lệnh tất cả mọi nơi cùng nhau gây giống và trồng thật nhiều hai loại cây kia. Điều đặc biệt nhất chính là trong luật, nhà vua đã yêu cầu trai gái, khi kết hôn cùng với nhau thì bắt buộc phải tìm đủ ba thứ: trầu, cau cùng với vôi, để cho tất cả mọi người cùng nhai và nhổ một ít để ghi dấu tình yêu chẳng bao giờ bị phai nhạt.\n" +
                "\n" +
                "Và cũng kể từ đó mà dân Việt ta mới hình thành tục ăn trầu. Đó là câu chuyện về sự tích trầu cau mà nhân dân ta vẫn lưu truyền.", "Truyện cổ tích"));

        storiesVietNam.add(new StoryVietName(R.drawable.img_trikhon, "Trí khôn của ta đây", "Một ngày nọ, có con cọp rất lớn từ trong rừng sâu đi ra ngoài, nó trông thấy ở ngay thửa ruộng cạnh rừng có bác nông dân cùng con trâu mộng chăm chỉ cày cuốc. Tuy rằng con trâu kia rất chăm chỉ kéo cày nhưng mà lâu lâu thì bác nông dân kia lại quất cho nó mấy roi tạo thành tiếng “đét… đét…” vào mông.\n" +
                "\n" +
                "Thấy cảnh này thì cọp cảm thấy ngạc nhiên lắm. Nó đợi cho đến khi buổi trưa tới, đợi cho bác nông dân tháo hết cày ra cho trâu, rồi nó mới lân la tiến tới để hỏi chuyện nó vẫn tò mò:– Này anh kia. Tôi trông anh to khỏe thế sao lại để cho bọn con người đánh đập, hành hạ đến khổ sở như thế chứ?Trâu thấy cọp tới thì cũng tỏ vẻ bình tĩnh, nghe cọp hỏi xong thì nó mới thì thầm:\n" +
                "\n" +
                "– Anh không biết đấy thôi! Nhìn con người nhỏ bé vậy nhưng họ có trí khôn, đáng sợ lắm!\n" +
                "\n" +
                "Nghe trâu nói như vậy thì cọp ta lại càng cảm thấy kì lạ và khó hiểu hơn. Cọp lại hỏi:\n" +
                "\n" +
                "– Trí khôn ư? Nó là gì thế? Trông nó như nào vậy anh?\n" +
                "\n" +
                "Nhưng mà trâu cũng chẳng biết cách để giải thích cho cọp hiểu chuyện này, vì vậy nó liền kiếm cớ trả lời qua loa cho qua chuyện:\n" +
                "\n" +
                "– Trí khôn thì là trí khôn chứ gì nữa hả? Nếu như mà anh muốn được biết rõ hơn nữa thì hãy tìm con người mà hỏi!\n" +
                "\n" +
                "Cọp ta bước đi rất thong thả mà tiến gần lại chỗ mà bác nông dân đang nghỉ ngơi, nó liền hỏi:\n" +
                "\n" +
                "– Này anh, trí khôn của anh đâu rồi, đem cho tôi xem môt chút đi nào?\n" +
                "\n" +
                "Bác nông dân nhìn cọp rồi nghĩ ngợi hồi lâu, sau đó mới đáp lời:\n" +
                "\n" +
                "– Tiếc là tôi để trí khôn ở nhà rồi. Hay là tôi chạy về đem nó ra đây cho anh nhìn nhé! Nếu như anh thích thì tôi có thể cho anh một chút đấy!\n" +
                "\n" +
                "Nghe bác nông dân bảo vậy thì cọp ta hết sức mừng rỡ, vội vàng giục bác về nhà lấy. Nhưng bác nông dân vừa định đi thì lại chợt nhớ ra chuyện gì đó nên lại quay lại bảo với cọp rằng:\n" +
                "\n" +
                "– Nhưng mà nhỡ đâu lúc tôi về nhà thì anh ở đây lại ăn mất toi con trâu kia của tôi thì tôi biết phải làm sao?\n" +
                "\n" +
                "Bị hỏi vậy thì cọp ta cũng bất ngờ lắm, trong lúc nó còn đương băn khoăn chẳng biết mình phải trả lời làm sao cho hợp tình hợp lí, thì bác nông dân lại tiếp lời:\n" +
                "\n" +
                "– Như vậy nhé, để tôi yên tâm trở về, anh chịu khó một chút cho tôi buộc tạm anh vào cái gốc cây kia được không?\n" +
                "\n" +
                "Tất nhiên là cọp ta chẳng có chút nghi ngờ nào về chuyện này nên chấp thuận ngay được. Bác nông dân đợi cọp đồng ý thì đem tới dây thừng và trói cọp thật chặt vào dưới gốc cây cạnh đó.\n" +
                "\n" +
                "Xong rồi bác lại đem tới rất nhiều rơm khô để chất xung quanh chỗ cọp. Sau cùng thì bác châm lửa để đốt rơm, rơm cháy và bác liền quát:\n" +
                "\n" +
                "– Trí khôn của ta đây! Trí khôn của ta đây!\n" +
                "\n" +
                "Nhìn thấy cảnh này thì con trâu ở gần đấy cũng thích thú lắm, nó bò lăn ra đất mà cười, không may là hàm trên của nó đập phải đá làm cho toàn bộ răng ở trên bị rụng sạch sẽ, không còn sót lại một cái nào cả.\n" +
                "\n" +
                "Còn cọp ta thì hết sức vùng vẫy ở bên trong đám cháy. Phải một hồi lâu sau đó, lửa cháy lớn làm đám dây thừng bị đứt, đến lúc ấy thì cọp mới thoát được. Nó co chân co cẳng vùng dậy và chạy thẳng vào trong rừng sâu, cũng chẳng dám ngoảnh đầu nhìn lại nữa.\n" +
                "\n" +
                "Cũng kể từ ngày đó trở đi thì đám cọp con được sinh ra thì con nào cũng đều có thêm những vằn màu đen và kéo dài ở trên người. Những vết vằn ấy chính là dấu vết còn sót lại của những vệt cháy ngày xưa.\n" +
                "\n" +
                "Còn đám trâu cũng kể từ khi ấy mà con nào con ấy đều không có răng ở hàm trên, trơ trọi chỉ có mỗi lợi mà thôi.\n" +
                "\n" +
                "Câu chuyện này đã cho chúng ta biết được nguyên nhân tại sao trâu thì không có rằng ở hàm trên, còn trên người của hổ (cọp) thì lại có những đường vằn đen. Qua đó cũng cho chúng ta thấy được sự thông minh, cơ trí của con người.\n" +
                "\n" +
                "Vì vậy nên các em cũng phải học tập thật chăm chỉ để càng ngày càng thông minh hơn, hiểu biết nhiều hơn về thế giới xung quanh chúng ta.\n" +
                "\n" +
                "Chúc tất cả các em sẽ luôn học giỏi và chăm ngoan, luôn lắng nghe lời dạy bảo của ông bà, cha mẹ và cả thầy cô nữa nhé!", "Truyện cổ tích"));

        storiesVietNam.add(new StoryVietName(R.drawable.img_thanhgiong,"Thánh Gióng","Vào thời của vua Hùng Vương trước đây, ở một vùng nọ có người đàn bà tuổi cũng đã cao, nhưng vẫn phải sống lủi thủi một mình mãi. Một ngày nọ, khi trời mới tảng sáng, theo thường lệ bà lại đi lên thăm nương, vô tình bà nhìn thấy có một dấu chân to dẫm nát hết mấy luống cà của mình. Nhìn dấu chân này bà ngạc nhiên kêu lớn:\n" +
                "\n" +
                "– Chao ôi! Bàn chân của ai mà lại to thế nhỉ?Tò mò nên bà đưa chân vào ướm thử dấu chân lạ kia, đột nhiên bà lại rùng mình một cái. Và kể từ ngày đó thì bà mang thai. Khi cái thai trong bụng đã đủ ngày đủ tháng thì bà sinh ra được một đứa bé trai kháu khỉnh, bụ bẫm, bà liền đặt tên cho nó là Gióng.Tuy nhiên, dù Gióng đã lên ba tuổi nhưng chẳng giống như những đứa trẻ khác, nó vẫn cứ nằm ngửa mà đòi ăn, chẳng biết ngồi mà cũng chẳng biết lẫy, hơn nữa nó cũng chẳng nói chẳng cười tiếng nào.\n" +
                "\n" +
                "Khi ấy là thời điểm bọn giặc Ân lũ lượt kéo vào để cướp nước của ta. Đám giặc Ân này vô cùng hung hãn và tàn ác, tên tướng cầm đầu tên là Ân vương, hắn có hình dung vô cùng cổ quái và dữ tợn. Chúng đi đến đâu thì lại đốt phá cửa nhà, còn giết người để cướp của khắp mọi nơi.\n" +
                "\n" +
                "Quân đội của Hùng Vương cũng không ít lần dẫn quân xuất trận, tuy nhiên sức yếu nên không thể nào đánh lại bọn giặc Ân hùng mạnh kia. Vua Hùng thấy tình hình không ổn thì vô cùng lo lắng, vì vậy vội vàng hạ lệnh cho sứ giả của mình đi khắp nơi trong nước mong có thể tìm được những bậc tướng tài ba để giúp nhà vua cứu lấy đất nước đang trên bờ lâm nguy.\n" +
                "\n" +
                "Vào một ngày kia, sứ giả tới làng của chú bé tên Gióng. Khi nghe thấy tiếng loa rao rằng nhà vua đang đi cầu người tài khắp nơi, mẹ của Gióng đang ru con liền đùa vui với con mình là:\n" +
                "\n" +
                "– Con ơi! Con trai ngoan của mẹ cứ mãi không đi không nói như vậy, biết đến bao giờ thì con mới có thể đi đuổi giặc giúp nhà vua đây!\n" +
                "\n" +
                "Không ngờ khi người mẹ vừa dứt lời thì Gióng lại đột nhiên mở miệng mà nói thành tiếng rằng:\n" +
                "\n" +
                "– Mẹ hãy đi gọi sứ giả vào nhà mình cho con!\n" +
                "\n" +
                "Nhưng khi nói xong thì Gióng lại im lặng. Người mẹ thấy vậy thì nửa mừng nửa sợ, vội vội vàng vàng đem chuyện lạ này kể lại cho xóm giềng xung quanh được biết. Thấy chuyện lạ xảy ra, tất cả mọi người đều đổ xô tới nhà của Gióng, ai cũng cho đây là một chuyện thần kì. Một người trong đám đông liền nói:\n" +
                "\n" +
                "– Ta cứ thử ra mời sứ giả tới để xem nó muốn làm cái gì nào.\n" +
                "\n" +
                "Vậy là mọi người lại chạy ra mời sứ giả tới, khi viên sứ giả ấy vào trong nhà và trông thấy Gióng thì lập tức hỏi:\n" +
                "\n" +
                "– Có phải mày chính là đứa bé tận ba tuổi mới học nói không? Mày mời ta đến đây có việc gì?\n" +
                "\n" +
                "Gióng chững chạc trả lời lại câu hỏi của viên sứ giả kia:\n" +
                "\n" +
                "– Hãy về báo lại với nhà vua cho người rèn một con ngựa sắt, làm một thanh gươm sắt, thêm một bộ áo giáp sắt, cùng với một chiếc nón sắt nữa, sau đó ta sẽ giúp đuổi đám giặc kia cho!\n" +
                "\n" +
                "Tất cả mọi người chứng kiến ở đó đều cảm thấy sự việc này hết sức lạ lùng và có phần thần kỳ nữa. Cho rằng đây là thần nhân hiện thân, viên sứ giả vội vã phi ngựa nước đại trở lại cung để bẩm báo lại toàn bộ sự việc cho nhà vua cùng quần thần được biết.\n" +
                "\n" +
                "Hùng Vương nghe sứ giả tâu rõ thì vô cùng vui mừng, lập tức hạ lệnh cho đám thợ rèn phải đem gom góp tất cả sắt lại để rèn ngựa sắt, gươm sắt, áo giáp sắt cùng với nón sắt đúng như lời dặn của chú bé kia.\n" +
                "\n" +
                "Những thứ đồ ấy khi rèn xong thì nặng không sao tả nổi. Hàng chục người cùng nhau bê thanh gươm sắt mà nó cũng chẳng chịu nhúc nhích một chút nào. Bởi vậy nên vua Hùng đành phải phái hàng ngàn quân lính của mình tìm đủ mọi cách để có thể chở đồ tới giao lại cho chú bé tên Gióng kia.\n" +
                "\n" +
                "Khi nghe tin có hàng toán quân lính cùng nhau khiêng những thứ đồ bằng sắt ấy tới làng, mẹ của Gióng vô cùng sợ hãi mà chạy thẳng về nhà nói với con trai:\n" +
                "\n" +
                "– Con ơi! Chuyện của nhà vua không phải là chuyện vui đùa đâu. Hiện nay quân lính người ta đang ầm ầm kéo nhau tới ngoài bãi rồi, chúng ta biết phải làm gì bây giờ?\n" +
                "\n" +
                "Nghe mẹ nói vậy, Gióng đột nhiên ngồi vụt dậy mà bảo:\n" +
                "\n" +
                "– Chuyện đánh giặc mẹ không cần lo lắng làm gì. Nhưng mà mẹ phải cho con ăn nhiều thì mới được!\n" +
                "\n" +
                "Người mẹ vội vã chạy đi thổi cơm để cho con trai ăn, nhưng bà nấu được nồi nào thì Gióng lại ăn hết ngay nồi ấy. Và mỗi lần ăn hết một nồi cơm mẹ nấu thì Gióng lớn được thêm một chút, cậu lại đòi ăn nữa. Người mẹ càng cho con ăn bao nhiêu thì Gióng lại càng lớn hơn được bấy nhiêu, cậu bé lớn nhanh như thổi, không bao lâu thì đã trở thành chàng trai trẻ tuổi khỏe mạnh.\n" +
                "\n" +
                "Khi trong nhà đã hết sạch gạo, người mẹ lại phải chạy đi khắp làng xóm để kêu gọi. Mọi người trong làng đều nô nức sắp gạo, đem khoai tới, còn có cả trâu, có cả rượu, cùng rất nhiều bánh trái, hoa quả,… chất đầy cả một sân rộng.\n" +
                "\n" +
                "Tuy nhiên, dù người dân trong làng có đưa đến bao nhiêu thì chàng Gióng lại ăn vơi đi bấy nhiêu, nhưng mà chàng vẫn tiếp tục đòi ăn thêm không ngừng nghỉ. Sau đó thì Gióng lại nói với mẹ mình là:\n" +
                "\n" +
                "– Mẹ hãy kiếm vải để may quần áo cho con mặc.\n" +
                "\n" +
                "Nghe chàng Gióng nói vậy thì tất cả mọi người lại cùng nhau đem tới không biết bao nhiêu là vải lụa để mà may quần áo mới cho chàng. Tuy nhiên thì thân thể của chàng lại lớn vụt một cách rất kỳ lạ, quần áo mới vừa may thì đã chật và ngắn ngay được, khiến mọi người cứ phải đem vải tới chắp vá thêm không ngừng. Chẳng mấy chốc mà đầu của chàng đã chạm tới được nóc nhà.\n" +
                "\n" +
                "Khi mọi người ở làng còn chưa hết ngạc nhiên thì đám quân lính cũng vừa lúc khiêng được đống ngựa sắt, gươm sắt, áo giáp sắt cùng nón sắt tới nơi. Gióng thấy thế liền bước ra ngoài, chàng vươn vai và người đột nhiên cao lớn sừng sững như một ngọn núi, chân chàng dài hơn trượng, chàng hét một tiếng nghe như tiếng sấm rền:\n" +
                "\n" +
                "– Ta chính là tướng của nhà Trời!\n" +
                "\n" +
                "Sau đó Gióng nhanh nhẹn đem áo giáp sắt mặc lên người, lấy nón sắt đội lên đầu, một tay cầm lấy gươm sắt mà múa vài vòng. Rồi chàng nói lời từ biệt với mẹ của mình cùng tất cả dân làng, sau cùng thì nhảy phắt lên con ngựa sắt. Con ngựa sắt đột nhiên chồm lên rồi phun thẳng về phía trước luồng lửa nóng đỏ rực.\n" +
                "\n" +
                "Chàng Gióng lấy chân thúc một cái, con ngựa lập tức phi như bay, nó sải những bước nhảy dài phải hàng chục con sào ghép lại, làm rung chuyển đất trời. Trong nháy mắt thì nó đã xông thẳng đến nơi giặc hạ trại, hàng loạt những khu trại rộng trải dài khắp mấy khu rừng. Chàng Gióng lập tức vung gươm trên tay như chớp giật. Đám giặc Ân xông vào bao nhiêu thì lại chết hết từng ấy. Rồi con ngựa sắt lại thét ra lửa làm cháy hết những đồn trại, rồi thiêu cháy luôn cả mấy cánh rừng kia nữa. Khói bụi bay mù mịt khắp trời, tiếng la hét khóc than vang trời.\n" +
                "\n" +
                "Tuy là bị thương vong rất nhiều nhưng tướng giặc Ân vương vẫn không ngừng gào thét ra lệnh cho quân đội tiến đến, Gióng càng đánh lại càng khỏe hơn, thây đám giặc Ân chất ngổn ngang khắp nơi trong rừng. Đột nhiên gươm sắt của chàng bị gãy. Nhưng chàng chẳng có chút bối rối, lập tức với tay nhổ lấy những bụi tre lớn ở hai bên đường mà quật túi bụi vào đám giặc đang bám trụ theo mệnh lệnh của chủ tướng.\n" +
                "\n" +
                "Nhưng bọn giặc Ân cũng chẳng cầm cự được bao lâu, sau đó bắt đầu tan rã, chạy tán loạn ở khắp nơi, còn tên tướng giặc Ân vương thì đã bị Gióng quật cho tan xác tự bao giờ. Đám tàn binh thấy tướng lĩnh đã chết thì vội vàng lạy lục để xin hàng.\n" +
                "\n" +
                "Đến lúc này thì quân đội Hùng Vương cùng tất cả dân làng nơi đây chỉ còn việc duy nhất là xông tới mà trói hết chúng lại mà thôi. Chưa đầy buổi mà Gióng đã có thể trừ được nạn nước. Khi ấy ngựa sắt của Gióng cũng đã tới chân ngọn núi Sóc Sơn. Khi đến nơi này, Gióng đem áo giáp sắt cùng nón sắt để lại, sau đó cưỡi theo ngựa sắt mà bay thẳng về trời.\n" +
                "\n" +
                "Sau khi nạn giặc ngoại xâm đã trừ, để tưởng nhớ công ơn của người anh hùng thì vua Hùng đã cho người xây dựng đền thờ chàng Gióng ngay tại quê hương của chàng, phong chàng thành Phù Đổng thiên vương.\n" +
                "\n" +
                "Cho đến tận ngày nay thì chúng ta vẫn còn có thể nhìn thấy được những vết tích sót lại là những dãy ao hình tròn cứ nối tiếp nhau từ Kim Anh, qua Đa Phúc rồi đến tận Sóc Sơn, cha ông ta nói rằng đó chính là dấu chân mà ngựa sắt của Thánh Gióng để lại. Còn khu rừng bị thiêu rụi bởi ngọn lửa của ngựa sắt thì ngày nay có tên gọi là làng Cháy. Và những đám tre mà Thánh Gióng đem nhổ nên để đánh giặc dính lửa nên từ màu xanh ngả hết thành màu vàng, hơn nữa còn có thêm lốm đốm những vết cháy, hiện nay vẫn còn giống ấy, người ta vẫn gọi nó là tre ngà (hoặc là tre đằng ngà).", "Truyện cổ tích"));
        storiesVietNam.add(new StoryVietName(R.drawable.img_caytre,"Cây tre trăm đốt","Chuyện xưa kể lại rằng, ở vùng nọ có một người nông phu rất nghèo khó, vì vậy nên anh ta không còn cách nào khác là phải đến ở cho nhà một phú ông vô cùng giàu có. Nhưng tính tình của phú ông này lại rất keo kiệt. Lão có rất nhiều mánh khóe để đối phó với những kẻ ở người ăn của nhà mình, hòng bòn công của họ mà bản thân lại không cần phải trả thêm bất cứ khoản tiền nào nữa.\n" +
                "\n" +
                "Lão có cô con gái cũng chưa gả chồng. Khi thấy anh đầy tớ nhà mình tuổi cũng đã khá lớn, lại cũng chưa cưới vợ thì lão ta lập tức nghĩ ra được một chiêu rất hay. Lão liền giả vờ giả vịt nói với anh đầy tới là:\n" +
                "\n– Cứ cố gắng mà làm việc con ạ! Sau này lão sẽ đem con gái lão gả cho mày.Bởi bản tính quá thật thà, khi anh chàng nghe được những lời đường mật, dụ dỗ của phú ông thì tưởng thật, cũng dần nuôi hy vọng được làm rể của phú ông.\n" +
                "\n" +
                "Kể từ ngày đó trở đi thì anh chàng đổ sức để làm việc mà không quản mệt nhọc, vất cả. Khi trời con chưa sáng thì anh đã đang bì bõm lội ở ngoài đồng xa, đến khi trời đã khuya mù mịt mà anh vẫn còn trần lực ra xay lúa rồi giã gạo, lại còn kéo trục và bện thừng nữa… làm việc luôn chân luôn tay. Tất cả những công to việc lớn mà phú ông giao cho, dù có phải chịu mệt nhọc hay khó khăn thì anh chàng cũng chẳng bao giờ từ chối cả.\n" +
                "\n" +
                "Khi phú ông trông thấy mưu kế của mình hiệu quả thì vô cùng mừng rỡ. Còn đứa con gái bảo bối của lão á? Đời nào mà lão lại chịu gả nó cho hạng người nghèo khố rách áo ôm, đi làm thuê làm mướn cho người như anh chứ. Một người giàu có nổi tiếng ở làng bên mới đem trầu cau và sính lễ tới dạm ngõ hỏi cưới con gái của lão cho con của hắn. Và lão cùng đã đồng ý gả rồi.\n" +
                "\n" +
                "Nhưng vì để giấu anh chàng đầy tớ nhà mình nên lão yêu cầu tất cả mọi người ở trong nhà đều phải giữ im lặng về chuyện này. Còn anh chàng đầy tớ, tất nhiên là anh chẳng hề biết gì, cũng chẳng nghi ngờ lời hứa ngon ngọt của chủ nhà, vẫn cứ đinh ninh rằng phú ông nói thật, vì thế vẫn cứ quần quần mà bán mạng làm việc cho lão ta, ký thác hy vọng của mình vào lão chủ xấu xa.\n" +
                "\n" +
                "Thời gian cũng vẫn cứ thế mà trôi qua, rồi thì ngày định cưới của cô con gái phú ông cuối cùng cũng đã tới. Ngày ấy ở trong nhà của phú ông, mọi người tất bật chạy qua chạy lại bày biện bàn ghế, rồi lại đi giết gà mổ lợn. Vì để tránh anh đầy tới nhà mình nảy sinh nghi ngờ lại kéo ra lắm chuyện lôi thôi ảnh hưởng đến lễ cưới của con gái mình, lão phú ông liền cho gọi anh chàng tới và nói rằng:\n" +
                "\n" +
                "– Thời gian ở nhà ta con đã làm việc tốt lắm, khiến lão vô cùng ưng ý đấy. Ngày hôm nay thì lão cũng đã cho người sửa soạn đầy đủ hết cỗ bàn rồi. Nhưng mà nếu con muốn cưới con gái lão thì cũng phải có gì đấy làm sính lễ thì mới coi được chứ. Ta cũng chẳng đòi con phải có tiền bạc hay ruộng vườn. Bây giờ con cứ đi lên trên rừng kia, kiếm lấy cây tre nào có đủ trăm đốt thì đem chặt rồi mang về đây, thì lão sẽ coi đó là sính lễ rồi cho các con làm lễ thành hôn với nhau luôn. Nếu mà con không kiếm được thì lão đem con gái gả cho người ta đấy!\n" +
                "\n" +
                "Anh chàng đầy tớ nghe phú ông nói một thôi một hồi thì cũng ngẩn người ra, phải một lúc sau thì anh mới hoàn hồn, vội vàng đem theo rựa mà cắm cúi lên rừng. Khi lên đến rừng, anh chàng cố tình tìm tới những bụi tre nào cao nhất, sau đó lách vào bằng được để chặt. Tuy nhiên thì cứ mỗi khi một cây tre bị đốn ngã là nỗi thất vọng của anh lại càng nhân lên. Những cây tre nhìn như cao ngất ngưởng là vậy đấy nhưng mà chẳng có cây nào đủ một trăm đốt cả, nhiều lắm thì cũng chỉ khoảng bốn mươi đốt mà thôi.\n" +
                "\n" +
                "Mặc dù vậy nhưng anh vẫn chẳng nản lòng. Cây này không được anh lại đi tìm cây khác, anh còn tìm đến những nơi vô cùng hiểm hóc, ở đó có những bụi tre già, dù cho có bị những gai tre cào rách áo, cào toạc da thì anh vẫn chẳng chút bận tâm đến. Anh cứ thế tìm kiếm với hy vọng tìm được một cây tre có đủ một trăm đốt tre mang về để làm sính lễ dâng cho bố vợ tương lai của mình.\n" +
                "\n" +
                "Với niềm hy vọng lớn lao trong lòng, anh cứ giơ cao rựa của mình mà chặt. Tuy nhiên dù anh có chặt bao nhiêu, dù có bao nhiêu cây tre đổ xuống thì đếm đi đếm lại cũng chẳng có cây nào đủ được một trăm đốt cả. Sức cũng đã kiệt, anh mệt mỏi và buồn rầu, quá chán nản nên anh đem con rựa trên tay quẳng luôn xuống dưới đất rồi tức tưởi ngồi khóc một mình.\n" +
                "\n" +
                "Tiếng khóc nức nở của anh làm vang động núi rừng. Khi tiếng khóc của anh đến tai của Bụt thì Bụt lập tức xuất hiện trước mặt anh mà hỏi rằng:\n" +
                "\n" +
                "– Con là ai? Tại sao con lại ngồi khóc ở nơi này?\n" +
                "\n" +
                "Anh chàng cố gạt hết nước mắt trên mặt mà thành thật kể lại cho Bụt nghe đầu đuôi câu chuyện. Khi nghe xong, Bụt liền bảo anh:\n" +
                "\n" +
                "– Con hãy nín khóc đi. Bây giờ con hãy đi chặt đủ một trăm dốt tre rồi mang lại đây.\n" +
                "\n" +
                "Nghe lời Bụt nói, anh chàng lập tức đi chặt đủ một trăm dốt tre rồi mang về chỗ Bụt đang đứng. Nhưng mà mang về rồi thì anh lại tiếp tục khóc than. Bụt hỏi:\n" +
                "\n" +
                "– Tại sao con lại khóc?\n" +
                "\n" +
                "Anh chàng buồn bã đáp:\n" +
                "\n" +
                "– Phú ông yêu cầu con phải chặt cho được một cây tre có đủ một trăm đốt tre, chứ không phải là chặt được một trăm đốt tre đâu!\n" +
                "\n" +
                "Bụt cười hiền lành, nhẹ giọng an ủi, sau đó thì bảo anh chàng để một trăm đốt tre rời thành một hàng ngay ngắ n rồi bảo hô:\n" +
                "\n" +
                "– Khắc nhập! Khắc nhập!\n" +
                "\n" +
                "Vâng lời Bụt, anh chàng cũng hô lớn thì lập tức có phép màu xuất hiện, khi anh vừa dứt lời thì một trăm đốt tre rời đột nhiên chắp lại với nhau hệt như là chúng vốn là một cây vậy.\n" +
                "\n" +
                "Khi đã có được cây tre trăm đốt như đúng yêu cầu của phú ông thì anh chàng vô cùng mừng rỡ, vội vàng vác cây tre mang về. Tuy nhiên thì dù anh có dùng sức bao nhiêu thì cũng không cách nào vác cây tre lên mà mang về nhà được. Anh cứ loay hoay mất một lúc lâu, sau cùng thì bất lực, anh lại để tre xuống mà khóc than. Nghe tiếng khóc của anh, Bụt lại hiện lên và hỏi:\n" +
                "\n" +
                "– Con làm sao lại khóc rồi?\n" +
                "\n" +
                "Anh chán nản thưa:\n" +
                "\n" +
                "– Vì cây tre này dài quá, con không thể đưa nó về được.\n" +
                "\n" +
                "Bụt cười lại dạy anh câu thần chú khác:\n" +
                "\n" +
                "– Khắc xuất! Khắc xuất!\n" +
                "\n" +
                "Khi anh chàng vừa hô xong thì phép màu cũng lại xuất hiện, cây tre ấy lại lập tức rời nhau ra thành một trăm đốt tre như ban đầu. Anh chàng mừng quá, cảm ơn Bụt rối rít, sau đó thì anh cột tre thành hai bó to rồi quảy lên vai đem ra khỏi khu rừng.\n" +
                "\n" +
                "Lúc anh chàng nông phu vừa về tới cửa nhà phú ông thì cũng là lúc mà hai họ đương cỗ bàn vô cùng linh đình, cũng là lúc mà cô dâu và chú rể chuẩn bị bước ra ngoài để làm lễ cưới.\n" +
                "\n" +
                "Anh chàng cũng chẳng thể hiện cảm xúc gì, chỉ lẳng lặng gọi phú ông tới để nhận sính lễ. Khi nhìn thấy những đốt tre rời rạc thì phú ông lập tức quát lớn:\n" +
                "\n" +
                "– Tao đã bảo mày đi chặt lấy một cây tre có trăm đốt, chứ ai bảo mày đi chặt một trăm đốt tre về làm gì! Đúng là đồ ngớ ngẩn!\n" +
                "\n" +
                "Dù lão phú ông quát vậy nhưng anh cũng chẳng nói chẳng rằng gì, chỉ hô lên liên tục:\n" +
                "\n" +
                "– Khắc nhập! Khắc nhập!\n" +
                "\n" +
                "Những đốt tre cứ lần lượt rời khỏi bó rồi chắp lại với nhau trở thành một cây tre cao ngất. Phú ông trông thấy, vừa ngạc nhiên, vừa bực mình, lão liền chạy ngay tới định phá cho những đốt tre phải rời nhau ra. Tuy nhiên thì tiếng hô “khắc nhập” của anh nông phu có phép màu không dừng lại, khiến cho cả thân người của lão phú ông cũng bị dính liền luôn vào thân cây tre, nhìn như là một đốt nối thêm vào cây vậy.\n" +
                "\n" +
                "Thấy mình bị dính vào với cây, phú ông lập tức kêu la ầm ỹ. Tiếng kêu la oai oái của lão khiến cho cả hai họ đều vô cùng hốt hoảng mà chạy hết ra ngoài. Chàng rể chính là người đầu tiên tiến tới định bụng sẽ gỡ hộ bố vợ mình, nhưng là anh nông phu lại hô “khắc nhập” khiến cho hắn cũng dính luôn vào cây tre, đội cả phú ông lên trên đầu. Tiếp theo là ông thông gia, vốn định chạy lại gỡ con trai của mình ra nhưng cũng lại bị dính luôn vào đấy.\n" +
                "\n" +
                "Sau đó thì hai bên họ nhà trai và họ nhà gái cứ nối tiếp nhau xông vào, định là gỡ nhưng lại thành ra bị dính chặt vào cây tre. Mọi người đều đã sợ đến mức mặt cũng xanh mét lại rồi, nhưng mà anh nông phu kia thì vẫn rất thản nhiên đứng ở một góc sân chờ câu trả lời của phú ông.\n" +
                "\n" +
                "Sau cùng thì phú ông cũng phải mở miệng van lạy anh hết lời, xin anh thả mọi người ra và cũng hứa sẽ gả con gái mình cho anh đúng như những gì lão đã hứa trước đây. Đến lúc bấy giờ thì anh nông phu mới hô:\n" +
                "\n" +
                "– Khắc xuất! Khắc xuất!\n" +
                "\n" +
                "Ngay lập tức, cả phú ông cùng với mọi người đều được thoát khỏi cây tre kia. Sau đó thì họ nhà trai cùng với chàng rể của nhà mình phải ra về tay không. Còn anh chàng nông phu thì lại đúng như ước nguyện được cưới con gái phú ông làm vợ.","Truyện cổ tích"));
        storiesVietNam.add(new StoryVietName(R.drawable.img_tamcam,"Tấm Cám","Ngày xửa ngày xưa ở nhà nọ có hai chị em cùng cha nhưng khác mẹ, người chị tên là Tấm còn người em tên là Cám. Hai người họ cũng gần bằng tuổi nhau. Nhưng Tấm là con của người vợ cả, còn Cám chỉ là con của vợ lẽ mà thôi. Mẹ của Tấm thì đã chết từ lúc Tấm còn nhỏ xíu. Vài năm sau cái chết của người vợ cả thì cha của Tấm cũng qua đời. Vì thế mà Tấm phải ở với người dì ghẻ, cũng chính là mẹ của Cám.\n" +
                "\n" +
                "Dì ghẻ này là một người vô cùng cay nghiệt. Mụ ta bắt Tấm ngày ngày đều phải làm lụng vất vả luôn canh, Tấm phải chăn trâu, rồi còn phải đi gánh nước, rồi lại thái khoai và vớt bèo. Đến đêm thì phải xay lúa và giã gạo, làm việc luôn tay luôn chân mà vẫn chẳng hết việc.Bên cạnh đó thì Cám lại được mẹ vô cùng cưng chiều, không chỉ ăn trắng mặc trơn, mà cả ngày chỉ biết quanh quẩn quanh nhà, chả bao giờ phải đụng tay vào bất kì công việc nặng nhọc nào.\n" +
                "\n" +
                "Vào một ngày nọ, dì ghẻ liền đem hai cái giỏ đưa cho hai chị em rồi sai ra ngoài đồng bắt ít tôm tép mang về. Mụ hứa hẹn rằng:\n" +
                "\n" +
                "– Cứ hễ đứa nào mà bắt mang về đầy giỏ tôm tép thì sẽ được ta thưởng cho cái yếm đỏ!\n" +
                "\n" +
                "Đến khi ra đồng, bởi vì Tấm đã quen với việc mò cua bắt ốc nên chỉ hết một buổi là đã bắt được đầy một giỏ nào tôm, nào tép, còn có cả cá nữa. Còn Cám quen thói ăn chơi, ra đến đồng vẫn cứ thủng thỉnh, cứ dạo từ ruộng này đến ruộng nọ, cho đến tận buổi chiều mà nó vẫn chẳng bắt được chút tôm tép nào cả. Nhìn thấy giỏ của Tấm đã đầy, Cám lập tức bảo với chị mình là:\n" +
                "\n" +
                "– Chị Tấm ơi chị Tấm! Đầu chị bị lấm, chị hụp cho sâu, kẻo về mẹ mắng.\n" +
                "\n" +
                "Tấm tin lời Cám nói là thật nên vội vàng lội xuống dưới ao, đi ra chỗ sâu để tắm rửa qua bùn đất bám trên người. Cám thừa cơ mà trút hết giỏ tôm tép của Tấm sang giỏ của mình, sau đó ba chân bốn cẳng chạy về nhà trước tiên. Khi Tấm đã gột rửa sạch sẽ, bước lên trên bờ thì giỏ tôm tép đầy khi nãy đã biến mất, chỉ còn lại một chiếc giỏ không nằm trơ trọi ở nơi đó. Quá đau lòng, Tấm liền ngồi đó ôm mặt khóc nức nở. Khi ấy Bụt đang ngồi ở trên tòa sen, vô tình nghe được tiếng khóc tức tưởi của Tấm nên xuất hiện. Bụt hỏi:\n" +
                "\n" +
                "– Tại sao con lại khóc?\n" +
                "\n" +
                "Thấy Bụt hỏi chuyện, Tấm cũng thành thành thật thật mà kể lại tất cả mọi chuyện cho Bụt nghe. Sau đó Bụt lại bảo:\n" +
                "\n" +
                "– Thôi, bây giờ con nín đi! Thử nhìn giỏ mình xem bên trong còn lại gì không?\n" +
                "\n" +
                "Nghe lời, Tấm cầm giỏ của mình lên mà nhòm vào bên trong rồi bảo Bụt:\n" +
                "\n" +
                "– Bên trong còn có một con cá bống ạ!\n" +
                "\n" +
                "– Giờ con hãy đem cá bống về nhà rồi thả xuống dưới giếng nuôi. Vào mỗi bữa ăn, nếu ăn ba bát thì giờ con chỉ ăn hai, bát còn lại thì hãy đem ra giếng thả cho bống ăn. Mỗi khi con cho bống ăn thì phải gọi thế này:\n" +
                "Bống bống, bang bang\n" +
                "Lên ăn cơm vàng cơm bạc nhà ta,\n" +
                "Chớ ăn cơm hẩm cháo hoa nhà người\n" +
                "Nếu như con không thể gọi đúng những lời như thế thì bống sẽ không lên đâu, con hãy nhớ lấy nhé!\n" +
                "\n" +
                "Nói đoạn Bụt liền biến mất. Nghe theo lời Bụt dặn, Tấm liền đem cá bống về nhà rồi thả xuống dưới giếng. Kể từ ngày hôm ấy về sau, sau mỗi bữa ăn thì Tấm đều có để dành lại một bát cơm rồi giấu đi để mang ra cho cá bống ăn. Mỗi khi nghe thấy lời Tấm gọi mình thì bống lại bơi lên trên mặt nước rồi đớp hạt cơm mà Tấm thả xuống, ăn xong lại lặn xuống đáy giếng. Người và bống càng ngày càng quen thân nhau hơn, bống cũng càng ngày càng lớn hơn trước.\n" +
                "\n" +
                "Tuy nhiên thì Tấm mỗi ngày đều giấu cơm rồi mang ra ngoài giếng sau mỗi bữa ăn thì mụ dì ghẻ cũng đâm nghi, vì vậy mới bảo con gái mình là Cám đi theo sau mà rình lấy. Cám nghe lời mẹ đi rình xem, nấp ở ngay bụi cây cạnh bờ giếng nên Cám có thể nghe rõ ràng tiếng Tấm gọi cá bống lên ăn cơm. Cám cũng cố nhẩm cho thuộc, sau đó lại về kể lại mọi chuyện cho mẹ mình nghe. Tối ấy mụ dì nghẻ dặn Tấm rằng sáng ngày hôm sau phải dậy sớm rồi đi chăn trâu, mụ còn dặn rằng:\n" +
                "\n" +
                "– Con ơi! Làng ta bắt đầu lệnh cấm đồng rồi. Ngày mai con dắt trâu đi chăn thì phải đi chăn ở tít đồng xa, chứ chớ có chăn đồng nhà, kẻo làng bắt mất trâu đấy.\n" +
                "\n" +
                "Tấm cũng vâng lời mụ dì ghẻ, sáng ngày hôm sau Tấm dắt trâu đi chăn ở tận đồng xa. Còn ở nhà thì mẹ con nhà Cám cầm theo bát cơm ra ngoài giếng, rồi bắt chiếc cách Tấm gọi để gọi bống lên ăn cơm. Khi nghe thấy gọi thì bống lập tức ngoi lên trên mặt nước. Bên thành giếng mẹ con nhà Cám đã chầu chực sẵn, thấy bống ngoi lên thì liền bắt đem vào làm thịt ăn với nhau.\n" +
                "\n" +
                "Buổi chiều khi Tấm trở về, sau bữa ăn thì Tấm lại theo lệ thường đem cơm ra giếng để cho bống ăn. Nhưng mà Tấm ở đó gọi mãi mà chẳng thấy bống đâu cả. Tấm vẫn cứ gọi mãi và gọi mãi, sau cùng thì chỉ trông thấy có một cục máu đỏ nổi lên. Thấy vậy thì Tấm biết ngay là bống đã gặp phải sự chẳng lành nên òa lên khóc nức nở. Nghe tiếng Tấm khóc, Bụt xuất hiện và hỏi:\n" +
                "\n" +
                "– Tại sao con lại khóc?\n" +
                "\n" +
                "Rồi Tấm đem mọi chuyện kể lại đầu đuôi cho Bụt nghe, vì vậy Bụt liền bảo:\n" +
                "\n" +
                "– Con bống ấy của con đã bị người ta thịt ăn mất rồi. Thôi, giờ con hãy nín khóc đi. Sau đó trở về nhà và nhặt lấy xương của nó, đi kiếm lấy bốn cái lọ đem bỏ xương vào, rồi con hãy chôn những cái lọ đó xuống dưới chân giường của con.\n" +
                "\n" +
                "Nghe lời dặn của Bụt, Tấm quay trở về nhà để tìm xương của bống. Tuy nhiên, dù có tìm thế nào thì vẫn chẳng tìm ra, Tấm tìm từ các xó vườn cho tới các góc sân mà vẫn không thấy. Trong sân có một con gà, trông thấy Tấm thì nó bảo:\n" +
                "\n" +
                "– Cục ta cục tác! Cho ta nắm thóc thì ta bới xương cho!\n" +
                "\n" +
                "Nghe gà kêu, Tấm vội đi bốc lấy một nắm thóc rồi ném cho gà. Khi đã mổ xong hết thóc thì gà chạy ngay vào trong bếp rồi bới bới một lúc thì tìm được xương của bống. Tấm đem xương nhặt lại rồi bỏ hết vào bốn cái lọ, đem chôn ở bốn chân giường đúng như lời dặn của Bụt.\n" +
                "\n" +
                "Không lâu sau đó thì nhà vua cho mở hội liền mấy ngày mấy đêm. Tất cả già trẻ, trai gái ở khắp các làng đều đua nhau đi xem hội. Trên khắp các nẻo đường, đâu đâu cũng thấy những quần áo mớ bảy mớ ba thướt tha, dập dìu kéo nhau tuôn về nơi kinh thành xem hội, đông như nước chảy.\n" +
                "\n" +
                "Đương nhiên là hai mẹ con nhà Cám cũng đi sắm sửa những bộ quần áo đẹp để mà đi trẩy hội. Khi thấy Tấm có vẻ muốn đi thì mụ dì ghẻ liền nguýt dài. Rồi mụ đi lấy một đấu thóc đem trộn lẫn cùng một đấu gạo và nói với Tấm là:\n" +
                "\n" +
                "– Con ở nhà nhặt cho hết chỗ gạo này, sau đó thích đi đâu thì đi, nhưng đừng có mà bỏ dở đấy, dì về mà không có gạo nấu cơm thì dì đánh cho.\n" +
                "\n" +
                "Nói xong thì hai mẹ con liền xúng xính quần áo lên đường đi hội. Còn Tấm phải ở nhà nhặt gạo lẫn trong thóc, nhặt được một lúc cũng chỉ được có chín nhúm, vì nghĩ chẳng biết bao giờ mới xong, quá buồn bã nên Tấm lại ngồi ôm mặt khóc. Đúng lúc ấy thì Bụt lại hiện lên và hỏi:\n" +
                "\n" +
                "– Tại sao con lại khóc?\n" +
                "\n" +
                "Tấm liền chỉ vào cái thúng mà thưa rằng:\n" +
                "\n" +
                "– Dì bắt con phải đem thóc và gạo nhặt riêng ra, sau đó thì mới được đi mà xem hội. Nhưng nếu nhặt xong chỗ này thì hội cũng đã tan từ lâu, làm gì còn gì mà xem nữa.\n" +
                "\n" +
                "Bụt lại bảo Tấm:\n" +
                "\n" +
                "– Thôi, con hãy nín đi. Bây giờ con đem cái thúng này để ra giữa sân kia, ta sẽ sai đàn chim sẻ tới để nhặt giúp con.\n" +
                "\n" +
                "– Nhưng lỡ như chim sẻ lại ăn mất thóc gạo của con thì khi về dì vẫn cứ đánh con.\n" +
                "\n" +
                "– Vậy thì con cứ nói với chúng nó là:\n" +
                "Rặt rặt (tức chim sẻ) xuống nhặt cho tao,\n" +
                "Ăn mất hạt nào thì tao đánh chết.\n" +
                "Nếu con nói như vậy thì bọn chúng sẽ không ăn mất hạt nào của con đâu mà.\n" +
                "\n" +
                "Tấm làm đúng như những gì Bụt nói, đột nhiên từ trên không, một đàn chim sẻ lập tức sà xuống cùng nhau nhặt gạo ra một đằng còn thóc ra một nẻo. Đàn chim sẻ chỉ lăng xăng có một lúc thôi mà đã làm xong hết công việc rồi, cũng không làm suy suyển dù chỉ một hạt nào. Tuy nhiên thì khi đàn sẻ đã cất cánh bay đi hết thì Tấm lại ôm mặt khóc nức nở. Và Bụt lại hiện lên hỏi:\n" +
                "\n" +
                "– Tại sao con lại khóc nữa thế?\n" +
                "\n" +
                "– Quần áo con đang mặc nhìn rách rưới thế này thì người ta sao có thể để con vào bên trong mà xem hội được.\n" +
                "\n" +
                "– Giờ con hãy đem đào những chiếc lọ đựng xương bống ngày trước con chôn ở dưới chân giường nên, như vậy thì con sẽ có đủ đồ để mà đi trẩy hội.\n" +
                "\n" +
                "Vâng lời Bụt, Tấm đi đào hết các lọ chôn dưới chân giường lên. Khi đào lên lọ thứ nhất thì Tấm lấy được bộ áo mớ ba, cùng một xống lụa, còn cả một chiếc yếm điều, thêm một chiếc khăn nhiễu nữa. Khi đào lên lọ thứ hai thì Tấm lấy thêm được đôi giày thêu, đi vào chân mới thấy vừa như in. Còn đào lên lọ thứ ba thì Tấm thấy có con ngựa nhỏ xíu, tuy nhiên vừa đặt ngựa ra bên ngoài thì đột nhiên nó hí vang rồi biến thành một con ngựa thật. Khi đào lên lọ cuối cùng thì Tấm lấy ra một bộ yên cương đẹp đẽ.\n" +
                "\n" +
                "Có được tất cả những món đồ trên thì Tấm vui mừng vô cùng, vội vội vàng vàng đi tắm rửa thay đồ, sau đó thắng yên vào ngựa rồi cưỡi ngựa lên đường lên kinh xem hội. Ngựa phi nước đại, chẳng mấy chốc mà đã tới được kinh đô. Tuy nhiên lúc ngựa phóng qua chỗ lội thì Tấm vô tình làm rơi một chiếc giày dưới chân xuống nước, cũng chẳng kịp mà nhặt lên. Cho đến khi tới chỗ xem hội, Tấm đành phải lấy khăn đem gói chiếc giày còn lại vào, sau đó chen vào trong biển người kia.\n" +
                "\n" +
                "Cùng lúc ấy thì đoàn xa giá của nhà vua cũng vừa lúc tiến đến. Nhưng vừa tới nơi này thì hai con voi dẫn đầu đột nhiên cắm ngà xuống dưới đất mà rống lên, làm cách nào cũng không chịu di chuyển tiếp. Vua đành phải sai lính xuống dưới nước tìm thử xem có gì không thì họ mò lên được một chiếc giày thêu mà Tấm lỡ đánh rơi lúc trước. Vua nhìn ngắm chiếc giày không biết chán, trong bụng thầm nghĩ:\n" +
                "\n" +
                "– Chà, quả nhiên là một chiếc giày xinh xắn! Chủ nhân của chiếc giày này chắc hẳn phải là một trang tuyệt sắc giai nhân đây!\n" +
                "\n" +
                "Nhà vua lập tức ban lệnh rao mời hết tất cả con gái, đàn bà đi xem hội ngày ấy đến để ướm thử, người nào đi vừa thì nhà vua sẽ cưới người đó làm vợ ngay. Đám hội lúc này lại càng thêm náo nhiệt hơn, các bà và các cô đều chen lấn xô đẩy nhau tới chỗ thử giày. Mọi người đều kéo nhau tới chỗ ngôi lầu ngay giữa bãi cỏ mong ướm thử cầu may một chút.\n" +
                "\n" +
                "Tuy nhiên, bao nhiêu người tới thử giày đều không người nào đi vừa cả. Trong số những người thử giày cũng có cả mẹ con nhà Cám. Khi hai người họ vừa bước ra khỏi ngôi lầu thì đụng mặt Tấm cũng đang tiến lại. Cám liền mách với mẹ mình:\n" +
                "\n" +
                "– Mẹ ơi, nhìn ai như là chị Tấm, hình như cũng tới đây thử giày thì phải!\n" +
                "\n" +
                "Nghe con nói vậy thì mụ dì ghẻ lập tức bĩu môi bảo:\n" +
                "\n" +
                "– Con nỡm. Chuông khánh còn chẳng ăn ai, nữa là mảnh chĩnh vứt ngoài bờ tre.\n" +
                "\n" +
                "Tuy nhiên thì khi Tấm vừa đặt chân vào giày thì lại vừa như in. Không chỉ vậy, Tấm còn mở chiếc khăn luôn mang bên mình, lấy ra chiếc giày thứ hai và đi vào chân. Hai chiếc giày dưới chân nàng giống nhau y đúc. Vì vậy bọn lính hầu mới vui mừng mà hò reo ầm ĩ. Nhà vua lập tức gọi đám thị nữ tới và rước nàng trở về cung. Nàng bước lên trên kiệu trước những con mắt hằn học cùng ngạc nhiên của mẹ con nhà Cám.\n" +
                "\n" +
                "Từ ngày ấy Tấm sống sung sướng ở trong hoàng cung, nhưng nàng chưa bao giờ quên mất ngày giỗ của cha mình cả. Đến ngày, nàng tới xin phép nhà vua cho mình trở lại nhà để sửa soạn cỗ cúng. Mẹ con nhà Cám trông thấy Tấm được sung sướng lại bắt đầu ghen ghét, nuôi hận trong lòng. Khi thấy Tấm trở về thì sự ganh ghét ấy lại cứ bùng cháy trong bụng. Mụ dì ghẻ nghĩ mãi cũng ra một kế rất hay, liền bảo với Tấm rằng:\n" +
                "\n" +
                "– Từ trước tới nay con vẫn quen việc trèo cau, vì thế con hãy trèo lên cây rồi xé lấy một buồng xuống cúng cho cha con.\n" +
                "\n" +
                "Nghe mụ dì ghẻ nói vậy Tấm chẳng chút nghi ngờ, ngoan ngoãn mà trèo cây để hái cau. Khi nàng đã lên sát buồng, ở bên dưới gốc cây thì mụ dì ghẻ lập tức cầm theo con dao sắc để mà đẵn gốc cây. Khi thấy cây cứ rung chuyển thì Tấm mới gọi vọng xuống:\n" +
                "\n" +
                "– Dì đang làm gì ở dưới gốc cây thế?\n" +
                "\n" +
                "– Ở gốc cau nhiều kiến quá, dì đang đuổi chúng để tránh chúng nó lại lên đấy mà đốt con.\n" +
                "\n" +
                "Tuy nhiên Tấm còn chưa kịp xé lấy buồng cau thì cây cau đã bị mụ dì ghẻ đẵn đổ, nàng liền ngã lộn cổ xuống dưới ao mà chết. Thấy nàng đã chết, mụ dì ghẻ liền đem hết quần áo đẹp của Tấm mặc vào cho Cám, sau đó đưa Cám vào trong cung và nói dối nhà vua là Tấm vô tình rớt xuống ao và chết đuối, nên giờ đưa em gái vào cung thay thế vị trí của chị. Nhà vua nghe bọn họ nói vậy tuy trong lòng không hề vui vẻ nhưng mà vẫn chẳng nói năng gì.\n" +
                "\n" +
                "Nói đến nàng Tấm, khi nàng chết đi liền hóa thành con chim vàng anh. Lập tức chim bay về kinh thành, bay vào trong vườn ngự uyển của vua. Chim vàng anh thấy Cám ngồi giặt áo vua ở ngay giếng nước thì bay lại, đậu ở trên cành cây mà hót vọng ra bảo:\n" +
                "\n" +
                "– Phơi áo chồng tao, phơi lao phơi sào, chớ phơi bờ rào, rách áo chồng tao.\n" +
                "\n" +
                "Hót xong thì chim lại bay vào trong cung, nó đậu ngay bên cửa sổ và hót lên những tiếng rất hay. Hễ thấy vua đi đâu thì chim lại bay cùng tới nơi đó. Vì vua hiện giờ không lúc nào nguôi nỗi nhớ Tấm, lại thấy chim cứ quyến luyến bay theo mình thì liền bảo:\n" +
                "\n" +
                "– Vàng ảnh vàng anh, có phải vợ anh, bay vào tay áo.\n" +
                "\n" +
                "Nghe vua nói xong thì chim vàng anh lập tức bay tới đậu lên tay vua, sau đó chui thẳng vào trong ống tay áo. Từ đó trở đi nhà vua hết mực yêu quý vàng anh đến nỗi quên ăn quên ngủ. Nhà vua sai thợ làm chiếc lồng bằng vàng để cho chim ở, ngày cũng như đêm vua chỉ quanh quẩn bên chim, chẳng bao giờ nhớ đến Cám cả.\n" +
                "\n" +
                "Thấy vậy nên Cám vội vã trở về nhà kể lại mọi chuyện cho mẹ mình nghe. Mụ dì ghẻ dặn nó bắt chim đem làm thịt rồi ăn đi, rồi cứ kiếm điều mà nói dối vua là được. Khi trở lại hoàng cung, nhân lúc vua bận việc đi vắng, Cám liền đem bắt lấy chim vàng anh rồi thịt ăn, còn đám lông chim thì lại đem vứt ngoài vườn. Lúc trở về, vua thấy mất vàng anh liền hỏi Cám thì Cám lại trả lời là:\n" +
                "\n" +
                "– Thiếp đang có mang nên thèm ăn thịt chim quá nên mới trộm phép của bệ hạ mà giết thịt mất rồi.\n" +
                "\n" +
                "Nhà vua nghe Cám nói vậy cũng không nói năng gì nữa. Đám lông chim vàng anh mà Cám đem chôn ở ngoài vườn bỗng hóa thành hai cây xoan đào. Nhà vua tới vườn ngự chơi thì thấy cành lá của hai cây xoan đào xòa xuống bên dưới làm thành bóng tròn y như hai chiếc lọng. Vì thấy hai cây xoan đào quá đẹp, lại còn rợp bóng mát nên vua sai lính đem mắc võng ở đó rồi cứ nằm đó hóng mát mãi. Nhưng chỉ cần vua rời khỏi thì cành cây của hai cây xoan đào lại lập tức vươn thẳng lên. Kể từ ngày đó, ngày nào nhà vua cũng tới chỗ hai cây xoan đào, mắc võng rồi nằm hóng mát.\n" +
                "\n" +
                "Khi chuyện đến tai Cám, nó lại chạy về nhà mách với mẹ mình. Mụ dì ghẻ lại dặn nó trở về sai thợ đem chặt hạ hai cây xoan đó đi, đem gỗ làm thành khung cửi, nếu vua hỏi thì cứ kiếm điều mà nói dối là được.\n" +
                "\n" +
                "Khi trở lại hoàng cung, tiện một ngày kia có gió bão, Cám lập tức kêu thợ tới đốn hạ hai cây xoan đào trong vườn ngự uyển, rồi lấy gỗ làm thành khung cửi cho mình. Thấy cây đã bị chặt, vua lại hỏi Cám, Cám lại đáp rằng:\n" +
                "\n" +
                "– Bão làm cho cây bị đổ, thiếp liền sai thợ đem chặt ra đóng khung cửi để mà dệt áo cho người.\n" +
                "\n" +
                "Tuy nhiên, khi khung cửi đã đóng xong, lúc Cám ngồi vào dệt thì lại luôn nghe được tiếng chiếc khung cửi ấy chửi rủa mình:\n" +
                "\n" +
                "– Cót ca cót két,\n" +
                "Lấy tranh chồng chị,\n" +
                "Chị khoét mắt ra.\n" +
                "\n" +
                "Nghe vậy thì Cám vô cùng sợ hãi, nó vội vàng về nhà mách với mẹ mình. Mụ dì ghẻ lại sai nó đem khung cửi đốt quách đi, sau đó mang tro tới nơi xa đổ đi cho yên tâm. Trở về cung, Cám nghe lời mẹ đem khung cửi đi đốt. Sau đó nó mang theo tro của chiếc khung cửi ấy đổ ở một bên lề đường rất xa nơi hoàng cung.\n" +
                "\n" +
                "Từ đống tro ấy, ngay bên đường liền mọc lên một cây thị rất cao lớn với những cành lá to, sum suê. Khi đến mùa ra quả thì cây thị này chỉ đậu duy nhất một quả mà thôi, nhưng mà mùi thơm của nó thì lại tỏa đi khắp ngả. Có một bà lão bán hàng nước ngay gần đó, ngày nọ đi ngang qua dưới gốc cây thì ngửi thấy mùi rất thơm, khi ngước đầu nhìn lên thì trông thấy cành cao tít có một quả thị đang treo lủng lẳng. Bà lão lập tức giơ chiếc bị của mình lên mà lẩm bẩm rằng:\n" +
                "\n" +
                "– Thị ơi, thị rụng bị bà, bà để bà ngửi, chứ bà không ăn.\n" +
                "\n" +
                "Khi bà lão nói vừa dứt câu thì quả thị trên cao liền rơi ngay vào trong bị của bà. Bà lão đem thị về nâng niu đặt trong buồng ngủ, cứ thi thoảng lại chạy vào trong để ngắm nghía, hít hà hương thơm của thị.\n" +
                "\n" +
                "Hằng ngày bà lão đều đi chợ nên vắng nhà. Đợi cho bà lão đã rời khỏi thì từ trong quả thị ấy liền bước ra một thiếu nữa nhỏ bằng ngón tay, chớp mắt một cái thì đã trở thành nàng Tấm xinh đẹp ngày nào. Tấm rời khỏi vỏ thị rồi đem nhà cửa quét tước, dọn dẹp ngăn nắp, sạch sẽ, sau đó lại đi lấy gạo thổi cơm, ra vườn hái rau về nấu canh cho bà lão hàng nước. Sau khi xong xuôi mọi việc thì Tấm lại hóa thành nhỏ tí rồi chui vào trong vỏ thị như cũ.\n" +
                "\n" +
                "Mỗi lần từ chợ trở về thì bà lão hàng nước đều thấy nhà cửa mình tự nhiên lại ngăn nắp và sạch sẽ, cơm nước cũng đã xong xuôi hết cả. Vì thế bà cảm thấy vô cùng ngạc nhiên và lạ lẫm.\n" +
                "\n" +
                "Vào một ngày kia, bà hàng nước như thường lệ lại đi chợ, nhưng khi đi đến nửa đường rồi thì bà lại lén trở về nhà và rình ngay chỗ bụi cây phía sau nhà để xem có chuyện gì xảy ra. Như mọi ngày, nàng Tấm lại bước ra từ quả thị, rồi lại làm tất cả những công việc mình thường hay làm.\n" +
                "\n" +
                "Bà lão nấp ở bụi cây cứ rón rén mà nhìn vào trong các khe cửa. Bà trông thấy xuất hiện một thiếu nữ vô cùng xinh đẹp giúp mình làm mọi việc. Lúc này thì bà vui mừng quá, liền bất ngờ xô cửa xông vào trong ôm chặt lấy Tấm, đem vỏ thị kia xé vụn đi. Kể từ ngày đó thì Tấm cùng ở với bà lão hàng nước, cả hai yêu thương nhau như là hai mẹ con ruột thịt vậy. Mỗi ngày Tấm đều giúp bà lão những việc như thổi cơm, nấu nước, rồi lại gói bánh và têm trầu cho bà lão mang đi bán.\n" +
                "\n" +
                "Ngày kia khi nhà vua rời khỏi hoàng cung để đi dạo chơi. Trông thấy bên đường có quán nước sạch sẽ nên vua bèn ghé vào trong. Bà lão hàng nước lập tức dâng trầu rót nước cho vua. Khi thấy những miếng trầu được têm cánh phượng đẹp mắt, nhà vua chợt nhận ra những miếng trầu này hoàn toàn giống với cách têm trầu ngày trước của vợ mình, vua lập tức phán:\n" +
                "\n" +
                "– Bà lão, trầu này là do ai têm?\n" +
                "\n" +
                "Bà lão liền trả lời:\n" +
                "\n" +
                "– Trầu này là chính tay con gái của già têm.\n" +
                "\n" +
                "– Vậy con gái bà đâu, hãy mau gọi ra đây để ta xem mặt một chút.\n" +
                "\n" +
                "Bà lão hàng nước liền vào trong nhà gọi Tấm ra ngoài, khi Tấm xuất hiện, nhà vua lập tức nhận ra nàng chính là vợ của mình, nhưng hình như bây giờ lại có phần trông trẻ đẹp hơn lúc trước. Nhà vua rất vui mừng liền bảo bà lão hàng nước đem đầu đuôi mọi chuyện nói cho mình nghe. Sau đó vua liền sai đám quân hầu mang kiệu tới để rước Tấm trở lại hoàng cung.\n" +
                "\n" +
                "Khi Cám trông thấy Tấm về, lại được nhà vua yêu thương còn hơn lúc trước thì nó sợ hãi lắm. Tìm một ngày, Cám liền tới chỗ Tấm mà hỏi:\n" +
                "\n" +
                "– Chị Tấm ơi chị Tấm, làm cách nào mà chị lại đẹp hơn thế?\n" +
                "\n" +
                "Tấm cũng không trả lời câu hỏi của Cám, chỉ nhẹ nhàng mà hỏi lại:\n" +
                "\n" +
                "– Em có muốn được đẹp không thì chị giúp cho!\n" +
                "\n" +
                "Nghe Tấm nói vậy thì Cám lập tức đồng ý. Tấm liền sai bọn lính hầu đào một chiếc hố sâu, sau đó bảo Cám chui xuống dưới, còn Tấm thì ở trên chỉ huy đám hầu đổ đầy nước sôi vào đó. Cám chết rồi, Tấm liền sai người đem xác của Cám làm thành mắm, sau đó đem để vào trong chĩnh và kêu người mang tới cho mụ dì ghẻ ở nhà, nói đó là quà mà con gái mụ ta gửi người tới biếu.\n" +
                "\n" +
                "Mụ dì ghẻ thấy vậy thì cứ ngỡ là thật nên đem mắm ra dùng, ngày nào mụ cũng ăn rồi tấm tắc khen mắm ngon. Có một con quạ từ đâu bay tới, đậu ở trên nóc nhà rồi kêu lên:\n" +
                "\n" +
                "– Ngon ngỏn ngòn ngon! Mẹ ăn thịt con, còn không xin miếng?\n" +
                "\n" +
                "Nghe quạ kêu trên nóc nhà thì mụ dì ghẻ giận lắm, mụ ta mắng chửi ầm ĩ, sau đó đem sào tới đuổi quạ đi. Tuy nhiên, khi mụ đã ăn gần hết chĩnh mắm ấy, mụ nhòm vào chĩnh thì thấy chiếc đầu lâu của con mình nằm ngay dưới đáy chĩnh, mụ lập tức lăn đùng ra chết tươi.\n" +
                "\n" +
                "Câu chuyện tấm cám đến đây là hết rồi. Chúc các em nhỏ chăm ngoan học giỏi và hiền thảo như cô Tấm nhé!","Truyện cổ tích"));
        storiesVietNam.add(new StoryVietName(R.drawable.img_caykhe,"Cây khế","Thuở trước có hai anh em nhà nọ mồ côi, cha mẹ họ đều qua đời từ rất sớm. Khi người anh đã cưới vợ thì anh ta không còn muốn sống chung với em trai của mình nữa, bởi vậy nên anh ta quyết định cùng em trai phân chia phần tài sản mà cha mẹ để lại cho họ.\n" +
                "\n" +
                "Người anh vốn là người có bản tính rất tham lam, vì vậy một mình anh ta chiếm hết số ruộng vườn, nhà cửa cùng trâu bò mà cha mẹ để lại trước khi qua đời, và anh ta chỉ chia cho em trai mình đúng một túp lều nhỏ cùng mảnh vườn hẹp, và trong mảnh vườn ấy có trồng một cây khế ngọt.Vì người em vốn hiền lành nên nhường nhịn anh trai, chẳng kêu ca một câu nào khi nhận phần tài sản kia. Hằng ngày người em vẫn luôn chăm sóc cùng tưới bón đầy đủ cho cây khế ngọt trong vườn của mình. Đồng thời cũng đi làm thuê làm mướn ở những gia đình giàu có ở khắp nơi để kiếm tiền mà nuôi thân.\n" +
                "\n" +
                "Vào một năm nọ thì cây khế ngọt ở trong vườn nhà người em đột nhiên sai quả rất bất thường, cả cây cành nào cũng nặng trĩu những trái ngọt và vàng óng. Khi người em trông thấy cây khế của mình chăm bón sai trĩu thì trong lòng cũng phấn khởi vô cùng, thầm tính đến chuyện sẽ đem khế đi bán đổi lấy tiền mà đong gạo ăn.\n" +
                "\n" +
                "Vào một ngày kia, từ đâu xuất hiện một con chim Phượng Hoàng bay tới cây khế ngọt của nhà người em để ăn quả. Trông thấy chim mổ hết khế trong vườn thì người em lập tức đem gậy ra để đuổi chim, anh nói:\n" +
                "\n" +
                "– Này chim kia! Ta chỉ có duy nhất cây khế sai quả này, ta đã bỏ công khó nhọc mà chăm bón nó ngày đêm chỉ đợi đến ngày thu quả. Nay ngươi lại đến ăn hết những quả khế kia thì ta lấy gì đi bán mà đong gạo đây. Nếu như ngươi muốn tới ăn quả thì phải đem trả cho ta thứ khác có giá trị một chút mới được.\n" +
                "\n" +
                "Con chim Phượng Hoàng ấy vừa mải mê ăn khế vừa quay ra đáp trả:\n" +
                "\n" +
                "– Ăn một trái, trả cục vàng, may túi ba gang đem đi mà đựng.\n" +
                "\n" +
                "Người em nghe được lời chim nói thì cũng yên tâm phần nào nên mới để kệ cho chim thỏa thích ăn khế ngọt trên cây nhà mình. Vài ngày sau, vẫn con chim Phượng Hoàng hôm trước bay đến để ăn khế ngọt. Khi đã ăn no nê rồi thì chim mới bảo người em cầm theo túi ba gang rồi chim sẽ chở bay đi lấy vàng trả tiền khế nó đã ăn.\n" +
                "\n" +
                "Chim Phượng Hoàng chở theo người em ở trên lưng mà cứ bay mãi, nó bay qua những ngọn núi cao hùng vĩ, lại bay qua cả biển lớn mênh mông, sau đó đậu xuống hòn đảo mà trên đấy đầy rẫy những vàng bạc cùng châu báu lấp lánh.\n" +
                "\n" +
                "Người em nhìn thấy hòn đảo thì vô cùng ngạc nhiên, liền đi xung quanh ngắm nghía một chút cho thỏa thích. Sau đó mới đem vàng nhét vào chiếc túi ba gang đã đem đi từ nhà. Khi chim Phượng Hoàng kêu người em hãy lấy thêm chút vàng nữa nhưng người em lại nhất định từ chối, bảo rằng mình đã lấy đủ rồi. Khi người em đã lấy được vàng, chim Phượng Hoàng lại chở anh trên lưng và bay trở lại nhà.\n" +
                "\n" +
                "Kể từ ngày đó trở đi, người em bây giờ đã có rất nhiều vàng bạc, đã trở thành một người giàu có. Nhưng vì bản tính vốn hiền lành và tốt bụng, tuy có nhiều vàng bạc nhưng anh lại không hề tham lam, anh đem tiền đi mua thóc mua gạo, còn đem cả tiền đi giúp đỡ cho những gia đình có hoàn cảnh khó khăn, nghèo khổ khác nữa.\n" +
                "\n" +
                "Khi người anh biết tin em trai của mình được chim Phượng Hoàng trả công khi cho nó ăn khế bằng việc chở đến đảo vàng bạc lấy tiền thì liền sang nhà em chơi, sau đó anh ta đòi người em tráo đổi nhà cùng ruộng vườn cho mình bằng được mới thôi. Thấy anh trai cứ nằng nặc muốn đổi nên người em cũng đành vâng lời, đem cây khế ngọt của mình cho anh trai, rồi nhận lấy vườn tược cùng nhà cửa.\n" +
                "\n" +
                "Thấy người em đã đồng ý đổi nhà cho mình, người anh vô cùng hí hửng như mở cờ trong bụng. Vì vậy lập tức trở về nhà kêu vợ sửa soạn đồ đạc để chuyển sang căn nhà cũ của người em, và chờ mong cho tới mùa khế năm sau chim Phượng Hoàng kia sẽ bay tới ăn khế rồi đưa anh ta đi lấy vàng.\n" +
                "\n" +
                "Năm sau, khi mùa khế đã đến, đúng như dự đoán của người anh, cây khế trong vườn năm nay cũng vẫn sai trĩu và chín vàng. Và con chim Phượng Hoàng ngày nào cũng lại bay tới để mà ăn khế ngọt. Khi thấy chim thì người anh bắt đầu giở trò kể nghèo kể khổ rồi khóc than với chim. Khi chim nghe vậy thì liền bảo người anh:\n" +
                "\n" +
                "– Ăn một trái, trả cục vàng, may túi ba gang đem đi mà đựng.\n" +
                "\n" +
                "Nghe chim kêu vậy thì người anh vô cùng mừng rỡ, anh ta lập tức sai vợ mình may lấy một chiếc túi mười hai gang để anh ta mang đi nhặt thật nhiều vàng. Chẳng khác người em là bao, mấy ngày hôm sau chim Phượng Hoàng lại bay tới và giữ đúng lời hứa là chở người anh ra đảo vàng để nhặt vàng trả tiền khế nó đã ăn.\n" +
                "\n" +
                "Khi vừa đặt chân lên đảo thì người anh đã vội vội vàng vàng vơ vét thật nhiều vàng, nhét đầy vào chiếc túi mà anh ta mang theo. Không chỉ vậy, túi đã đầy thì anh ta lại bắt đầu nhặt vàng đem nhét vào xung quanh người, bởi vì bản tính của anh ta vốn rất tham lam, không bao giờ cảm thấy đủ cả.\n" +
                "\n" +
                "Mọi chuyện đã xong xuôi đâu vào đó thì chim Phượng Hoàng mới chở người anh bay trở về. Tuy nhiên thì túi vàng mà anh ta đem theo lại quá nặng, chim đã bảo anh ta mấy lần rằng đem vàng vứt bớt đi nhưng anh ta nào có chịu nghe, mà cứ cố giữ khư khư cái túi ấy bằng được. Vừa nặng vừa bực, chim Phượng Hoàng liền nghiêng cánh một cái, người anh tham lam ôm theo túi vàng đầy đã bị hất xuống đáy biển sâu mất tích.\n" +
                "\n" +
                "Đến đây là kết thúc truyện ăn khế trả vàng rồi các em nhỏ. Các em nhỏ hãy chăm ngoan, học giỏi và đừng học tập tính tham lam như người anh trong truyện nhé !","Truyện cổ tích"));
        storiesVietNam.add(new StoryVietName(R.drawable.img_sontinh,"Sơn Tinh Thủy Tinh","Vào đời Vua Hùng thứ 18, Vua có một người con gái đã đến tuổi cập kê, công chúa có dung nhan xinh đẹp tuyệt trần, lại còn có một làn da trắng trẻo mịn màng, dáng người nàng cũng cao ráo. Tên của nàng công chúa này là Mỵ Nương. Khi thấy con gái của mình đã tới tuổi để gả chồng nên Vua liền cho ban truyền tìm kiếm nhân kiệt ở khắp nhân gian hòng kén được một người phò mã đủ tài đủ đức.\n" +
                "\n" +
                "Nghe được tin Vua Hùng ban tin kén rể khắp nơi cho con gái, vua nước Tây Âu liền đem tới rất nhiều những vàng bạc cùng châu báu như là cau vàng, trầu bạc để mà dạm hỏi cưới nàng Mỵ Nương. Thấy vậy Vua Hùng lập tức cho triệu tất cả Lạc Hầu của mình vào cung để mà hội ý. Những Lạc Hầu này tâu rằng:\n" +
                "\n– Vua nước Tây Âu ấy là một con người rất cường bạo, tuổi cũng khá cao rồi, mà hình dáng cũng rất kì quái, làm sao mà có thể xứng đôi với công chúa của chúng ta được.\n" +
                "\nNghe những lời khuyên can của đám Lạc Hầu nên Vua Hùng liền từ chối lời cầu hôn của vua nước Tây Âu kia. Cũng chính từ ngày đó mà mối quan hệ giữa nước Văn Lang cùng Tây Âu xấu đi, nảy sinh hiềm khích khó tháo gỡ.\n" +
                "\n" +
                "Bẵng đi một thời gian thì lại có hai chàng trai tới để dạm hỏi cưới nàng công chúa Mỵ Nương. Hai chàng trai này đều vô cùng xuất sắc và tuấn tú. Một người là Sơn Tinh (Chính là thần núi Tản Viên, hay còn gọi là Thánh Tản), người còn lại là Thủy Tinh (Chính là Thần Nước, hay Thần Biển Cả).\n" +
                "\n" +
                "Vua Hùng liền cho truyền cả hai chàng trai này vào triều để trổ tài, nếu như ai có tài hơn thì Vua sẽ chấp nhận gả con gái mình, tức công chúa Mỵ Nương cho người đó.\n" +
                "\n" +
                "Chàng Sơn Tinh trổ tài trước, chàng có phép chỉ tay tới đâu thì nơi đó lại mọc lên những rừng núi hùng vĩ, chim muông đông đúc từng đàn. Còn chàng Thủy Tinh lại có phép vẫy tay thì nước sẽ ào ào mà dâng lên thật cao, còn có cả thuồng luồng và ba ba hàng đàn kéo nhau nổi lên mặt nước nữa.\n" +
                "\n" +
                "Cả hai chàng trai đều vô cùng tài giỏi, có thể gọi là ngang tài cân sức nên Vua Hùng không biết phải chọn ai mới được. Vì vậy để quyết định thắng thua mà Vua đã phải ra thêm thử thách khác, người nào chiến thắng thì sẽ trở thành phò mã. Vua nói rằng:\n" +
                "\n" +
                "– Hai ngươi đều rất tài giỏi, ngang tài cân sức với nhau, vì vậy nên ta không thể chọn một trong hai được. Bây giờ sẽ như thế này, ngày mai nếu như một trong hai ngươi, người nào có thể đem được đồ sính lễ gồm có một trăm ván cơm nếp, một trăm tệp bánh trưng, voi chín ngà, gà chín cựa, ngựa chín hồng mao, mỗi thứ phải có một đôi tới đây sớm hơn thì người đó sẽ được cưới con gái của ta.\n" +
                "\n" +
                "Tuy nói rằng không thể chọn ai nhưng tất cả những đồ lễ mà Vua Hùng yêu cầu hai chàng chuẩn bị thì tất cả đều là những sản vật ở trên đất liền. Điều đó có thể cho thấy được Vua Hùng cũng đã ngầm đồng ý gả nàng Mỵ Nương cho Sơn Tinh rồi.\n" +
                "\n" +
                "Ngày hôm sau, khi bầu trời bên ngoài chỉ vừa hửng sáng thì Sơn Tinh đã đem được đầy đủ các loại lễ vật theo đúng yêu cầu của Vua Hùng đến cung vua để xin hỏi cưới nàng Mỵ Nương. Bởi vì những đồ lễ vật ấy với một thần núi như chàng thì vô cùng dễ để chuẩn bị.Vua Hùng vô cùng hài lòng với biểu hiện của Sơn Tinh nên đã bằng lòng cho phép Sơn Tinh được cưới con gái Mỵ Nương của mình.\n" +
                "\n" +
                "Còn Thủy Tinh bởi vì khó tìm kiếm những món lễ vật hỏi cưới đó nên đến trễ hơn một chút, chàng vô cùng hốt hoảng khi được tin nàng Mỵ Nương đã cùng đi với phu quân của mình là Sơn Tinh. Vì thế nên Thủy Tinh lập tức đuổi theo, đem cả đám binh tướng của mình tới đánh Sơn Tinh thề phải cướp lại nàng Mỵ Nương cho bằng được.\n" +
                "\n" +
                "Thủy Tinh cứ thế hô mưa rồi gọi gió làm rung chuyển trời đất, khiến cho nước biển cuồn cuộn dâng lên để đánh Sơn Tinh. Khi nước dâng cao khiến cho lúa ngập, đồng cũng ngập, sau đó thì nhà cửa cũng ngập nốt. Và giông tố cứ mỗi lúc lại càng dữ dội hơn, nước cũng càng ngày càng dâng cao hơn nữa, đám thủy quái thì cứ đông lên nhiều lần, chúng rầm rầm rộ rộ làm theo tất cả những mệnh lệnh của Thủy Tinh.\n" +
                "\n" +
                "Tất cả cư dân của nước Văn Lang lúc bấy giờ đều chung sức và chung lòng ra tay để giúp đỡ cho Sơn Tinh. Hơn nữa thần trống đồng thiêng liêng cũng hiện về để giục giã, cổ vũ cho mọi người ra trận mà tiêu diệt đám thủy quái hung bạo kia, đồng thời chống cả lũ lụt dữ dội. Những người nào khỏe mạnh thì đi đào đất để đắp thành đê. Chính vì thế mà ra đời những con đê dùng để chống lụt hiện nay của người Việt ta. Những đoạn đê dựng lên ngày càng cao hơn, chắc hơn, ngăn chia rồi chặn đứng được tất cả sự phá phách khủng khiếp của lũ lụt.\n" +
                "\n" +
                "Đối mặt với tình cảnh này, Sơn Tinh không hề có chút nao núng nào cả, chàng liền dùng phép của mình để bốc những quả đồi, rồi dời đi những dãy núi để mà tạo thành bức tường vững chắc ngăn chặn dòng nước lũ của đối thủ. Dòng nước lũ của Thủy Tinh dâng cao bao nhiêu thì những dãy núi của Sơn Tinh lại mọc cao lên bằng ấy. Đội quân của Sơn Tinh bê những hòn đá lớn, nhỏ ném tới tấp vào đám quân của Thủy Tinh ở dưới nước khiến chúng chết vô số kể. Xác cá, xác thuồng luồng, xác ba ba cứ nổi đầy kín cả mặt nước.\n" +
                "\n" +
                "Thủy Tinh cứ dâng nước lên một trào, Sơn Tinh lại nâng núi, nâng đất đá cao lên một vì. Khi Thủy Tinh lại dâng nước lên hai đợt thì Sơn Tinh lại tiếp tục mà dựng núi của mình lên hai vì. Vào đợt thứ ba thì Thủy Tinh liền xô nước tới, Sơn Tinh nhanh chóng nâng núi của mình lên đến ba vì. Cũng chính vì trận chiến này mà núi Tản Viên xưa còn được gọi với cái tên Ba Vì.\n" +
                "\n" +
                "Cả hai bên đã đánh nhau kéo dài tới mấy tháng ròng. Nhưng sau cùng bởi vì đuối sức nên Thủy Tinh phải cho quân rút trở về. Kể từ ngày đó thì chàng Sơn Tinh và nàng Mỵ Nương cũng được sống bên nhau vui vẻ, hạnh phúc.\n" +
                "\n" +
                "Tuy nhiên thì ân oán của Sơn Tinh cùng Thủy Tinh lại càng ngày càng nặng, hận thù cũng càng ngày càng sâu hơn. Mỗi năm vào tầm tháng 7 theo Âm lịch thì Thủy Tinh lại nghĩ tới ân oán khi xưa, lập tức đem dâng nước kéo tới đánh nhau cùng Sơn Tinh. Tuy vậy nhưng mỗi lần như vậy thì Thủy Tinh đều nhận lấy thất bại rồi phải kéo quân ra về.\n" +
                "\n" +
                "Truyền thuyết về Sơn Tinh – Thủy Tinh vô cùng nổi tiếng, và là một trong những cách lý giải của người Việt xưa về hiện tượng lũ lụt cùng những cách để chống lũ lụt của nước mình.","Truyện cổ tích"));
        storiesVietNam.add(new StoryVietName(R.drawable.img_thachsanh,"Thạch Sanh","Quận Cao Bình ngày trước có đôi vợ chồng nhà nọ, tuổi cũng đã già mà lại chưa có mụn con nào. Gia đình nhà này rất nghèo, thường phải leo lên rừng để mà chặt củi, rồi đem đi đổi lấy gạo để mà nuôi hai thân già. Tuy nghèo nhưng họ lại rất hay giúp đỡ mọi người xung quanh, như là giúp họ khơi cống hay đắp đường, hoặc là giúp đỡ những người già kẻ yếu gặp khó khăn mà chẳng bao giờ nề hà chuyện chi.\n" +
                "\n" +
                "Bởi vì thấy hai vợ chồng họ ăn ở hiền lành nên Ngọc Hoàng thương tình phái thái tử của mình đầu thai xuống để làm con họ. Kể từ ngày ấy thì người vợ bỗng nhiên có bầu, tuy nhiên thì thời gian mang thai đã kéo dài mấy năm liền mà chẳng thấy có dấu hiệu sinh nở. Đúng lúc ấy thì người chồng đột nhiên đổ bệnh sau đó qua đời. Rất lâu sau đó thì người vợ mới trở dạ, hạ sinh được một đứa bé trai kháu khỉnh, đáng yêu.Khi đứa bé đã lớn khôn thì người mẹ lúc này cũng từ giã cõi hồng trần mà về thế giới bên kia với chồng mình. Còn nó thì phải sống côi sống cút ở trong túp lều rách nát dựng ngay dưới gốc đa. Tất cả mọi người đều quen gọi là Thạch Sanh. Tài sản của Thạch Sanh cũng chỉ có duy nhất cái lưỡi búa mà người cha quá cố để lại cho, ngày ngày lại tiếp tục công việc lên rừng đốn củi đem về đổi lấy gạo ăn. Đến ngày Thạch Sanh biết sử dụng búa thì Ngọc Hoàng lập tức sai thiên thần xuống để dạy cho đủ thứ võ nghệ cùng rất nhiều những phép thần thông khác.\n" +
                "\n" +
                "Một ngày nọ có người làm hàng rượu là Lý Thông vô tình đi ngang qua và ngồi xuống nghỉ ngơi ở dưới gốc đa. Cũng vừa lúc ấy hắn trông thấy Thạch Sanh từ trong rừng trở về, trên vai gánh một gánh củi rất lớn, hắn liền nghĩ thầm trong bụng: “Trông tướng người này khỏe hơn voi. Nếu như kéo nó về ở chung với ta chắc chắn được rất nhiều lợi đây”.\n" +
                "\n" +
                "Nghĩ là vậy nên Lý Thông liền lân la tới gạ chuyện làm quen, sau đó thì gạ gẫm Thạch Sanh cùng mình kết thành anh em. Khi thấy có một người lạ lại ân cần, săn sóc cho mình như vậy thì Thạch Sanh rất cảm động, vì vậy cũng vui vẻ mà nhận lời kết nghĩa anh em với Lý Thông. Sau đó thì chàng liền từ giã túp lều rách dưới gốc cây đa mà đến nhà họ Lý chung sống. Nhà họ Lý này chuyên môn làm nghề cất rượu. Khi Thạch Sanh tới thì mẹ con nhà hắn quả nhiên là có được một người đỡ đần vô cùng tốt.\n" +
                "\n" +
                "Lúc bấy giờ ở vùng này có con Chằn tinh vô cùng hung dữ, nó có được rất nhiều những phép biến hóa rất kỳ lạ, chuyên môn bắt người để mà ăn thịt. Đã không ít lần quan quân của triều đình tới tìm cách tiêu diệt nhưng đều thất bại trở về. Sau cùng không còn cách nào khác nên đành phải thương lượng, xây cho nó cái miếu thờ, hằng năm còn phải dâng cho nó một người, có như vậy nó mới không đi phá phách khắp nơi nữa.\n" +
                "\n" +
                "Không may là năm ấy lại đến lượt của Lý Thông phải đi nộp mình cho Chằn tinh. Khi nghe được tin ấy thì Lý Thông cảm thấy vô cùng hốt hoảng và lo sợ, tuy nhiên, rất nhanh sau đó hai mẹ con nhà hắn đã nghĩ ra được một mưu kế rất hay là lừa cho chàng Thạch Sanh phải đi nộp mạng mà chết thay cho mình. Bọn họ thầm nghĩ: “Hắn ta không cha không mẹ, cũng chỉ vừa mới tới nơi này vẫn còn lạ nước lạ cái, việc này chắc có thể trót lọt được”.\n" +
                "\n" +
                "Ngay buổi chiều ngày hôm ấy thì Lý Thông đã chờ chực sẵn, đợi cho tới khi Thạch Sanh đi lấy củi trở về thì liền đem một mâm đầy rượu và thịt dọn lên mời ăn, sau đó mới bảo chàng:\n" +
                "\n" +
                "– Đêm nay là đến lượt của anh phải tới miếu thờ canh giữ, nhưng mẻ rượu ở nhà lại đang cất giở, giờ em hãy chịu khó mà thay anh tới canh miếu thờ một đêm, khi trời sáng thì lại trở về.\n" +
                "\n" +
                "Đương nhiên Thạch Sanh chẳng chút nghi ngờ nào với lời nói của Lý Thông, vì vậy đồng ý đi thay ngay.\n" +
                "\n" +
                "Khi trời nửa đêm, lúc Thạch Sanh vừa lim dim mắt định ngủ thì bỗng nhiên Chằn tinh từ phía sau miếu thờ hiện ra, nó giơ vuốt, nhe nanh định sẽ vồ lấy chàng mà ăn tươi nuốt sống. Nhưng mà Thạch Sanh lại nhanh nhẹn tránh thoát, tay cầm lấy búa của mình mà đánh lại.\n" +
                "\n" +
                "Con Chằn tinh này dùng đủ loại phép thuật, cứ thoắt ẩn rồi lại thoắt hiện liên tục. Nhưng chàng Thạch Sanh của chúng ta cũng không hề nao núng chút nào, chàng bình tĩnh giở ra các phép tấn công mà mình biết, liên tiếp đáp trả Chằn tinh. Chẳng mất bao lâu thì Chằn tinh đã bị lưỡi búa của Thạch Sanh xả ra làm hai nửa. Nó hiện nguyên hình một con trăn khổng lồ. Thạch Sanh vội vàng chặt lấy đầu của nó, nhặt bộ cung tên vàng của nó để lại và xách trở về nhà.\n" +
                "\n" +
                "Vào khoảng canh ba đêm hôm ấy, lúc mà mẹ con nhà Lý Thông còn đang ngủ say thì bỗng nhiên lại nghe thấy tiếng gọi cửa của Thạch Sanh, cứ ngỡ đó là oan hồn chàng hiện về nên ba hồn bảy vía của họ đều bay hết lên mây, vội vàng dập đầu mà lạy lấy lạy để. Nhưng khi Thạch Sanh đã vào trong nhà, đem câu chuyện mình giết Chằn tinh kể lại thì mẹ con Lý Thông mới hoàn hồn. Tuy nhiên thì Lý Thông lại nảy ra kế khác để lừa bịp chàng. Hắn nói với Thạch Sanh rằng:\n" +
                "\n" +
                "– Trời ơi! Con chăn đó là thú nuôi mà nhà vua nuôi bấy lâu. Giờ em lại đem nó giết đi, nếu như vua biết thì sao thoát khỏi được tội chết đây. Thôi, hiện giờ trời con chưa sáng hẳn, em nhân cơ hội này mà chạy trốn ngay đi. Ở đây có chuyện gì thì cứ mặc anh, anh sẽ đem lo liệu cả!\n" +
                "\n" +
                "Nghe Lý Thông nói như vậy thì Thạch Sanh vô cùng kinh hoảng, chàng vội vã nói lời từ giã với mẹ con nhà Lý Thông để ra đi. Cũng chẳng còn chỗ nào để đi, chàng đành phải trở về túp lều cũ rách dưới gốc đa ngày nào của mình, và lại ngày ngày lên rừng chặt củi đổi lấy gạo mà nuôi thân.\n" +
                "\n" +
                "Lại nói về Lý Thông, đợi cho Thạch Sanh đi xa, hắn liền vác theo đầu Chằn tinh đem vào trong kinh thành và tâu với nhà vua rằng mình đã giết được yêu quái, trừ hại cho dân. Nhà vua thấy thế thì hết lời khen ngợi, sau đó lại phong hào cho hắn làm đô đốc, được hưởng vinh hoa, phú quý.\n" +
                "\n" +
                "Cùng thời điểm ấy, con gái của nhà vua cũng vừa đến tuổi cập kê. Tuy nhiên thì nàng công chúa của chúng ta vẫn chưa tìm được người nào thực sự xứng đáng với mình cả. Mấy tên hoàng tử của những nước láng giềng cũng nhiều lần sai sứ mang lễ sang nước ta để hỏi cưới công chúa, tuy nhiên thì chẳng một người nào lọt vào mắt xanh của nàng cả.\n" +
                "\n" +
                "Cuối cùng thì nhà vua đành phải tổ chức hội lớn để cho tất cả những hoàng tử của các nước, cùng với tất cả thanh niên trai tráng trong thiên hạ về đây tụ hội, sau đó để cho nàng công chúa ném tú cầu từ phía trên lầu cao xuống. Nếu như người nào có thể lấy được tú cầu đó thì sẽ được phép lấy công chúa làm vợ.\n" +
                "\n" +
                "Tuy nhiên, trong ngày hội ấy, lúc công chúa định ném tú cầu thì đột nhiên xuất hiện một con Đại bàng đang bay ngang qua. Nó vốn là một con yêu tinh trên đỉnh núi, cũng có không ít những phép thần thông quỷ dị. Khi trông thấy trên lầu cao có nàng công chúa xinh đẹp thì nó lập lức sải cánh bay tới cắp nàng đi luôn.\n" +
                "\n" +
                "Khi ấy Thạch Sanh đương lúc ngồi ở dưới gốc đa. Vô tình trông thấy con Đại bàng kia bay ngang qua, dưới chân nó còn đương quắp người, tiện cung tên bên cạnh, chàng liền đưa lên bắn nó một phát. Đại bàng bị trúng mũi tên ấy vào ngay cánh, vì đau quá nên nó phải hạ xuống để mà nhổ mũi tên kia đi, tuy rất đau nhưng nó vẫn cố cắn răng mà tha nàng công chúa trở về hang của mình. Thạch Sanh cũng lần theo những vết máu của nó mà tìm đến được nơi trú ẩn của quái vật kia.\n" +
                "\n" +
                "Trông thấy con gái của mình bị yêu quái bắt đi thì nhà vua vô cùng đau đớn, vội vàng hạ lệnh cho đô đốc mới nhậm chức là Lý Thông phải đi tìm công chúa cho bằng được, còn hứa nếu hắn tìm được sẽ gả công chúa cho hắn, sau đó cũng sẽ đem ngôi vị truyền lại.\n" +
                "\n" +
                "Lý Thông nhận mệnh vừa mừng lại vừa lo, hắn chẳng biết phải tính toán sao cho ổn thỏa mọi chuyện. Sau cùng thì hắn lại nghĩ tới Thạch Sanh, người em cùng kết nghĩa của mình, hắn nghĩ cũng chỉ có chàng thì mới có thể nghĩ được ra cách để mà gỡ thế bí bây giờ của mình. Bởi vậy nên hắn lệnh cho một toán lính đi dò la tin tức tìm người ở khắp nơi. Không chỉ thế, hắn còn sai nhân dân khắp nơi mở hội xướng trong vòng mười ngày để mà nghe ngóng xem có tin tức gì của Thạch Sanh hay không. Nhưng mà thời gian hội hát xướng cũng trôi qua được tám chín ngày rồi mà vẫn chẳng có chút thông tin mới mẻ nào cả. Đến tận ngày thứ mười thì hắn mới tìm được Thạch Sanh đang lẫn trong đám người tới xem hội.\n" +
                "\n" +
                "Khi Lý Thông nhắc tới chuyện muốn tìm được công chúa thì Thạch Sanh cũng thật thà mà kể lại toàn bộ câu chuyện kể từ khi mình bắn được Đại bàng cho hắn nghe. Thấy vậy thì Lý Thông vô cùng mừng rỡ, hắn lập tức bảo chàng dẫn mình cùng quân lính tới đến hang đá để tìm cách cứu công chúa, lập công với nhà vua.\n" +
                "\n" +
                "Khi đến sát bên cạnh hang đá, thấy cửa hang cứ ăn thông xuống tận sâu dưới đất thì không một người nào có gan mà xuống đó cả. Vì vậy Thạch Sanh lại tình nguyện xuống hang thám thính. Chàng đem dây thừng buộc ngang lưng, sau đó người bên trên cứ từ từ mà dòng dây xuống dưới hang.\n" +
                "\n" +
                "Ngày ấy Đại bàng bị tên bắn bị thương nặng nên nằm liệt ở một nơi, nó bắt nàng công chúa xinh đẹp phải phục dịch mình đủ điều. Thạch Sanh khi đã xuống dưới đáy hang thì liền nấp vào xó kín, đợi cho đến lúc nàng công chúa đi ngang qua thì ra hiệu gọi nàng lại. Nàng công chúa thấy có một chàng trai lạ mặt liều chết tới cứu mình thì trong lòng vừa ngạc nhiên lại vừa cảm phục vô cùng.\n" +
                "\n" +
                "Thạch Sanh đưa cho công chúa bịch thuốc mê, bảo nàng đem pha vào nước để Đại bàng kia uống. Đợi đến khi con Đại bàng đã say ngủ thì Thạch Sanh đem dây thừng buộc vào người công chúa, kéo dây ra hiệu cho đám người bên trên cửa hang kéo nàng lên trên. Đến khi chàng chờ tới lượt của mình, nhưng ai ngờ rằng tên Lý Thông vong ân bội nghĩa kia lại sai người vần một khối đá lớn tới lấp kín cửa hang, sau đó bỏ về hết.\n" +
                "\n" +
                "Thấy cửa hang bị bọn Lý Thông chặn, mình ở dưới lại chẳng cách nào lên được nên Thạch Sanh tức mình lắm. Chàng đành phải đập phá mọi nơi trong hang mong tìm được lối ra. Đúng lúc ấy thì con Đại bàng lại tỉnh lại. Trông thấy có người lạ ở trong hang, lại không nhìn thấy công chúa đâu, nó nổi giận bừng bừng liền xông tới định sẽ giết chết Thạch Sanh.\n" +
                "\n" +
                "Tất nhiên là Thạch Sanh không thể nào mà để cho nó được toại nguyện, chàng cũng tung ra các phép thần thông của mình để đối chọi, hai bên ác chiến vô cùng kịch liệt. Nhưng con Đại bàng này mình vẫn mang trọng thương nên chẳng bao lâu thì thất bại. Giết chết được yêu tinh thì Thạch Sanh lại đi lục lọi ở khắp nơi tìm lối thoát cho mình.\n" +
                "\n" +
                "Trong lúc tìm kiếm thì Thạch Sanh trông thấy trong cũi sắt đang nhốt một chàng trai trẻ. Khi hỏi ra thì chàng mới biết người ấy chính là Thái tử con trai của vua Thủy. Cách đây khoảng hơn một năm trước, trong lúc Thái tử cùng đoàn tùy tùng của mình du ngoạn thì vô tình bị con Đại bàng kia bắt về nhốt trong hang này.\n" +
                "\n" +
                "Sau khi rõ ngọn ngành mọi chuyện, Thạch Sanh sử dụng cung vàng của mình bắn tan chiếc cũi sắt kia và cứu được Thái tử. Khi thoát nạn, Thái tử hết lời mà cảm tạ ơn cứu mạng của chàng, còn khẩn thiết được mời chàng xuống Thủy phủ dạo chơi ít ngày.\n" +
                "\n" +
                "Gặp lại con trai, vua Thủy vô cùng sung sướng, trong lòng vô cùng biết ơn với Thạch Sanh. Vì vậy vua Thủy liền giữ chàng lại Thủy cung, chiêu đãi rất hậu. Đến khi chàng muốn về thì vua Thủy còn đem rất nhiều vàng bạc châu báu để tống tiễn chàng, nhưng Thạch Sanh lại nhất định chẳng chịu nhận thứ gì, chàng chỉ xin duy nhất một cây đàn. Sau đó thì Thạch Sanh lại trở về túp lều rách dưới gốc đa ngày nào và tiếp tục cuộc sống trước đây của mình.\n" +
                "\n" +
                "Nói về chuyện của Chằn tinh cùng với Đại bàng, chúng sau khi chết đi thì hồn chẳng được người nào cúng tế cả, đành phải lang thang khắp nơi để kiếm miếng ăn qua ngày. Một ngày kia lại vô tình gặp được nhau, cùng ngồi lại kể về số phận long đong, lận đận mà mình gặp phải. Khi biết cả hai đều là bị Thạch Sanh hại chết, chúng liền bàn kế trả thù chàng Thạch Sanh để mà bõ ghét.\n" +
                "\n" +
                "Cả hai lẻn vào trong kho của nhà vua, chúng trộm lấy ít của cải, sau đó đem tới gốc đa của chàng Thạch Sanh, ném vào đó để mà vui tội cho chàng. Quả nhiên là đám nội thị lần theo dấu vết và tìm được đến nơi gốc đa, tang vật đầy đủ nên Thạch Sanh lập tức bị bỏ ngục.\n" +
                "\n" +
                "Còn chuyện về nàng công chúa, sau khi nàng được tên Lý Thông kia đưa trở lại hoàng cung thì hóa câm ngay. Cả ngày thì mặt hoa của nàng đều rầu rĩ, cũng chẳng nói chẳng cười lấy một tiếng nào. Nhà vua không còn cách nào khác đành phải hoãn lại việc cưới xin của nàng. Nhà vua hạ lệnh cho Lý Thông mời thầy tới lập đàn để cầu nguyện công chúa được khỏi bệnh.\n" +
                "\n" +
                "Lý Thông cũng cho người đi mời hàng tá những thầy pháp sư với phép thuật vô cùng cao cường tới để lập đàn cúng. Tuy nhiên thì hiệu quả chẳng thấy đâu, nàng công chúa vẫn cứ im lặng mà rầu rĩ như trước.\n" +
                "\n" +
                "Ngày ngày công chúa đều im lặng ngồi một chỗ khiến cho lòng hắn sốt ruột vô cùng. Vô tình lúc ấy Thạch Sanh lại bị bắt, thuộc ngay quyền xét xử của hắn. Lý Thông nào có ngờ được rằng người mà hắn năm lần bảy lượt cố tình hãm hại, đẩy vào chỗ chết mà vẫn cứ sống nhăn răng ở đó. Hắn trong bụng thầm nghĩ: “Nếu như mà để cho nó được sống thì nó chắc hẳn sẽ tranh công với ta, và sẽ tố cáo việc ta làm với nhà vua”. Vì vậy nên Lý Thông hạ quyết định ép Thạch Sanh tội chết.\n" +
                "\n" +
                "Khi ngồi ở trong ngục tối, trong lúc buồn tình Thạch Sanh liền đem chiếc đàn mà vua Thủy tặng ngày nào ra gảy chơi. Chàng không hề biết được rằng cây đàn này là một cây đàn thần, và tiếng đàn văng vẳng vang xa như than, như oán, như bực, như tức. Chàng càng gảy thì tiếng đàn lại càng trách cứ sự hờ hững của nàng công chúa, cũng vạch rõ được tội ác tày trời của tên Lý Thông kia.\n" +
                "\n" +
                "Tiếng đàn của Thạch Sanh vượt khỏi ngục tối, truyền đi xa. Tiếng đàn bay tận vào trong hoàng cung và lọt đến tai của nàng công chúa. Khi ấy nàng đang ngồi ở trên lầu cao, nghe được tiếng đàn thì nàng đột nhiên đứng dậy và cười nói đủ điều. Mà câu nói đầu tiên của nàng chính là xin với vua cha được gặp người đang đánh đàn vào trong cung.\n" +
                "\n" +
                "Nhà vua thấy con gái như vậy thì cảm thấy lạ lùng vô cùng, vội vàng cho lính đem Thạch Sanh tới. Khi đến trước mặt tất cả mọi người, Thạch Sanh đem chuyện của mình kể lại đầu đuôi, từ việc bản thân là cô nhi, đến chuyện cùng Lý Thông kết nghĩa anh em, sau đó lại là chuyện giết Chằn tinh, tiêu diệt Đại bàng, rồi cả chuyện chàng cứu công chúa sau đó cửa hang lại bị chính anh em kết nghĩa của mình lấp kín, còn cả chuyện chàng cứu được Thái tử con vua Thủy rồi lại bị bắt nhốt trong ngục chẳng hiểu tại sao…\n" +
                "\n" +
                "Cả nhà vua cùng với quần thần trong triều càng nghe chuyện của chàng lại càng cảm thấy thương cảm, xót xa. Nhà vua lập tức hạ lệnh tống giam mẹ con nhà Lý Thông và giao lại cho Thạch Sanh quyền xét xử bọn họ. Tuy nhiên, chàng lại quá bao dung nên tha cho hai mẹ con hắn được trở lại quê nhà để làm ăn. Nhưng mới chỉ đi được nửa đường thì đã bị sét đánh chết tươi.\n" +
                "\n" +
                "Sau đó nhà vua rất vui mừng mà gả con gái mình cho chàng Thạch Sanh dũng cảm, tốt bụng. Lễ cưới được tổ chức vô cùng linh đình, phải nói là tưng bừng nhất ở nơi kinh kỳ này, chưa bao giờ lại có chuyện nào vui như vậy cả.\n" +
                "\n" +
                "Nhưng mấy tên hoàng tử ở các nước khác biết chuyện lại vô cùng tức giận khi nghĩ tới chuyện trước đây mình bị từ chối. Họ liền tụ lại với nhau, dẫn theo binh lính của mười tám nước tới hỏi tội nhà vua lí do đem công chúa cành vàng lá ngọc ấy gả cho một tên khố rách áo ôm.\n" +
                "\n" +
                "Tuy nhiên, khi tất cả vây quanh kinh thành, lại nghe được tiếng đàn thánh thót từ chiếc đàn thần của Thạch Sanh thì đám quân sĩ chẳng còn chút ý chí nào để đánh trận. Sau cùng thì tất cả hoàng tử các nước đều đồng loạt mà cuốn giáp. Chàng Thạch Sanh lại sai người dọn cơm ra để mời họ. Mười tám nước, quân sĩ lên đến mấy vạn mà Thạch Sanh chỉ cho dọn có một chiếc niêu cơm nhỏ tí, cả đám đều bĩu môi chẳng buồn đụng đũa. Thạch Sanh thấy vậy biết ý nên mới đố họ xem có thể ăn hết được niêu cơm của mình không, nếu ai làm được thì chàng sẽ trọng thưởng thật hậu cho người đó.\n" +
                "\n" +
                "Cả mấy vạn quân nghe vậy thì dốc hết sức mình mà ăn, tuy nhiên thì có ăn mãi thì niêu cơm nhỏ ấy cứ hết lại đầy. Sau khi tất cả đã ăn no căng thì liền đồng loạt cúi đầu mà lạy tạ Thạch Sanh rồi kéo nhau trở về nước. Ngày sau vì nhà vua không có người nối ngôi nên đã nhường lại ngôi cho chàng Thạch Sanh.","Truyện cổ tích"));
    }

    public void addStoryWorld() {
        storiesWorld.add(new StoryWorld(R.drawable.img_cobe, "Cô bé bán diêm", "Vào buổi đêm giáng sinh ngày ấy, bên ngoài trời những bông tuyết cứ triền miên rơi mãi mà không dừng, những cơn gió lạnh thấu xương lại tô điểm hơn cho cái ngày giáng sinh vô cùng đặc biệt trong năm, cái ngày mà chúa sinh ra đời… Có một cô bé, trên tay ôm một bao giấy, bên trong là những hộp diêm còn mới cứng. Cô bé ấy vừa đi lại trên phố vừa cất cao giọng nói của mình để mời rao.\n" +
                "\n" +
                "Đêm ấy trời thật lạnh, tất cả mọi người đều ở nhà, quây quần ở bên lò sưởi cùng gia đình đón chào giáng sinh, còn những đứa bé thì lại náo nức mong chờ ông già Noel đến cùng với những món quà.Nhưng cô bé của chúng ta, cô lại phải lẻ loi với đôi chân trần, chịu đựng cái rét cắt da cắt thịt, lê bước qua từng con phố để ra bán những hộp diêm nho nhỏ. Cô cũng có một đôi dép khá cũ nát, nhưng đám trẻ nghịch ngợm đã vứt đi mất vào buổi sáng ngày hôm nay rồi.\n" +
                "\n" +
                "Trời càng về khuya thì không khí lại càng lạnh lẽo hơn, đôi chân trần của cô bé cũng đã tím ngắt hết cả. Ở trên phố, tất cả mọi người đều đang hối hả bước nhanh chân để có thể trở về nhà nhanh hơn. Và chẳng có người nào có thời gian chú ý tới cô, mặc cho đôi mắt ngây thơ chất đầy van xin và ngại ngùng vẫn luôn ngước nhìn họ.\n" +
                "\n" +
                "Chẳng hiểu tại sao, hôm nay cô bé vẫn chỉ bán giá một xu cho một hộp diêm như mọi ngày, nhưng mà cả ngày nay lại chẳng có một người nào hỏi tới. Là bởi vì họ quá vô tâm, hay là do họ đang vội vã?\n" +
                "\n" +
                "Đêm tới, tuyết rơi lại càng nhiều thêm, khắp mọi nơi đều bao phủ bởi một tấm thảm trắng xóa từ tuyết. Và cô bé bán diêm cũng đã kiệt sức rồi, đôi chân trần của em tê buốt, chẳng còn bất kì cảm giác gì nữa.\n" +
                "\n" +
                "Ngay lúc này, cô bé cũng chỉ ước một điều rất nhỏ nhoi thôi, đó chính là được về nhà, được cuộn tròn mình trong góc nhỏ trên chiếc giường cũ nát, cô bé muốn được ngủ một giấc dài cho tới tận sáng để có thể bỏ quên cái lạnh, cái đói đang bao phủ cả người mình. Tuy nhiên, khi nhớ tới việc mình bị mắng nhiếc, bị đòn roi từ người cha của mình, cô bé liền rùng mình, một nỗi sợ hãi chồm tới bao phủ cả thân thể gầy gò, đánh tan mọi lạnh giá, cô bé lại cất bước, những bước chân nặng nhọc trên phố vắng.\n" +
                "\n" +
                "Đi một quãng thì cô bé khựng người lại ngắm nhìn những ngôi nhà tỏa ra sự ấm cúng ở hai bên đường. Trong mỗi căn nhà ấy đều có một cây thông Noel được trang trí lộng lẫy, đám trẻ treo đầy những chiếc bít tất để nhận quà tặng, nơi thì đèn điện đua nhau nhấp nháy, nơi thì tỏa ra hương thơm khó cưỡng từ những chiếc bánh mới ra lò nóng hổi và thơm lừng. Có nhà còn dọn cả một bàn có đầy đủ nào gà tây, nào rượu ngon, lại còn đủ thứ bánh ngọt và trái cây ngon lành nữa.\n" +
                "\n" +
                "Cô bé bất giác mà nuốt nước bọt, đôi mắt đột nhiên hoa lên, tay chân đều bủn rủn cứ run lên từng đợt. Đột nhiên cô bé cảm thấy đói bụng và lạnh lẽo hơn bất cứ khi nào. Đôi bàn tay gầy yếu cứ cố gắng xiết chặt cơ thể, mong giữ lấy chút hơi ấm mỏng manh. Cô bé lại tiếp tục lê bước trên đôi chân đã lạnh cóng, trong tiếng nhạc rộn ràng của giáng sinh ấy, một mình cô lạc lõng giữa dòng đời, cô đơn giữa sự vui mừng hồ hởi đón chào ngày chúa sinh ra đời của tất cả mọi người…\n" +
                "\n" +
                "Suốt ngày hôm đó em chẳng bán được một hộp diêm nào, cũng chẳng có người nào tốt bụng bố thí thứ gì cho em. Cô bé đáng thương phải chịu cảnh đói rét ấy vẫn phải lê những bước dài nặng nhọc trên đường, chịu đựng bầu trời tuyết rơi lạnh đến thấu xương ấy để mong bán được vài hộp diêm nhỏ. Mái tóc của em xõa dài trên lưng, được phủ lên một tầng bông tuyết trắng xóa và lạnh buốt, nhưng em cũng chẳng để ý, bởi vì giờ đây em đã chẳng cảm nhận được gì nữa rồi.\n" +
                "\n" +
                "Tất cả mọi nhà, tất cả các cửa sổ đều sáng rực ánh đèn màu, khắp các con phố to ngõ nhỏ đều quanh quẩn mùi thơm của ngỗng quay. Bởi vì là đêm giáng sinh nên tất cả mọi nhà đều vui vẻ tổ chức ăn uống rất linh đình.\n" +
                "\n" +
                "Trông thấy những khung cảnh ấy khiến cô bé nhớ lại những tháng ngày trước kia, lúc người bà yêu quý và hiền từ của em vẫn còn sống. Khi ấy, vào mỗi dịp giáng sinh, bà và em lại vui vẻ cùng nhau ở nhà đón mừng giáng sinh, trong nhà của em cũng có bánh thơm, cũng có ngỗng quay, và cũng có cả quả ngọt nữa.\n" +
                "\n" +
                "Thật không may là, thần chết đã tới và đem bà đi xa mãi mãi, tài sản của bà bị người cha của em tiêu tán đến hết, em cũng bị buộc phải rời khỏi ngôi nhà ấm áp và xinh đẹp, ngôi nhà với những dây trường xuân bao bọc, để rồi phải chuyển tới một cái xó tối tăm và bẩn thỉu. Hằng ngày em còn phải chịu những trận đòn roi điếng người, nghe những lời chửi mắng thậm tệ của người cha.\n" +
                "\n" +
                "Quá mệt mỏi, cô bé liền đem theo đống diêm của mình ngồi nép vào góc tường ở giữa hai căn nhà, em thu lại đôi chân, vòng tay ôm chặt mong xua bớt cái rét lạnh kia, nhưng mà càng lúc thì em lại càng thấy rét hơn nữa.\n" +
                "\n" +
                "Giờ em rất muốn được trở về nhà của mình, nhưng mà em lại không thể về được, bởi vì nếu em không thể bán được bao diêm nào, hoặc là chẳng được người ta bố thí cho đồng xu nào. Nếu như mà em cứ thế trở về thì chắc chắn người cha của em sẽ lại mắng nhiếc, đánh đập em dã man.\n" +
                "\n" +
                "Hơn nữa, dù em có trở về thì cũng vẫn cứ rét lạnh như thế, bởi vì hai cha con của em sống ở phía trên gác, dù đã dùng giẻ để bịt vào những khe hở trên vách, nhưng như vậy cũng chẳng đủ để ngăn cản những cơn gió lạnh rít gào, luồn lách vào trong nhà. Và giờ thì đôi tay của em cũng tê cứng lại rồi.\n" +
                "\n" +
                "Chà! Lúc này giá như mà được quẹt lấy một que diêm lên để sưởi ấm, giá như mà em có thể được quẹt lấy một que diêm lấy lửa hơ đôi bàn tay đã lạnh cóng này thì tốt biết mấy.\n" +
                "\n" +
                "Sau cùng thì cô bé cũng đánh liều mà lấy một que diêm ra quẹt. Que diêm rất nhanh liền bén lửa, ngọn lửa ban đầu có màu xanh lam, sau đó thì dần chuyển sang màu xanh biếc, và rồi thì biến thành màu trắng rực hồng ở quanh que gỗ, ánh lửa sáng chói nhìn rất vui mắt.\n" +
                "\n" +
                "Cô bé vội vàng giơ đôi bàn tay của mình vòng quanh que diêm đang cháy rực. Chà! Từ ngọn lửa nhỏ tỏa ra hơi ấm tuyệt vời! Em có cảm giác như là mình đang ngồi trước chiếc lò sưởi đang cháy rực vậy, vô cùng ấm áp. Bên trong lò thì những thanh củi cứ đua nhau cháy nhìn đến là thích mắt, nó tỏa ra từng luồng hơi ấm rất dỗi dịu dàng. Cảm giác dễ chịu vô cùng.\n" +
                "\n" +
                "Trời càng ngày càng giá rét, khi tuyết trắng bao phủ khắp mọi nơi, những cơn gió lạnh rít gào liên tục, nếu như lúc này có thể ngồi bên cạnh lò sưởi để sưởi ấm thì tuyệt vời làm sao!\n" +
                "\n" +
                "Em vừa duỗi đôi chân ra định sưởi ấm thì bỗng nhiên lửa trên que diêm vụt tắt, và chiếc lò sưởi ấm áp cũng biến mất. Và em chợt nhận ra mình vẫn đang ngồi ở giữa trời giá rét cùng với que diêm tàn ở trên tay. Rồi em lại giật mình mà nhớ tới chuyện người cha giao cho em việc đi bán những bao diêm, đêm nay nếu em trở về tay không thì đảm bảo người cha sẽ đánh đòn em rất tàn nhẫn.\n" +
                "\n" +
                "Cô bé đánh liều và quẹt thêm một que diêm nữa, que diêm lại bùng cháy, giờ thì hai bức tường bên cạnh em đột nhiên biến thành tấm rèm vải màn, em có thể nhìn thấy được tất cả ở bên trong nhà. Bên trong, bàn ăn chất đầy những món ăn ngon, có một con ngỗng quay tỏa hương thơm lừng, còn có những bát đũa sứ rất đẹp đẽ, mà chiếc khăn trải bàn trắng tinh, có những giỏ đựng đầy hoa quả, còn có cả những ổ bánh mì mới ra lò nóng hổi.\n" +
                "\n" +
                "Kì lạ thay, con ngỗng kia đột nhiên lại nhảy ra khỏi đĩa, còn đem theo dao ăn, phóng sết ở trên lưng và tiến tới phía của em. Đột nhiên que diêm này cũng vụt tắt và những tấm rèm em nhìn thấy lại trở thành hai bức tường gạch lạnh lẽo, và ngoài trời kia thì tuyết vẫn buông xuống dày đặc.\n" +
                "\n" +
                "Và thực thế cuối cùng cũng thay thế tất cả mộng mị, em chẳng có được lò sưởi, em cũng không có được bàn ăn ngon, chẳng có con ngỗng quay thơm lừng, cũng chẳng có nổi một ổ bánh ngọt mới nướng. Mọi thứ em nhìn thấy chỉ toàn là ảo ảnh em tưởng tượng ra.\n" +
                "\n" +
                "Còn thực sự xung quanh em thì vẫn là con phố vắng vẻ và lạnh lẽo, phủ kín tầng tuyết dày, lùa vào những cơn gió lạnh buốt. Một vài người còn trên phố thì cũng đang cố rảo nhanh bước chân để về nhà, hoặc là tới những nơi hẹn vui vẻ, ấm áp khác. Chẳng có bất kì người nào chú ý đến cô bé bán diêm đang thu người trong góc nhỏ, hình như là đối với họ thì em chỉ là vô hình mà thôi.\n" +
                "\n" +
                "Cô bé lại rút tiếp một cây diêm khác ra để quẹt, diêm lại bốc cháy rất rực rỡ, đột nhiên em nhìn thấy trước mắt có một cây thông noel lớn vô cùng, ở chung quanh cây thông gắn đầy những vật trang trí lấp lánh, còn có những dây đèn nháy nhiều màu trông rất thích mắt, trên những cành lá xanh tươi còn cắm đầy những cây nến to được thắp sáng.\n" +
                "\n" +
                "Em liền đưa tay để chạm về phía cây thông… nhưng mà chưa kịp chạm tay tới thì que diêm lại vụt tắt. Và rồi tất cả đèn nháy, nến sáng đều hóa thành những ngôi sao bay vụt lên trên trời cao.\n" +
                "\n" +
                "Chắc là vừa có ai đó qua đời, cô bé bán diêm liền tự nhủ như vậy. Bởi vì trước kia lúc bà nội của em chưa mất, bà thường hay kể với em: “Mỗi khi trên trời cao xuất hiện thêm những vì sao thì chính là lúc có thêm những linh hồn mới bay về trời, cùng đến với chốn thiên đàng”.\n" +
                "\n" +
                "Em lại tiếp tục quẹt thêm một que diêm khác, khi ánh sáng từ que diêm lan tỏa khắp không gian xung quanh thì em lại trông thấy bà nội em rõ ràng đang cười rất hiền với em. Cô bé vô cùng mừng rỡ liền reo lên:\n" +
                "\n" +
                "– Bà ơi bà! Bà hãy cho cháu theo với! Cháu biết là khi que diêm này tắt đi thì bà sẽ biến mất, bà cũng sẽ biến mất y như lò sưởi, ngỗng quay và cả cây thông noel lúc trước nữa. Nhưng cháu cầu xin bà, bà đừng bỏ cháu ở lại nơi này một mình. Trước kia khi bà còn sống, cháu và bà đã sống cùng nhau vui vẻ biết nhường nào, bà cũng từng nói với cháu là nếu như cháu ngoan thì ngày nào đó bà sẽ về gặp cháu. Bà ơi bà! Cháu rất muốn được đi theo bà! Vì thế bà hãy cầu xin thượng đế giúp cháu với, cháu tin là ngài sẽ không đành lòng mà từ chối thỉnh cầu này của cháu!\n" +
                "\n" +
                "Que diêm cuối cùng cũng cháy rụi, và ngọn lửa dần vụt tắt, ảo ảnh về bà của cô bé trong ánh sáng mờ mờ ảo ảo cũng dần biến mất. Cô bé vội vàng lôi hết số diêm của mình ra và quẹt, em chỉ muốn níu kéo hình ảnh của bà.\n" +
                "\n" +
                "Những que diêm ấy cứ nối tiếp mà tỏa sáng, ánh sáng rực rỡ và ấm áp đến kì lạ. Và em cũng chưa bao giờ được nhìn hình ảnh của bà mình đẹp đẽ, to lớn đến như vậy. Bà cười hiền hậu, tiến tới nắm lấy đôi tay gầy gò của em, và rồi hai bà cháu bay về trời cao, về nơi không có những trận đòn roi kinh người, không có những đói rét lạnh giá. Họ cùng nhau bay về thiên đàng, cùng về bên thượng đế.\n" +
                "\n" +
                "Buổi sáng hôm sau, bên ngoài vẫn được phủ kín một tầng tuyết dày, những tia nắng mặt trời xuất hiện và một bầu trời cao xanh ngắt một màu. Tất cả mọi người đều vui vẻ mở cửa ra khỏi ngôi nhà ấm áp của mình.\n" +
                "\n" +
                "Và cũng trong buổi sáng buốt giá ấy thì người ta nhìn thấy được ở trong góc tường nhỏ, nơi ấy có cô bé bán diêm đang ngồi ở đó, đôi má em ửng hồng, còn đôi môi em thì mang một nụ cười rất hạnh phúc. Và em đã chết, em chết vì đói, em chết vì lạnh, em chết ngay trong đêm giáng sinh.\n" +
                "\n" +
                "Cô bé ấy ngồi giữa một đống những bao diêm, còn có một bao diêm đã đốt hết. Tất cả mọi người đều kháo rằng: “Con bé chắc là muốn được sưởi ấm lắm”. Nhưng có một điều mà không một ai có thể biết, đó là những thứ kì diệu em đã nhìn thấy khi ánh lửa từ những que diêm đó bùng cháy, đặc biệt là hình ảnh hai bà cháu nắm tay nhau cùng bay lên trên trời cao, cùng nhau đón đầu năm mới tốt đẹp.", "truyện cổ tích"));
        storiesWorld.add(new StoryWorld(R.drawable.img_quangkhando,"Cô bé quàng khăn đỏ","Ngày xửa ngày xưa có chuyện kể rằng, có một cô bé thường hay quàng chiếc khăn màu đỏ, vì thế nên mọi người bắt đầu gọi cô bằng cái tên cô bé quàng khăn đỏ. Vào một ngày kia, mẹ của cô bé quàng khăn đỏ bảo cô đem theo bánh mẹ cô vừa nướng xong để biếu cho bà ngoại. Trước lúc cô bé rời khỏi nhà thì mẹ cô dặn dò rất kĩ rằng:\n" +
                "\n" +
                "– Ở con đường vòng qua khu rừng thường có rất nhiều chó sói ở đó, vì thế con hãy đi theo đường thẳng đến nhà bà ngoại để tránh bị những con chó sói kia ăn thịt nhé!Cô bé ngoan ngoãn vâng lời mẹ, sau đó đem theo giỏ bánh lên đường đến nhà bà ngoại của mình. Khi đi trên đường thì cô bé trông thấy con đường vòng qua khu rừng kia có thật nhiều những loài hoa thơm cùng cỏ lạ, còn có không biết bao nhiêu là bướm có những đôi cánh màu sắc sặc sỡ và rất xinh đẹp nữa.\n" +
                "\n" +
                "Khi nhìn thấy hoa xinh cùng bướm đẹp thì cô bé chẳng còn nhớ được những lời dặn trước lúc rời khỏi nhà của mẹ mình nữa. Vì vậy nên cô bé liền tung tăng mà đi vào con đường rừng xinh đẹp kia. Khi đi được một đoạn thì cô bé bắt gặp một bạn Sóc, và Sóc dừng lại mà nhắc nhở cô:\n" +
                "\n" +
                "– Này cô bé quàng khăn đỏ, khi nãy chẳng phải mẹ cô đã dặn cô phải đi theo đường thẳng, không nên đi đường vòng qua khu rừng kẻo bị chó sói bắt ăn thịt sao. Thế sao giờ cô lại ở đây? Cô nên nghe lời của mẹ mình đi thì hơn.\n" +
                "\n" +
                "Nhưng cô bé quàng khăn đỏ chả thèm quan tâm lời nhắc nhở chân thành của Sóc, cô không muốn nghe, nên chẳng thèm trả lời Sóc nữa. Cô quyết định sẽ không nghe những lời mà mẹ dặn, cô cũng không nghe cả lời nhắc nhở kia của Sóc, cô vẫn cứ tiếp tục đi trên còn đường vòng qua khu rừng.\n" +
                "\n" +
                "Rồi cô vừa tung tăng bước đi trên đường lại vừa hái hoa và bắt bướm vô cùng vui vẻ. Khi cô đi đến khoảng giữa của khu rừng thì vô tình bắt gặp chó sói. Chó sói nhìn rất to, nó lập tức tiến đến gần, đứng ngay trước mặt cô bé rồi cất cái giọng ầm ầm của mình lên mà hỏi:\n" +
                "\n" +
                "– Cô bé quàng khăn đỏ này, cô tung tăng mà đi đâu đấy?\n" +
                "\n" +
                "Nhìn thấy chó sói chắn ngay trước mặt mình thì cô bé vô cùng sợ hãi, tuy nhiên thì cô cũng cố tỏ ra mạnh dạn mà trả lời lại câu hỏi ấy của chó sói:\n" +
                "\n" +
                "– Giờ tôi đang sang nhà của bà ngoại, để tặng cho bà ngoại tôi giỏ bánh mẹ tôi mới nướng xong.\n" +
                "\n" +
                "Khi nghe cô bé trả lời rằng đang trên đường sang nhà bà ngoại để tặng bánh thì trong bụng nó thầm nghĩ: “À, thế hóa ra là con bé này còn có cả bà ngoại cơ đấy, vậy thì ta phải tính sao để mà ăn thịt được cả hai bà cháu nhà nó mới bõ công”. Trong bụng nghĩ vậy nên nó lập tức hỏi lại cô bé rằng:\n" +
                "\n" +
                "– Này, nhà bà ngoại của cô ở nơi nào thế? Còn cách xa nơi này không vậy?\n" +
                "\n" +
                "Cô bé quàng khăn đỏ chẳng nghi ngờ gì mà đáp lại ngay:\n" +
                "\n" +
                "– Nhà của bà ngoại thì ở tít bên kia của khu rừng này cơ. Chính là cái ngôi nhà có ống khói rất cao đấy, đến đó thì chỉ cần đẩy nhẹ cửa là vào được ngay.\n" +
                "\n" +
                "Nghe xong thì chó sói chẳng vội mà ăn thịt của cô bé nữa, mà nó lập tức chạy thẳng tới ngôi nhà của bà ngoại mà cô bé nhắc tới. Vì biết được vào nhà của bà cụ này rất dễ dàng nên nó nhẹ nhàng đẩy cửa ra, sau đó thì vồ lấy bà cụ rồi nuốt chửng luôn. Khi nó đã nuốt bà ngoại của cô bé quàng khăn đỏ vào trong bụng thì nó liền leo lên trên giường, còn đắp chăn thật kín để giả làm bà ngoại vẫn đang bị ốm của cô bé.\n" +
                "\n" +
                "Bởi vì lúc ở trong rừng chó sói không ăn thịt ngay cô bé nên sau một hồi hái hoa bắt bướm vui vẻ thì cô bé cũng tới được nhà của bà ngoại mình. Lúc vào nhà thì cô bé trông thấy trên giường là chó sói đang nằm, còn đắp chăn kín mít nữa, nhưng cô lại cứ tưởng là bà ngoại của mình đang ốm, nên cô bé mới hỏi bà:\n" +
                "\n" +
                "– Bà yêu dấu của cháu! Bà ốm như vậy lâu chưa?\n" +
                "\n" +
                "Chó sói không hề mở miệng đáp lại câu hỏi của cô bé, nó vẫn cố chui trong chăn rồi giả vờ mà rên lên hừ hừ.\n" +
                "\n" +
                "– Bà yêu dấu ơi, mẹ của cháu đã nướng bánh mới rồi bảo cháu mang sang biếu cho bà đấy!\n" +
                "\n" +
                "– Thế hả? Bà vui lắm, cảm ơn cả hai mẹ con nhé. Cháu ngoan, hãy lại đây với bà tí nào.\n" +
                "\n" +
                "Nghe bà gọi thì cô bé quàng khăn đỏ cũng lập tức chạy tới bên cạnh giường của bà đang nằm, nhưng thấy hơi lạ nên cô bé mới hỏi:\n" +
                "\n" +
                "– Bà yêu dấu ơi, tại sao hôm nay cháu nhìn thấy tai của bà dài thế ạ?\n" +
                "\n" +
                "Con sói cũng lên tiếng trả lời cô bé:\n" +
                "\n" +
                "– Tai của bà dài như thế là để có thể nghe cháu nói rõ ràng hơn đấy mà!\n" +
                "\n" +
                "– Bà yêu dấu ơi, tại sao hôm nay mắt của bà lại to và đen vậy ạ?\n" +
                "\n" +
                "– Mắt của bà to là để bà có thể nhìn đứa cháu gái vô cùng xinh đẹp này của bà rõ ràng hơn đấy mà!\n" +
                "\n" +
                "Nhưng cô bé vẫn cảm thấy bà mình hôm nay có quá nhiều điểm lạ lẫm, vì vậy nên lại hỏi bà tiếp:\n" +
                "\n" +
                "– Bà yêu dấu ơi, vậy thì sao hôm nay nhìn mồm của bà lại to vậy ạ?\n" +
                "\n" +
                "– Mồm của bà to là để cho bà có thể ăn thịt của cháu được ngon lành hơn.\n" +
                "\n" +
                "Nói đoạn, chó sói liền chồm dậy và vồ gọn cô bé quàng khăn đỏ chuẩn bị nuốt chửng. May mà đúng vào lúc ấy lại có một bác thợ săn đang đi ngang qua nơi này, tiện trong tay còn đang cầm chiếc búa sắc nên bác phang ngay vào giữa đầu con sói một nhát mạnh như trời giáng. Vì trúng phải đòn hiểm nên con chó sói ấy lập tức lăn ra chết tươi.\n" +
                "\n" +
                "Vì biết được chó sói vừa mới ăn thịt người bà ngoại nên bác thợ săn liền lấy một con dao sắc ở trong bếp mà mổ bụng của sói ra, vừa kịp để mà cứu sống được bà ngoại của cô bé. Thật may mắn là hai bà cháu cô bé quàng khăn đỏ đều thoát được nạn này. Và cũng từ ngày ấy trở đi thì cô bé quàng khăn đỏ chẳng bao giờ dám làm trái những lời mà mẹ cô bé dặn nữa cả.","Truyện cổ tích"));
        storiesWorld.add(new StoryWorld(R.drawable.img_bachtuyet,"Nàng bạch tuyết và bảy chú lùn","Chuyện xưa kể rằng hồi ấy, khi trời đang ở giữa mùa đông lạnh giá, những bông hoa tuyết y như những chiếc lông chim trắng muốt bay phấp phới khắp bầu trời, một bà hoàng hậu đang ngồi khâu ở bên bậu cửa sổ. Chiếc khung cửa được làm từ gỗ mun đen nhánh. Bà hoàng hậu tuy ngồi khâu nhưng bà lại quá mải mê ngắm nhìn những bông tuyết xinh đẹp đang rơi ngoài kia, vì không chú ý nên kim khâu đâm vào đầu ngón tay của bà, có ba giọt máu màu đỏ tươi rớt xuống dưới nền tuyết trắng. Hoàng hậu trông thấy màu máu đỏ nổi bật ở trên nền tuyết trắng, bà thì thầm:\n" +
                "\n" +
                "– Giá như mình có được một đứa con có làn da trắng như tuyết, màu môi hồng hào như là màu đỏ tươi của máu, tóc thì đen nhánh như là gỗ mun làm khung cửa sổ này. Nếu được như vậy thì tốt quá nhỉ.Không lâu sau thì hoàng hậu mang bầu và hạ sinh một nàng công chúa có làn da trắng như là tuyết, môi đỏ như là son, tóc thì đen nhánh như là gỗ mun, bởi vậy nên hoàng hậu liền đặt tên cho con gái của mình là Bạch Tuyết. Tuy nhiên, khi hạ sinh công chúa xong thì hoàng hậu cũng qua đời.\n" +
                "\n" +
                "Nhà vua để tang vợ mình tròn một năm, sau đó thì cưới người vợ khác làm hoàng hậu. Vị hoàng hậu mới này vô cùng xinh đẹp, tuy nhiên thì tính cách của mụ lại rất kiêu ngạo và ngông cuồng. Chỉ cần mụ ta nghe được người khác nói rằng có người xinh đẹp hơn mụ là mụ sẽ tức điên lên. Mụ ta có chiếc gương thần vô cùng màu nhiệm, mụ thường hay ngắm nhìn nhan sắc của mình trước gương, mỗi lần như vậy mụ lại hỏi gương thần rằng:\n" +
                "\n" +
                "– Gương kia ngự ở trên tường,\n" +
                "Thế gian ai đẹp được dường như ta?\n" +
                "\n" +
                "Mỗi lần mụ ta hỏi như vậy thì gương thần đều thành thật mà trả lời:\n" +
                "\n" +
                "– Muôn tâu hoàng hậu, hoàng hậu chính là người đẹp nhất trên thế gian này.\n" +
                "\n" +
                "Nghe câu trả lời của gương thì hoàng hậu vô cùng hài lòng, bởi vì mụ biết rằng gương thần chưa bao giờ nói dối cả.\n" +
                "\n" +
                "Tuy nhiên, thời gian qua đi, nàng công chúa Bạch Tuyết của chúng ta càng ngày càng lớn, và càng ngày càng xinh đẹp hơn. Khi nàng lên bảy tuổi thì nàng đẹp như là nắng sớm mai, vẻ đẹp của nàng hơn hẳn vị hoàng hậu kia. Có một lần hoàng hậu lại tìm đến gương thần, mụ ta lại hỏi:\n" +
                "\n" +
                "– Gương kia ngự ở trên tường,\n" +
                "Thế gian ai đẹp được dường như ta?\n" +
                "\n" +
                "Nhưng lần này, ngoài ý muốn của hoàng hậu, gương thần lại trả lời rằng:\n" +
                "\n" +
                "– Muôn tâu hoàng hậu,\n" +
                "Xưa kia bà đẹp nhất trần,\n" +
                "Ngày nay Bạch Tuyết muôn phần đẹp hơn.\n" +
                "\n" +
                "Hoàng hậu nghe gương thần trả lời thì giật mình, khuôn mặt xinh đẹp của mụ lập tức tái xanh đi vì tức giận cùng ghen ghét. Kể từ ngày đó trở đi, chỉ cần mụ ta thoáng trông thấy nàng Bạch Tuyết thì mụ lại cảm thấy vô cùng khó chịu, trong lòng thì đong đầy bực tức, cứ dần dần lại càng căm ghét Bạch Tuyết hơn nữa. Sự ghen ghét nảy mầm trong lòng hoàng hậu, và mỗi ngày lại một lớn hơn, lòng đố kỵ ngày càng thêm mãnh liệt khiến cho mụ cả ngày lẫn đêm đều cảm thấy bực bội và bứt rứt không yên. Mụ lập tức cho tìm đến một tên thợ săn và ra lệnh:\n" +
                "\n" +
                "– Ngươi mau mang con bé kia vào tận trong rừng sâu, ta không bao giờ muốn trông thấy mặt của nó nữa. Ngươi phải giết nó rồi mang gan và phổi của nó về đây cho ta. Có như vậy ta mới biết rằng ngươi đã giết nó hay chưa.\n" +
                "\n" +
                "Người thợ săn nhận mệnh đem nàng Bạch Tuyết vào tận trong rừng sâu tăm tối. Tuy nhiên, lúc bác vừa rút con dao ra khỏi vỏ định giết, cô bé đột nhiên khóc lớn và bảo:\n" +
                "\n" +
                "– Chao ôi, hỡi bác thợ săn thân yêu, bác làm ơn hãy để cháu được sống, cháu sẽ chạy sâu vào trong khu rừng hoang vu này, cháu hứa là sẽ chẳng vào giờ đặt chân lại lâu đài nữa.\n" +
                "\n" +
                "Bác thợ săn nhìn cô bé xinh đẹp van khóc thảm thiết thì cũng động lòng thương hại, vì thế bác liền bảo:\n" +
                "\n" +
                "– Giờ con hãy chạy trốn thật sâu vào trong rừng kia, thật tội nghiệp cho con.\n" +
                "\n" +
                "Trong bụng bác lại thầm nghĩ rằng: “Có khi cô bé vào trong rừng ấy lại bị lũ thú dữ ăn thịt mất thôi”. Tuy nhiên thì bác cũng cảm thấy gánh nặng vơi bớt vì đã chẳng phải ra tay giết một cô bé đáng thương như thế.\n" +
                "\n" +
                "Vừa lúc ấy thì có con lợn rừng đột nhiên nhảy tới, vì thế bác thợ săn liền đâm chết nó, sau đó moi gan và phổi để mang về giao cho hoàng hậu như là bằng chứng để chứng minh rằng Bạch Tuyết đã bị giết chết. Mụ ta liền sai đầu bếp đem gan và phổi đi xào cho mụ ăn. Vì cứ ngỡ đó là gan và phổi của Bạch Tuyết nên mụ ăn kỳ hết mới thôi.\n" +
                "\n" +
                "Lại nói về nàng Bạch Tuyết bất hạnh của chúng ta, từ lúc rời khỏi chỗ bác thợ săn thì cô cứ một mình lủi thủi ở trong khu rừng rậm mênh mông ấy, cô rất sợ hãi, đôi mắt ngơ ngác cứ nhìn khắp nơi, nhìn từ cành cây cho tới ngọn cỏ, cô chẳng biết mình nên làm gì vào lúc này nữa.\n" +
                "\n" +
                "Bỗng nhiên cô lại cắm đầu cắm cổ chạy, cô giẫm lên cả những gai cùng đá nhọn. Lũ thú dữ vẫn cứ lượn quanh nhưng chẳng con nào nhào tới đụng vào người cô cả. Bạch Tuyết cứ thế mà chạy mãi, cô chạy cho tới khi trời đã sẩm tối thì cô trông thấy đằng xa có một ngôi nhà nhỏ. Quá mệt mỏi, cô liền bước tới mong có chỗ để nghỉ chân.\n" +
                "\n" +
                "Khi cô bước vào bên trong nhà thì mọi đồ vật ở trong căn nhà ấy đều bé xíu, nhỏ xinh và cũng rất sạch sẽ, không thể nào chê bai được một điều gì cả. Ở ngay giữa nhà chính là một chiếc bàn, trên nó được trải tấm khăn màu trắng tinh, bên trên bàn có bày ra bảy chiếc đĩa nhỏ, trên mỗi chiếc đĩa lại có một chiếc thìa nhỏ, một con dao nhỏ, một chiếc nĩa nhỏ, và còn có một chiếc ly cũng nhỏ và xinh nốt. Ở sát hai bên tường thì có kê bảy chiếc giường khá nhỏ nằm nối tiếp nhau, ở trên giường đều phủ khăn màu trắng phau.\n" +
                "\n" +
                "Cả một ngày lang thang trong rừng sâu khiến bụng của Bạch Tuyết đều đã cồn cào vì đói khát rồi. Nàng liền ăn một chút thức ăn ở mỗi đĩa, và rồi lại uống một hớp nhỏ rượu vang ở mỗi chiếc ly. Mặc dù cô rất đói nhưng cô lại không muốn bất kì ai phải mất phần vì mình.\n" +
                "\n" +
                "Và khi bụng đã đỡ đói, đôi chân đã phải rong ruổi trong rừng cả ngày giờ đây mỏi nhừ, vì quá mệt nên cô muốn nằm ngay lên giường mà ngủ một giấc, nhưng những chiếc giường này chiếc nào chiếc nấy đều không vừa với cô, cái thì lại quá dài, cái thì lại quá ngắn. Bạch Tuyết đi một lượt và thử thì phải đến chiếc giường thứ bảy cô mới cảm thấy được, vì vậy cô nằm đó mà thiếp đi.\n" +
                "\n" +
                "Khi bầu trời bên ngoài đã tối mịt thì những người chủ nhân của ngôi nhà nhỏ xinh này mới trở về, họ là bảy chú lùn, công việc thường ngày của họ chính là đào bới ở mỏ quặng sắt sâu trong núi. Trở về đến nhà, họ cùng nhau thắp sáng bảy ngọn đèn nhỏ, ánh sáng lan tỏa khắp trong căn nhà và họ cảm giấc được như có người đã vào trong nhà của mình. Bởi vì tất cả những đồ vật ở trong căn nhà của họ đều không giữ nguyên được như lúc họ mới đi làm.\n" +
                "\n" +
                "Chú lùn thứ nhất ngạc nhiên nói:\n" +
                "\n" +
                "– Đã có ai ngồi vào chiếc ghế xinh đẹp này của tôi rồi?\n" +
                "\n" +
                "Chú lùn thứ hai cũng kêu lên:\n" +
                "\n" +
                "– Người nào đã ăn nho trong đĩa của tôi thế?\n" +
                "\n" +
                "Chú lùn thứ ba lại nói:\n" +
                "\n" +
                "– Người nào lại ăn bánh trong đĩa của tôi vậy?\n" +
                "\n" +
                "Chú lùn thứ tư nói tiếp:\n" +
                "\n" +
                "– Là ai đã ăn rau trong đĩa nhỏ của tôi?\n" +
                "\n" +
                "Chú lùn thứ năm bảo:\n" +
                "\n" +
                "– Đã có người dùng chiếc nĩa nhỏ xinh của tôi mà cắt gì đó?\n" +
                "\n" +
                "Chú lùn thứ sáu tiếp lời:\n" +
                "\n" +
                "– Có người dùng con dao bé xíu của tôi làm gì rồi đấy?\n" +
                "\n" +
                "Và chú lùn thứ bảy cũng không khỏi bất ngờ:\n" +
                "\n" +
                "– Là người nào lại uống nước trong chiếc ly của thôi vậy?\n" +
                "\n" +
                "Tất cả các chú lùn đều chạy về chiếc giường của mình mà kêu lên:\n" +
                "\n" +
                "– Hình như có người vừa nằm lên trên chiếc giường của tôi thì phải?\n" +
                "\n" +
                "Chú lùn thứ bảy cũng kiểm tra chiếc giường của mình, chú trông thấy nàng Bạch Tuyết vẫn đang ngủ say. Chú lập tức gọi mọi người tới. Tất cả đều hết sức ngạc nhiên vì vị khách lạ, họ đem tới bảy cây đèn rồi soi vào Bạch Tuyết, rồi họ cùng nhau reo lên đầy vui mừng:\n" +
                "\n" +
                "– Ôi chao, cô bé này sao mà lại xinh đẹp thế nhỉ!\n" +
                "\n" +
                "Các chú lùn thấy vậy thì rất vui mừng, cũng không nỡ đánh thức Bạch Tuyết dậy, họ giữ im lặng để cô bé được ngủ ngon. Còn chú lùn thứ bảy không có giường đành phải ngủ nhờ ở giường của những người bạn khác, chú ngủ nhờ mỗi giường một giờ, và thế cũng qua được một đêm.\n" +
                "\n" +
                "Khi bầu trời đã hửng sáng thì Bạch Tuyết tỉnh lại, trông thấy cả bảy chú lùn đang vây quanh mình, nhìn mình tò mò thì cô rất sợ hãi. Tuy nhiên họ đều rất thân thiện, vui vẻ mà hỏi cô rằng:\n" +
                "\n" +
                "– Tên cô là gì thế?\n" +
                "\n" +
                "Cô cũng đáp lại:\n" +
                "\n" +
                "– Tên em là Bạch Tuyết.\n" +
                "\n" +
                "Và các chú lùn lại tiếp tục hỏi:\n" +
                "\n" +
                "– Tại sao cô lại tới được ngôi nhà của bọn tôi vậy?\n" +
                "\n" +
                "Rồi Bạch Tuyết thành thật mà kể lại cho mọi người nghe toàn bộ câu chuyện của mình, về mụ dì ghẻ đã tìm cách hãm hại cô như thế nào, chuyện bác thợ săn tốt bụng đã thả cho cô đi ra sao, và cả chuyện cô đã phải chạy trốn cả ngày ở trong rừng sâu và tới được ngôi nhà của họ nữa. Nghe xong câu chuyện vô cùng đáng thương của cô, bảy chú lùn liền bảo cô là:\n" +
                "\n" +
                "– Đã vậy thì cô hãy ở lại đây với chúng tôi, nếu như cô có thể trông nom chuyện nhà cửa, rũ giường, nấu ăn, giặt quần áo, thêu thùa, khâu vá, dọn dẹp và quét tước nhà cửa sạch sẽ và ngăn nắp. Nếu cô đồng ý thì từ nay về sau cuộc sống của cô sẽ chẳng thiếu thốn gì nữa.\n" +
                "\n" +
                "Lời đề nghị này của bảy chú lùn khiến cho Bạch Tuyết vô cùng vui mừng, cô lập tức trả lời:\n" +
                "\n" +
                "– Vâng, nếu được vậy thì em rất sẵn lòng.\n" +
                "\n" +
                "Kể từ ngày đó trở đi thì Bạch Tuyết liền ở lại cùng bảy chú lùn trong ngôi nhà nhỏ tận sâu trong rừng. Cô nhận đảm đương tất cả những công việc vặt ở trong nhà, mỗi buổi sáng khi bảy chú lùn kéo nhau đi đào mỏ ở trong rừng sâu để tìm vàng và sắt, đến chiều tối muộn trở về thì đã thấy thức ăn của mình được bày biện đẹp đẽ ngay trên bàn ăn. Bởi vì suốt ngày Bạch Tuyết đều phải ở lại trông nhà một mình nên bảy chú lùn không bao giờ quên nhắc nhở cô là:\n" +
                "\n" +
                "– Cô phải canh chừng cái mụ dì ghẻ của mình nhé! Chẳng lâu nữa là mụ sẽ phát hiện ra cô đang ở nơi này. Nhớ là không được cho bất kì ai vào trong nhà nhé!\n" +
                "\n" +
                "Mụ hoàng hậu ở lâu đài vẫn luôn tin rằng mình đã ăn được gan và phổi của Bạch Tuyết nên từ giờ sẽ chỉ có mình mụ là người xinh đẹp nhất trên thế gian này. Mụ lại tới chỗ gương thần, nhìn mình trong gương mụ hỏi:\n" +
                "\n" +
                "– Gương kia ngự ở trên tường,\n" +
                "Thế gian ai đẹp được dường như ta?\n" +
                "\n" +
                "Gương liền trả lời ngay:\n" +
                "\n" +
                "– Muôn tâu hoàng hậu,\n" +
                "Xưa kia bà đẹp nhất trần,\n" +
                "Nhưng nay Bạch Tuyết muôn phần đẹp hơn.\n" +
                "Nàng ở khuất tận núi non,\n" +
                "Trong nhà của bảy chú lùn xa xa.\n" +
                "\n" +
                "Hoàng hậu vô cùng hoảng hốt, bởi vì mụ biết gương thần chưa từng nói dối điều gì. Vì vậy mụ nghĩ ngay tới chuyện gã thợ săn kia đã lừa mụ, để cho Bạch Tuyết sống và chạy thoát. Giờ mụ ta lại phải ngồi mà nghĩ ra kế nào đó để giết bằng được Bạch Tuyết mới thôi, khi nào mà gương chưa nói mụ là người xinh đẹp nhất trần thì cơn ghen tức này sẽ còn khiến cho mụ mất ăn và mất ngủ mãi.\n" +
                "\n" +
                "Sau khi đã suy nghĩ rất nhiều, mụ đột nhiên nghĩ ra được kế rất hay, mụ lấy phấn bôi lên mặt, đem mặc lên người bộ quần áo khác để giả trang thành bà lão bán hàng, dù cho là ai gặp cũng không thể nhận ra đó là hoàng hậu. Với hình dạng mới của mình, mụ lập tức vượt qua bảy ngọn núi cao và tìm tới nhà của bảy chú lùn. Khi đến nơi, mụ nhẹ nhàng gõ lên cánh cửa kia và rao rằng:\n" +
                "\n" +
                "– Hàng đẹp, hàng tốt đây, người nào mua không, ai mua đi!\n" +
                "\n" +
                "Nghe tiếng rao hàng bên ngoài, Bạch Tuyết tò mò nên mở cửa sổ và thò đầu ra bên ngoài, cô hỏi bà cụ:\n" +
                "\n" +
                "– Cháu chào bà ạ! Bà đang bán gì vậy ạ?\n" +
                "\n" +
                "Bà lão liền đáp lời nàng:\n" +
                "\n" +
                "– Bà có hàng đẹp hàng tốt đây, dây lưng có đủ màu luôn nhé!","Truyện cổ tích"));
        storiesWorld.add(new StoryWorld(R.drawable.img_onglao,"Ông lão đánh cá và con cá vàng","Xưa kia, ở một bờ biển rất rộng lớn nọ, có một ông lão làm nghề đánh cá cùng chung sống với người vợ của mình. Hai vợ chồng già sống trong túp lều rách nát, tồi tàn. Mỗi ngày ông lão ấy sẽ đem lưới ra biển thả để bắt cá, còn bà vợ thì lại ở nhà dọn dẹp và kéo sợi.\n" +
                "\n" +
                "Vào một ngày kia, vẫn như thường lệ, ông lão lại vác lưới ra biển thả. Tuy nhiên thì hôm nay vận may lại không tới với ông, lần đầu tiên ông kéo lưới, bên trong chỉ toàn là đất với đất; lần thứ hai kéo lưới lên thì bên trong chỉ duy nhất có một cây rong biển mà thôi; còn lần kéo lưới thứ ba, trong lưới của ông có con cá vàng bị mắc. Khi ông lão gỡ cá vàng ra khỏi lưới thì cá vàng đột nhiên cất tiếng nói, nó van xin:Nghe cá vàng khẩn thiết cầu xin như vậy, ban đầu thì ông lão ngạc nhiên lắm, sau thì lại xúc động vô cùng, bởi vậy nên ông lão liền quyết định sẽ thả cho nó đi. Ông lão thả cá vàng xuống biển và nói:\n" +
                "\n" +
                "– Mong rằng trời đất phù hộ ngươi! Ngươi hãy mau trở về bên mẹ biển cả của mình mà thỏa sức vùng vẫy. Ta đây chẳng đòi hỏi thứ gì của ngươi đâu!\n" +
                "\n" +
                "Và rồi ông lão đành tay không mà trở về nhà. Khi ông lão về tới nhà của mình, ông đem câu chuyện về con cá vàng kể lại cho bà vợ nghe. Khi nghe ông lão lể hết thì bà vợ nổi giận, bà ta mắng ông lão té tát:\n" +
                "\n" +
                "– Cái ông già ngu ngốc này! Đáng lí ra ông phải yêu cầu con cá đó cho mình thứ gì để trả ơn chứ. Ít ra thì ông cũng nên đòi lấy cái máng lợn mới, hãy nhìn xem, cái máng lợn của nhà mình vỡ gần hết rồi kia kìa.\n" +
                "\n" +
                "Nghe bà vợ chửi mắng một hồi, ông lão đành phải lủi thủi đi ra ngoài biển để tìm cá vàng. Ngoài biển tĩnh lặng, những con sóng cứ lăn tăn chạy vào bờ. Ông lão chỉ vừa cất tiếng gọi, cá vàng liền ngoi ngay lên trên mặt biển. Khi nghe ông lão bộc bạch hết mọi chuyện thì cá vàng mới niềm nở mà bảo ông rằng:\n" +
                "\n" +
                "– Ông lão đánh cá ơi, ông đừng lo lắng nhé! Ông hãy về đi, ông sẽ có được cái máng lợn mới ngay thôi!\n" +
                "\n" +
                "Nói xong thì cá vàng cũng lặn sâu xuống biển. Khi ông lão về nhà, ông rất vui mừng vì đã nhìn thấy trước chuồng lợn có cái máng lợn mới tinh. Tuy nhiên, ông lão chẳng vui mừng được lâu thì bà vợ của ông đã quát lớn:\n" +
                "\n" +
                "– Đồ ngu ngốc! Sao lại chỉ đòi có cái máng lợn thế, ông phải đòi lấy một ngôi nhà rộng rãi chứ?\n" +
                "\n" +
                "Nghe vợ kêu gào, ông lão ấy lại phải ngậm ngùi đi ra biển để tìm cá vàng lần nữa. Lúc này biển xanh đã nổi những đợt sóng ào ạt. Chẳng đợi ông lão gọi mình, cá vàng đã nhanh chóng ngoi lên trên mặt nước và cất lời chào. Ông lão lại kể lại toàn bộ việc mụ vợ của ông muốn có được một ngôi nhà mới rộng rãi hơn. Khi nghe xong thì cá vàng bảo ông:\n" +
                "\n" +
                "– Ông lão đánh cá ơi! Trời nhất định phù hộ gia đình của ông, ông cứ về đi, mụ vợ của ông sẽ có ngay ngôi nhà lớn thật đẹp.\n" +
                "\n" +
                "Dứt lời, cá vàng liền hòa mình vào trong nước xanh mà biến mất. Khi ông lão trở về, túp lều cũ nát ngày xưa đã không còn nữa, giờ đây ở chỗ ấy là ngôi nhà to đẹp, còn có lò sưởi nữa. Lúc ấy mụ vợ của ông lão đang ngồi ở bên cửa sổ, khi nhìn thấy ông lão trở về thì mụ ta lại cất cao giọng mà mắng nhiếc đủ điều:\n" +
                "\n" +
                "– Đúng là đồ ngu! Tôi chưa từng thấy người nào mà lại ngu ngốc như ông nữa đấy. Tôi muốn làm nhất phẩm phu nhân, vì thế ông mau trở lại biển và nói cho con cá vàng kia biết.\n" +
                "\n" +
                "Không còn cách nào khác cả, ông lão đánh cá khốn khổ ấy lại phải lóc ca lóc cóc đi ra biển để gọi cá vàng. Hiện giờ thì biển xanh đang nổi sóng vô cùng dữ dội. Khi cá vàng ngoi lên, ông lão nói cho cá biết về mong muốn mà mụ vợ của ông vừa nói. Khi nghe xong, cá vàng lại ân cần mà an ủi ông vài lời:\n" +
                "\n" +
                "– Ông lão cũng không cần lo lắng quá đâu! Ông cứ về đi, chắc chắn trời cao phù hộ ông mà!\n" +
                "\n" +
                "Lúc về tới nhà thì mụ vợ của ông lão đã biến thành một nhất phẩm phu nhân theo đúng ý muốn. Trên người mụ khoác một bộ quần áo rất sang trọng, trên cổ đeo một chuỗi ngọc trai, trên tay thì lấp lánh những chiếc nhẫn vàng, dưới chân mụ là đôi giày bằng nhung đỏ đắt tiền. Ở trong nhà cũng xuất hiện không biết bao nhiêu là người hầu kẻ hạ. Và ông lão cũng cất tiếng mà chào hỏi:\n" +
                "\n" +
                "– Kính chào nhất phẩm phu nhân…\n" +
                "\n" +
                "Nhưng ông chẳng được nói hết câu, mụ vợ của ông lại bắt đầu chửi rủa, mắng nhiếc đủ điều. Sau đó còn bắt ông lão phải đi dọn dẹp chuồng ngựa cho mình. Thời gian trôi đi, ông lão phải sống một cuộc sống vất vả của một người hầu kẻ hạ trong chính ngôi nhà của mình. Rồi một hôm nọ, mụ vợ của ông lão lại cho gọi ông tới. Lúc nhìn thấy ông thì mụ lại giận dữ mà hét lớn:\n" +
                "\n" +
                "– Giờ ta không thích làm nhất phẩm phu nhân. Bây giờ ta muốn được trở thành nữ hoàng của vương quốc này. Ngay lập tức, ngươi hãy ra biển và bảo với con cá kia như vậy.\n" +
                "\n" +
                "Ông lão đánh cá tội nghiệp cũng đành phải quay đầu, bước đi lặng lẽ tiến dần ra biển. Lúc này thì biển xanh đang nổi sóng mịt mù. Đây là lần thứ tư ông lão phải cất tiếng gọi cá vàng. Từ giữa những cơn sóng dữ dội, cá vàng bơi lên trên mặt nước và hỏi:\n" +
                "\n" +
                "– Ông lão đánh cá ơi! Ông có chuyện gì vậy?\n" +
                "\n" +
                "Khi nghe cá hỏi thì ông lão cũng thật thà mà lể lại chuyện mụ vợ của ông đang nổi điên lên ở nhà và muốn được thành nữ hoàng, ông lão còn kể cả chuyện mụ ta tát vào mặt của ông nữa… Cá vàng yên lặng mà lắng nghe câu chuyện của ông lão tội nghiệp, sau đó cũng an ủi lão:\n" +
                "\n" +
                "– Ông lão cũng đừng lo nữa. Tôi nhất định sẽ nói trời phù hộ ông, và mụ vợ của ông chắc chắn sẽ được làm nữ hoàng như đúng ý muốn của bà ta.\n" +
                "\n" +
                "Khi về tới nhà thì ông lão vô cùng sửng sốt vì nhìn thấy ngôi nhà trước đây giờ đã biến thành một cung điện tráng lệ, nguy nga ngoài sức tưởng tượng, còn mụ vợ của ông thì đã trở thành nữ hoàng và đang ngồi tham gia tiệc tùng. Ở xung quanh có không biết bao nhiêu cung nữ, người rót rượu, kẻ dâng bánh… Còn có cả đám vệ binh được trang bị gươm giáo đã tuốt trần, đang đứng chỉnh tề hầu bên cạnh. Nhìn thấy cảnh này khiến ông lão vừa bất ngờ vừa sợ hãi, ông khúm lúm cúi rạp cả người xuống đất để chào hỏi người vợ của mình:\n" +
                "\n" +
                "– Thưa nữ hoàng, giờ thì người hài lòng chưa?\n" +
                "\n" +
                "Nhưng mà mụ vợ chẳng mảy may đếm xỉa tới lời nói ấy của ông lão, mụ ta lập tức hạ lệnh cho đám lính đuổi ông lão ra khỏi cung điện của mình. Toán vệ binh lập tức tuốt gươm giáo ra và xông tới khiến cho ông lão sợ đến mức run cầm cập, mặt mày tái mét… Nhiều người chứng kiến cái cảnh này thì lên tiếng mỉa mai, chế giễu ông lão:\n" +
                "\n" +
                "– Cho đáng đời! Như thế thì mới sáng mắt ra được, lần sau đừng thấy người sang rồi lao đến mà bắt quàng làm họ.\n" +
                "\n" +
                "Chỉ được một thời gian thì mụ vợ của ông lão đánh cá lại nổi giận, mụ ta sai đám lính của mình đi tìm ông lão và đem đến cho mình. Vừa trông thấy ông lão ngoài cửa thì mụ đã la lối om sòm:\n" +
                "\n" +
                "– Lão già ngu ngốc kia, ngươi mau ra biển và tìm con cá kia, hãy nói cho nó biết ta chán làm nữ hoàng rồi. Giờ ta muốn trở thành Long Vương dưới Long Cung, và con cá đó phải hầu hạ, nghe lời của ta!\n" +
                "\n" +
                "Đây là lần thứ năm mà ông lão khốn khổ phải ra biển để tìm cá vàng. Khi ông lão cất giọng gọi cá thì mặt biển đột nhiên nổi lên những cơn sóng dữ ầm ầm, một cơn dông từ đâu ập tới. Nhưng chẳng giống những lần trước, lần này ông lão gọi được một lúc thì cá vàng mới bơi lên trên mặt nước. Ông lão lại thành thật mà kể lại chuyện mụ vợ của ông muốn được làm Long Vương. Lần này thì cá vàng chẳng thèm nói lời nào, nó lẳng lặng mà lặn sâu xuống dưới biển.\n" +
                "\n" +
                "Thấy vậy thì ông lão cũng bất ngờ lắm, nhưng chẳng biết phải làm sao cả, vì vậy cứ tần ngần đứng trên bờ cùng với tiếng sóng đang gào thét. Ông chờ đợi hồi lâu nhưng chẳng thấy gì, vì vậy đành phải quay trở về.\n" +
                "\n" +
                "Nhưng, một điều khiến ông sửng sốt đã xảy ra, cung điện nguy nga tráng lệ đã không còn nữa. Bây giờ ở nơi đó chính là túp lều cũ nát và sập sệ khi xưa, còn mụ vợ của ông lão thì đang ngồi cạnh cái máng lợn vỡ mà rầu rĩ.\n" +
                "\n" +
                "Câu chuyện đã kết thúc, nó muốn nhắn nhủ cho chúng ta biết một điều là: sống trên đời thì không được tham lam và bội bạc. Chúc tất cả các em luôn vui vẻ, mạnh khỏe và chăm ngoan, hãy luôn nghe lời ông bà, cha mẹ và thầy cô nhé!","Truyện cổ tích"));
        storiesWorld.add(new StoryWorld(R.drawable.img_bachuheo,"Ba chú heo con và con sói","Chuyện kể rằng ngày trước có một con heo mẹ sinh ra được ba con heo con. Cả ba con heo này đều hay ăn nên rất nhanh lớn, khi con heo mẹ nhìn thấy đàn con của mình đều đã khôn lớn, trưởng thành cả rồi, thì heo mẹ mới gọi ba con tới và bảo rằng:\n" +
                "\n" +
                "– Các con ạ, giờ ai cũng lớn hết rồi, chẳng còn bé bỏng như lúc xưa nữa. Bây giờ cũng đã đến lúc ta để cho các con ra đi, mỗi đứa phải tự xây được cho mình một căn nhà. Tuy nhiên, các con cần phải hết sức cẩn thận, tránh để chó sói bắt gặp mình, nếu không nó sẽ ăn thịt ngay.– Cả ba anh em ta phải rất cẩn thận, kẻo chó sói bắt ăn thịt đấy!\n" +
                "\n" +
                "Ba con heo con đi được một quãng thì gặp ngay một bác nông dân, bác đang vác một bó rơm rất to trên người. Cả ba liền đứng lại, lễ phép mà chào hỏi bác nông dân ấy. Con heo cả bảo với bác rằng:\n" +
                "\n" +
                "– Bác nông dân ơi, bác có thể cho chúng cháu bó rơm của bác được không? Cháu muốn tự mình làm một ngôi nhà rơm.\n" +
                "\n" +
                "Thấy heo nói, bác nông dân cũng mỉm cười vui vẻ mà nói:\n" +
                "\n" +
                "– Cháu định xây nhà bằng rơm thật à cậu bé, vậy được, ta sẽ cho cháu hết chỗ rơm này đấy.\n" +
                "\n" +
                "Con heo cả vô cùng vui mừng nhận lấy bó rơm to mà bác nông dân đã cho nó. Nó liền đem chỗ rơm ấy mà dựng thành một ngôi nhà rơm. Khi đã dựng nhà xong xuôi rồi nó mới nói:\n" +
                "\n" +
                "– Từ bây giờ trở đi ta đã có được ngôi nhà rơm để sinh sống, và chó sói sẽ chẳng bao giờ mà bắt được ta cả, ta sẽ không lo bị nó ăn thịt nữa.\n" +
                "\n" +
                "Con heo thứ hai lại nói:\n" +
                "\n" +
                "– Em cũng sẽ tự mình đi xây một ngôi nhà còn chắc chắn hơn cả ngôi nhà rơm này của anh.\n" +
                "\n" +
                "Và con heo út cũng bảo:\n" +
                "\n" +
                "– Em cũng thế, ngôi nhà rơm của anh nhìn rất mong manh đấy, không thể nào mà chống được gió to mưa lớn đâu, em sẽ tự mình xây một ngôi nhà thật chắc chắn mới được.\n" +
                "\n" +
                "Nói đoạn con heo thứ hai cùng với con heo út lại tiếp tục cuộc hành trình của mình, còn con heo cả lại quyết định ở lại ngôi nhà rơm mình vừa mới làm được kia. Khi đi được một quãng xa nữa thì cả hai con heo lại gặp được bác tiều phu, bác đang vác ở trên vai bó củi với những cành cây rất lớn. Con heo thứ hai lập tức tới và nói với bác tiều phu rằng:\n" +
                "\n" +
                "– Bác tiều phu ơi, bác có thể cho cháu chỗ bó cây của bác được không? Cháu muốn dùng những cành cây này để làm một ngôi nhà cho mình.\n" +
                "\n" +
                "Nghe heo hỏi thì bác tiều phu cũng vui vẻ mà bảo:\n" +
                "\n" +
                "– Tất nhiên là được rồi cậu bé, bác sẽ cho cháu tất cả chỗ cành cây này của bác, cháu hãy thử dùng chúng dựng một ngôi nhà cho mình nhé.\n" +
                "\n" +
                "Sau khi nhận được cả bó cành cây từ chỗ bác tiều phu, con heo thứ hai lập tức dựng hành một ngôi nhà cành cây cho mình. Sau khi đã hoàn thành, nó liền nói:\n" +
                "\n" +
                "– Ngôi nhà cành cây nhìn chắc chắn hơn hẳn ngôi nhà rơm của anh cả rồi. Và giờ thì mình cũng không phải lo lắng chó sói có thể ăn thịt mình nữa.\n" +
                "\n" +
                "Nhưng con heo út vẫn nói rằng:\n" +
                "\n" +
                "– Em sẽ đi và dựng cho mình ngôi nhà còn vững trãi hơn là ngôi nhà cành cây này của anh.\n" +
                "\n" +
                "Bởi vì con heo thứ hai đã rất hài lòng với ngôi nhà cành cây mà nó vừa làm xong, vì vậy nó quyết định ở lại đó. Bây giờ cuộc hành trình cũng chỉ còn mình con heo út tiếp bước mà thôi. Nó đi thêm được một quãng đường nữa thì bắt gặp bác thợ xây, bác đang kéo một chiếc xe với những viên gạch màu đỏ. Heo con liền chào bác thợ xây rồi hỏi:\n" +
                "\n" +
                "– Bác thợ xây ơi, bác có thể cho cháu chỗ gạch này của bác được không? Cháu muốn tự xây một ngôi nhà cho mình bằng những viên gạch đỏ ấy.\n" +
                "\n" +
                "Nghe heo nói, bác thợ xây cũng vui lòng mà bảo:\n" +
                "\n" +
                "– Đương nhiên là được rồi cậu bé, cháu có thể lấy bao nhiêu gạch cháu muốn.\n" +
                "\n" +
                "Khi đã có đủ số gạch cần thiết để xây nhà, con heo út phải mất rất nhiều thời gian thì mới có thể hoàn thành ngôi nhà của chính mình. Nhưng những thứ đó chả hề gì cả, bởi vì nó đã có được thành quả rất đáng giá, một ngôi nhà vững trãi và rất chắc chắn. Nhìn ngôi nhà của mình, nó tự nhẩm:\n" +
                "\n" +
                "– Ngôi nhà của mình thật tốt, như vậy thì chó sói không thể nào có thể ăn thịt mình được.\n" +
                "\n" +
                "Vào một ngày nọ, một con chó sói từ đâu xuất hiện. Đầu tiên nó đi tới ngôi nhà rơm của con heo cả mất công dựng lên. Khi con heo cả trông thấy chó sói thì nó vội vàng chạy vào trong nhà và đóng kín cửa lại. Chó sói trông thấy thì cười bảo:\n" +
                "\n" +
                "– Con heo ngu ngốc kia. Mày nghĩ trốn vào trong cái ngôi nhà yếu ớt này thì có thể ngăn cản việc ta bắt mày ăn thịt hả?\n" +
                "\n" +
                "Nói đoạn, chó sói liền gầm gừ và thổi thật mạnh một cái, ngôi nhà rơm yếu ớt lập tức đổ sập xuống. Và con heo cả bị chó sói dễ dàng ăn thịt.\n" +
                "\n" +
                "Ngày hôm sau chó sói dọc theo con đường hôm qua đi tiếp. Chó sói gặp một ngôi nhà xây lên từ những cành cây khô, ngôi nhà này là của con heo thứ hai. Khi con heo thứ hai trông thấy chó sói tới thì vô cùng sợ hãi, nó chạy nhanh vào trong nhà và cài then cửa thật chặt. Nhưng chó sói cũng lại cười mà bảo:\n" +
                "\n" +
                "– Lại thêm một con heo ngu ngốc nữa, với ngôi nhà cành cây của mày ấy mà, tao chỉ cần nhẹ thổi một phát là nó bay ngay, mày nghĩ là mày thoát được tao hay sao.\n" +
                "\n" +
                "Nói đoạn chó sói lại hít thật sâu rồi ra sức mà thổi mạnh, ngôi nhà cành cây cũng không thể nào chống đỡ được liền đổ sụp ngay, và con heo thứ hai cũng bị chó sói dễ dàng mà ăn thịt được.\n" +
                "\n" +
                "Chó sói vẫn tiếp tục đi trên con đường cũ, ngày hôm sau nó gặp được ngôi nhà xây bằng gạch đỏ của con heo út. Khi con heo út trông thấy chó sói tới thì một mạch chạy thẳng vào trong nhà, rồi đem cửa chốt kín lại. Chó sói lại tới mở miệng đe dọa:\n" +
                "\n" +
                "– Con heo kia, mày làm sao mà thoát được chứ, hai ngày trước tao đã đem hai ngôi nhà của mấy con heo như mày thổi bay và ăn thịt hết rồi. Bây giờ tao sẽ cho ngôi nhà của mày bay nốt.\n" +
                "\n" +
                "Dứt lời thì chó sói lại lấy hơi rồi thổi mạnh y như hai lần trước nó làm vậy. Tuy nhiên thì ngôi nhà này được xây bằng gạch nên vô cùng chắc chắn, dù cho chó sói có cố gắng thổi bao nhiêu thì ngôi nhà vẫn chẳng hề suy suyển chút nào, chứ nói gì đến đổ sập.\n" +
                "\n" +
                "Chó sói thầm nghĩ: “Con heo này có vẻ thông minh hơn, nếu mà muốn ăn thịt được nó thì ta chắc phải bày mưu dùng phương pháp nào mềm mỏng mới được”. Chó sói liền bảo với con heo út:\n" +
                "\n" +
                "– Này heo con ơi, sáng mai sáu giờ thì ta với chú cùng nhau tới chỗ trang trại nhà ông Smith nhé, ở nơi đó chúng ta sẽ có được những củ cải ngon và tươi nhất để nấu thành một bữa tối tuyệt vời đấy.\n" +
                "\n" +
                "– Oh! Nếu vậy thì rất tốt, tôi thích củ cải lắm!\n" +
                "\n" +
                "Con heo út cũng đáp lại lời của chó sói. Nhưng bằng trí thông minh thì heo con cũng thừa hiểu chó sói nói như vậy chính là để gạt mình, sau đó sẽ tóm mình rồi ăn thịt. Vì thế, buổi sáng ngày hôm sau, đúng năm giờ sáng thì heo con đã một mình chạy tới chỗ trang trại của nhà ông Smith, heo con lấy được cho mình khá nhiều củ cải tươi ngon, sau đó lại trở về nhà mình trước khi đồng hồ điểm sáu giờ sáng.\n" +
                "\n" +
                "Như lời nói của mình hôm trước, khi sáu giờ tới, chó sói liền đi sang và gõ cửa nhà heo con. Khi nghe thấy có tiếng gõ cửa, heo con biết là chó sói đã tới, nó liền bảo:\n" +
                "\n" +
                "– Tôi đã tới chỗ trang trại của nhà ông Smith rồi, và tôi cũng đã mang về cho mình một giỏ củ cải tươi ngon dùng làm bữa tối.\n" +
                "\n" +
                "Khi nghe heo con nói vậy thì chó sói bực lắm, tuy nhiên nó vẫn cố tỏ ra mềm mỏng mà bảo:\n" +
                "\n" +
                "– Nếu vậy thì sáng ngày mai hai chúng ta sẽ cùng tới chỗ vườn táo của ông Brown nhé. Hai ta có thể xin được những quả táo đỏ tươi ở đó.\n" +
                "\n" +
                "– Vậy à! Thật tốt quá, tôi thích táo lắm.\n" +
                "\n" +
                "Lần này con heo con cũng vui mừng hùa theo lời dụ dỗ của chó sói. Nhưng sáng ngày hôm sau, nó lại dậy sớm hơn cả hôm trước, bốn giờ sáng nó đã đem theo giỏ tới chỗ vườn táo của ông Brown. Nhưng khi nó đang bận bịu trèo lên những cành cao để hái táo thì từ đâu chó sói bất thình lình mà xuất hiện ở ngay bên dưới.","Truyện cổ tích"));

        storiesWorld.add(new StoryWorld(R.drawable.img_lolem,"Cô bé lọ lem","Ngày xửa ngày xưa ở vùng nọ có người đàn ông rất giàu có, nhưng vợ của ông ta lại đang bị ốm rất nặng. Khi mà bà cảm thấy như mình chuẩn bị gần đất mà xa trời rồi thì bà liền gọi cô con gái độc nhất vô nhị của mình tới ngay bên cạnh giường mình đang nằm, rồi bà dặn dò con gái rằng:\n" +
                "\n" +
                "– Đứa con gái yêu dấu của mẹ, khi mẹ đi rồi thì con phải cố gắng chăm chỉ và nết na nhé, còn mẹ thì vẫn sẽ mãi mãi ở bên cạnh con và phù hộ con.Vừa nói xong lời trăn trối thì bà liền nhắm mắt mà qua đời. Sau khi mẹ mất thì ngày nào cô bé cũng tới ngay bên cạnh mộ của mẹ mình mà khóc thương. Cô bé vâng lời mẹ nên ngày ngày đều rất chăm chỉ và nết na khiến cho tất cả mọi người đều cảm thấy yêu mến cô bé.\n" +
                "\n" +
                "Rồi khi mùa đông đã tới, khi tuyết đã phủ đầy một lớp dày ngay trên mộ của người mẹ, nhìn nó hệt như là một tấm khăn màu trắng xinh đẹp vậy. Rồi khi những ánh nắng mặt trời của mùa xuân tới và cuốn mất chiếc khăn trắng tinh ấy đi thì người cha quyết định cưới vợ hai.\n" +
                "\n" +
                "Không chỉ đem vợ hai về nhà, mà người dì ghẻ này còn đem theo cả hai cô con gái riêng nữa. Cả hai đứa con gái riêng này mặt mày tuy rằng cũng sáng sủa và kháu khỉnh đấy, nhưng trong bụng lại rất xấu xa và đen tối. Cũng từ ngày đó trở đi thì cô bé kia phải sống một cuộc đời vô cùng khốn khổ. Mụ dì ghẻ hùa cùng với hai đứa con gái riêng của mình bảo nhau:\n" +
                "\n" +
                "– Chúng ta không thể nào cứ để cho cái con ngan vô cùng ngu ngốc ấy ngồi lỳ ở trong nhà được! Nếu nó muốn có bánh mà ăn thì phải tự đi kiếm lấy. Ra đây ngay lập tức, con làm bếp!\n" +
                "\n" +
                "Khi cô bé ra ngoài, chúng đem lột sạch tất cả những quần áo đẹp đẽ đang mặc trên người cô ra, sau đó ném cho cô chiếc áo choàng màu xám vô cùng cũ kĩ và xấu xí, sau đó lại ném tiếp cho cô đôi guốc mộc nữa. Rồi thì chúng vui vẻ cười nói:\n" +
                "\n" +
                "– Hãy nhìn xem cô công chúa đài các của chúng ta đã thay đổi hình dạng của mình như thế nào kìa!\n" +
                "\n" +
                "Và ba mẹ con họ cứ thế reo lên mà nhạo báng đủ điều, sau đó mới đẩy cô xuống nhà bếp. Họ bắt cô từ buổi sáng tới tận tối làm lụng vô cùng vất vả, từ tờ mờ sáng thì cô đã phải dậy, rồi lại đi gánh nước, về lại nhóm bếp, sau đó thì thổi cơm và giặt giũ. Nhưng như vậy vẫn còn chưa đủ, hai đứa con gái của dì ghẻ nghĩ ra rất nhiều cách khác để mà hành hạ cô, khi đã hành hạ cô chán chê thì chúng lại hả hê chế giễu, chúng còn đem đậu Hà Lan trộn lẫn cùng đậu biển đổ xuống tro rồi bắt cô nhặt riêng từng loại ra.\n" +
                "\n" +
                "Khi tối đến, sau cả một ngày phải làm lụng vô cùng vất vả, cơ thể cô đã mệt lử cả đi, nhưng ba mẹ con dì ghẻ cũng chẳng cho cô được ngủ trên chiếc giường tử tế, chúng bắt cô ngủ ở trên đống tro tàn ngay cạnh bếp. Bởi vì lúc nào cũng ở gần tro bụi trong bếp nên nhìn cô càng ngày càng lem luốc, nên hai đứa con gái của dì ghẻ liền đặt tên cho cô là “Lọ Lem”.\n" +
                "\n" +
                "Có một lần người cha chuẩn bị chợ phiên, ông ta hỏi hai đứa con của dì ghẻ xem chúng muốn được mua món quà như thế nào. Đứa con gái thứ nhất thì nói:\n" +
                "\n" +
                "– Con muốn có quần áo đẹp.\n" +
                "\n" +
                "Còn đứa thứ hai lại nói rằng:\n" +
                "\n" +
                "– Con muốn có ngọc với đá quý nữa.\n" +
                "\n" +
                "Người cha lại quay ra hỏi:\n" +
                "\n" +
                "– Còn Lọ Lem, con thì muốn thứ gì?\n" +
                "\n" +
                "– Thưa cha, lúc trên đường trở về nhà, có cành cây nào vướng vào mũ của cha thì xin cha bẻ cành cây đó về cho con.\n" +
                "\n" +
                "Đi chợ phiên trở về, người cha không quên mua quần áo đẹp cùng ngọc trai, đá quý về cho hai đứa con gái của dì ghẻ. Lúc đi trên đường, ông cưỡi ngựa ngang qua bụi cây, một cành dẻ vô tình vướng vào người khiến chiếc mũ ông đang đội rơi luôn xuống đường. Nhớ đến Lọ Lem, ông liền bẻ luôn cành dẻ ấy mang về nhà.\n" +
                "\n" +
                "Khi về đến nhà, người cha đem quà đã mua chia cho hai đứa con gái của dì ghẻ đồ chúng đã xin, ông cũng đưa cành dẻ kia cho Lọ Lem. Lọ Lem liền cám ơn cha mình, sau đó mang theo cành dẻ kia đến bên mộ của mẹ mình rồi trồng ngay bên cạnh mộ, sau đó cô ngồi đó khóc lóc vô cùng thảm thiết, hai hàng nước mắt cứ chảy xuống không ngừng, tưới ướt cả cành cây dẻ mới trồng. Đột nhiên cành dẻ nảy dễ rồi đâm chồi, sau đó một thời gian ngắn thì từ cành cây nhỏ đã trở thành cây dẻ cao lớn, tán lá xòe to.\n" +
                "\n" +
                "Hằng ngày Lọ Lem đều chăm chỉ ra mộ của mẹ viếng ba lần, xong cô lại ngồi đó mà khóc lóc khấn mẹ, mỗi lần cô như vậy thì đều có một con chim màu trắng bay tới rồi đậu ở trên cành cây dẻ. Hễ thấy Lọ Lem nói ra điều mong ước muốn thứ gì thì chim lập tức đem thả thứ ấy cho cô.\n" +
                "\n" +
                "Ngày kia, nhà vua cho mở hội tận ba ngày, ngài cho mời hết tất cả những hoa khôi ở trong nước tới tham dự hội để cho hoàng tử con trai mình kén vợ. Khi hai đứa con gái của dì ghẻ nghe tin mình cũng có thiệp mời tới tham dự thì vô cùng vui mừng, chúng liền cho gọi Lọ Lem tới và bảo cô:\n" +
                "\n" +
                "– Mày mau mau chải đầu rồi đi đánh lại giày cho bọn tao, nhớ buộc dây giày cho thật chặt, bọn tao còn phải đi tới dự hội trong cung vua đấy.\n" +
                "\n" +
                "Lọ Lem ngoan ngoãn làm theo những gì chúng sai khiến, sau đó lại ngồi ôm mặt khóc một mình, bởi vì cô cũng rất muốn được đi nhảy tại hội ấy. Cô liền xin mụ dì ghẻ cho mình được đi cùng. Nhưng dì ghẻ lại nói:\n" +
                "\n" +
                "– Cái đồ Lọ Lem mày, người thì toàn bụi bẩn mà lại dám đòi được đi dự hội à! Quần áo, giày mày còn không có mà còn đòi được đi nhảy cơ!\n" +
                "\n" +
                "Lọ Lem vẫn khẩn khoản cầu xin dì ghẻ cho phép mình đi. Cuối cùng dì ghẻ mới nói là:\n" +
                "\n" +
                "– Tao vừa mới đổ một đấu đậu biển vào trong đám tro, nếu như mày có thể nhặt hết số đậu ấy trong vòng hai giờ đồng hồ thì tao sẽ cho mày được đi hội.\n" +
                "\n" +
                "Lọ Lem vâng lời, cô lập tức chạy hướng cửa sau và ra vườn, cô gọi to:\n" +
                "\n" +
                "– Hỡi những chú chim câu hiền lành, những chim gáy cùng tất cả những chú chim khác trên trời, các bạn hãy bay về đây nhặt đậu giúp em với:\n" +
                "Đậu ngon chim bỏ vào niêu,\n" +
                "Còn là đậu xấu chim bỏ vào diều chim nhé.\n" +
                "\n" +
                "Cô vừa dứt tiếng gọi thì có hai con chim bồ câu màu trắng lập tức bay qua ô cửa sổ bếp và sà xuống đám tro nhặt đậu, tiếp theo còn có chim gáy, sau đó thì tất cả những loài chim đang bay trên trời đều đua nhau sà xuống nơi tro bếp.","Truyện cổ tích"));
    }

    public List<StoryVietName> getStoriesVietNam() {
        return storiesVietNam;
    }

    public void setStoriesVietNam(List<StoryVietName> storiesVietNam) {
        this.storiesVietNam = storiesVietNam;
    }

    public List<StoryWorld> getStoriesWorld() {
        return storiesWorld;
    }

    public void setStoriesWorld(List<StoryWorld> storiesWorld) {
        this.storiesVietNam = storiesVietNam;
    }
}
