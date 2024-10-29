//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Wave_Trend_Calculation
// ID_model: AMD_30Min_1WAV_0cbc8a5f Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AMD_30Min_1WAV_0cbc8a5f", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AMD_30Min_0cbc8a5f(tci, ci, d_tci, esa, d, ci_wt2, wt2, ap)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ci_wt2 <= 12.1442 )
		if( tci <= 70.7216 )
			if( esa <= 5.21225 )
				if( d <= 0.01319 )
					if( d_tci <= 10.4758 )
						if( ci_wt2 <= -92.8003 )
							if( tci <= 6.12141 )
								ret := -0.200000
							if( tci > 6.12141 )
								if( ci_wt2 <= -107.98 )
									ret := 0.769231 // buy
								if( ci_wt2 > -107.98 )
									ret := 0.200000
						if( ci_wt2 > -92.8003 )
							if( d <= 0.00892 )
								if( ci_wt2 <= -57.6127 )
									ret := -0.900000 // sell
								if( ci_wt2 > -57.6127 )
									ret := -0.307692
							if( d > 0.00892 )
								if( ap <= 2.76897 )
									ret := 0.080000
								if( ap > 2.76897 )
									ret := -0.300000
					if( d_tci > 10.4758 )
						if( ci_wt2 <= 1.113 )
							if( ap <= 2.675 )
								if( ci <= -99.123 )
									ret := 1.000000 // buy
								if( ci > -99.123 )
									ret := 0.240000
							if( ap > 2.675 )
								if( d <= 0.012774 )
									ret := -0.043478
								if( d > 0.012774 )
									ret := -0.750000 // sell
						if( ci_wt2 > 1.113 )
							if( ci <= -12.1002 )
								ret := 0.250000
							if( ci > -12.1002 )
								ret := 1.000000 // buy
				if( d > 0.01319 )
					if( ci <= -86.8755 )
						if( tci <= -12.7629 )
							if( d_tci <= 51.1292 )
								if( d <= 0.016812 )
									ret := 0.307692
								if( d > 0.016812 )
									ret := 0.746939 // buy
							if( d_tci > 51.1292 )
								if( tci <= -64.2769 )
									ret := 0.682927
								if( tci > -64.2769 )
									ret := 0.102041
						if( tci > -12.7629 )
							if( tci <= -11.7746 )
								ret := -1.000000 // sell
							if( tci > -11.7746 )
								if( d <= 0.057322 )
									ret := 0.268817
								if( d > 0.057322 )
									ret := -0.833333 // sell
					if( ci > -86.8755 )
						if( ci <= -16.1117 )
							if( wt2 <= 0.033767 )
								if( d <= 0.019139 )
									ret := 0.487179
								if( d > 0.019139 )
									ret := 0.149635
							if( wt2 > 0.033767 )
								if( wt2 <= 44.0455 )
									ret := -0.145455
								if( wt2 > 44.0455 )
									ret := 0.500000
						if( ci > -16.1117 )
							if( tci <= 66.8531 )
								if( ci_wt2 <= -35.4742 )
									ret := 0.685185
								if( ci_wt2 > -35.4742 )
									ret := 0.367347
							if( tci > 66.8531 )
								if( ci <= 54.1524 )
									ret := 0.777778 // buy
								if( ci > 54.1524 )
									ret := -0.720000 // sell
			if( esa > 5.21225 )
				if( esa <= 12.3936 )
					if( ci <= -62.4777 )
						if( ci_wt2 <= -76.684 )
							if( d <= 0.10678 )
								if( tci <= 40.7723 )
									ret := 0.072411
								if( tci > 40.7723 )
									ret := 0.807692 // buy
							if( d > 0.10678 )
								if( ci <= -188.35 )
									ret := -0.250000
								if( ci > -188.35 )
									ret := 0.558824
						if( ci_wt2 > -76.684 )
							if( wt2 <= 2.49766 )
								if( d <= 0.244779 )
									ret := -0.034419
								if( d > 0.244779 )
									ret := -0.900000 // sell
							if( wt2 > 2.49766 )
								if( d_tci <= 3.30723 )
									ret := 0.000000
								if( d_tci > 3.30723 )
									ret := -0.909091 // sell
					if( ci > -62.4777 )
						if( wt2 <= -42.0912 )
							if( ci <= -56.9826 )
								if( wt2 <= -62.2475 )
									ret := 0.909091 // buy
								if( wt2 > -62.2475 )
									ret := -0.216867
							if( ci > -56.9826 )
								if( ci <= -50.5261 )
									ret := 0.723881 // buy
								if( ci > -50.5261 )
									ret := 0.284483
						if( wt2 > -42.0912 )
							if( d_tci <= 38.6068 )
								if( esa <= 5.321 )
									ret := -0.538462
								if( esa > 5.321 )
									ret := 0.156819
							if( d_tci > 38.6068 )
								if( ap <= 10.2703 )
									ret := 0.026316
								if( ap > 10.2703 )
									ret := -0.694915
				if( esa > 12.3936 )
					if( d <= 0.092997 )
						if( ci_wt2 <= -43.3143 )
							if( wt2 <= 23.1357 )
								if( d_tci <= 26.6661 )
									ret := 0.058984
								if( d_tci > 26.6661 )
									ret := -0.194805
							if( wt2 > 23.1357 )
								if( ci_wt2 <= -233.366 )
									ret := 0.900000 // buy
								if( ci_wt2 > -233.366 )
									ret := -0.227902
						if( ci_wt2 > -43.3143 )
							if( d_tci <= 59.138 )
								if( ci <= -47.9718 )
									ret := 0.253230
								if( ci > -47.9718 )
									ret := 0.032151
							if( d_tci > 59.138 )
								if( esa <= 12.7628 )
									ret := -0.764706 // sell
								if( esa > 12.7628 )
									ret := -0.333333
					if( d > 0.092997 )
						if( esa <= 85.1629 )
							if( d <= 0.430003 )
								if( tci <= -66.3375 )
									ret := 0.330677
								if( tci > -66.3375 )
									ret := 0.053992
							if( d > 0.430003 )
								if( ci <= -125.49 )
									ret := 0.362117
								if( ci > -125.49 )
									ret := 0.126769
						if( esa > 85.1629 )
							if( ci <= -119.017 )
								if( esa <= 89.1119 )
									ret := -0.261084
								if( esa > 89.1119 )
									ret := -0.012508
							if( ci > -119.017 )
								if( ci_wt2 <= -115.743 )
									ret := 0.213358
								if( ci_wt2 > -115.743 )
									ret := 0.030831
		if( tci > 70.7216 )
			if( d <= 0.668303 )
				if( tci <= 87.6263 )
					if( ap <= 10.5869 )
						if( d <= 0.174007 )
							if( wt2 <= 81.7739 )
								if( d <= 0.109559 )
									ret := -0.060606
								if( d > 0.109559 )
									ret := 0.520000
							if( wt2 > 81.7739 )
								if( esa <= 7.467 )
									ret := 1.000000 // buy
								if( esa > 7.467 )
									ret := 0.750000 // buy
						if( d > 0.174007 )
							if( d <= 0.255754 )
								if( ap <= 6.76585 )
									ret := 0.200000
								if( ap > 6.76585 )
									ret := -0.758621 // sell
							if( d > 0.255754 )
								ret := 1.000000 // buy
					if( ap > 10.5869 )
						if( d_tci <= -77.278 )
							if( wt2 <= 84.3648 )
								if( tci <= 81.7867 )
									ret := 0.666667
								if( tci > 81.7867 )
									ret := 0.117647
							if( wt2 > 84.3648 )
								if( d <= 0.386503 )
									ret := 0.642857
								if( d > 0.386503 )
									ret := 1.000000 // buy
						if( d_tci > -77.278 )
							if( ap <= 48.8983 )
								if( d <= 0.273544 )
									ret := 0.285714
								if( d > 0.273544 )
									ret := 0.549550
							if( ap > 48.8983 )
								if( tci <= 70.9838 )
									ret := -0.500000
								if( tci > 70.9838 )
									ret := 0.114286
				if( tci > 87.6263 )
					if( ap <= 22.4444 )
						if( d <= 0.221567 )
							ret := 0.666667
						if( d > 0.221567 )
							if( d <= 0.274534 )
								if( ap <= 8.59924 )
									ret := -1.000000 // sell
								if( ap > 8.59924 )
									ret := -0.250000
							if( d > 0.274534 )
								ret := -1.000000 // sell
					if( ap > 22.4444 )
						ret := 0.800000 // buy
			if( d > 0.668303 )
				if( wt2 <= 73.3724 )
					if( d <= 1.26002 )
						if( ci <= 76.7738 )
							if( d <= 1.18835 )
								if( ci <= 61.7595 )
									ret := -0.666667
								if( ci > 61.7595 )
									ret := 0.000000
							if( d > 1.18835 )
								ret := 0.250000
						if( ci > 76.7738 )
							if( ci <= 80.5003 )
								ret := 1.000000 // buy
							if( ci > 80.5003 )
								ret := 0.250000
					if( d > 1.26002 )
						if( esa <= 83.3558 )
							ret := 1.000000 // buy
						if( esa > 83.3558 )
							if( d_tci <= -69.8842 )
								if( d_tci <= -70.6555 )
									ret := -0.250000
								if( d_tci > -70.6555 )
									ret := 0.142857
							if( d_tci > -69.8842 )
								if( ci <= 67.1516 )
									ret := 0.545455
								if( ci > 67.1516 )
									ret := 1.000000 // buy
				if( wt2 > 73.3724 )
					if( ci <= 49.5701 )
						if( esa <= 88.792 )
							if( d <= 1.39963 )
								if( ci_wt2 <= -32.3079 )
									ret := 0.000000
								if( ci_wt2 > -32.3079 )
									ret := 0.625000
							if( d > 1.39963 )
								ret := 1.000000 // buy
						if( esa > 88.792 )
							if( ci <= 27.6945 )
								ret := -0.500000
							if( ci > 27.6945 )
								if( tci <= 71.9034 )
									ret := -0.111111
								if( tci > 71.9034 )
									ret := 0.357143
					if( ci > 49.5701 )
						if( ap <= 92.0283 )
							if( ci <= 52.9187 )
								if( ci_wt2 <= -23.9966 )
									ret := -0.166667
								if( ci_wt2 > -23.9966 )
									ret := 0.500000
							if( ci > 52.9187 )
								if( tci <= 74.7418 )
									ret := -0.894737 // sell
								if( tci > 74.7418 )
									ret := -0.361702
						if( ap > 92.0283 )
							if( d <= 1.50197 )
								if( wt2 <= 78.9281 )
									ret := -0.171429
								if( wt2 > 78.9281 )
									ret := 0.727273 // buy
							if( d > 1.50197 )
								if( esa <= 185.658 )
									ret := -0.289474
								if( esa > 185.658 )
									ret := 0.750000 // buy
	if( ci_wt2 > 12.1442 )
		if( esa <= 170.136 )
			if( ci <= 188.907 )
				if( ci <= 55.0495 )
					if( ci <= 24.3752 )
						if( wt2 <= -45.1603 )
							if( esa <= 13.9039 )
								if( d <= 0.128599 )
									ret := -0.011598
								if( d > 0.128599 )
									ret := -0.395062
							if( esa > 13.9039 )
								if( ci <= -25.1737 )
									ret := 0.020586
								if( ci > -25.1737 )
									ret := 0.182540
						if( wt2 > -45.1603 )
							if( ci_wt2 <= 23.7645 )
								if( tci <= -41.5632 )
									ret := -0.451613
								if( tci > -41.5632 )
									ret := 0.107467
							if( ci_wt2 > 23.7645 )
								if( d <= 0.672825 )
									ret := -0.070128
								if( d > 0.672825 )
									ret := -0.328767
					if( ci > 24.3752 )
						if( d <= 0.400257 )
							if( wt2 <= -43.7662 )
								if( ap <= 2.5931 )
									ret := -0.416667
								if( ap > 2.5931 )
									ret := 0.372024
							if( wt2 > -43.7662 )
								if( ap <= 5.5576 )
									ret := -0.106557
								if( ap > 5.5576 )
									ret := 0.123133
						if( d > 0.400257 )
							if( ci <= 38.9428 )
								if( d <= 1.03411 )
									ret := -0.167800
								if( d > 1.03411 )
									ret := 0.357143
							if( ci > 38.9428 )
								if( tci <= 20.5906 )
									ret := 0.136646
								if( tci > 20.5906 )
									ret := -0.065934
				if( ci > 55.0495 )
					if( ap <= 104.867 )
						if( tci <= 66.4535 )
							if( ci_wt2 <= 154.587 )
								if( d <= 0.350418 )
									ret := -0.011200
								if( d > 0.350418 )
									ret := -0.083703
							if( ci_wt2 > 154.587 )
								if( ap <= 12.2142 )
									ret := -0.517588
								if( ap > 12.2142 )
									ret := -0.057096
						if( tci > 66.4535 )
							if( esa <= 81.3556 )
								if( d <= 0.082358 )
									ret := -0.106918
								if( d > 0.082358 )
									ret := 0.267857
							if( esa > 81.3556 )
								if( wt2 <= 58.6031 )
									ret := 0.560000
								if( wt2 > 58.6031 )
									ret := -0.287879
					if( ap > 104.867 )
						if( d_tci <= 3.02457 )
							if( tci <= 64.1114 )
								if( d <= 0.593948 )
									ret := 0.044140
								if( d > 0.593948 )
									ret := 0.185007
							if( tci > 64.1114 )
								if( esa <= 152.327 )
									ret := 0.108911
								if( esa > 152.327 )
									ret := -0.500000
						if( d_tci > 3.02457 )
							if( ap <= 137.81 )
								if( d <= 0.498293 )
									ret := 0.203980
								if( d > 0.498293 )
									ret := -0.234375
							if( ap > 137.81 )
								if( esa <= 164.499 )
									ret := -0.303922
								if( esa > 164.499 )
									ret := 0.225806
			if( ci > 188.907 )
				if( ci <= 196.288 )
					if( ap <= 82.2501 )
						if( wt2 <= 6.0812 )
							if( wt2 <= -41.8308 )
								ret := 1.000000 // buy
							if( wt2 > -41.8308 )
								if( wt2 <= -19.6101 )
									ret := -0.700000 // sell
								if( wt2 > -19.6101 )
									ret := -0.055556
						if( wt2 > 6.0812 )
							if( ci_wt2 <= 161.683 )
								if( wt2 <= 38.1604 )
									ret := -0.714286 // sell
								if( wt2 > 38.1604 )
									ret := 0.411765
							if( ci_wt2 > 161.683 )
								if( esa <= 20.2153 )
									ret := 0.888889 // buy
								if( esa > 20.2153 )
									ret := 0.166667
					if( ap > 82.2501 )
						if( d_tci <= -51.2032 )
							if( d <= 0.741858 )
								if( ci_wt2 <= 150.828 )
									ret := 0.000000
								if( ci_wt2 > 150.828 )
									ret := -1.000000 // sell
							if( d > 0.741858 )
								ret := 1.000000 // buy
						if( d_tci > -51.2032 )
							if( esa <= 119.267 )
								if( d <= 0.24587 )
									ret := 0.400000
								if( d > 0.24587 )
									ret := 0.924528 // buy
							if( esa > 119.267 )
								if( esa <= 128.63 )
									ret := 0.000000
								if( esa > 128.63 )
									ret := 0.555556
				if( ci > 196.288 )
					if( ci <= 202.833 )
						if( ap <= 20.2353 )
							if( ap <= 12.6882 )
								if( wt2 <= 21.5624 )
									ret := -0.285714
								if( wt2 > 21.5624 )
									ret := 0.800000 // buy
							if( ap > 12.6882 )
								if( wt2 <= -5.68857 )
									ret := -0.941176 // sell
								if( wt2 > -5.68857 )
									ret := -0.562500
						if( ap > 20.2353 )
							if( d <= 0.941858 )
								if( tci <= 41.9612 )
									ret := 0.391304
								if( tci > 41.9612 )
									ret := 0.000000
							if( d > 0.941858 )
								ret := -0.833333 // sell
					if( ci > 202.833 )
						if( esa <= 105.418 )
							if( ci <= 230.91 )
								if( d <= 0.080467 )
									ret := 0.111111
								if( d > 0.080467 )
									ret := 0.554839
							if( ci > 230.91 )
								if( ap <= 5.25769 )
									ret := 1.000000 // buy
								if( ap > 5.25769 )
									ret := -0.018519
						if( esa > 105.418 )
							if( ci <= 244.827 )
								if( ci_wt2 <= 176.926 )
									ret := 0.600000
								if( ci_wt2 > 176.926 )
									ret := -0.458333
							if( ci > 244.827 )
								if( ci_wt2 <= 231.187 )
									ret := 0.000000
								if( ci_wt2 > 231.187 )
									ret := 0.583333
		if( esa > 170.136 )
			if( ci_wt2 <= 170 )
				if( d <= 0.596823 )
					if( ci <= 15.8909 )
						if( esa <= 173.825 )
							ret := 1.000000 // buy
						if( esa > 173.825 )
							if( esa <= 174.536 )
								ret := -0.500000
							if( esa > 174.536 )
								if( ci <= -13.4328 )
									ret := 1.000000 // buy
								if( ci > -13.4328 )
									ret := 0.277778
					if( ci > 15.8909 )
						if( ci <= 22.5587 )
							if( ap <= 193.494 )
								if( d <= 0.44136 )
									ret := -0.916667 // sell
								if( d > 0.44136 )
									ret := -0.400000
							if( ap > 193.494 )
								ret := 0.000000
						if( ci > 22.5587 )
							if( ci <= 138.297 )
								if( d <= 0.209734 )
									ret := 0.636364
								if( d > 0.209734 )
									ret := -0.130682
							if( ci > 138.297 )
								if( d <= 0.295313 )
									ret := -0.800000 // sell
								if( d > 0.295313 )
									ret := 0.650000
				if( d > 0.596823 )
					if( d_tci <= -42.1381 )
						if( d_tci <= -58.9696 )
							if( wt2 <= 68.0093 )
								if( d <= 1.79345 )
									ret := -0.528571
								if( d > 1.79345 )
									ret := 0.375000
							if( wt2 > 68.0093 )
								if( ci <= 110.468 )
									ret := 0.000000
								if( ci > 110.468 )
									ret := 1.000000 // buy
						if( d_tci > -58.9696 )
							if( d <= 0.908749 )
								if( esa <= 183.593 )
									ret := 0.217391
								if( esa > 183.593 )
									ret := -0.727273 // sell
							if( d > 0.908749 )
								if( esa <= 203.985 )
									ret := 0.526316
								if( esa > 203.985 )
									ret := -0.142857
					if( d_tci > -42.1381 )
						if( esa <= 175.61 )
							if( d <= 0.82141 )
								if( esa <= 171.069 )
									ret := -0.250000
								if( esa > 171.069 )
									ret := -0.894737 // sell
							if( d > 0.82141 )
								if( esa <= 171.75 )
									ret := -0.777778 // sell
								if( esa > 171.75 )
									ret := -1.000000 // sell
						if( esa > 175.61 )
							if( d_tci <= 18.1209 )
								if( d_tci <= 12.3725 )
									ret := -0.418605
								if( d_tci > 12.3725 )
									ret := -1.000000 // sell
							if( d_tci > 18.1209 )
								if( ci <= -32.9302 )
									ret := 0.533333
								if( ci > -32.9302 )
									ret := -0.177778
			if( ci_wt2 > 170 )
				if( esa <= 177.849 )
					if( ap <= 178.537 )
						ret := 0.400000
					if( ap > 178.537 )
						ret := 1.000000 // buy
				if( esa > 177.849 )
					ret := -0.285714
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_AMD_30Min_0cbc8a5f(tci, ci, d_tci, esa, d, ci_wt2, wt2, ap)

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


