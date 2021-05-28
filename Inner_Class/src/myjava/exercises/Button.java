package myjava.exercises;

public class Button {

    private String title;
    private OnClickListener onClickLister;

    public Button(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setOnClickLister(OnClickListener onClickListener)
    {
        this.onClickLister = onClickListener;
    }

    public void onClick()
    {
        this.onClickLister.onClick(this.title);

    }

    public interface OnClickListener
    {

        void onClick(String title);
    }
}
