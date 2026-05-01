import 'package:all_in_one/model/artist_model.dart';
import 'package:all_in_one/model/song_model.dart';

class ArtistDetail {
  final Artist info;
  final List<Song> songs;
  final int totalTrack;

  ArtistDetail({
    required this.info,
    required this.songs,
    required this.totalTrack,
  });

  factory ArtistDetail.fromJson(Map<String, dynamic> json) => ArtistDetail(
    info: Artist.fromJson(json),
    songs: json["songs"] == null
        ? []
        : List<Song>.from(json["songs"].map((x) => Song.fromJson(x))),
    totalTrack: json["totalTrack"] ?? 0,
  );

  String get name => info.name;
  String get avatar => info.avatar ?? '';
  int get id => info.id;
}
