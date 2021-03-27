package io.giodude.one888.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import io.giodude.one888.R;

public class HomeOneView extends Fragment {
CardView c1,c2,c3,c4;
TextView t1,d1,desc;
    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance) {
        view = inflater.inflate(R.layout.activity_home_one_view, container, false);
        c1 = view.findViewById(R.id.card1);
        c2 = view.findViewById(R.id.card2);
        c3 = view.findViewById(R.id.card3);
        c4 = view.findViewById(R.id.card4);
        desc = view.findViewById(R.id.clickdesc);

        desc.setOnClickListener(v -> {
            final Dialog myDialog;
            myDialog = new Dialog(getContext());
            myDialog.setContentView(R.layout.clickdetails);
            myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            t1 = myDialog.findViewById(R.id.title);
            d1 = myDialog.findViewById(R.id.desc);
            t1.setText("Tổng quan về nhà cái One88");
            d1.setText("One88 là nhà cái chuyên về lĩnh vực cá cược thể thao với hàng ngàn trò chơi giải trí đầy sức hấp dẫn, thu hút người chơi trên thị trường cá cược trực tuyến. Với phương châm Uy tín là số 1 thì One88 được mệnh danh là Trùm nhà cái hiện nay. Cùng tìm hiểu những thông tin tổng quan về nhà cái One88 để nắm rõ hơn nhé." +
                    "\n\n" +
                    "Đây là nhà cái cá cược đẳng cấp đến từ châu Âu với không gian cá cược đầy hấp dẫn, sôi động cùng hàng ngàn sản phẩm đến từ Casino, Trò chơi số, Thể thao…\n" +
                    "\n\n" +
                    "Thông tin, danh tính của người chơi được bảo mật tuyệt đối, đảm bảo độ an toàn, tin cậy cực cao\n" +
                    "\n\n" +
                    "Trong quá trình tham gia cá cược thì sự minh bạch, rõ ràng cũng luôn được nhà cái đặt lên hàng đầu, tạo sự yên tâm cao nhất cho người chơi\n" +
                    "\n\n" +
                    "Hệ thống nhà cái có đội ngũ nhân viên vô cùng chuyên nghiệp, kỹ năng chuyên môn tốt, hỗ trợ khách hàng nhanh chóng khi có yêu cầu.");
            myDialog.show();
        });

        c1.setOnClickListener(v -> {
            final Dialog myDialog;
            myDialog = new Dialog(getContext());
            myDialog.setContentView(R.layout.clickdetails);
            myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            t1 = myDialog.findViewById(R.id.title);
            d1 = myDialog.findViewById(R.id.desc);
            t1.setText("Uy tín, chất lượng");
            d1.setText("Được cấp phép hoạt động bởi Chính phủ Isle of Man – Ủy ban Giám sát Cờ bạc Isle of Man có tiêu chuẩn cao và được biết đến là một hệ thống quản lý vô cùng chặt chẽ\n" +
                    "\n\n" +
                    "Với mục tiêu xây dựng nên một ngành công nghiệp cá cược chất lượng, hợp pháp nên One88 luôn đề cao tính công bằng và đảm bảo tốt nhất lợi ích của người chơi.\n" +
                    "\n\n" +
                    "Chất lượng trong từng sản phẩm cá cược trực tuyến đã khẳng định rõ vị thế của một nhà cái có độ uy tín, đẳng cấp số 1. Ngoài sự phong phú về số lượng thì minh bạch trong khi chơi cũng đã tạo nên sự yên tâm cao độ nhất.\n" +
                    "Là điểm đến cá cược thể thao hàng đầu\n" +
                    "\n\n" +
                    "Lĩnh vực hàng đầu của One88 đó chính là sản phẩm cá cược thể thao. Thị trường cá cược luôn đầy hấp dẫn và sôi động nhằm tạo sự lựa chọn tốt nhất cũng như sự trải nghiệm tuyệt vời nhất.\n" +
                    "\n\n" +
                    "Người chơi cược cũng thỏa sức đam mê với kho trò chơi đa dạng, hấp dẫn như: bóng đá, bóng chuyền, bóng rổ, bóng bầu dục, tennis, cầu long, quyền anh… và hàng ngàn trò chơi khác nhau đều có trên nhà cái.");
            myDialog.show();
        });

        c2.setOnClickListener(v -> {
            final Dialog myDialog;
            myDialog = new Dialog(getContext());
            myDialog.setContentView(R.layout.clickdetails);
            myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            t1 = myDialog.findViewById(R.id.title);
            d1 = myDialog.findViewById(R.id.desc);
            t1.setText("Tỷ lệ cược cạnh tranh");
            d1.setText("Với nỗ lực mang đến cho người chơi một không gian chơi cược đầy đẳng cấp, uy tín, chất lượng và công bằng nhất, hệ thống nhà cái luôn nỗ lực cập nhật số liệu chính xác với tỷ lệ kèo tốt nhất.\n" +
                    "\n\n" +
                    "Tỷ lệ kèo của One88 vô cùng đa dạng, cập nhật nhanh chóng từng giây, từng phút. Ngoài các tỷ lệ kèo phổ biến như châu Á, châu Âu, Tài Xỉu, phạt góc, chẵn lẻ… thì ở các trận đấu sẽ có nhiều loại kèo khác nhau để bạn lựa chọn ở từng giải đấu và trận đấu khác nhau.\n" +
                    "\n\n" +
                    "Đội ngũ nhân viên làm việc hết mình sẽ tiến hành tổng hợp, phân tích nên tỷ lệ kèo luôn bám sát thực tế để tạo cơ hội chiến thắng cao nhất cho người chơi\n" +
                    "Kho trò chơi đa dạng, đẳng cấp\n" +
                    "\n\n" +
                    "Đối với nhà cái One88 thì bạn sẽ được hòa mình và đắm chìm vào thế giới giải trí trực tuyến đẳng cấp nhất hiện nay với hơn 100 trò chơi hấp dẫn. Từ cá cược bóng đá cho đến thể thao ảo, keno, casino, numbergame…\n" +
                    "\n\n" +
                    "One88 tự hào là nhà cái đi đầu trong việc ứng dụng công nghệ, kỹ thuật tiên tiến nhất để mang đến người chơi trải nghiệm đẳng cấp, tuyệt vời nhất khi chơi cược trực tuyến trên trang.");
            myDialog.show();
        });

        c3.setOnClickListener(v -> {
            final Dialog myDialog;
            myDialog = new Dialog(getContext());
            myDialog.setContentView(R.layout.clickdetails);
            myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            t1 = myDialog.findViewById(R.id.title);
            d1 = myDialog.findViewById(R.id.desc);
            t1.setText("Độ an toàn, bảo mật");
            d1.setText("Dưới sự giám sát của Ủy ban Isle of Man – luôn đề cao tính bảo mật cũng như đảm bảo các tiêu chuẩn chung nên người chơi yên tâm khi chơi cược tại One88\n" +
                    "\n\n" +
                    "Độ an toàn, bảo mật của người chơi luôn được đặt lên hàng đầu và hệ thống an ninh mạng áp dụng công nghệ hiện đại nhất cùng với việc giám sát và kiểm tra liên tục nên không gian cá cược sẽ đảm bảo tính công bằng, minh bạch và an toàn cao.");
            myDialog.show();
        });

        c4.setOnClickListener(v -> {
            final Dialog myDialog;
            myDialog = new Dialog(getContext());
            myDialog.setContentView(R.layout.clickdetails);
            myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            t1 = myDialog.findViewById(R.id.title);
            d1 = myDialog.findViewById(R.id.desc);
            t1.setText("Chất lượng dịch vụ");
            d1.setText("Đội ngũ nhân viên chăm sóc khách hàng, tận tình và vô cùng chuyên nghiệp nên mọi thắc mắc của khách hàng đều được giải đáp nhanh chóng.\n" +
                    "\n\n" +
                    "Với phương châm phục vụ “Khách hàng là thượng đế” thì chúng tôi hy vọng người chơi sẽ có những phút giây giải trí thật vui vẻ và thoải mái nhất khi đến với One88");
            myDialog.show();
        });
        return view;
    }
}