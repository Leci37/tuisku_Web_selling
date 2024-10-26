//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Wave_Trend_Calculation
// ID_model: U_1Min_1WAV_0c21d693 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_U_1Min_1WAV_0c21d693", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_U_1Min_0c21d693(ap, d_tci, ci, ci_wt2, tci, d, wt2, esa)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ci_wt2 <= 16.0038 )
		if( d <= 0.023125 )
			if( ci_wt2 <= -81.3164 )
				if( ci_wt2 <= -137.06 )
					if( ci <= -229.455 )
						if( wt2 <= 7.14607 )
							ret := -1.000000 // sell
						if( wt2 > 7.14607 )
							ret := 0.714286 // buy
					if( ci > -229.455 )
						if( esa <= 22.3871 )
							if( d <= 0.017495 )
								if( ap <= 16.7431 )
									ret := 0.093220
								if( ap > 16.7431 )
									ret := 0.295950
							if( d > 0.017495 )
								if( esa <= 16.6249 )
									ret := 0.293578
								if( esa > 16.6249 )
									ret := 0.563319
						if( esa > 22.3871 )
							if( wt2 <= 11.113 )
								if( d <= 0.014423 )
									ret := -0.055556
								if( d > 0.014423 )
									ret := 0.538462
							if( wt2 > 11.113 )
								if( ci <= -96.6947 )
									ret := -0.275362
								if( ci > -96.6947 )
									ret := 0.444444
				if( ci_wt2 > -137.06 )
					if( ci_wt2 <= -88.8835 )
						if( ap <= 21.523 )
							if( d <= 0.017826 )
								if( d_tci <= -23.879 )
									ret := 0.229560
								if( d_tci > -23.879 )
									ret := 0.071334
							if( d > 0.017826 )
								if( wt2 <= 36.9615 )
									ret := 0.229692
								if( wt2 > 36.9615 )
									ret := -0.075630
						if( ap > 21.523 )
							if( d <= 0.022507 )
								if( ci <= -150.661 )
									ret := -0.526316
								if( ci > -150.661 )
									ret := -0.015544
							if( d > 0.022507 )
								if( ci_wt2 <= -90.3921 )
									ret := 0.473684
								if( ci_wt2 > -90.3921 )
									ret := -0.750000 // sell
					if( ci_wt2 > -88.8835 )
						if( d <= 0.012717 )
							if( tci <= -6.05574 )
								if( ci_wt2 <= -87.597 )
									ret := 0.318182
								if( ci_wt2 > -87.597 )
									ret := -0.060606
							if( tci > -6.05574 )
								if( wt2 <= 1.69622 )
									ret := 0.846154 // buy
								if( wt2 > 1.69622 )
									ret := 0.118750
						if( d > 0.012717 )
							if( d_tci <= 40.588 )
								if( d_tci <= -33.6907 )
									ret := -0.039216
								if( d_tci > -33.6907 )
									ret := 0.344298
							if( d_tci > 40.588 )
								if( ap <= 16.7782 )
									ret := -0.258065
								if( ap > 16.7782 )
									ret := 0.136364
			if( ci_wt2 > -81.3164 )
				if( esa <= 14.2536 )
					if( ci_wt2 <= -40.3971 )
						if( ci_wt2 <= -55.8802 )
							if( ci_wt2 <= -62.797 )
								if( esa <= 14.0632 )
									ret := 0.000000
								if( esa > 14.0632 )
									ret := 0.769231 // buy
							if( ci_wt2 > -62.797 )
								if( ap <= 14.1633 )
									ret := -0.750000 // sell
								if( ap > 14.1633 )
									ret := 0.000000
						if( ci_wt2 > -55.8802 )
							if( d <= 0.014856 )
								if( ci <= -68.4284 )
									ret := 1.000000 // buy
								if( ci > -68.4284 )
									ret := 0.250000
							if( d > 0.014856 )
								if( wt2 <= -18.8313 )
									ret := 0.500000
								if( wt2 > -18.8313 )
									ret := 0.923077 // buy
					if( ci_wt2 > -40.3971 )
						if( d_tci <= -9.13285 )
							if( esa <= 14.1994 )
								if( tci <= 28.425 )
									ret := -1.000000 // sell
								if( tci > 28.425 )
									ret := -0.500000
							if( esa > 14.1994 )
								ret := 0.333333
						if( d_tci > -9.13285 )
							if( ap <= 14.2358 )
								if( ci <= -58.4132 )
									ret := -0.055556
								if( ci > -58.4132 )
									ret := 0.258621
							if( ap > 14.2358 )
								ret := 1.000000 // buy
				if( esa > 14.2536 )
					if( d_tci <= 31.5885 )
						if( d_tci <= 2.48118 )
							if( ci <= 68.5393 )
								if( wt2 <= 3.67312 )
									ret := -0.129032
								if( wt2 > 3.67312 )
									ret := 0.001263
							if( ci > 68.5393 )
								if( ap <= 16.2193 )
									ret := 0.764706 // buy
								if( ap > 16.2193 )
									ret := 0.264706
						if( d_tci > 2.48118 )
							if( ci_wt2 <= -38.9649 )
								if( d <= 0.017703 )
									ret := -0.035279
								if( d > 0.017703 )
									ret := 0.174242
							if( ci_wt2 > -38.9649 )
								if( ci_wt2 <= 12.4352 )
									ret := 0.175824
								if( ci_wt2 > 12.4352 )
									ret := -0.135593
					if( d_tci > 31.5885 )
						if( ci_wt2 <= -80.8238 )
							if( d_tci <= 50.2646 )
								if( esa <= 18.5267 )
									ret := -1.000000 // sell
								if( esa > 18.5267 )
									ret := -0.750000 // sell
							if( d_tci > 50.2646 )
								if( wt2 <= -42.136 )
									ret := -0.500000
								if( wt2 > -42.136 )
									ret := -0.250000
						if( ci_wt2 > -80.8238 )
							if( wt2 <= -25.4151 )
								if( ci_wt2 <= -56.5108 )
									ret := 0.094815
								if( ci_wt2 > -56.5108 )
									ret := -0.035559
							if( wt2 > -25.4151 )
								if( ap <= 17.4558 )
									ret := -0.627907
								if( ap > 17.4558 )
									ret := -0.119048
		if( d > 0.023125 )
			if( esa <= 16.2336 )
				if( wt2 <= -61.5397 )
					if( ci_wt2 <= -3.66592 )
						if( d <= 0.119917 )
							if( ci_wt2 <= -13.8587 )
								if( tci <= -68.1866 )
									ret := -0.016260
								if( tci > -68.1866 )
									ret := -0.676471
							if( ci_wt2 > -13.8587 )
								if( ci_wt2 <= -13.3315 )
									ret := 1.000000 // buy
								if( ci_wt2 > -13.3315 )
									ret := 0.091837
						if( d > 0.119917 )
							if( wt2 <= -75.3969 )
								ret := 0.500000
							if( wt2 > -75.3969 )
								ret := 1.000000 // buy
					if( ci_wt2 > -3.66592 )
						if( ci <= -56.616 )
							if( ap <= 14.2579 )
								ret := 0.750000 // buy
							if( ap > 14.2579 )
								if( d <= 0.114154 )
									ret := -0.503448
								if( d > 0.114154 )
									ret := 0.500000
						if( ci > -56.616 )
							if( tci <= -60.5755 )
								if( wt2 <= -68.3735 )
									ret := -0.833333 // sell
								if( wt2 > -68.3735 )
									ret := 0.645161
							if( tci > -60.5755 )
								ret := -1.000000 // sell
				if( wt2 > -61.5397 )
					if( wt2 <= 34.3235 )
						if( d <= 0.116095 )
							if( ap <= 13.8026 )
								if( d_tci <= 54.7183 )
									ret := -0.675676
								if( d_tci > 54.7183 )
									ret := 0.812500 // buy
							if( ap > 13.8026 )
								if( ci <= 30.8575 )
									ret := 0.325217
								if( ci > 30.8575 )
									ret := -0.470588
						if( d > 0.116095 )
							if( ci <= -24.168 )
								if( ci_wt2 <= -76.1159 )
									ret := 0.629630
								if( ci_wt2 > -76.1159 )
									ret := 0.980769 // buy
							if( ci > -24.168 )
								if( esa <= 14.4227 )
									ret := -1.000000 // sell
								if( esa > 14.4227 )
									ret := -0.750000 // sell
					if( wt2 > 34.3235 )
						if( wt2 <= 44.803 )
							if( ci <= -132.105 )
								ret := 1.000000 // buy
							if( ci > -132.105 )
								if( d <= 0.076165 )
									ret := -0.243243
								if( d > 0.076165 )
									ret := -0.894737 // sell
						if( wt2 > 44.803 )
							if( ci_wt2 <= 10.5085 )
								if( ap <= 16.2544 )
									ret := 0.052925
								if( ap > 16.2544 )
									ret := 0.750000 // buy
							if( ci_wt2 > 10.5085 )
								if( d_tci <= -53.2131 )
									ret := 0.711864 // buy
								if( d_tci > -53.2131 )
									ret := -0.066667
			if( esa > 16.2336 )
				if( d_tci <= 42.1736 )
					if( ap <= 24.2368 )
						if( d_tci <= -74.1536 )
							if( d_tci <= -76.9087 )
								if( wt2 <= 81.9893 )
									ret := 0.387500
								if( wt2 > 81.9893 )
									ret := -0.242424
							if( d_tci > -76.9087 )
								if( ci <= 56.035 )
									ret := 0.285714
								if( ci > 56.035 )
									ret := -0.398058
						if( d_tci > -74.1536 )
							if( d <= 0.06988 )
								if( wt2 <= 56.8829 )
									ret := 0.162053
								if( wt2 > 56.8829 )
									ret := 0.254386
							if( d > 0.06988 )
								if( wt2 <= 66.8684 )
									ret := -0.000711
								if( wt2 > 66.8684 )
									ret := 0.340249
					if( ap > 24.2368 )
						if( ci <= -95.9617 )
							if( tci <= -26.6716 )
								if( ci <= -103.939 )
									ret := 0.407407
								if( ci > -103.939 )
									ret := -0.181818
							if( tci > -26.6716 )
								if( ci_wt2 <= -117.658 )
									ret := -0.109091
								if( ci_wt2 > -117.658 )
									ret := -0.729167 // sell
						if( ci > -95.9617 )
							if( d <= 0.048859 )
								if( wt2 <= -37.9211 )
									ret := 0.625000
								if( wt2 > -37.9211 )
									ret := -0.088235
							if( d > 0.048859 )
								if( d <= 0.073565 )
									ret := 0.401786
								if( d > 0.073565 )
									ret := -0.031746
				if( d_tci > 42.1736 )
					if( d <= 0.079208 )
						if( ci <= -152.533 )
							if( d <= 0.064984 )
								if( ci_wt2 <= -141.469 )
									ret := -0.117647
								if( ci_wt2 > -141.469 )
									ret := 0.638554
							if( d > 0.064984 )
								ret := -1.000000 // sell
						if( ci > -152.533 )
							if( wt2 <= -46.6088 )
								if( wt2 <= -52.7498 )
									ret := 0.015120
								if( wt2 > -52.7498 )
									ret := 0.154200
							if( wt2 > -46.6088 )
								if( esa <= 23.0824 )
									ret := -0.115977
								if( esa > 23.0824 )
									ret := 0.172549
					if( d > 0.079208 )
						if( ci <= -47.1572 )
							if( ap <= 23.0301 )
								if( ci <= -84.7393 )
									ret := 0.301136
								if( ci > -84.7393 )
									ret := 0.634731
							if( ap > 23.0301 )
								if( ci <= -127.492 )
									ret := -0.750000 // sell
								if( ci > -127.492 )
									ret := 0.073171
						if( ci > -47.1572 )
							if( esa <= 21.352 )
								if( ci <= -42.6407 )
									ret := -1.000000 // sell
								if( ci > -42.6407 )
									ret := -0.750000 // sell
							if( esa > 21.352 )
								if( esa <= 23.0531 )
									ret := 0.600000
								if( esa > 23.0531 )
									ret := -0.789474 // sell
	if( ci_wt2 > 16.0038 )
		if( wt2 <= -71.4709 )
			if( tci <= -82.4087 )
				if( ci <= -65.9718 )
					if( d_tci <= 84.8679 )
						ret := 1.000000 // buy
					if( d_tci > 84.8679 )
						ret := -0.200000
				if( ci > -65.9718 )
					if( ap <= 20.9539 )
						ret := -1.000000 // sell
					if( ap > 20.9539 )
						ret := -0.750000 // sell
			if( tci > -82.4087 )
				if( esa <= 22.3938 )
					if( d <= 0.04567 )
						if( wt2 <= -73.0044 )
							if( d <= 0.043026 )
								if( d <= 0.040694 )
									ret := -0.013889
								if( d > 0.040694 )
									ret := 0.666667
							if( d > 0.043026 )
								if( ap <= 16.0465 )
									ret := -0.250000
								if( ap > 16.0465 )
									ret := -1.000000 // sell
						if( wt2 > -73.0044 )
							if( esa <= 17.8882 )
								if( esa <= 16.187 )
									ret := 0.333333
								if( esa > 16.187 )
									ret := 0.850000 // buy
							if( esa > 17.8882 )
								ret := 0.000000
					if( d > 0.04567 )
						if( ci <= -4.79727 )
							if( tci <= -73.4211 )
								if( wt2 <= -77.8837 )
									ret := 0.775862 // buy
								if( wt2 > -77.8837 )
									ret := 0.114286
							if( tci > -73.4211 )
								if( ap <= 15.9721 )
									ret := 0.266667
								if( ap > 15.9721 )
									ret := 0.847826 // buy
						if( ci > -4.79727 )
							if( ci <= 6.46241 )
								if( d <= 0.06689 )
									ret := -0.500000
								if( d > 0.06689 )
									ret := -1.000000 // sell
							if( ci > 6.46241 )
								if( tci <= -65.7164 )
									ret := 1.000000 // buy
								if( tci > -65.7164 )
									ret := 0.500000
				if( esa > 22.3938 )
					if( d <= 0.122373 )
						if( wt2 <= -73.7883 )
							if( esa <= 23.1485 )
								ret := 1.000000 // buy
							if( esa > 23.1485 )
								ret := 0.500000
						if( wt2 > -73.7883 )
							ret := -0.250000
					if( d > 0.122373 )
						if( d_tci <= 75.8161 )
							ret := -0.285714
						if( d_tci > 75.8161 )
							ret := -1.000000 // sell
		if( wt2 > -71.4709 )
			if( ci <= 171.522 )
				if( wt2 <= 75.9402 )
					if( tci <= 59.535 )
						if( ci <= 85.5123 )
							if( ap <= 18.4243 )
								if( tci <= -54.4505 )
									ret := -0.223013
								if( tci > -54.4505 )
									ret := -0.032679
							if( ap > 18.4243 )
								if( ci_wt2 <= 19.5537 )
									ret := -0.107692
								if( ci_wt2 > 19.5537 )
									ret := 0.039961
						if( ci > 85.5123 )
							if( tci <= 23.3663 )
								if( d <= 0.021282 )
									ret := -0.063781
								if( d > 0.021282 )
									ret := -0.206045
							if( tci > 23.3663 )
								if( ci_wt2 <= 37.8953 )
									ret := -0.524752
								if( ci_wt2 > 37.8953 )
									ret := -0.023640
					if( tci > 59.535 )
						if( ap <= 16.7996 )
							if( esa <= 15.2907 )
								if( esa <= 14.4111 )
									ret := 0.583333
								if( esa > 14.4111 )
									ret := -0.409091
							if( esa > 15.2907 )
								if( tci <= 77.3213 )
									ret := 0.354545
								if( tci > 77.3213 )
									ret := -0.344828
						if( ap > 16.7996 )
							if( wt2 <= 54.4057 )
								if( d_tci <= -65.4712 )
									ret := -0.333333
								if( d_tci > -65.4712 )
									ret := 0.366667
							if( wt2 > 54.4057 )
								if( ap <= 23.525 )
									ret := 0.035511
								if( ap > 23.525 )
									ret := -0.363636
				if( wt2 > 75.9402 )
					if( ap <= 17.9837 )
						if( tci <= 87.0408 )
							if( esa <= 15.9806 )
								if( ap <= 15.5106 )
									ret := 0.888889 // buy
								if( ap > 15.5106 )
									ret := 0.300000
							if( esa > 15.9806 )
								ret := 1.000000 // buy
						if( tci > 87.0408 )
							ret := 0.000000
					if( ap > 17.9837 )
						if( tci <= 79.9257 )
							ret := -1.000000 // sell
						if( tci > 79.9257 )
							if( tci <= 82.9309 )
								ret := 0.500000
							if( tci > 82.9309 )
								ret := -0.750000 // sell
			if( ci > 171.522 )
				if( d <= 0.050606 )
					if( wt2 <= -25.5784 )
						if( wt2 <= -39.7092 )
							ret := -0.833333 // sell
						if( wt2 > -39.7092 )
							if( d <= 0.034712 )
								if( esa <= 19.9008 )
									ret := 0.842105 // buy
								if( esa > 19.9008 )
									ret := 0.000000
							if( d > 0.034712 )
								ret := -0.333333
					if( wt2 > -25.5784 )
						if( d <= 0.013306 )
							if( d <= 0.013059 )
								if( ap <= 15.7908 )
									ret := 0.461538
								if( ap > 15.7908 )
									ret := -0.159091
							if( d > 0.013059 )
								ret := 1.000000 // buy
						if( d > 0.013306 )
							if( wt2 <= 51.1165 )
								if( wt2 <= 36.2985 )
									ret := -0.490716
								if( wt2 > 36.2985 )
									ret := 0.051282
							if( wt2 > 51.1165 )
								if( d <= 0.043142 )
									ret := -1.000000 // sell
								if( d > 0.043142 )
									ret := -0.250000
				if( d > 0.050606 )
					if( ci <= 211.431 )
						if( wt2 <= 32.5182 )
							if( ap <= 17.2862 )
								if( d_tci <= -44.9748 )
									ret := 1.000000 // buy
								if( d_tci > -44.9748 )
									ret := -0.600000
							if( ap > 17.2862 )
								if( ap <= 21.5733 )
									ret := 1.000000 // buy
								if( ap > 21.5733 )
									ret := 0.625000
						if( wt2 > 32.5182 )
							if( ap <= 18.1189 )
								ret := 0.500000
							if( ap > 18.1189 )
								ret := -0.800000 // sell
					if( ci > 211.431 )
						if( ci <= 239.944 )
							if( ap <= 19.3368 )
								ret := -0.750000 // sell
							if( ap > 19.3368 )
								ret := -1.000000 // sell
						if( ci > 239.944 )
							ret := 0.500000
	
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
float op_operation = decision_tree_0_U_1Min_0c21d693(ap, d_tci, ci, ci_wt2, tci, d, wt2, esa)

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


