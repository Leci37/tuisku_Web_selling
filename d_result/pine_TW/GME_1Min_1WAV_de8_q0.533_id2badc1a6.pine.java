//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Wave_Trend_Calculation
// ID_model: GME_1Min_1WAV_2badc1a6 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_GME_1Min_1WAV_2badc1a6", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_GME_1Min_2badc1a6(d, esa, d_tci, ci_wt2, wt2, ci, ap, tci)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( wt2 <= -57.9799 )
		if( d <= 0.108903 )
			if( ci <= -137.024 )
				if( d <= 0.067553 )
					if( ci_wt2 <= -69.2986 )
						if( d_tci <= 78.8127 )
							if( wt2 <= -60.7361 )
								if( d <= 0.039068 )
									ret := 0.111111
								if( d > 0.039068 )
									ret := 0.750000 // buy
							if( wt2 > -60.7361 )
								ret := -0.285714
						if( d_tci > 78.8127 )
							ret := -0.600000
					if( ci_wt2 > -69.2986 )
						ret := 1.000000 // buy
				if( d > 0.067553 )
					if( wt2 <= -58.9406 )
						if( ci <= -173.787 )
							ret := 0.750000 // buy
						if( ci > -173.787 )
							ret := 1.000000 // buy
					if( wt2 > -58.9406 )
						ret := 0.750000 // buy
			if( ci > -137.024 )
				if( d <= 0.033484 )
					if( ci <= 64.1098 )
						if( wt2 <= -61.0853 )
							if( esa <= 23.8771 )
								if( ci_wt2 <= 25.6658 )
									ret := 0.117886
								if( ci_wt2 > 25.6658 )
									ret := -0.012987
							if( esa > 23.8771 )
								if( esa <= 23.8866 )
									ret := -0.500000
								if( esa > 23.8866 )
									ret := -0.064103
						if( wt2 > -61.0853 )
							if( d_tci <= 55.5564 )
								if( ap <= 14.0096 )
									ret := 0.400000
								if( ap > 14.0096 )
									ret := -0.016129
							if( d_tci > 55.5564 )
								if( ci <= -7.65498 )
									ret := -0.076531
								if( ci > -7.65498 )
									ret := -0.600000
					if( ci > 64.1098 )
						if( ci <= 69.2051 )
							ret := -1.000000 // sell
						if( ci > 69.2051 )
							if( ci <= 93.1003 )
								ret := 0.000000
							if( ci > 93.1003 )
								ret := -0.750000 // sell
				if( d > 0.033484 )
					if( ci <= -47.2213 )
						if( wt2 <= -78.5846 )
							if( wt2 <= -80.1733 )
								ret := 0.142857
							if( wt2 > -80.1733 )
								if( esa <= 20.9872 )
									ret := 0.250000
								if( esa > 20.9872 )
									ret := 0.842105 // buy
						if( wt2 > -78.5846 )
							if( esa <= 20.6108 )
								if( tci <= -73.1407 )
									ret := -0.115385
								if( tci > -73.1407 )
									ret := 0.395122
							if( esa > 20.6108 )
								if( wt2 <= -75.8343 )
									ret := -0.500000
								if( wt2 > -75.8343 )
									ret := 0.031167
					if( ci > -47.2213 )
						if( ci <= 94.5314 )
							if( d <= 0.108654 )
								if( esa <= 29.0596 )
									ret := 0.231537
								if( esa > 29.0596 )
									ret := 0.909091 // buy
							if( d > 0.108654 )
								ret := -0.800000 // sell
						if( ci > 94.5314 )
							ret := -1.000000 // sell
		if( d > 0.108903 )
			if( ci_wt2 <= -6.25398 )
				if( ap <= 25.1168 )
					if( ci <= -163.824 )
						ret := -0.800000 // sell
					if( ci > -163.824 )
						if( tci <= -61.0576 )
							if( tci <= -64.1221 )
								if( ci <= -110.247 )
									ret := 0.315068
								if( ci > -110.247 )
									ret := 0.638158
							if( tci > -64.1221 )
								if( ci_wt2 <= -8.90321 )
									ret := -0.052632
								if( ci_wt2 > -8.90321 )
									ret := 0.909091 // buy
						if( tci > -61.0576 )
							ret := 1.000000 // buy
				if( ap > 25.1168 )
					if( ap <= 26.5042 )
						if( wt2 <= -66.0688 )
							if( d <= 0.165896 )
								if( tci <= -71.6642 )
									ret := 0.952381 // buy
								if( tci > -71.6642 )
									ret := -1.000000 // sell
							if( d > 0.165896 )
								if( tci <= -75.7503 )
									ret := -0.947368 // sell
								if( tci > -75.7503 )
									ret := -0.551724
						if( wt2 > -66.0688 )
							if( ci_wt2 <= -18.0393 )
								if( ci_wt2 <= -41.7639 )
									ret := 0.909091 // buy
								if( ci_wt2 > -41.7639 )
									ret := -0.320000
							if( ci_wt2 > -18.0393 )
								if( tci <= -62.4224 )
									ret := 1.000000 // buy
								if( tci > -62.4224 )
									ret := 0.500000
					if( ap > 26.5042 )
						if( d_tci <= 85.0906 )
							if( ci <= -80.2139 )
								if( ap <= 43.1117 )
									ret := 0.711027 // buy
								if( ap > 43.1117 )
									ret := 0.253333
							if( ci > -80.2139 )
								if( d <= 0.152676 )
									ret := -0.500000
								if( d > 0.152676 )
									ret := 0.279412
						if( d_tci > 85.0906 )
							if( d <= 2.1199 )
								if( ap <= 28.7711 )
									ret := 0.285714
								if( ap > 28.7711 )
									ret := -1.000000 // sell
							if( d > 2.1199 )
								if( ap <= 42.0198 )
									ret := 0.500000
								if( ap > 42.0198 )
									ret := 1.000000 // buy
			if( ci_wt2 > -6.25398 )
				if( wt2 <= -73.6786 )
					if( ci_wt2 <= 55.9296 )
						if( ap <= 45.9183 )
							if( wt2 <= -77.7129 )
								if( ap <= 24.4236 )
									ret := 0.585366
								if( ap > 24.4236 )
									ret := -0.212121
							if( wt2 > -77.7129 )
								if( d_tci <= 76.4046 )
									ret := -0.261194
								if( d_tci > 76.4046 )
									ret := -0.814815 // sell
						if( ap > 45.9183 )
							ret := 1.000000 // buy
					if( ci_wt2 > 55.9296 )
						if( ci_wt2 <= 75.0486 )
							if( d <= 0.126056 )
								ret := 0.750000 // buy
							if( d > 0.126056 )
								ret := 1.000000 // buy
						if( ci_wt2 > 75.0486 )
							if( d <= 0.266927 )
								ret := 0.428571
							if( d > 0.266927 )
								if( d <= 1.14359 )
									ret := -1.000000 // sell
								if( d > 1.14359 )
									ret := -0.750000 // sell
				if( wt2 > -73.6786 )
					if( d <= 1.37517 )
						if( d <= 0.832043 )
							if( d_tci <= 74.4675 )
								if( d <= 0.762239 )
									ret := 0.272171
								if( d > 0.762239 )
									ret := 1.000000 // buy
							if( d_tci > 74.4675 )
								if( ap <= 21.778 )
									ret := -1.000000 // sell
								if( ap > 21.778 )
									ret := -0.500000
						if( d > 0.832043 )
							if( wt2 <= -63.1706 )
								if( ap <= 37.2047 )
									ret := 1.000000 // buy
								if( ap > 37.2047 )
									ret := -0.090909
							if( wt2 > -63.1706 )
								if( esa <= 37.3322 )
									ret := -0.500000
								if( esa > 37.3322 )
									ret := -0.956522 // sell
					if( d > 1.37517 )
						if( ci <= -53.3529 )
							if( tci <= -71.31 )
								ret := 0.500000
							if( tci > -71.31 )
								ret := -0.600000
						if( ci > -53.3529 )
							if( d_tci <= 59.7862 )
								if( d_tci <= 52.3204 )
									ret := 1.000000 // buy
								if( d_tci > 52.3204 )
									ret := -0.571429
							if( d_tci > 59.7862 )
								ret := 1.000000 // buy
	if( wt2 > -57.9799 )
		if( esa <= 22.1098 )
			if( d <= 0.028763 )
				if( tci <= 51.1981 )
					if( wt2 <= -20.1461 )
						if( wt2 <= -24.635 )
							if( ci_wt2 <= 229.047 )
								if( wt2 <= -55.6631 )
									ret := -0.224138
								if( wt2 > -55.6631 )
									ret := 0.017094
							if( ci_wt2 > 229.047 )
								if( ci <= 206.928 )
									ret := -1.000000 // sell
								if( ci > 206.928 )
									ret := -0.750000 // sell
						if( wt2 > -24.635 )
							if( d <= 0.023942 )
								if( wt2 <= -20.6674 )
									ret := -0.049430
								if( wt2 > -20.6674 )
									ret := -0.195652
							if( d > 0.023942 )
								if( esa <= 10.9696 )
									ret := -0.750000 // sell
								if( esa > 10.9696 )
									ret := -0.225225
					if( wt2 > -20.1461 )
						if( d <= 0.019414 )
							if( d_tci <= -11.6255 )
								if( ap <= 13.48 )
									ret := 0.131579
								if( ap > 13.48 )
									ret := 0.023268
							if( d_tci > -11.6255 )
								if( wt2 <= -2.774 )
									ret := 0.031886
								if( wt2 > -2.774 )
									ret := -0.037458
						if( d > 0.019414 )
							if( ci <= 42.8844 )
								if( d_tci <= -24.8498 )
									ret := 0.037102
								if( d_tci > -24.8498 )
									ret := 0.153094
							if( ci > 42.8844 )
								if( d_tci <= -5.85438 )
									ret := 0.042481
								if( d_tci > -5.85438 )
									ret := -0.156250
				if( tci > 51.1981 )
					if( ap <= 18.453 )
						if( ap <= 10.7172 )
							if( tci <= 55.6603 )
								if( esa <= 10.5473 )
									ret := 0.117647
								if( esa > 10.5473 )
									ret := 1.000000 // buy
							if( tci > 55.6603 )
								if( esa <= 10.3869 )
									ret := -0.033333
								if( esa > 10.3869 )
									ret := -0.354167
						if( ap > 10.7172 )
							if( d_tci <= -54.6954 )
								if( esa <= 10.8712 )
									ret := -0.833333 // sell
								if( esa > 10.8712 )
									ret := -0.236111
							if( d_tci > -54.6954 )
								if( ci_wt2 <= -18.9094 )
									ret := 0.000000
								if( ci_wt2 > -18.9094 )
									ret := -0.684211
					if( ap > 18.453 )
						if( ci_wt2 <= 121.797 )
							if( ap <= 20.2 )
								if( wt2 <= 52.5084 )
									ret := -0.058824
								if( wt2 > 52.5084 )
									ret := 0.259259
							if( ap > 20.2 )
								if( ap <= 20.3047 )
									ret := -0.777778 // sell
								if( ap > 20.3047 )
									ret := 0.000000
						if( ci_wt2 > 121.797 )
							if( ap <= 20.8591 )
								ret := -0.200000
							if( ap > 20.8591 )
								if( esa <= 21.4183 )
									ret := -0.750000 // sell
								if( esa > 21.4183 )
									ret := -1.000000 // sell
			if( d > 0.028763 )
				if( esa <= 15.8307 )
					if( d <= 0.115724 )
						if( ci_wt2 <= -16.4813 )
							if( ci <= -81.6964 )
								if( wt2 <= -18.6689 )
									ret := 0.278107
								if( wt2 > -18.6689 )
									ret := -0.095238
							if( ci > -81.6964 )
								if( ci_wt2 <= -33.7995 )
									ret := 0.317391
								if( ci_wt2 > -33.7995 )
									ret := 0.597561
						if( ci_wt2 > -16.4813 )
							if( ap <= 10.7466 )
								if( tci <= 63.92 )
									ret := -0.193548
								if( tci > 63.92 )
									ret := -0.916667 // sell
							if( ap > 10.7466 )
								if( d_tci <= -6.21072 )
									ret := 0.200555
								if( d_tci > -6.21072 )
									ret := -0.009259
					if( d > 0.115724 )
						if( ci <= 26.9688 )
							if( ci <= -94.9143 )
								if( d <= 0.132907 )
									ret := 0.500000
								if( d > 0.132907 )
									ret := 0.937500 // buy
							if( ci > -94.9143 )
								if( d_tci <= 48.5126 )
									ret := -0.472727
								if( d_tci > 48.5126 )
									ret := 0.235294
						if( ci > 26.9688 )
							if( tci <= 79.129 )
								if( wt2 <= 53.8705 )
									ret := 0.360656
								if( wt2 > 53.8705 )
									ret := 0.797814 // buy
							if( tci > 79.129 )
								if( tci <= 81.2185 )
									ret := -0.750000 // sell
								if( tci > 81.2185 )
									ret := -1.000000 // sell
				if( esa > 15.8307 )
					if( ci <= 6.59876 )
						if( d <= 0.087165 )
							if( wt2 <= 42.4909 )
								if( tci <= 2.19667 )
									ret := 0.163378
								if( tci > 2.19667 )
									ret := 0.283237
							if( wt2 > 42.4909 )
								if( ap <= 21.2378 )
									ret := 0.156069
								if( ap > 21.2378 )
									ret := -0.184615
						if( d > 0.087165 )
							if( wt2 <= -46.8849 )
								if( ci <= -87.4128 )
									ret := 0.666667
								if( ci > -87.4128 )
									ret := 0.198444
							if( wt2 > -46.8849 )
								if( ap <= 19.3057 )
									ret := -0.259958
								if( ap > 19.3057 )
									ret := 0.095023
					if( ci > 6.59876 )
						if( ci_wt2 <= 170.006 )
							if( d <= 0.064901 )
								if( esa <= 16.2107 )
									ret := -0.126531
								if( esa > 16.2107 )
									ret := 0.097632
							if( d > 0.064901 )
								if( ap <= 19.617 )
									ret := 0.100273
								if( ap > 19.617 )
									ret := -0.066995
						if( ci_wt2 > 170.006 )
							if( d <= 0.038526 )
								if( wt2 <= -48.0234 )
									ret := -0.800000 // sell
								if( wt2 > -48.0234 )
									ret := 0.048780
							if( d > 0.038526 )
								if( esa <= 18.6325 )
									ret := -0.863636 // sell
								if( esa > 18.6325 )
									ret := -0.435294
		if( esa > 22.1098 )
			if( wt2 <= 51.8918 )
				if( d <= 0.491513 )
					if( ci <= 176.532 )
						if( d_tci <= -48.7643 )
							if( esa <= 30.4647 )
								if( tci <= 55.7188 )
									ret := 0.131765
								if( tci > 55.7188 )
									ret := -0.073171
							if( esa > 30.4647 )
								if( ap <= 61.1867 )
									ret := 0.688442
								if( ap > 61.1867 )
									ret := -1.000000 // sell
						if( d_tci > -48.7643 )
							if( ci <= -184.633 )
								if( ci <= -196.666 )
									ret := 0.092715
								if( ci > -196.666 )
									ret := 0.574803
							if( ci > -184.633 )
								if( tci <= -65.8534 )
									ret := 0.622642
								if( tci > -65.8534 )
									ret := 0.029403
					if( ci > 176.532 )
						if( ci_wt2 <= 183.545 )
							if( esa <= 26.2261 )
								if( d_tci <= -68.7895 )
									ret := 1.000000 // buy
								if( d_tci > -68.7895 )
									ret := -0.615854
							if( esa > 26.2261 )
								if( d <= 0.114696 )
									ret := 0.411765
								if( d > 0.114696 )
									ret := -0.812500 // sell
						if( ci_wt2 > 183.545 )
							if( ci <= 250.994 )
								if( tci <= 38.492 )
									ret := 0.165644
								if( tci > 38.492 )
									ret := -0.615385
							if( ci > 250.994 )
								if( tci <= 23.4635 )
									ret := -0.714286 // sell
								if( tci > 23.4635 )
									ret := 0.500000
				if( d > 0.491513 )
					if( d_tci <= -55.6791 )
						if( wt2 <= 50.3348 )
							ret := 1.000000 // buy
						if( wt2 > 50.3348 )
							if( ci <= 132.841 )
								ret := -0.500000
							if( ci > 132.841 )
								ret := 1.000000 // buy
					if( d_tci > -55.6791 )
						if( ci_wt2 <= -96.5043 )
							if( ci <= -142.724 )
								if( tci <= -7.17839 )
									ret := -0.450000
								if( tci > -7.17839 )
									ret := 1.000000 // buy
							if( ci > -142.724 )
								if( ci <= -68.6056 )
									ret := 0.509804
								if( ci > -68.6056 )
									ret := -0.652174
						if( ci_wt2 > -96.5043 )
							if( d <= 2.02611 )
								if( ap <= 39.0058 )
									ret := -0.291605
								if( ap > 39.0058 )
									ret := -0.114964
							if( d > 2.02611 )
								if( d_tci <= -24.4702 )
									ret := 0.272727
								if( d_tci > -24.4702 )
									ret := -0.769231 // sell
			if( wt2 > 51.8918 )
				if( ap <= 34.1898 )
					if( ap <= 28.3033 )
						if( d <= 0.079518 )
							if( ci_wt2 <= -38.563 )
								if( ap <= 25.7374 )
									ret := -0.160149
								if( ap > 25.7374 )
									ret := -0.435294
							if( ci_wt2 > -38.563 )
								if( ap <= 23.6269 )
									ret := 0.130602
								if( ap > 23.6269 )
									ret := -0.060224
						if( d > 0.079518 )
							if( ci <= -19.0927 )
								if( tci <= 44.8581 )
									ret := -0.363636
								if( tci > 44.8581 )
									ret := 0.548148
							if( ci > -19.0927 )
								if( d_tci <= -82.0066 )
									ret := -0.032258
								if( d_tci > -82.0066 )
									ret := -0.323069
					if( ap > 28.3033 )
						if( d <= 0.248095 )
							if( wt2 <= 63.2626 )
								if( d <= 0.216759 )
									ret := -0.132328
								if( d > 0.216759 )
									ret := 0.384615
							if( wt2 > 63.2626 )
								if( d_tci <= -67.5569 )
									ret := 0.221649
								if( d_tci > -67.5569 )
									ret := 0.508571
						if( d > 0.248095 )
							if( d_tci <= -58.2499 )
								if( d <= 0.607921 )
									ret := -0.304348
								if( d > 0.607921 )
									ret := 0.371429
							if( d_tci > -58.2499 )
								if( esa <= 29.871 )
									ret := 0.923077 // buy
								if( esa > 29.871 )
									ret := 0.016949
				if( ap > 34.1898 )
					if( esa <= 66.3359 )
						if( ci <= -28.1308 )
							if( d <= 1.56845 )
								if( d <= 0.407181 )
									ret := 0.166667
								if( d > 0.407181 )
									ret := 1.000000 // buy
							if( d > 1.56845 )
								ret := -0.285714
						if( ci > -28.1308 )
							if( wt2 <= 79.7967 )
								if( esa <= 56.0228 )
									ret := 0.203562
								if( esa > 56.0228 )
									ret := 0.638889
							if( wt2 > 79.7967 )
								if( d <= 1.2221 )
									ret := -0.658537
								if( d > 1.2221 )
									ret := 0.600000
					if( esa > 66.3359 )
						if( ci <= -6.43812 )
							ret := -0.500000
						if( ci > -6.43812 )
							ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Wave_Trend_Calculation 
//@version=5
//indicator "WaveTrend [LazyBear]", shorttitle="WT_LB", overlay=false)

n1 = input.int(10, title="Channel Length")
n2 = input.int(21, title="Average Length")
obLevel1 = input.float(60, title="Over Bought Level 1")
obLevel2 = input.float(53, title="Over Bought Level 2")
osLevel1 = input.float(-60, title="Over Sold Level 1")
osLevel2 = input.float(-53, title="Over Sold Level 2")

ap = hlc3
esa = ta.ema(ap, n1)
d = ta.ema(math.abs(ap - esa), n1)
ci = (ap - esa) / (0.015 * d)
tci = ta.ema(ci, n2)

wt1 = tci
wt2 = ta.sma(wt1, 4)

d_tci = d-tci
ci_wt2 = ci - wt2

plot(0, color=color.gray)
plot(obLevel1, color=color.red)
plot(osLevel1, color=color.green)
plot(obLevel2, color=color.red, linewidth=2, style=plot.style_line, title="OB Level 2 (Dashed)", color=color.red)
plot(osLevel2, color=color.green, linewidth=2, style=plot.style_line, title="OS Level 2 (Dashed)", color=color.green)

plot(wt1, color=color.green, title="WT1")
plot(wt2, color=color.red, title="WT2", style=plot.style_line, linewidth=1)
plot(wt1 - wt2, color=color.new(color.blue, 80), title="WT1-WT2", style=plot.style_area)

// EXPLANATION OF THE STRATEGY
//The provided Pine Script implements a trading strategy that includes stop loss (SL) and multiple take profit (TP) levels,
//with an option to activate a trailing stop at the third TP level. Here's a detailed breakdown of its components and functionality:

//Variables Initialization:
var float stop = na
var float limit1 = na
var float limit2 = na

// Converts a percentage to points based on the average position price and the minimum tick size.
percent2points(percent) =>
    strategy.position_avg_price * percent / 100 / syminfo.mintick

// Stop Loss and Take Profit Inputs:
//Defines inputs for stop loss and three take profit levels in percentage terms.
sl = percent2points(input(2.92, title="stop loss %%"))
tp1 = percent2points(input(1.12, title="take profit 1 %%"))
tp2 = percent2points(input(2.31, title="take profit 2 %%"))
tp3 = percent2points(input(3.91, title="take profit 3 %%"))
activateTrailingOnThirdStep = input(false,title="activate trailing on third stage (tp3 is amount, tp2 is offset level)")
log.info("Stop Loss (sl):", sl," Take Profit 1 (tp1):", tp1, " Take Profit 2 (tp2):", tp2," Take Profit 3 (tp3):", tp3)

// Current Profit Calculation:
//Calculates the current profit in points based on the position size and price.
curProfitInPts() =>
    if strategy.position_size > 0
        (high - strategy.position_avg_price) / syminfo.mintick
    else if strategy.position_size < 0
        (strategy.position_avg_price - low) / syminfo.mintick
    else
        0
// Stop Loss and Profit Target Price Calculations:
//Determines the stop loss and profit target prices based on the position size and offset points.
calcStopLossPrice(OffsetPts) =>
    if strategy.position_size > 0
        strategy.position_avg_price - OffsetPts * syminfo.mintick
    else if strategy.position_size < 0
        strategy.position_avg_price + OffsetPts * syminfo.mintick
    else
        0
calcProfitTrgtPrice(OffsetPts) =>
    calcStopLossPrice(-OffsetPts)
// Current Stage Determination:
//Determines the current stage of the trade based on the profit points reached.
getCurrentStage() =>
    var stage = 0
    if strategy.position_size == 0
        stage := 0
    if stage == 0 and strategy.position_size != 0
        stage := 1
    else if stage == 1 and curProfitInPts() >= tp1
        stage := 2
    else if stage == 2 and curProfitInPts() >= tp2
        stage := 3
    stage
stopLevel = -1.
profitLevel = calcProfitTrgtPrice(tp3)

log.info("Stop Level:", stopLevel)
log.info("Profit Level:", profitLevel)
//This part of the strategy sets up exit conditions based on the current stage of the trade and uses the same exit ID "x" to modify the exit parameters dynamically.
//The exit parameters include stop loss, take profit, and comments for each stage.
// based on current stage set up exit
// note: we use same exit ids ("x") consciously, for MODIFY the exit's parameters
curStage = getCurrentStage()
float op_operation = decision_tree_0_GME_1Min_2badc1a6(d, esa, d_tci, ci_wt2, wt2, ci, ap, tci)

log.info("Decision Tree Operation (op_operation):", op_operation)
if (op_operation <= 0)
    if curStage == 1
        stopLevel := calcStopLossPrice(sl)
        strategy.exit("x", loss = sl, profit = tp3, comment = "sl or tp3")
    else if curStage == 2
        stopLevel := calcStopLossPrice(0)
        strategy.exit("x", stop = stopLevel, profit = tp3, comment = "breakeven or tp3")
    else if curStage == 3
        stopLevel := calcStopLossPrice(-tp1)
        strategy.exit("x", stop = stopLevel, profit = tp3, comment = "tp1 or tp3")
    else
        strategy.cancel("x")


//SIGNAL MANAGE    User Adjustments and Risk Management
// The user can adjust the threshold values for op_operation to control the level of risk they are willing to take:
// Lower op_operation Threshold for Buy Signal (e.g., 0.5 instead of 0.55):
//     Effect: Generates more buy signals, increasing the frequency of trades. This is suitable for a user willing to take more risks and potentially capture more trading opportunities.
// Higher op_operation Threshold for Buy Signal (e.g., 0.8 instead of 0.55):
//     Effect: Generates fewer buy signals, reducing the frequency of trades. This is suitable for a user seeking to take fewer risks and only enter trades under more favorable conditions.
// Lower op_operation Threshold for Signal Closure (e.g., -0.8 instead of -0.9):
//     Effect: Closes positions less frequently, allowing trades more room to recover from temporary unfavorable conditions. This increases risk but can capture larger gains if the market reverses favorably.
// Higher op_operation Threshold for Signal Closure (e.g., -0.95 instead of -0.9):
//     Effect: Closes positions more frequently, exiting trades quickly at the first sign of unfavorable conditions. This decreases risk but may result in missed opportunities for recovery.
//Signal BUY
FIXED_DOLLAR_AMOUNT  = 10000
positionSize = FIXED_DOLLAR_AMOUNT / close
log.info("Position Size (in dollars $",FIXED_DOLLAR_AMOUNT,"):", positionSize)

if (op_operation >= 0.55)
    stop := close * 0.965
    limit1 := close * 1.03
    limit2 := close * 1.02
    strategy.entry("x", strategy.long, qty=positionSize, stop=stop, comment="in")
//Signal SELL
if (op_operation <= -0.9)
    strategy.close("x", comment = "under Le1")

// Impact on the Dataset
//Stop Loss (SL): Limits the maximum loss by exiting the position if the price moves against the trade by a specified percentage.
//Take Profit (TP1, TP2, TP3): Defines profit-taking levels to secure gains at different stages.
//Trailing Stop: Optionally activates a trailing stop at the third TP level to lock in profits while allowing for further gains if the price continues to move favorably.
//Position Entry and Exit: The strategy's buy and sell signals determine when to enter and exit positions, influencing the dataset by marking the points of trade execution and closure.
//Current Stage Tracking: Monitors the trade's progress through predefined stages, adjusting stop and profit levels accordingly.
//This strategy is designed to manage risk and maximize profits through a structured approach, incorporating multiple exit levels and dynamic adjustments based on market conditions. The dataset will reflect these actions, showing entries, exits, stop loss activations, and profit-taking events, providing valuable information for backtesting and performance analysis.
//Random forest AI offers significant advantages in trading, including the ability to handle large data sets, reduce overfitting and provide more robust predictions through the aggregation of multiple decision trees.

// NOTE: While the Tuisku team stands behind the quality and effectiveness of this trading strategy,
// PLEASE be aware that there is NO GUARANTEE of specific results or profits. TRADING INVOLVES SIGNIFICANT RISK, and it is important to use this strategy with careful consideration of your financial situation and risk tolerance.
// For further information and support, please contact us at Tuisku.eu.


