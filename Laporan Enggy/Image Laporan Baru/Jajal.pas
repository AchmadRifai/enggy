program jajal;
uses crt;

function inPassword:string;
var
  key:char;
  iki:string;
begin
  iki:='';
  key:=readkey;
  while key<>#13 do begin
    iki:=iki+key;
    key:=readkey;
  end;
  inPassword:=iki;
end;
var
  pass:string;
begin
  write('masukan password : ');
  pass:=inPassword;
  writeln('Password : ',pass);
  readkey;
end.