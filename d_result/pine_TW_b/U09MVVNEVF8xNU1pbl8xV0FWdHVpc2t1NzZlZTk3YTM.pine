//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Wave_Trend_Calculation
// ID_model: SOLUSDT_15Min_1WAV_76ee97a3 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SOLUSDT_15Min_1WAV_76ee97a3", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SOLUSDT_15Min_76ee97a3(esa, d_tci, tci, ci_wt2, wt2, d, ci, ap)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( tci <= -43.5224 )
		if( ci <= -79.4404 )
			if( ap <= 19.9633 )
				if( esa <= 14.0724 )
					if( ci_wt2 <= -23.7265 )
						if( tci <= -69.9513 )
							if( ci_wt2 <= -46.9152 )
								if( ci_wt2 <= -67.283 )
									ret := 0.500000
								if( ci_wt2 > -67.283 )
									ret := -0.636364
							if( ci_wt2 > -46.9152 )
								if( tci <= -74.2051 )
									ret := 1.000000 // buy
								if( tci > -74.2051 )
									ret := 0.400000
						if( tci > -69.9513 )
							if( tci <= -67.6822 )
								ret := -0.611111
							if( tci > -67.6822 )
								if( esa <= 13.7829 )
									ret := 0.110236
								if( esa > 13.7829 )
									ret := -0.428571
					if( ci_wt2 > -23.7265 )
						if( d <= 0.20354 )
							if( ci <= -84.7241 )
								ret := 0.166667
							if( ci > -84.7241 )
								ret := 0.375000
						if( d > 0.20354 )
							ret := 0.785714 // buy
				if( esa > 14.0724 )
					if( wt2 <= -52.6017 )
						if( tci <= -68.3989 )
							if( ci_wt2 <= -13.3844 )
								if( ci_wt2 <= -37.2574 )
									ret := 0.481928
								if( ci_wt2 > -37.2574 )
									ret := 0.097561
							if( ci_wt2 > -13.3844 )
								if( wt2 <= -77.5795 )
									ret := 0.571429
								if( wt2 > -77.5795 )
									ret := 1.000000 // buy
						if( tci > -68.3989 )
							if( d <= 0.334099 )
								if( ap <= 15.3297 )
									ret := 0.714286 // buy
								if( ap > 15.3297 )
									ret := -0.226950
							if( d > 0.334099 )
								ret := -1.000000 // sell
					if( wt2 > -52.6017 )
						if( tci <= -45.8253 )
							if( d <= 0.097969 )
								if( esa <= 18.2534 )
									ret := 0.711712 // buy
								if( esa > 18.2534 )
									ret := 0.289655
							if( d > 0.097969 )
								if( wt2 <= -49.6596 )
									ret := 0.680851
								if( wt2 > -49.6596 )
									ret := 0.879747 // buy
						if( tci > -45.8253 )
							if( d_tci <= 45.4311 )
								if( ci_wt2 <= -96.1729 )
									ret := -0.833333 // sell
								if( ci_wt2 > -96.1729 )
									ret := -0.400000
							if( d_tci > 45.4311 )
								ret := 0.047619
			if( ap > 19.9633 )
				if( tci <= -53.4702 )
					if( esa <= 97.5551 )
						if( ap <= 79.299 )
							if( ci <= -169.27 )
								if( tci <= -54.3499 )
									ret := 0.500000
								if( tci > -54.3499 )
									ret := 1.000000 // buy
							if( ci > -169.27 )
								if( ap <= 52.469 )
									ret := 0.072236
								if( ap > 52.469 )
									ret := 0.532847
						if( ap > 79.299 )
							if( esa <= 91.7263 )
								if( ci <= -91.113 )
									ret := -0.588710
								if( ci > -91.113 )
									ret := 0.400000
							if( esa > 91.7263 )
								if( ci <= -124.95 )
									ret := -0.506494
								if( ci > -124.95 )
									ret := 0.449612
					if( esa > 97.5551 )
						if( wt2 <= -49.7375 )
							if( ci_wt2 <= -23.481 )
								if( wt2 <= -57.8051 )
									ret := 0.602151
								if( wt2 > -57.8051 )
									ret := 0.338776
							if( ci_wt2 > -23.481 )
								if( tci <= -70.5712 )
									ret := 0.378788
								if( tci > -70.5712 )
									ret := -0.256410
						if( wt2 > -49.7375 )
							if( wt2 <= -45.5524 )
								if( d_tci <= 56.7717 )
									ret := 0.051282
								if( d_tci > 56.7717 )
									ret := -0.401786
							if( wt2 > -45.5524 )
								if( ci <= -139.887 )
									ret := -0.200000
								if( ci > -139.887 )
									ret := 0.500000
				if( tci > -53.4702 )
					if( wt2 <= -32.3821 )
						if( wt2 <= -38.7753 )
							if( esa <= 20.324 )
								ret := -0.800000 // sell
							if( esa > 20.324 )
								if( ap <= 22.9817 )
									ret := 0.305699
								if( ap > 22.9817 )
									ret := -0.038430
						if( wt2 > -38.7753 )
							if( d_tci <= 47.5024 )
								if( ci <= -126.773 )
									ret := -0.103175
								if( ci > -126.773 )
									ret := 0.382151
							if( d_tci > 47.5024 )
								if( ci_wt2 <= -115.739 )
									ret := 0.701754 // buy
								if( ci_wt2 > -115.739 )
									ret := -0.151724
					if( wt2 > -32.3821 )
						if( d_tci <= 44.3429 )
							if( ci_wt2 <= -96.9596 )
								ret := -0.840000 // sell
							if( ci_wt2 > -96.9596 )
								ret := -0.500000
						if( d_tci > 44.3429 )
							if( esa <= 25.1569 )
								if( tci <= -46.5206 )
									ret := 0.000000
								if( tci > -46.5206 )
									ret := 0.536585
							if( esa > 25.1569 )
								if( esa <= 142.386 )
									ret := -0.353535
								if( esa > 142.386 )
									ret := 0.070175
		if( ci > -79.4404 )
			if( esa <= 16.0033 )
				if( ci_wt2 <= 26.1716 )
					if( wt2 <= -64.5548 )
						if( d_tci <= 68.8041 )
							if( ci <= -63.9612 )
								ret := 0.692308
							if( ci > -63.9612 )
								if( ci_wt2 <= 20.6663 )
									ret := 1.000000 // buy
								if( ci_wt2 > 20.6663 )
									ret := 0.933333 // buy
						if( d_tci > 68.8041 )
							if( wt2 <= -72.5333 )
								if( esa <= 14.2694 )
									ret := 0.884058 // buy
								if( esa > 14.2694 )
									ret := 0.214286
							if( wt2 > -72.5333 )
								if( ap <= 12.7279 )
									ret := -0.565217
								if( ap > 12.7279 )
									ret := 0.375000
					if( wt2 > -64.5548 )
						if( d_tci <= 45.9667 )
							if( d <= 0.071902 )
								if( ci <= -55.7472 )
									ret := 0.400000
								if( ci > -55.7472 )
									ret := -0.055556
							if( d > 0.071902 )
								if( tci <= -44.274 )
									ret := 0.800000 // buy
								if( tci > -44.274 )
									ret := 1.000000 // buy
						if( d_tci > 45.9667 )
							if( ci_wt2 <= 18.3758 )
								if( tci <= -60.2199 )
									ret := 0.343137
								if( tci > -60.2199 )
									ret := -0.101449
							if( ci_wt2 > 18.3758 )
								if( tci <= -61.0343 )
									ret := 0.000000
								if( tci > -61.0343 )
									ret := -0.590909
				if( ci_wt2 > 26.1716 )
					if( d_tci <= 67.5637 )
						if( esa <= 12.302 )
							if( d <= 0.062746 )
								if( d <= 0.048978 )
									ret := 0.303030
								if( d > 0.048978 )
									ret := -0.766667 // sell
							if( d > 0.062746 )
								if( tci <= -52.5764 )
									ret := 0.107143
								if( tci > -52.5764 )
									ret := 0.888889 // buy
						if( esa > 12.302 )
							if( d_tci <= 66.757 )
								if( ci <= 54.7672 )
									ret := 0.605809
								if( ci > 54.7672 )
									ret := -0.166667
							if( d_tci > 66.757 )
								ret := -0.384615
					if( d_tci > 67.5637 )
						if( tci <= -74.498 )
							ret := 1.000000 // buy
						if( tci > -74.498 )
							if( esa <= 12.5984 )
								ret := 0.750000 // buy
							if( esa > 12.5984 )
								ret := 0.866667 // buy
			if( esa > 16.0033 )
				if( esa <= 145.652 )
					if( esa <= 38.614 )
						if( d <= 0.526647 )
							if( esa <= 32.0102 )
								if( esa <= 29.6277 )
									ret := -0.045874
								if( esa > 29.6277 )
									ret := 0.207031
							if( esa > 32.0102 )
								if( esa <= 32.2141 )
									ret := -0.618182
								if( esa > 32.2141 )
									ret := -0.106981
						if( d > 0.526647 )
							if( ci <= -13.7576 )
								if( ap <= 21.13 )
									ret := -0.830986 // sell
								if( ap > 21.13 )
									ret := -0.313253
							if( ci > -13.7576 )
								ret := 0.647059
					if( esa > 38.614 )
						if( ci_wt2 <= 24.3615 )
							if( d_tci <= 53.4696 )
								if( ci <= -60.5298 )
									ret := 0.215217
								if( ci > -60.5298 )
									ret := 0.366061
							if( d_tci > 53.4696 )
								if( tci <= -53.0201 )
									ret := 0.087441
								if( tci > -53.0201 )
									ret := -0.622222
						if( ci_wt2 > 24.3615 )
							if( d_tci <= 81.1246 )
								if( ci <= 10.9189 )
									ret := -0.068635
								if( ci > 10.9189 )
									ret := 0.145679
							if( d_tci > 81.1246 )
								ret := 0.608696
				if( esa > 145.652 )
					if( ci_wt2 <= -11.795 )
						if( ap <= 151.202 )
							if( wt2 <= -50.006 )
								if( ap <= 145.866 )
									ret := -0.833333 // sell
								if( ap > 145.866 )
									ret := -1.000000 // sell
							if( wt2 > -50.006 )
								if( d_tci <= 54.8499 )
									ret := -0.607143
								if( d_tci > 54.8499 )
									ret := 1.000000 // buy
						if( ap > 151.202 )
							if( ap <= 193.175 )
								if( wt2 <= -60.6078 )
									ret := 1.000000 // buy
								if( wt2 > -60.6078 )
									ret := 0.062780
							if( ap > 193.175 )
								ret := 1.000000 // buy
					if( ci_wt2 > -11.795 )
						if( ap <= 145.581 )
							ret := -0.888889 // sell
						if( ap > 145.581 )
							if( tci <= -77.4179 )
								ret := 0.636364
							if( tci > -77.4179 )
								if( wt2 <= -57.5764 )
									ret := -0.345521
								if( wt2 > -57.5764 )
									ret := -0.076923
	if( tci > -43.5224 )
		if( esa <= 185.759 )
			if( tci <= -2.89704 )
				if( ci_wt2 <= -42.5749 )
					if( ap <= 165.508 )
						if( d <= 0.063558 )
							if( ci <= -87.0645 )
								if( d_tci <= 15.5186 )
									ret := -0.164251
								if( d_tci > 15.5186 )
									ret := 0.038781
							if( ci > -87.0645 )
								if( esa <= 20.1687 )
									ret := -0.274090
								if( esa > 20.1687 )
									ret := -0.103937
						if( d > 0.063558 )
							if( ap <= 68.8867 )
								if( ci <= -72.2627 )
									ret := 0.010978
								if( ci > -72.2627 )
									ret := 0.229984
							if( ap > 68.8867 )
								if( d <= 0.27637 )
									ret := -0.291379
								if( d > 0.27637 )
									ret := 0.005526
					if( ap > 165.508 )
						if( tci <= -14.6449 )
							if( tci <= -38.4403 )
								if( ci <= -126.687 )
									ret := 0.083333
								if( ci > -126.687 )
									ret := 0.758242 // buy
							if( tci > -38.4403 )
								if( esa <= 171.715 )
									ret := -0.054945
								if( esa > 171.715 )
									ret := 0.325806
						if( tci > -14.6449 )
							if( esa <= 172.011 )
								if( ci <= -103.466 )
									ret := 0.384615
								if( ci > -103.466 )
									ret := -0.076923
							if( esa > 172.011 )
								if( ci <= -129.527 )
									ret := 0.545455
								if( ci > -129.527 )
									ret := -0.528846
				if( ci_wt2 > -42.5749 )
					if( d_tci <= 39.9589 )
						if( d_tci <= 12.0996 )
							if( ci <= -45.1317 )
								if( tci <= -10.8075 )
									ret := -0.861111 // sell
								if( tci > -10.8075 )
									ret := -0.425000
							if( ci > -45.1317 )
								if( d <= 0.628648 )
									ret := -0.090381
								if( d > 0.628648 )
									ret := -0.387707
						if( d_tci > 12.0996 )
							if( ci_wt2 <= 18.0183 )
								if( tci <= -12.0006 )
									ret := -0.105221
								if( tci > -12.0006 )
									ret := 0.708333 // buy
							if( ci_wt2 > 18.0183 )
								if( tci <= -23.0836 )
									ret := -0.056879
								if( tci > -23.0836 )
									ret := 0.055833
					if( d_tci > 39.9589 )
						if( esa <= 18.9359 )
							if( d <= 0.10403 )
								if( ci <= 45.2781 )
									ret := 0.319249
								if( ci > 45.2781 )
									ret := -0.866667 // sell
							if( d > 0.10403 )
								if( ci <= -25.6032 )
									ret := 0.947368 // buy
								if( ci > -25.6032 )
									ret := 0.533333
						if( esa > 18.9359 )
							if( ap <= 44.096 )
								if( d_tci <= 42.611 )
									ret := -0.021592
								if( d_tci > 42.611 )
									ret := -0.285714
							if( ap > 44.096 )
								if( d_tci <= 44.1234 )
									ret := 0.110352
								if( d_tci > 44.1234 )
									ret := 0.638298
			if( tci > -2.89704 )
				if( ci_wt2 <= 214.675 )
					if( d_tci <= -51.6038 )
						if( ci <= 34.9125 )
							if( ci <= 27.902 )
								if( ap <= 25.07 )
									ret := 0.174061
								if( ap > 25.07 )
									ret := -0.116959
							if( ci > 27.902 )
								if( wt2 <= 67.7554 )
									ret := 0.318653
								if( wt2 > 67.7554 )
									ret := -0.008333
						if( ci > 34.9125 )
							if( ci <= 93.1548 )
								if( d <= 0.092898 )
									ret := 0.082517
								if( d > 0.092898 )
									ret := -0.134898
							if( ci > 93.1548 )
								if( ci_wt2 <= 16.8589 )
									ret := 1.000000 // buy
								if( ci_wt2 > 16.8589 )
									ret := -0.004292
					if( d_tci > -51.6038 )
						if( d <= 0.35829 )
							if( ci_wt2 <= 192.777 )
								if( ci_wt2 <= -225.356 )
									ret := 0.851852 // buy
								if( ci_wt2 > -225.356 )
									ret := 0.041613
							if( ci_wt2 > 192.777 )
								if( ci <= 206.167 )
									ret := -0.354839
								if( ci > 206.167 )
									ret := -0.870370 // sell
						if( d > 0.35829 )
							if( d <= 3.16734 )
								if( tci <= 3.59782 )
									ret := -0.133958
								if( tci > 3.59782 )
									ret := -0.025008
							if( d > 3.16734 )
								if( wt2 <= 48.418 )
									ret := 0.434783
								if( wt2 > 48.418 )
									ret := 1.000000 // buy
				if( ci_wt2 > 214.675 )
					if( tci <= 36.145 )
						if( ap <= 106.547 )
							if( d <= 0.123054 )
								ret := 0.666667
							if( d > 0.123054 )
								ret := 1.000000 // buy
						if( ap > 106.547 )
							ret := 0.363636
					if( tci > 36.145 )
						ret := -0.400000
		if( esa > 185.759 )
			if( ci_wt2 <= -66.5878 )
				if( wt2 <= 55.2827 )
					if( wt2 <= 32.8821 )
						if( ci <= -161.951 )
							ret := 0.200000
						if( ci > -161.951 )
							if( d <= 1.24905 )
								if( ci <= -77.7365 )
									ret := -0.689655
								if( ci > -77.7365 )
									ret := -0.390244
							if( d > 1.24905 )
								if( wt2 <= -19.1346 )
									ret := 0.000000
								if( wt2 > -19.1346 )
									ret := 0.464286
					if( wt2 > 32.8821 )
						if( wt2 <= 49.9907 )
							if( ap <= 190.15 )
								if( d_tci <= -30.1337 )
									ret := 1.000000 // buy
								if( d_tci > -30.1337 )
									ret := 0.750000 // buy
							if( ap > 190.15 )
								ret := 0.133333
						if( wt2 > 49.9907 )
							ret := -0.200000
				if( wt2 > 55.2827 )
					if( d <= 0.911333 )
						ret := -0.307692
					if( d > 0.911333 )
						ret := -1.000000 // sell
			if( ci_wt2 > -66.5878 )
				if( ci <= 78.4325 )
					if( ci_wt2 <= -36.2554 )
						if( d <= 0.547941 )
							if( d_tci <= -6.93813 )
								ret := 0.076923
							if( d_tci > -6.93813 )
								if( ap <= 191.672 )
									ret := -0.888889 // sell
								if( ap > 191.672 )
									ret := -0.500000
						if( d > 0.547941 )
							if( ci <= 14.2345 )
								if( tci <= 41.3103 )
									ret := 0.465347
								if( tci > 41.3103 )
									ret := 0.901961 // buy
							if( ci > 14.2345 )
								ret := 0.047619
					if( ci_wt2 > -36.2554 )
						if( ap <= 187.549 )
							if( d <= 0.444017 )
								ret := 0.538462
							if( d > 0.444017 )
								if( ci <= 52.1329 )
									ret := -0.660000
								if( ci > 52.1329 )
									ret := 0.363636
						if( ap > 187.549 )
							if( d_tci <= 35.2835 )
								if( wt2 <= -7.31424 )
									ret := 0.407767
								if( wt2 > -7.31424 )
									ret := -0.074742
							if( d_tci > 35.2835 )
								if( d <= 0.763812 )
									ret := 0.000000
								if( d > 0.763812 )
									ret := -0.960000 // sell
				if( ci > 78.4325 )
					if( ci <= 137.309 )
						if( ci <= 114.786 )
							if( wt2 <= 32.7104 )
								if( esa <= 196.453 )
									ret := -0.826087 // sell
								if( esa > 196.453 )
									ret := -0.526316
							if( wt2 > 32.7104 )
								if( wt2 <= 37.1916 )
									ret := 0.125000
								if( wt2 > 37.1916 )
									ret := -0.596774
						if( ci > 114.786 )
							if( ap <= 189.082 )
								ret := 0.714286 // buy
							if( ap > 189.082 )
								if( wt2 <= -18.4508 )
									ret := -1.000000 // sell
								if( wt2 > -18.4508 )
									ret := -0.403226
					if( ci > 137.309 )
						if( d_tci <= -14.1541 )
							if( tci <= 30.0661 )
								ret := 0.090909
							if( tci > 30.0661 )
								ret := 0.285714
						if( d_tci > -14.1541 )
							ret := 1.000000 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_SOLUSDT_15Min_76ee97a3(esa, d_tci, tci, ci_wt2, wt2, d, ci, ap)

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


