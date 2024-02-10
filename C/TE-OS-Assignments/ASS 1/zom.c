#include<stdlib.h>
#include<sys/types.h>
#include<unistd.h>
#include<stdio.h>

int main()
{
  pid_t ch;
  ch=fork();
  if(ch>0)
    {
    sleep(10);
    printf("parent process id %d\n i m in zombie state",getpid());
    system("ps aux ");	
    }
  else
    {
     printf("\nchild process id is %d parent %d",getpid(),getppid());
     exit(0);
    }
  return 0;
}
/*output
svit@svit-ThinkCentre-M70e:~$ cd os
svit@svit-ThinkCentre-M70e:~/os$ gcc zom.c
svit@svit-ThinkCentre-M70e:~/os$ ./a.out

child process id is 3343 parent 3342parent process id 3342
USER       PID %CPU %MEM    VSZ   RSS TTY      STAT START   TIME COMMAND
root         1  0.0  0.1  33900  3220 ?        Ss   12:05   0:01 /sbin/init
root         2  0.0  0.0      0     0 ?        S    12:05   0:00 [kthreadd]
root         3  0.0  0.0      0     0 ?        S    12:05   0:00 [ksoftirqd/0]
root         5  0.0  0.0      0     0 ?        S<   12:05   0:00 [kworker/0:0H]
root         7  0.0  0.0      0     0 ?        R    12:05   0:00 [rcu_sched]
root         8  0.0  0.0      0     0 ?        S    12:05   0:00 [rcuos/0]
root         9  0.0  0.0      0     0 ?        S    12:05   0:00 [rcuos/1]
root        10  0.0  0.0      0     0 ?        S    12:05   0:00 [rcuos/2]
root        11  0.0  0.0      0     0 ?        S    12:05   0:00 [rcuos/3]
root        12  0.0  0.0      0     0 ?        S    12:05   0:00 [rcu_bh]
root        13  0.0  0.0      0     0 ?        S    12:05   0:00 [rcuob/0]
root        14  0.0  0.0      0     0 ?        S    12:05   0:00 [rcuob/1]
root        15  0.0  0.0      0     0 ?        S    12:05   0:00 [rcuob/2]
root        16  0.0  0.0      0     0 ?        S    12:05   0:00 [rcuob/3]
root        17  0.0  0.0      0     0 ?        S    12:05   0:00 [migration/0]
root        18  0.0  0.0      0     0 ?        S    12:05   0:00 [watchdog/0]
root        19  0.0  0.0      0     0 ?        S    12:05   0:00 [watchdog/1]
root        20  0.0  0.0      0     0 ?        S    12:05   0:00 [migration/1]
root        21  0.0  0.0      0     0 ?        S    12:05   0:00 [ksoftirqd/1]
root        23  0.0  0.0      0     0 ?        S<   12:05   0:00 [kworker/1:0H]
root        24  0.0  0.0      0     0 ?        S<   12:05   0:00 [khelper]
root        25  0.0  0.0      0     0 ?        S    12:05   0:00 [kdevtmpfs]
root        26  0.0  0.0      0     0 ?        S<   12:05   0:00 [netns]
root        27  0.0  0.0      0     0 ?        S<   12:05   0:00 [writeback]
root        28  0.0  0.0      0     0 ?        S<   12:05   0:00 [kintegrityd]
root        29  0.0  0.0      0     0 ?        S<   12:05   0:00 [bioset]
root        30  0.0  0.0      0     0 ?        S<   12:05   0:00 [kworker/u9:0]
root        31  0.0  0.0      0     0 ?        S<   12:05   0:00 [kblockd]
root        32  0.0  0.0      0     0 ?        S<   12:05   0:00 [ata_sff]
root        33  0.0  0.0      0     0 ?        S    12:05   0:00 [khubd]
root        34  0.0  0.0      0     0 ?        S<   12:05   0:00 [md]
root        35  0.0  0.0      0     0 ?        S<   12:05   0:00 [devfreq_wq]
root        36  0.0  0.0      0     0 ?        R    12:05   0:00 [kworker/0:1]
root        38  0.0  0.0      0     0 ?        S    12:05   0:00 [khungtaskd]
root        39  0.0  0.0      0     0 ?        S    12:05   0:00 [kswapd0]
root        40  0.0  0.0      0     0 ?        SN   12:05   0:00 [ksmd]
root        41  0.0  0.0      0     0 ?        SN   12:05   0:00 [khugepaged]
root        42  0.0  0.0      0     0 ?        S    12:05   0:00 [fsnotify_mark]
root        43  0.0  0.0      0     0 ?        S    12:05   0:00 [ecryptfs-kthre
root        44  0.0  0.0      0     0 ?        S<   12:05   0:00 [crypto]
root        56  0.0  0.0      0     0 ?        S<   12:05   0:00 [kthrotld]
root        58  0.0  0.0      0     0 ?        S    12:05   0:00 [scsi_eh_0]
root        59  0.0  0.0      0     0 ?        S    12:05   0:00 [scsi_eh_1]
root        61  0.0  0.0      0     0 ?        S    12:05   0:00 [scsi_eh_2]
root        62  0.0  0.0      0     0 ?        S    12:05   0:00 [scsi_eh_3]
root        84  0.0  0.0      0     0 ?        S<   12:05   0:00 [deferwq]
root        85  0.0  0.0      0     0 ?        S<   12:05   0:00 [charger_manage
root        86  0.0  0.0      0     0 ?        S    12:05   0:00 [kworker/0:2]
root       135  0.0  0.0      0     0 ?        S    12:05   0:00 [kworker/1:3]
root       139  0.0  0.0      0     0 ?        S<   12:05   0:00 [kpsmoused]
root       149  0.0  0.0      0     0 ?        S    12:05   0:00 [jbd2/sda7-8]
root       150  0.0  0.0      0     0 ?        S<   12:05   0:00 [ext4-rsv-conve
root       273  0.0  0.0  19484   648 ?        S    12:05   0:00 upstart-udev-br
root       279  0.0  0.0  51960  2012 ?        Ss   12:05   0:00 /lib/systemd/sy
root       372  0.0  0.0      0     0 ?        S<   12:05   0:00 [hd-audio0]
root       451  0.0  0.0  15268   644 ?        S    12:05   0:00 upstart-socket-
root       496  0.0  0.0  23428   832 ?        Ss   12:05   0:00 rpcbind
root       525  0.0  0.0      0     0 ?        S<   12:05   0:00 [kworker/u9:1]
root       611  0.0  0.0  15284   632 ?        S    12:05   0:00 upstart-file-br
message+   613  0.0  0.1  40140  2324 ?        Ss   12:05   0:00 dbus-daemon --s
syslog     644  0.0  0.0 255848  1248 ?        Ssl  12:05   0:00 rsyslogd
root       686  0.0  0.2 334452  4436 ?        Ssl  12:05   0:00 /usr/sbin/Modem
root       691  0.0  0.0  19304  1492 ?        Ss   12:05   0:00 /usr/sbin/bluet
root       704  0.0  0.0      0     0 ?        S<   12:05   0:00 [krfcommd]
root       782  0.0  0.0  43564  1896 ?        Ss   12:05   0:00 /lib/systemd/sy
avahi      791  0.0  0.0  32360  1652 ?        S    12:05   0:00 avahi-daemon: r
avahi      807  0.0  0.0  32228   464 ?        S    12:05   0:00 avahi-daemon: c
root       840  0.0  0.0  20020   960 tty4     Ss+  12:05   0:00 /sbin/getty -8 
root       844  0.0  0.0  20020   952 tty5     Ss+  12:05   0:00 /sbin/getty -8 
root       851  0.0  0.0  20020   956 tty2     Ss+  12:05   0:00 /sbin/getty -8 
root       853  0.0  0.0  20020   964 tty3     Ss+  12:05   0:00 /sbin/getty -8 
root       857  0.0  0.0  20020   960 tty6     Ss+  12:05   0:00 /sbin/getty -8 
root       913  0.0  0.1  61388  3060 ?        Ss   12:05   0:00 /usr/sbin/sshd 
mongodb    919  0.1  2.1 382068 44200 ?        Ssl  12:05   0:12 /usr/bin/mongod
root       920  0.0  0.0  23552  1332 ?        Ss   12:05   0:00 /usr/sbin/vsftp
root       936  0.0  0.0   4376   700 ?        Ss   12:05   0:00 acpid -c /etc/a
root       966  0.0  0.1  75368  3432 ?        Ss   12:05   0:00 /usr/sbin/cups-
root       971  0.0  0.2 351760  5812 ?        SLsl 12:05   0:00 lightdm
root       978  0.0  0.0  23660  1012 ?        Ss   12:05   0:00 cron
root       989  0.3  1.0 320672 21064 tty7     Ssl+ 12:05   0:25 /usr/bin/X -cor
kernoops   995  0.0  0.0  37152  1012 ?        Ss   12:05   0:00 /usr/sbin/kerne
root       998  0.0  0.2 287476  4128 ?        Sl   12:05   0:00 /usr/lib/accoun
mysql     1006  0.0  2.5 484476 51416 ?        Ssl  12:05   0:03 /usr/sbin/mysql
root      1058  0.0  0.3 345028  6180 ?        Ssl  12:05   0:00 NetworkManager
root      1064  0.0  0.2 281076  5100 ?        Sl   12:05   0:00 /usr/lib/policy
root      1106  0.0  0.0  20020   960 tty1     Ss+  12:05   0:00 /sbin/getty -8 
whoopsie  1137  0.0  0.2 361224  5168 ?        Ssl  12:05   0:00 whoopsie
root      1150  0.0  0.0      0     0 ?        S    12:05   0:00 [kauditd]
root      1209  0.0  0.1 170504  3868 ?        Sl   12:05   0:00 lightdm --sessi
root      1252  0.0  0.2 239364  4524 ?        Sl   12:05   0:00 /usr/lib/upower
root      1264  0.0  0.1  10236  3748 ?        S    12:05   0:00 /sbin/dhclient 
rtkit     1286  0.0  0.0 168920  1280 ?        SNl  12:05   0:00 /usr/lib/rtkit/
nobody    1542  0.0  0.0  35228  1516 ?        S    12:05   0:00 /usr/sbin/dnsma
svit      1713  0.0  0.1 444388  3808 ?        Sl   12:05   0:00 /usr/bin/gnome-
svit      1715  0.0  0.1  40200  2616 ?        Ss   12:05   0:00 init --user
svit      1801  0.0  0.1  40184  2284 ?        Ss   12:05   0:01 dbus-daemon --f
svit      1812  0.0  0.0  22308  1156 ?        Ss   12:05   0:00 upstart-event-b
svit      1819  0.0  0.2  78204  4088 ?        Ss   12:05   0:00 /usr/lib/x86_64
svit      1851  0.0  0.2 362368  4956 ?        Ssl  12:05   0:04 /usr/bin/ibus-d
svit      1856  0.0  0.0  30788   716 ?        S    12:05   0:00 upstart-file-br
svit      1867  0.0  0.0  22316   636 ?        S    12:05   0:00 upstart-dbus-br
svit      1869  0.0  0.0  22316   656 ?        S    12:05   0:00 upstart-dbus-br
svit      1873  0.0  0.8 739760 17680 ?        Ssl  12:05   0:00 /usr/lib/unity-
svit      1877  0.0  1.6 687136 33208 ?        Ssl  12:05   0:05 /usr/lib/x86_64
svit      1880  0.0  0.1 337596  3412 ?        Ssl  12:05   0:00 /usr/lib/at-spi
svit      1881  0.0  0.6 731540 13404 ?        Ssl  12:05   0:00 gnome-session -
svit      1886  0.0  0.0  39400  2000 ?        S    12:05   0:00 /bin/dbus-daemo
svit      1888  0.0  1.2 574100 24468 ?        Ssl  12:05   0:04 /usr/lib/unity/
svit      1891  0.0  0.1 196652  3148 ?        Sl   12:05   0:00 /usr/lib/gvfs/g
svit      1895  0.0  0.1 345672  3120 ?        Sl   12:05   0:00 /usr/lib/gvfs/g
svit      1904  0.0  0.1 124920  3300 ?        Sl   12:05   0:00 /usr/lib/at-spi
svit      1910  0.0  0.2 280888  5492 ?        Sl   12:05   0:00 /usr/lib/ibus/i
svit      1911  0.0  0.7 478592 14740 ?        Sl   12:05   0:01 /usr/lib/ibus/i
svit      1913  0.0  0.3 386896  7372 ?        Sl   12:05   0:00 /usr/lib/ibus/i
svit      1936  0.0  0.6 550816 12728 ?        Sl   12:05   0:01 /usr/lib/x86_64
svit      1955  0.0  0.1 335092  2996 ?        Ssl  12:05   0:00 /usr/lib/x86_64
svit      1959  0.0  0.1 263648  2860 ?        Ssl  12:05   0:00 /usr/lib/x86_64
svit      1961  0.0  0.2 205160  5576 ?        Sl   12:05   0:01 /usr/lib/ibus/i
svit      1964  0.0  0.7 594396 15212 ?        Sl   12:05   0:00 /usr/lib/x86_64
svit      1965  0.0  0.1 278456  3384 ?        Ssl  12:05   0:00 /usr/lib/x86_64
svit      1971  0.0  0.5 1162588 11360 ?       Ssl  12:05   0:00 /usr/lib/x86_64
svit      1973  0.0  0.2 553128  5832 ?        Ssl  12:05   0:00 /usr/lib/x86_64
svit      1974  0.0  0.5 520476 11664 ?        Ssl  12:05   0:00 /usr/lib/x86_64
svit      1976  0.0  0.3 893740  6116 ?        Ssl  12:05   0:00 /usr/lib/x86_64
svit      1996  0.0  0.2 360528  5004 ?        Ssl  12:05   0:00 /usr/lib/x86_64
svit      2012  0.0  0.3 373704  6200 ?        S<l  12:05   0:00 /usr/bin/pulsea
svit      2023  0.0  0.6 833316 12824 ?        Sl   12:05   0:00 /usr/lib/evolut
svit      2031  0.0  0.5 340480 10204 ?        Sl   12:05   0:00 /usr/lib/x86_64
colord    2043  0.0  0.2 301496  5700 ?        Sl   12:05   0:00 /usr/lib/colord
svit      2057  0.0  0.2 178312  4836 ?        Sl   12:05   0:00 /usr/lib/dconf/
svit      2059  0.6  7.6 1499004 154276 ?      Sl   12:05   0:42 compiz
svit      2077  0.2  2.6 1393824 53772 ?       Sl   12:05   0:19 nautilus -n
svit      2078  0.0  0.4 550912 10024 ?        Sl   12:05   0:00 /usr/lib/unity-
svit      2083  0.0  0.8 590864 17932 ?        Sl   12:05   0:00 nm-applet
svit      2084  0.0  0.4 331736  9640 ?        Sl   12:05   0:00 /usr/lib/policy
svit      2096  0.0  2.3 1074516 46656 ?       Sl   12:05   0:00 /usr/lib/evolut
svit      2107  0.0  0.2 372708  5588 ?        Sl   12:05   0:00 /usr/lib/gvfs/g
root      2115  0.0  0.2 437048  5844 ?        Sl   12:05   0:00 /usr/lib/udisks
svit      2123  0.0  0.1  58156  3652 ?        S    12:05   0:00 /usr/lib/x86_64
svit      2128  0.0  0.1 200284  3048 ?        Sl   12:05   0:00 /usr/lib/gvfs/g
svit      2132  0.0  0.1 285980  3348 ?        Sl   12:05   0:00 /usr/lib/gvfs/g
svit      2137  0.0  0.1 212448  3356 ?        Sl   12:05   0:00 /usr/lib/gvfs/g
svit      2159  0.0  0.2 507016  5964 ?        Sl   12:05   0:00 /usr/lib/gvfs/g
svit      2177  0.0  0.1 124828  3032 ?        Sl   12:05   0:00 /usr/lib/gvfs/g
svit      2202  0.0  0.1 270388  3048 ?        Sl   12:05   0:00 /usr/lib/gvfs/g
svit      2242  0.0  0.5 455152 11972 ?        Sl   12:06   0:00 telepathy-indic
svit      2252  0.0  0.4 322520  9320 ?        Sl   12:06   0:00 /usr/lib/telepa
root      2270  0.0  0.1  76876  3792 ?        Ss   12:06   0:00 /usr/sbin/cupsd
svit      2308  0.0  0.9 677136 19164 ?        Sl   12:06   0:00 /usr/lib/x86_64
svit      2323  0.0  0.4 577764  8312 ?        Sl   12:06   0:00 /usr/lib/x86_64
svit      2324  0.0  0.9 597988 18956 ?        Sl   12:06   0:00 /usr/bin/unity-
svit      2338  0.0  0.3 348992  7088 ?        Sl   12:06   0:00 /usr/bin/zeitge
svit      2346  0.0  0.5 325828 11456 ?        Sl   12:06   0:00 /usr/lib/x86_64
svit      2348  0.0  0.4 476064  9832 ?        Sl   12:06   0:00 zeitgeist-datah
svit      2360  0.0  0.0  11420   360 ?        S    12:06   0:00 /bin/cat
svit      2446  0.0  0.6 497984 12968 ?        Sl   12:06   0:00 update-notifier
svit      2491  0.0  0.3 377752  6120 ?        Sl   12:07   0:00 /usr/lib/x86_64
root      2852  0.0  0.0      0     0 ?        S    13:44   0:00 [kworker/1:0]
root      2861  0.0  0.0      0     0 ?        S    13:44   0:00 [kworker/u8:3]
root      3054  0.0  0.0      0     0 ?        S    13:50   0:00 [kworker/u8:1]
root      3076  0.0  0.0      0     0 ?        S    13:52   0:00 [kworker/u8:2]
root      3097  0.0  0.0  17524  1096 ?        S    13:52   0:00 /lib/systemd/sy
root      3261  0.0  0.0      0     0 ?        S    13:58   0:00 [kworker/1:1]
root      3263  0.0  0.0      0     0 ?        S    13:58   0:00 [scsi_eh_8]
root      3264  0.0  0.0      0     0 ?        S    13:58   0:00 [usb-storage]
root      3268  0.0  0.0      0     0 ?        S    13:58   0:00 [kworker/u8:0]
svit      3313  0.7  0.9 647668 18252 ?        Sl   13:58   0:00 gnome-terminal
svit      3322  0.0  0.0  14828   796 ?        S    13:58   0:00 gnome-pty-helpe
svit      3323  0.1  0.1  26900  3868 pts/0    Ss   13:58   0:00 bash
svit      3342  0.0  0.0   4204   356 pts/0    S+   13:58   0:00 ./a.out
svit      3343  0.0  0.0      0     0 pts/0    Z+   13:58   0:00 [a.out] <defunc
svit      3344  0.0  0.0   4452   632 pts/0    S+   13:59   0:00 sh -c ps aux 
svit      3345  0.0  0.0  22648  1288 pts/0    R+   13:59   0:00 ps aux
 i m in zombie statesvit@svit-ThinkCentre-M70e:~/os$ 
*/

