package home.antonyaskiv.testprojecttumblr.Adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import java.util.ArrayList;
import java.util.List;

import home.antonyaskiv.testprojecttumblr.Model.Config;
import home.antonyaskiv.testprojecttumblr.Model.Photo;
import home.antonyaskiv.testprojecttumblr.Model.Post;
import home.antonyaskiv.testprojecttumblr.Model.Type;
import home.antonyaskiv.testprojecttumblr.R;

/**
 * Created by AntonYaskiv on 09.01.2018.
 */

public class AdapterForRecyclerView  extends RecyclerView.Adapter{

    private List<Post> dataSet;
    Context context;
    int total_types;

    public AdapterForRecyclerView(List<Post> dataSet, Context context) {
        this.dataSet = dataSet;
        this.context = context;
        total_types = dataSet.size();
    }

    public static class TextTypeViewHolder extends RecyclerView.ViewHolder {

        TextView txtType;
        TextView type;

        public TextTypeViewHolder(View itemView) {
            super(itemView);

            this.txtType =  itemView.findViewById(R.id.text_type_id);
            this.type=itemView.findViewById(R.id.type);

        }
    }
    public static class AudioTypeViewHolder extends RecyclerView.ViewHolder {

        TextView audioview;
        TextView type;
        CardView cardView;

        public AudioTypeViewHolder(View itemView) {
            super(itemView);

            this.audioview =  itemView.findViewById(R.id.audio_type_id);
            this.type=itemView.findViewById(R.id.type);
            this.cardView=itemView.findViewById(R.id.cardView_audio);

        }
    }
    public static class ChatTypeViewHolder extends RecyclerView.ViewHolder {

        TextView chatview;
        TextView type;

        public ChatTypeViewHolder(View itemView) {
            super(itemView);

            this.chatview =  itemView.findViewById(R.id.chat_type_id);
            this.type=itemView.findViewById(R.id.type);
        }
    }
    public static class LinkTypeViewHolder extends RecyclerView.ViewHolder {

        TextView linkview;
        TextView type;
        CardView cardView;

        public LinkTypeViewHolder(View itemView) {
            super(itemView);

            this.linkview =  itemView.findViewById(R.id.link_type_id);
            this.type=itemView.findViewById(R.id.type);
            this.cardView=itemView.findViewById(R.id.cardView_link);
        }
    }
    public static class PhotoTypeViewHolder extends RecyclerView.ViewHolder {

        SimpleDraweeView photoview;
        TextView type;

        public PhotoTypeViewHolder(View itemView) {
            super(itemView);

            this.photoview = (SimpleDraweeView ) itemView.findViewById(R.id.photo_type_id);
            this.type=itemView.findViewById(R.id.type);
        }
    }
    public static class QuoteTypeViewHolder extends RecyclerView.ViewHolder {

        TextView quoteview;
        TextView type;

        public QuoteTypeViewHolder(View itemView) {
            super(itemView);

            this.quoteview =  itemView.findViewById(R.id.quote_type_id);
            this.type=itemView.findViewById(R.id.type);
        }
    }
    public static class VideoTypeViewHolder extends RecyclerView.ViewHolder {

        YouTubePlayerView videoView;
        TextView type;

        public VideoTypeViewHolder(View itemView) {
            super(itemView);

            this.videoView =  itemView.findViewById(R.id.video_type_id);
            this.type=itemView.findViewById(R.id.type);
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        switch (viewType) {
            case Type.text:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.text_type, parent, false);
                return new TextTypeViewHolder(view);
            case Type.audio:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.audio_type, parent, false);
                return new AudioTypeViewHolder(view);
            case Type.chat:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.chat_type, parent, false);
                return new ChatTypeViewHolder(view);
            case Type.link:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.link_type, parent, false);
                return new LinkTypeViewHolder(view);
            case Type.photo:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.photo_type, parent, false);
                return new PhotoTypeViewHolder(view);
            case Type.video:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.video_type, parent, false);
                return new VideoTypeViewHolder(view);
            case Type.quote:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.quote_type, parent, false);
                return new QuoteTypeViewHolder(view);
        }
        return null;
    }

    @Override
    public int getItemViewType(int position) {
        switch (dataSet.get(position).getType()) {
            case "text":
                return Type.text;
            case "audio":
                return Type.audio;
            case "video":
                return Type.video;
            case "quote":
                return Type.quote;
            case "photo":
                return Type.photo;
            case "link":
                return Type.link;
            case "chat":
                return Type.chat;
            default:
                return -1;
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        final Post object = dataSet.get(position);
        if(object!=null)
        {
            switch (object.getType())
            {
                case "text":
                    ((TextTypeViewHolder) holder).txtType.setText(object.getBody());
                    ((TextTypeViewHolder) holder).type.setText(object.getType());
                    break;
                case "audio":
                    ((AudioTypeViewHolder) holder).type.setText(object.getType());
                    ((AudioTypeViewHolder) holder).audioview.setText(object.getSummary());
                    ((AudioTypeViewHolder) holder).cardView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            Intent i = new Intent(Intent.ACTION_VIEW);
                            i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            i.setData(Uri.parse(object.getAudioSourceUrl()));
                            context.startActivity(i);
                        }
                    });
                    break;
                case "video":
                    ((VideoTypeViewHolder) holder).videoView.initialize(Config.DEVELOPER_KEY, new YouTubePlayer.OnInitializedListener() {
                        @Override
                        public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                            if (!b) {
                                youTubePlayer.loadVideo(object.getVideo().getYoutube().getVideoId());
                                youTubePlayer.pause();
                                youTubePlayer.setPlayerStyle(YouTubePlayer.PlayerStyle.MINIMAL);
                            }
                        }

                        @Override
                        public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                            if (youTubeInitializationResult.isUserRecoverableError()) {

                            } else {
                                String errorMessage = youTubeInitializationResult.toString();
                                Toast.makeText(context, errorMessage, Toast.LENGTH_LONG).show();
                            }
                        }
                    });
                    ((VideoTypeViewHolder) holder).type.setText(object.getType());
                    break;
                case "quote":
                    ((QuoteTypeViewHolder) holder).quoteview.setText(object.getSummary());
                    ((QuoteTypeViewHolder) holder).type.setText(object.getType());
                    break;
                case "photo":
                    ((PhotoTypeViewHolder) holder).photoview.setImageURI(Uri.parse(object.getPhotos().get(0).getOriginalSize().getUrl()));
                    ((PhotoTypeViewHolder) holder).type.setText(object.getType());
                    break;
                case "link":
                    ((LinkTypeViewHolder) holder).linkview.setText(object.getUrl());
                    ((LinkTypeViewHolder)holder).type.setText(object.getType());
                    ((LinkTypeViewHolder) holder).cardView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            Intent i = new Intent(Intent.ACTION_VIEW);
                            i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            i.setData(Uri.parse(object.getUrl()));
                            context.startActivity(i);
                        }
                    });
                    break;
                case "chat":
                    ((ChatTypeViewHolder)  holder).chatview.setText(object.getSummary());
                    ((ChatTypeViewHolder)  holder).type.setText(object.getType());
                    break;
            }
        }
    }

    @Override
    public int getItemCount() {
        return total_types;
    }
}
