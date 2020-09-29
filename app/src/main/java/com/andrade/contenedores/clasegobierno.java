
package com.andrade.contenedores;

        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.Button;
        import android.widget.TextView;

        import androidx.annotation.NonNull;
        import androidx.recyclerview.widget.RecyclerView;

        import java.sql.ClientInfoStatus;
        import java.util.ArrayList;

public class clasegobierno extends RecyclerView.Adapter<clasegobierno.ViewHolderDatos> {
    ArrayList<ClientInfoStatus> listaUsuario;

    public clasegobierno(ArrayList<Usuario> listaUsuario) {
        this. = listaUsuario;
    }

    @NonNull
    @Override
    public gobierno.ViewHolderDatos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //enlace
        View view = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.recycler_simple_item, parent, false);
        return new ViewHolderDatos(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MiAdaptador.ViewHolderDatos holder, int position) {

    }

    @Override
    public int getItemCount() {
        return listaUsuario.size();
    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder {
        TextView texto;
        Button button;

        public ViewHolderDatos(@NonNull View itemView) {
            super(itemView);
            texto = itemView.findViewById(R.id.texto);
            button = itemView.findViewById(R.id.button);
        }
    }
}
