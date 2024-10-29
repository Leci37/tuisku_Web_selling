//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Wave_Trend_Calculation
// ID_model: UNIUSDT_15Min_1WAV_820108c8 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UNIUSDT_15Min_1WAV_820108c8", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UNIUSDT_15Min_820108c8(ap, d_tci, ci, ci_wt2, tci, d, wt2, esa)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( tci <= -41.5393 )
		if( wt2 <= -30.6002 )
			if( ci <= -57.898 )
				if( d <= 0.034422 )
					if( wt2 <= -50.1502 )
						if( tci <= -53.2501 )
							if( ci_wt2 <= -89.4583 )
								if( ci_wt2 <= -94.8444 )
									ret := 0.217391
								if( ci_wt2 > -94.8444 )
									ret := 0.857143 // buy
							if( ci_wt2 > -89.4583 )
								if( ci <= -62.7233 )
									ret := -0.102014
								if( ci > -62.7233 )
									ret := 0.257485
						if( tci > -53.2501 )
							if( ci <= -75.5419 )
								if( ap <= 6.28625 )
									ret := -0.948718 // sell
								if( ap > 6.28625 )
									ret := -0.375000
							if( ci > -75.5419 )
								if( d <= 0.008852 )
									ret := -0.733333 // sell
								if( d > 0.008852 )
									ret := -0.291139
					if( wt2 > -50.1502 )
						if( wt2 <= -48.5415 )
							if( tci <= -61.5142 )
								ret := -0.888889 // sell
							if( tci > -61.5142 )
								if( ci <= -62.093 )
									ret := 0.292776
								if( ci > -62.093 )
									ret := 0.772727 // buy
						if( wt2 > -48.5415 )
							if( ci_wt2 <= -122.231 )
								if( ci_wt2 <= -135.954 )
									ret := 0.090090
								if( ci_wt2 > -135.954 )
									ret := -0.640625
							if( ci_wt2 > -122.231 )
								if( esa <= 10.7105 )
									ret := 0.096965
								if( esa > 10.7105 )
									ret := -0.550000
				if( d > 0.034422 )
					if( ci <= -161.802 )
						if( d <= 0.038801 )
							if( d <= 0.036416 )
								if( wt2 <= -48.1998 )
									ret := 1.000000 // buy
								if( wt2 > -48.1998 )
									ret := 0.615385
							if( d > 0.036416 )
								ret := 1.000000 // buy
						if( d > 0.038801 )
							if( d_tci <= 53.3553 )
								if( tci <= -51.78 )
									ret := 1.000000 // buy
								if( tci > -51.78 )
									ret := 0.384615
							if( d_tci > 53.3553 )
								if( d_tci <= 73.5702 )
									ret := 0.254717
								if( d_tci > 73.5702 )
									ret := 0.900000 // buy
					if( ci > -161.802 )
						if( esa <= 5.75496 )
							if( d_tci <= 55.4866 )
								if( ci <= -88.4757 )
									ret := 0.296875
								if( ci > -88.4757 )
									ret := 0.661442
							if( d_tci > 55.4866 )
								if( esa <= 4.25094 )
									ret := -0.238462
								if( esa > 4.25094 )
									ret := 0.217245
						if( esa > 5.75496 )
							if( wt2 <= -79.3301 )
								if( ap <= 7.00275 )
									ret := 0.772152 // buy
								if( ap > 7.00275 )
									ret := 0.000000
							if( wt2 > -79.3301 )
								if( d_tci <= 55.767 )
									ret := 0.215772
								if( d_tci > 55.767 )
									ret := 0.078517
			if( ci > -57.898 )
				if( ap <= 3.8717 )
					if( tci <= -47.7449 )
						if( wt2 <= -69.1475 )
							ret := 1.000000 // buy
						if( wt2 > -69.1475 )
							if( esa <= 3.61672 )
								ret := 1.000000 // buy
							if( esa > 3.61672 )
								if( d_tci <= 57.7484 )
									ret := 0.631579
								if( d_tci > 57.7484 )
									ret := 0.000000
					if( tci > -47.7449 )
						ret := -0.176471
				if( ap > 3.8717 )
					if( d_tci <= 78.2726 )
						if( esa <= 7.5558 )
							if( esa <= 6.87502 )
								if( tci <= -57.0188 )
									ret := 0.074612
								if( tci > -57.0188 )
									ret := 0.009356
							if( esa > 6.87502 )
								if( ci <= -50.7713 )
									ret := 0.251701
								if( ci > -50.7713 )
									ret := -0.148454
						if( esa > 7.5558 )
							if( ci <= -25.0395 )
								if( wt2 <= -68.0704 )
									ret := 0.777778 // buy
								if( wt2 > -68.0704 )
									ret := 0.203655
							if( ci > -25.0395 )
								if( tci <= -44.3861 )
									ret := -0.119792
								if( tci > -44.3861 )
									ret := 0.233766
					if( d_tci > 78.2726 )
						if( esa <= 6.64551 )
							if( d_tci <= 81.1622 )
								ret := -0.714286 // sell
							if( d_tci > 81.1622 )
								if( esa <= 5.45113 )
									ret := -0.777778 // sell
								if( esa > 5.45113 )
									ret := -1.000000 // sell
						if( esa > 6.64551 )
							ret := 0.120000
		if( wt2 > -30.6002 )
			if( d_tci <= 44.199 )
				if( tci <= -42.4672 )
					if( ci_wt2 <= -88.6217 )
						if( ap <= 8.02788 )
							if( ci <= -147.818 )
								if( tci <= -43.4036 )
									ret := 0.083333
								if( tci > -43.4036 )
									ret := 0.875000 // buy
							if( ci > -147.818 )
								ret := -0.318182
						if( ap > 8.02788 )
							ret := -0.642857
					if( ci_wt2 > -88.6217 )
						ret := 0.923077 // buy
				if( tci > -42.4672 )
					if( ap <= 7.85877 )
						if( ci_wt2 <= -113.182 )
							if( tci <= -42.0909 )
								ret := 0.058824
							if( tci > -42.0909 )
								ret := 0.777778 // buy
						if( ci_wt2 > -113.182 )
							if( d_tci <= 41.7857 )
								ret := 0.333333
							if( d_tci > 41.7857 )
								if( wt2 <= -29.7969 )
									ret := -0.166667
								if( wt2 > -29.7969 )
									ret := -0.634146
					if( ap > 7.85877 )
						ret := -0.846154 // sell
			if( d_tci > 44.199 )
				if( ci_wt2 <= -125.859 )
					if( d_tci <= 47.387 )
						if( ap <= 5.62085 )
							ret := -0.363636
						if( ap > 5.62085 )
							if( wt2 <= -28.569 )
								ret := 0.000000
							if( wt2 > -28.569 )
								ret := 0.666667
					if( d_tci > 47.387 )
						if( ap <= 5.56867 )
							ret := -0.909091 // sell
						if( ap > 5.56867 )
							ret := -0.444444
				if( ci_wt2 > -125.859 )
					if( d <= 0.041951 )
						if( d <= 0.02038 )
							ret := -0.600000
						if( d > 0.02038 )
							ret := -0.777778 // sell
					if( d > 0.041951 )
						if( wt2 <= -29.6597 )
							ret := -0.937500 // sell
						if( wt2 > -29.6597 )
							ret := -1.000000 // sell
	if( tci > -41.5393 )
		if( esa <= 7.17127 )
			if( ci <= -42.1733 )
				if( ci <= -44.5802 )
					if( ci_wt2 <= -195.578 )
						if( ap <= 6.49025 )
							if( ci_wt2 <= -221.287 )
								if( d <= 0.04069 )
									ret := -0.750000 // sell
								if( d > 0.04069 )
									ret := -0.428571
							if( ci_wt2 > -221.287 )
								if( ci <= -177.781 )
									ret := 0.622951
								if( ci > -177.781 )
									ret := -0.285714
						if( ap > 6.49025 )
							if( d_tci <= 11.2892 )
								if( ci <= -166.089 )
									ret := 0.458333
								if( ci > -166.089 )
									ret := 1.000000 // buy
							if( d_tci > 11.2892 )
								ret := 0.947368 // buy
					if( ci_wt2 > -195.578 )
						if( wt2 <= 61.448 )
							if( esa <= 6.93456 )
								if( ap <= 6.18635 )
									ret := 0.047067
								if( ap > 6.18635 )
									ret := -0.015385
							if( esa > 6.93456 )
								if( ci_wt2 <= -157.942 )
									ret := -0.453125
								if( ci_wt2 > -157.942 )
									ret := 0.145468
						if( wt2 > 61.448 )
							if( d <= 0.024375 )
								ret := -0.454545
							if( d > 0.024375 )
								if( ap <= 6.09923 )
									ret := -0.916667 // sell
								if( ap > 6.09923 )
									ret := -0.800000 // sell
				if( ci > -44.5802 )
					if( ci_wt2 <= -71.5117 )
						if( ap <= 5.02633 )
							ret := -0.842105 // sell
						if( ap > 5.02633 )
							if( wt2 <= 43.9616 )
								if( esa <= 6.05366 )
									ret := -0.235294
								if( esa > 6.05366 )
									ret := 0.361702
							if( wt2 > 43.9616 )
								if( ci <= -43.0494 )
									ret := -0.318182
								if( ci > -43.0494 )
									ret := 0.000000
					if( ci_wt2 > -71.5117 )
						if( d_tci <= -15.1552 )
							if( wt2 <= 24.9774 )
								if( d <= 0.025361 )
									ret := 0.700000 // buy
								if( d > 0.025361 )
									ret := 0.636364
							if( wt2 > 24.9774 )
								ret := 1.000000 // buy
						if( d_tci > -15.1552 )
							if( ap <= 5.58895 )
								if( wt2 <= -35.5914 )
									ret := -0.500000
								if( wt2 > -35.5914 )
									ret := 0.174497
							if( ap > 5.58895 )
								if( wt2 <= -18.1867 )
									ret := 0.559322
								if( wt2 > -18.1867 )
									ret := 0.217105
			if( ci > -42.1733 )
				if( d_tci <= -74.576 )
					if( tci <= 74.9176 )
						if( esa <= 6.03617 )
							ret := 0.666667
						if( esa > 6.03617 )
							if( d_tci <= -74.7342 )
								ret := 1.000000 // buy
							if( d_tci > -74.7342 )
								ret := 0.777778 // buy
					if( tci > 74.9176 )
						if( ci <= 141.073 )
							if( tci <= 84.196 )
								if( ci_wt2 <= 53.771 )
									ret := 0.263858
								if( ci_wt2 > 53.771 )
									ret := -0.448276
							if( tci > 84.196 )
								if( ci <= 89.0893 )
									ret := 0.285714
								if( ci > 89.0893 )
									ret := -0.413793
						if( ci > 141.073 )
							if( d_tci <= -82.5153 )
								ret := 1.000000 // buy
							if( d_tci > -82.5153 )
								ret := 0.625000
				if( d_tci > -74.576 )
					if( ci <= 218.784 )
						if( d_tci <= 21.1222 )
							if( d_tci <= 19.9334 )
								if( esa <= 6.31916 )
									ret := 0.011485
								if( esa > 6.31916 )
									ret := -0.036573
							if( d_tci > 19.9334 )
								if( d <= 0.022956 )
									ret := 0.075130
								if( d > 0.022956 )
									ret := 0.366492
						if( d_tci > 21.1222 )
							if( ci_wt2 <= 20.2056 )
								if( ci <= -16.3848 )
									ret := -0.117869
								if( ci > -16.3848 )
									ret := -0.371429
							if( ci_wt2 > 20.2056 )
								if( ap <= 6.38769 )
									ret := -0.052870
								if( ap > 6.38769 )
									ret := 0.028179
					if( ci > 218.784 )
						if( ci <= 240.641 )
							if( d <= 0.019763 )
								if( d <= 0.01464 )
									ret := 0.900000 // buy
								if( d > 0.01464 )
									ret := 1.000000 // buy
							if( d > 0.019763 )
								if( esa <= 6.02998 )
									ret := 0.125000
								if( esa > 6.02998 )
									ret := 0.681818
						if( ci > 240.641 )
							ret := 0.100000
		if( esa > 7.17127 )
			if( ci <= -86.0446 )
				if( wt2 <= -19.5509 )
					if( ap <= 9.91889 )
						if( ap <= 7.59013 )
							if( tci <= -40.2303 )
								if( wt2 <= -28.7166 )
									ret := 1.000000 // buy
								if( wt2 > -28.7166 )
									ret := 0.636364
							if( tci > -40.2303 )
								if( d_tci <= 39.5598 )
									ret := 0.275862
								if( d_tci > 39.5598 )
									ret := -0.583333
						if( ap > 7.59013 )
							if( d_tci <= 35.1764 )
								if( wt2 <= -22.5464 )
									ret := -0.704225 // sell
								if( wt2 > -22.5464 )
									ret := 0.185185
							if( d_tci > 35.1764 )
								if( ci <= -133.272 )
									ret := 0.560976
								if( ci > -133.272 )
									ret := 0.148515
					if( ap > 9.91889 )
						if( d <= 0.055576 )
							if( esa <= 10.5541 )
								if( ci <= -111.118 )
									ret := 1.000000 // buy
								if( ci > -111.118 )
									ret := 0.642857
							if( esa > 10.5541 )
								if( ci <= -114.6 )
									ret := 0.407407
								if( ci > -114.6 )
									ret := -0.236842
						if( d > 0.055576 )
							if( ap <= 12.0573 )
								if( d_tci <= 36.7496 )
									ret := 0.914894 // buy
								if( d_tci > 36.7496 )
									ret := 0.575758
							if( ap > 12.0573 )
								ret := 0.190476
				if( wt2 > -19.5509 )
					if( wt2 <= -16.3923 )
						if( d <= 0.122541 )
							if( ci_wt2 <= -73.5409 )
								if( ci <= -140.598 )
									ret := -0.840909 // sell
								if( ci > -140.598 )
									ret := -0.483871
							if( ci_wt2 > -73.5409 )
								ret := 0.666667
						if( d > 0.122541 )
							ret := 0.352941
					if( wt2 > -16.3923 )
						if( d_tci <= -26.8343 )
							if( ci_wt2 <= -152.67 )
								if( ap <= 7.76007 )
									ret := 0.200000
								if( ap > 7.76007 )
									ret := -0.727273 // sell
							if( ci_wt2 > -152.67 )
								if( ci_wt2 <= -144.949 )
									ret := 0.434783
								if( ci_wt2 > -144.949 )
									ret := 0.833333 // buy
						if( d_tci > -26.8343 )
							if( wt2 <= 29.3977 )
								if( d_tci <= -14.8966 )
									ret := 0.634146
								if( d_tci > -14.8966 )
									ret := 0.004734
							if( wt2 > 29.3977 )
								if( tci <= 25.6898 )
									ret := -0.201058
								if( tci > 25.6898 )
									ret := -0.928571 // sell
			if( ci > -86.0446 )
				if( wt2 <= 64.8734 )
					if( d <= 0.138309 )
						if( wt2 <= 47.5526 )
							if( wt2 <= 0.019329 )
								if( ci_wt2 <= 202.322 )
									ret := -0.043737
								if( ci_wt2 > 202.322 )
									ret := -0.750000 // sell
							if( wt2 > 0.019329 )
								if( ci_wt2 <= 9.94659 )
									ret := -0.163029
								if( ci_wt2 > 9.94659 )
									ret := -0.094155
						if( wt2 > 47.5526 )
							if( d_tci <= -48.8016 )
								if( esa <= 11.0061 )
									ret := 0.091854
								if( esa > 11.0061 )
									ret := -0.275472
							if( d_tci > -48.8016 )
								if( ci <= -58.1781 )
									ret := 0.407407
								if( ci > -58.1781 )
									ret := -0.131737
					if( d > 0.138309 )
						if( esa <= 13.8043 )
							if( ci <= 26.802 )
								if( esa <= 10.5951 )
									ret := 0.216216
								if( esa > 10.5951 )
									ret := 0.632000
							if( ci > 26.802 )
								if( d <= 0.16924 )
									ret := 0.266667
								if( d > 0.16924 )
									ret := -0.303030
						if( esa > 13.8043 )
							if( ci_wt2 <= 4.00094 )
								if( wt2 <= 48.5628 )
									ret := 0.230769
								if( wt2 > 48.5628 )
									ret := 1.000000 // buy
							if( ci_wt2 > 4.00094 )
								ret := -0.384615
				if( wt2 > 64.8734 )
					if( tci <= 76.7537 )
						if( ci_wt2 <= -61.8728 )
							if( esa <= 8.23136 )
								if( wt2 <= 65.6183 )
									ret := 0.076923
								if( wt2 > 65.6183 )
									ret := 0.621622
							if( esa > 8.23136 )
								if( tci <= 60.0408 )
									ret := -0.625000
								if( tci > 60.0408 )
									ret := 0.000000
						if( ci_wt2 > -61.8728 )
							if( tci <= 68.353 )
								if( esa <= 10.0855 )
									ret := -0.479638
								if( esa > 10.0855 )
									ret := -0.100000
							if( tci > 68.353 )
								if( d_tci <= -70.4509 )
									ret := -0.408163
								if( d_tci > -70.4509 )
									ret := -0.830986 // sell
					if( tci > 76.7537 )
						if( d <= 0.362344 )
							if( wt2 <= 71.6864 )
								ret := -0.529412
							if( wt2 > 71.6864 )
								if( ci_wt2 <= 32.1245 )
									ret := 0.100000
								if( ci_wt2 > 32.1245 )
									ret := 0.596491
						if( d > 0.362344 )
							if( tci <= 87.433 )
								ret := -0.526316
							if( tci > 87.433 )
								ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_UNIUSDT_15Min_820108c8(ap, d_tci, ci, ci_wt2, tci, d, wt2, esa)

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


