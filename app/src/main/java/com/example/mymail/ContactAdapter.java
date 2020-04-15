package com.example.mymail;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ContactAdapter extends BaseAdapter {

    List<ContactModel> contacts;

    public ContactAdapter(List<ContactModel> contact) {
        this.contacts = contact;
    }

    @Override
    public int getCount() {
        return contacts.size();
    }

    @Override
    public Object getItem(int i) {
        return contacts.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {
        viewHolder viewHolder;

        if (view == null){
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_item1,viewGroup, false);
            viewHolder = new viewHolder();
            viewHolder.textFullname = view.findViewById(R.id.text1);
            viewHolder.textBG = view.findViewById(R.id.round_bg);
            viewHolder.imgAva = view.findViewById(R.id.img_ava1);
            viewHolder.imgCheck = view.findViewById(R.id.imgchk);
            view.setTag(viewHolder);
        } else
            viewHolder = (viewHolder) view.getTag();


        final ContactModel contact = contacts.get(i);
        viewHolder.imgAva.setImageResource(contact.getAvaResource());
        viewHolder.textFullname.setText(contact.getFullname());
        viewHolder.textBG.setText(contact.getFullname().substring(0, 1));

        //

        if (contact.isSelected){
            viewHolder.imgCheck.setImageResource(R.drawable.ic_star_selected);
        } else
            viewHolder.imgCheck.setImageResource(R.drawable.ic_star_selected);

        viewHolder.imgCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isSelected = contacts.get(i).isSelected;
                contacts.get(i).setSelected(!isSelected);
                notifyDataSetChanged();
            }
        });

        return view;
    }

    class viewHolder{
        ImageView imgAva;
        TextView textFullname;
        TextView textBG;
        ImageView imgCheck;

    }
}
