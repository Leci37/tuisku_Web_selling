//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Wave_Trend_Calculation
// ID_model: HUBS_15Min_1WAV_1f249d7a Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_HUBS_15Min_1WAV_1f249d7a", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_HUBS_15Min_1f249d7a(d, esa, d_tci, ci_wt2, wt2, ci, ap, tci)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( wt2 <= 47.9424 )
		if( ci_wt2 <= 75.726 )
			if( d_tci <= -26.6085 )
				if( ci <= 68.69 )
					if( ap <= 171.524 )
						if( wt2 <= 28.2634 )
							if( ci_wt2 <= 8.27294 )
								if( ci_wt2 <= -4.75859 )
									ret := -0.111111
								if( ci_wt2 > -4.75859 )
									ret := 0.363636
							if( ci_wt2 > 8.27294 )
								if( d_tci <= -31.0881 )
									ret := 0.235294
								if( d_tci > -31.0881 )
									ret := -0.369668
						if( wt2 > 28.2634 )
							if( d_tci <= -45.2397 )
								if( d <= 1.06099 )
									ret := -0.204000
								if( d > 1.06099 )
									ret := 0.500000
							if( d_tci > -45.2397 )
								if( tci <= 37.1545 )
									ret := 0.039964
								if( tci > 37.1545 )
									ret := 0.185492
					if( ap > 171.524 )
						if( d <= 1.08918 )
							if( tci <= 30.4406 )
								if( d_tci <= -28.3589 )
									ret := 0.083333
								if( d_tci > -28.3589 )
									ret := -0.191860
							if( tci > 30.4406 )
								if( ci_wt2 <= -93.4613 )
									ret := 0.181818
								if( ci_wt2 > -93.4613 )
									ret := -0.320379
						if( d > 1.08918 )
							if( ci <= -86.8493 )
								if( tci <= 31.4009 )
									ret := 0.351351
								if( tci > 31.4009 )
									ret := 0.882353 // buy
							if( ci > -86.8493 )
								if( ci <= -72.5028 )
									ret := -0.700000 // sell
								if( ci > -72.5028 )
									ret := -0.086427
				if( ci > 68.69 )
					if( tci <= 33.4947 )
						if( ci <= 93.5528 )
							if( ap <= 515.952 )
								if( d <= 0.252857 )
									ret := -0.022222
								if( d > 0.252857 )
									ret := 0.427451
							if( ap > 515.952 )
								if( wt2 <= 21.7051 )
									ret := -0.583333
								if( wt2 > 21.7051 )
									ret := 0.033333
						if( ci > 93.5528 )
							if( wt2 <= 21.9649 )
								ret := -0.625000
							if( wt2 > 21.9649 )
								if( ci_wt2 <= 70.2831 )
									ret := -0.153846
								if( ci_wt2 > 70.2831 )
									ret := 0.047619
					if( tci > 33.4947 )
						if( esa <= 64.0559 )
							if( d <= 0.096412 )
								ret := -0.272727
							if( d > 0.096412 )
								if( d <= 0.138152 )
									ret := 0.954545 // buy
								if( d > 0.138152 )
									ret := 0.536000
						if( esa > 64.0559 )
							if( ap <= 449.862 )
								if( d <= 1.41804 )
									ret := -0.062121
								if( d > 1.41804 )
									ret := 0.292176
							if( ap > 449.862 )
								if( tci <= 46.428 )
									ret := -0.210361
								if( tci > 46.428 )
									ret := 0.128205
			if( d_tci > -26.6085 )
				if( d <= 6.99524 )
					if( wt2 <= -16.7041 )
						if( ap <= 807.328 )
							if( tci <= -7.92846 )
								if( esa <= 331.266 )
									ret := -0.044787
								if( esa > 331.266 )
									ret := 0.035236
							if( tci > -7.92846 )
								if( esa <= 488.458 )
									ret := -0.517241
								if( esa > 488.458 )
									ret := -0.869565 // sell
						if( ap > 807.328 )
							if( tci <= -30.5855 )
								if( wt2 <= -32.3241 )
									ret := -0.722222 // sell
								if( wt2 > -32.3241 )
									ret := -0.090909
							if( tci > -30.5855 )
								if( esa <= 831.859 )
									ret := -1.000000 // sell
								if( esa > 831.859 )
									ret := -0.722222 // sell
					if( wt2 > -16.7041 )
						if( ap <= 310.585 )
							if( wt2 <= 20.797 )
								if( ap <= 100.536 )
									ret := 0.027557
								if( ap > 100.536 )
									ret := 0.110096
							if( wt2 > 20.797 )
								if( d <= 0.104554 )
									ret := -0.662500
								if( d > 0.104554 )
									ret := 0.016092
						if( ap > 310.585 )
							if( ap <= 336.093 )
								if( wt2 <= 21.3463 )
									ret := -0.443340
								if( wt2 > 21.3463 )
									ret := 0.228571
							if( ap > 336.093 )
								if( ap <= 744.996 )
									ret := 0.001522
								if( ap > 744.996 )
									ret := 0.262774
				if( d > 6.99524 )
					if( ci_wt2 <= -61.9909 )
						if( esa <= 527.571 )
							if( wt2 <= -5.6658 )
								if( esa <= 466.003 )
									ret := 0.558824
								if( esa > 466.003 )
									ret := 0.972973 // buy
							if( wt2 > -5.6658 )
								if( esa <= 464.573 )
									ret := -0.966667 // sell
								if( esa > 464.573 )
									ret := 1.000000 // buy
						if( esa > 527.571 )
							if( d <= 11.9947 )
								if( ap <= 668.769 )
									ret := -0.546296
								if( ap > 668.769 )
									ret := -0.932203 // sell
							if( d > 11.9947 )
								if( tci <= -26.1767 )
									ret := 0.153846
								if( tci > -26.1767 )
									ret := -0.562500
					if( ci_wt2 > -61.9909 )
						if( ci_wt2 <= 21.8237 )
							if( esa <= 798.463 )
								if( ap <= 380.012 )
									ret := 0.839080 // buy
								if( ap > 380.012 )
									ret := 0.385103
							if( esa > 798.463 )
								ret := -0.571429
						if( ci_wt2 > 21.8237 )
							if( ap <= 464.52 )
								if( wt2 <= -5.96166 )
									ret := 0.830769 // buy
								if( wt2 > -5.96166 )
									ret := -0.035714
							if( ap > 464.52 )
								if( d <= 8.1795 )
									ret := 0.250000
								if( d > 8.1795 )
									ret := -0.600000
		if( ci_wt2 > 75.726 )
			if( ap <= 280.778 )
				if( esa <= 274.268 )
					if( wt2 <= -6.36053 )
						if( ci <= 91.4722 )
							if( ap <= 73.896 )
								if( tci <= -2.16778 )
									ret := -0.274760
								if( tci > -2.16778 )
									ret := 0.560000
							if( ap > 73.896 )
								if( ap <= 91.5311 )
									ret := 0.393939
								if( ap > 91.5311 )
									ret := -0.015901
						if( ci > 91.4722 )
							if( ci_wt2 <= 160.205 )
								if( esa <= 57.9613 )
									ret := 0.419355
								if( esa > 57.9613 )
									ret := -0.368035
							if( ci_wt2 > 160.205 )
								if( wt2 <= -49.2466 )
									ret := -0.766667 // sell
								if( wt2 > -49.2466 )
									ret := 0.036101
					if( wt2 > -6.36053 )
						if( ci_wt2 <= 190.403 )
							if( ci <= 173.151 )
								if( ap <= 98.9174 )
									ret := -0.120718
								if( ap > 98.9174 )
									ret := 0.040082
							if( ci > 173.151 )
								if( esa <= 165.945 )
									ret := 0.565217
								if( esa > 165.945 )
									ret := -0.279070
						if( ci_wt2 > 190.403 )
							if( ap <= 189.666 )
								if( d_tci <= -25.5657 )
									ret := -0.943396 // sell
								if( d_tci > -25.5657 )
									ret := -0.205882
							if( ap > 189.666 )
								ret := 0.333333
				if( esa > 274.268 )
					if( tci <= -21.6619 )
						if( d <= 2.47328 )
							if( ci_wt2 <= 103.81 )
								ret := -0.857143 // sell
							if( ci_wt2 > 103.81 )
								ret := -0.750000 // sell
						if( d > 2.47328 )
							ret := -0.272727
					if( tci > -21.6619 )
						if( wt2 <= -21.8886 )
							ret := 1.000000 // buy
						if( wt2 > -21.8886 )
							if( d <= 0.752064 )
								ret := 1.000000 // buy
							if( d > 0.752064 )
								if( d <= 1.2955 )
									ret := -0.272727
								if( d > 1.2955 )
									ret := 0.343750
			if( ap > 280.778 )
				if( d <= 7.67189 )
					if( ap <= 414.793 )
						if( d <= 1.71701 )
							if( ci_wt2 <= 133.171 )
								if( esa <= 343.863 )
									ret := -0.134177
								if( esa > 343.863 )
									ret := -0.440141
							if( ci_wt2 > 133.171 )
								if( ap <= 307.187 )
									ret := 0.449153
								if( ap > 307.187 )
									ret := -0.351064
						if( d > 1.71701 )
							if( ci <= 131.831 )
								if( esa <= 307.573 )
									ret := -0.764259 // sell
								if( esa > 307.573 )
									ret := -0.326957
							if( ci > 131.831 )
								if( d_tci <= -18.0068 )
									ret := -0.530303
								if( d_tci > -18.0068 )
									ret := 0.309524
					if( ap > 414.793 )
						if( ap <= 776.11 )
							if( tci <= 24.8198 )
								if( wt2 <= 5.69827 )
									ret := -0.030404
								if( wt2 > 5.69827 )
									ret := 0.354430
							if( tci > 24.8198 )
								if( ci <= 177.533 )
									ret := -0.166895
								if( ci > 177.533 )
									ret := -0.528169
						if( ap > 776.11 )
							if( esa <= 796.746 )
								if( d_tci <= 1.98454 )
									ret := -0.603774
								if( d_tci > 1.98454 )
									ret := -0.977778 // sell
							if( esa > 796.746 )
								if( wt2 <= -31.7033 )
									ret := -0.761905 // sell
								if( wt2 > -31.7033 )
									ret := 0.057471
				if( d > 7.67189 )
					if( tci <= -29.3031 )
						if( ci_wt2 <= 103.852 )
							ret := 1.000000 // buy
						if( ci_wt2 > 103.852 )
							ret := 0.842105 // buy
					if( tci > -29.3031 )
						if( esa <= 771.634 )
							if( d <= 12.9188 )
								if( d_tci <= 7.93592 )
									ret := 0.463768
								if( d_tci > 7.93592 )
									ret := -0.400000
							if( d > 12.9188 )
								if( ci_wt2 <= 130.954 )
									ret := 1.000000 // buy
								if( ci_wt2 > 130.954 )
									ret := 0.800000 // buy
						if( esa > 771.634 )
							ret := -1.000000 // sell
	if( wt2 > 47.9424 )
		if( tci <= 56.1566 )
			if( ci <= -74.0104 )
				if( ap <= 354.053 )
					if( esa <= 161.749 )
						if( d <= 0.685138 )
							if( d_tci <= -34.9668 )
								if( ci <= -92.4967 )
									ret := 0.800000 // buy
								if( ci > -92.4967 )
									ret := 0.928571 // buy
							if( d_tci > -34.9668 )
								ret := 0.500000
						if( d > 0.685138 )
							ret := 0.300000
					if( esa > 161.749 )
						if( ci <= -83.3143 )
							if( d_tci <= -34.3252 )
								ret := -0.272727
							if( d_tci > -34.3252 )
								ret := 0.083333
						if( ci > -83.3143 )
							ret := 0.714286 // buy
				if( ap > 354.053 )
					if( tci <= 44.7101 )
						if( esa <= 587.795 )
							if( d <= 2.30254 )
								ret := 0.777778 // buy
							if( d > 2.30254 )
								ret := 1.000000 // buy
						if( esa > 587.795 )
							if( d_tci <= -30.4755 )
								ret := 0.384615
							if( d_tci > -30.4755 )
								ret := 1.000000 // buy
					if( tci > 44.7101 )
						ret := 0.363636
			if( ci > -74.0104 )
				if( ap <= 460.803 )
					if( d <= 0.969061 )
						if( esa <= 150.04 )
							if( esa <= 104.33 )
								if( ap <= 102.007 )
									ret := -0.008772
								if( ap > 102.007 )
									ret := -0.833333 // sell
							if( esa > 104.33 )
								if( ci <= -29.9996 )
									ret := 0.714286 // buy
								if( ci > -29.9996 )
									ret := 0.297101
						if( esa > 150.04 )
							if( ci <= -64.5529 )
								ret := -0.850000 // sell
							if( ci > -64.5529 )
								if( ci_wt2 <= -18.442 )
									ret := -0.149390
								if( ci_wt2 > -18.442 )
									ret := 0.070485
					if( d > 0.969061 )
						if( esa <= 144.596 )
							if( esa <= 83.3274 )
								ret := -1.000000 // sell
							if( esa > 83.3274 )
								if( esa <= 125.971 )
									ret := 0.934426 // buy
								if( esa > 125.971 )
									ret := 0.532544
						if( esa > 144.596 )
							if( esa <= 428.172 )
								if( ap <= 415.685 )
									ret := 0.201770
								if( ap > 415.685 )
									ret := -0.417722
							if( esa > 428.172 )
								if( ci <= 19.0031 )
									ret := 0.520000
								if( ci > 19.0031 )
									ret := 0.898305 // buy
				if( ap > 460.803 )
					if( ci_wt2 <= -0.765322 )
						if( esa <= 587.229 )
							if( esa <= 488.989 )
								if( ci_wt2 <= -109.628 )
									ret := -1.000000 // sell
								if( ci_wt2 > -109.628 )
									ret := -0.141304
							if( esa > 488.989 )
								if( esa <= 579.805 )
									ret := 0.182870
								if( esa > 579.805 )
									ret := 0.857143 // buy
						if( esa > 587.229 )
							if( ap <= 783.359 )
								if( ci <= 10.9638 )
									ret := -0.651376
								if( ci > 10.9638 )
									ret := -0.064815
							if( ap > 783.359 )
								if( esa <= 812.542 )
									ret := 1.000000 // buy
								if( esa > 812.542 )
									ret := -0.454545
					if( ci_wt2 > -0.765322 )
						if( ci_wt2 <= 25.9469 )
							if( ap <= 656.631 )
								if( tci <= 54.8948 )
									ret := -0.487654
								if( tci > 54.8948 )
									ret := -0.787234 // sell
							if( ap > 656.631 )
								if( ap <= 675.771 )
									ret := 0.764706 // buy
								if( ap > 675.771 )
									ret := -0.292683
						if( ci_wt2 > 25.9469 )
							if( ci <= 88.0857 )
								if( ci_wt2 <= 29.9097 )
									ret := 0.571429
								if( ci_wt2 > 29.9097 )
									ret := 0.125000
							if( ci > 88.0857 )
								if( ci_wt2 <= 67.1427 )
									ret := -0.437500
								if( ci_wt2 > 67.1427 )
									ret := 0.714286 // buy
		if( tci > 56.1566 )
			if( ap <= 400.06 )
				if( ci <= 119.028 )
					if( ci <= 103.917 )
						if( wt2 <= 54.204 )
							if( d_tci <= -54.3814 )
								if( ci <= 64.273 )
									ret := 0.900000 // buy
								if( ci > 64.273 )
									ret := 0.395939
							if( d_tci > -54.3814 )
								ret := -0.315789
						if( wt2 > 54.204 )
							if( ci <= 85.5831 )
								if( tci <= 68.5866 )
									ret := 0.116646
								if( tci > 68.5866 )
									ret := -0.060317
							if( ci > 85.5831 )
								if( wt2 <= 68.3317 )
									ret := -0.356589
								if( wt2 > 68.3317 )
									ret := 0.185841
					if( ci > 103.917 )
						if( wt2 <= 58.5252 )
							if( ci_wt2 <= 55.817 )
								if( tci <= 60.3565 )
									ret := 0.729730 // buy
								if( tci > 60.3565 )
									ret := 0.272727
							if( ci_wt2 > 55.817 )
								if( wt2 <= 50.6253 )
									ret := 0.066667
								if( wt2 > 50.6253 )
									ret := -0.473684
						if( wt2 > 58.5252 )
							if( ap <= 152.118 )
								if( wt2 <= 60.4515 )
									ret := 0.583333
								if( wt2 > 60.4515 )
									ret := -0.016949
							if( ap > 152.118 )
								if( tci <= 83.8792 )
									ret := 0.690722
								if( tci > 83.8792 )
									ret := -0.166667
				if( ci > 119.028 )
					if( esa <= 65.8811 )
						ret := 0.583333
					if( esa > 65.8811 )
						if( ap <= 148.639 )
							if( ap <= 93.124 )
								if( ci_wt2 <= 79.6377 )
									ret := -0.638889
								if( ci_wt2 > 79.6377 )
									ret := 0.178571
							if( ap > 93.124 )
								if( ci <= 129.978 )
									ret := -0.458333
								if( ci > 129.978 )
									ret := -0.796610 // sell
						if( ap > 148.639 )
							if( ci_wt2 <= 161.698 )
								if( wt2 <= 57.9596 )
									ret := -0.469231
								if( wt2 > 57.9596 )
									ret := 0.144144
							if( ci_wt2 > 161.698 )
								ret := 0.894737 // buy
			if( ap > 400.06 )
				if( d <= 16.6797 )
					if( tci <= 61.9648 )
						if( ci_wt2 <= -81.7655 )
							ret := 0.705882 // buy
						if( ci_wt2 > -81.7655 )
							if( ci <= 140.265 )
								if( ap <= 553.396 )
									ret := -0.178645
								if( ap > 553.396 )
									ret := 0.072674
							if( ci > 140.265 )
								if( esa <= 490.592 )
									ret := -0.111111
								if( esa > 490.592 )
									ret := -1.000000 // sell
					if( tci > 61.9648 )
						if( d_tci <= -59.355 )
							if( ci <= 72.0922 )
								if( ap <= 450.637 )
									ret := -0.584906
								if( ap > 450.637 )
									ret := 0.197411
							if( ci > 72.0922 )
								if( ap <= 415.926 )
									ret := -0.950000 // sell
								if( ap > 415.926 )
									ret := -0.218295
						if( d_tci > -59.355 )
							if( wt2 <= 54.0764 )
								ret := -0.071429
							if( wt2 > 54.0764 )
								if( d <= 10.9076 )
									ret := -0.741573 // sell
								if( d > 10.9076 )
									ret := -0.200000
				if( d > 16.6797 )
					if( wt2 <= 74.669 )
						if( ap <= 704.186 )
							ret := 0.800000 // buy
						if( ap > 704.186 )
							ret := -0.500000
					if( wt2 > 74.669 )
						if( d_tci <= -61.411 )
							ret := 0.888889 // buy
						if( d_tci > -61.411 )
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
float op_operation = decision_tree_0_HUBS_15Min_1f249d7a(d, esa, d_tci, ci_wt2, wt2, ci, ap, tci)

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


