//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ultimate_MA_MTF_V2
// ID_model: TRXUSDT_15Min_1ULT_8e5bd04c Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TRXUSDT_15Min_1ULT_8e5bd04c", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TRXUSDT_15Min_8e5bd04c(avg2, cr_down2Int, avg, cr_up2Int, ma_downInt, ma_upInt, cr_upInt, cr_downInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( avg <= 0.062046 )
		if( cr_upInt <= 0.5 )
			if( avg <= 0.050011 )
				if( avg2 <= 0.050787 )
					if( ma_downInt <= 0.5 )
						if( avg <= 0.049562 )
							if( avg2 <= 0.049478 )
								ret := 0.000000
							if( avg2 > 0.049478 )
								if( avg <= 0.048619 )
									ret := -0.230769
								if( avg > 0.048619 )
									ret := 0.859375 // buy
						if( avg > 0.049562 )
							if( avg <= 0.049759 )
								if( avg2 <= 0.049566 )
									ret := -0.666667
								if( avg2 > 0.049566 )
									ret := -0.388889
							if( avg > 0.049759 )
								if( avg <= 0.049869 )
									ret := 0.666667
								if( avg > 0.049869 )
									ret := -0.033333
					if( ma_downInt > 0.5 )
						if( cr_downInt <= 0.5 )
							if( avg2 <= 0.050045 )
								ret := 0.153226
							if( avg2 > 0.050045 )
								if( avg2 <= 0.050305 )
									ret := 0.677419
								if( avg2 > 0.050305 )
									ret := 0.923077 // buy
						if( cr_downInt > 0.5 )
							ret := 1.000000 // buy
				if( avg2 > 0.050787 )
					ret := 1.000000 // buy
			if( avg > 0.050011 )
				if( avg <= 0.055907 )
					if( avg2 <= 0.055101 )
						if( avg <= 0.051496 )
							if( avg <= 0.051213 )
								if( avg <= 0.050157 )
									ret := -0.324324
								if( avg > 0.050157 )
									ret := 0.143863
							if( avg > 0.051213 )
								if( ma_downInt <= 0.5 )
									ret := 0.885417 // buy
								if( ma_downInt > 0.5 )
									ret := 0.333333
						if( avg > 0.051496 )
							if( ma_upInt <= 0.5 )
								if( cr_downInt <= 0.5 )
									ret := 0.061550
								if( cr_downInt > 0.5 )
									ret := 0.357143
							if( ma_upInt > 0.5 )
								if( cr_downInt <= 0.5 )
									ret := 0.005093
								if( cr_downInt > 0.5 )
									ret := 0.111111
					if( avg2 > 0.055101 )
						if( avg2 <= 0.056117 )
							if( cr_down2Int <= 0.5 )
								if( ma_upInt <= 0.5 )
									ret := -0.179439
								if( ma_upInt > 0.5 )
									ret := -0.380208
							if( cr_down2Int > 0.5 )
								if( avg2 <= 0.055373 )
									ret := -0.045455
								if( avg2 > 0.055373 )
									ret := -0.769231 // sell
						if( avg2 > 0.056117 )
							if( ma_downInt <= 0.5 )
								ret := -0.318182
							if( ma_downInt > 0.5 )
								if( avg <= 0.055775 )
									ret := 0.500000
								if( avg > 0.055775 )
									ret := 0.903226 // buy
				if( avg > 0.055907 )
					if( avg <= 0.056333 )
						if( ma_downInt <= 0.5 )
							if( avg2 <= 0.055566 )
								if( avg2 <= 0.055093 )
									ret := 0.666667
								if( avg2 > 0.055093 )
									ret := -0.200000
							if( avg2 > 0.055566 )
								if( avg <= 0.056136 )
									ret := 1.000000 // buy
								if( avg > 0.056136 )
									ret := 0.921569 // buy
						if( ma_downInt > 0.5 )
							if( avg <= 0.0562 )
								if( avg <= 0.05596 )
									ret := 1.000000 // buy
								if( avg > 0.05596 )
									ret := 0.600000
							if( avg > 0.0562 )
								if( avg <= 0.056253 )
									ret := -0.461538
								if( avg > 0.056253 )
									ret := 0.133333
					if( avg > 0.056333 )
						if( ma_upInt <= 0.5 )
							if( avg <= 0.058155 )
								if( avg <= 0.057512 )
									ret := 0.007782
								if( avg > 0.057512 )
									ret := -0.525773
							if( avg > 0.058155 )
								if( avg2 <= 0.05972 )
									ret := 0.548638
								if( avg2 > 0.05972 )
									ret := 0.175692
						if( ma_upInt > 0.5 )
							if( avg <= 0.056835 )
								if( avg <= 0.056582 )
									ret := -0.181818
								if( avg > 0.056582 )
									ret := -0.586957
							if( avg > 0.056835 )
								if( cr_up2Int <= 0.5 )
									ret := 0.054267
								if( cr_up2Int > 0.5 )
									ret := -0.322581
		if( cr_upInt > 0.5 )
			if( avg <= 0.050725 )
				if( avg <= 0.049567 )
					if( avg2 <= 0.049673 )
						ret := 1.000000 // buy
					if( avg2 > 0.049673 )
						ret := 0.466667
				if( avg > 0.049567 )
					if( avg2 <= 0.050455 )
						ret := -0.208333
					if( avg2 > 0.050455 )
						if( avg <= 0.050628 )
							if( ma_downInt <= 0.5 )
								ret := 1.000000 // buy
							if( ma_downInt > 0.5 )
								ret := 0.214286
						if( avg > 0.050628 )
							ret := 0.882353 // buy
			if( avg > 0.050725 )
				if( cr_up2Int <= 0.5 )
					if( avg <= 0.052577 )
						if( avg2 <= 0.05256 )
							if( ma_upInt <= 0.5 )
								if( avg <= 0.050895 )
									ret := -1.000000 // sell
								if( avg > 0.050895 )
									ret := -0.400000
							if( ma_upInt > 0.5 )
								if( avg <= 0.051274 )
									ret := -0.677419
								if( avg > 0.051274 )
									ret := -0.047619
						if( avg2 > 0.05256 )
							ret := -1.000000 // sell
					if( avg > 0.052577 )
						if( avg2 <= 0.061733 )
							if( avg <= 0.061099 )
								if( avg2 <= 0.055842 )
									ret := -0.120332
								if( avg2 > 0.055842 )
									ret := 0.177419
							if( avg > 0.061099 )
								if( avg2 <= 0.061188 )
									ret := -0.657143
								if( avg2 > 0.061188 )
									ret := -0.212500
						if( avg2 > 0.061733 )
							ret := 0.600000
				if( cr_up2Int > 0.5 )
					if( ma_downInt <= 0.5 )
						if( avg2 <= 0.060633 )
							if( avg <= 0.060464 )
								if( avg <= 0.059697 )
									ret := -0.130435
								if( avg > 0.059697 )
									ret := 0.187500
							if( avg > 0.060464 )
								ret := 1.000000 // buy
						if( avg2 > 0.060633 )
							if( avg2 <= 0.061473 )
								if( avg2 <= 0.061378 )
									ret := -0.800000 // sell
								if( avg2 > 0.061378 )
									ret := -1.000000 // sell
							if( avg2 > 0.061473 )
								if( avg <= 0.061584 )
									ret := 0.200000
								if( avg > 0.061584 )
									ret := 0.300000
					if( ma_downInt > 0.5 )
						if( avg2 <= 0.061461 )
							if( avg <= 0.055471 )
								if( avg2 <= 0.053613 )
									ret := 0.333333
								if( avg2 > 0.053613 )
									ret := -0.142857
							if( avg > 0.055471 )
								if( avg <= 0.060233 )
									ret := 0.730769 // buy
								if( avg > 0.060233 )
									ret := 0.260870
						if( avg2 > 0.061461 )
							ret := -0.357143
	if( avg > 0.062046 )
		if( ma_upInt <= 0.5 )
			if( cr_downInt <= 0.5 )
				if( avg <= 0.081082 )
					if( cr_down2Int <= 0.5 )
						if( avg2 <= 0.080845 )
							if( avg <= 0.06624 )
								if( cr_upInt <= 0.5 )
									ret := 0.093939
								if( cr_upInt > 0.5 )
									ret := 0.020649
							if( avg > 0.06624 )
								if( cr_upInt <= 0.5 )
									ret := 0.003542
								if( cr_upInt > 0.5 )
									ret := -0.008662
						if( avg2 > 0.080845 )
							if( avg2 <= 0.081272 )
								if( avg2 <= 0.08114 )
									ret := 0.457971
								if( avg2 > 0.08114 )
									ret := -0.500000
							if( avg2 > 0.081272 )
								ret := 0.601036
					if( cr_down2Int > 0.5 )
						if( avg <= 0.067774 )
							if( avg <= 0.065948 )
								if( avg2 <= 0.06253 )
									ret := 0.479167
								if( avg2 > 0.06253 )
									ret := -0.069264
							if( avg > 0.065948 )
								if( avg2 <= 0.066214 )
									ret := 0.828125 // buy
								if( avg2 > 0.066214 )
									ret := 0.091954
						if( avg > 0.067774 )
							if( avg2 <= 0.068031 )
								ret := -1.000000 // sell
							if( avg2 > 0.068031 )
								if( avg <= 0.079831 )
									ret := -0.100543
								if( avg > 0.079831 )
									ret := 0.428571
				if( avg > 0.081082 )
					if( cr_down2Int <= 0.5 )
						if( avg2 <= 0.12031 )
							if( avg <= 0.092512 )
								if( cr_upInt <= 0.5 )
									ret := -0.119141
								if( cr_upInt > 0.5 )
									ret := -0.317406
							if( avg > 0.092512 )
								if( cr_upInt <= 0.5 )
									ret := -0.006446
								if( cr_upInt > 0.5 )
									ret := 0.212174
						if( avg2 > 0.12031 )
							if( avg <= 0.123167 )
								if( avg <= 0.118686 )
									ret := -1.000000 // sell
								if( avg > 0.118686 )
									ret := -0.223301
							if( avg > 0.123167 )
								if( avg <= 0.125289 )
									ret := 0.088825
								if( avg > 0.125289 )
									ret := -0.118192
					if( cr_down2Int > 0.5 )
						if( avg <= 0.110788 )
							if( avg2 <= 0.104837 )
								if( avg2 <= 0.09333 )
									ret := -0.301471
								if( avg2 > 0.09333 )
									ret := 0.036364
							if( avg2 > 0.104837 )
								if( avg <= 0.108532 )
									ret := -0.744186 // sell
								if( avg > 0.108532 )
									ret := -0.272727
						if( avg > 0.110788 )
							if( avg2 <= 0.157147 )
								if( avg2 <= 0.111197 )
									ret := 0.846154 // buy
								if( avg2 > 0.111197 )
									ret := 0.161725
							if( avg2 > 0.157147 )
								if( avg <= 0.162662 )
									ret := -0.555556
								if( avg > 0.162662 )
									ret := -0.285714
			if( cr_downInt > 0.5 )
				if( avg <= 0.065017 )
					if( avg <= 0.063959 )
						if( avg <= 0.062319 )
							if( avg2 <= 0.062257 )
								ret := 0.454545
							if( avg2 > 0.062257 )
								ret := 0.800000 // buy
						if( avg > 0.062319 )
							if( avg2 <= 0.062445 )
								ret := 0.730769 // buy
							if( avg2 > 0.062445 )
								if( avg2 <= 0.064235 )
									ret := -0.234043
								if( avg2 > 0.064235 )
									ret := 1.000000 // buy
					if( avg > 0.063959 )
						if( avg <= 0.06483 )
							if( avg2 <= 0.064076 )
								ret := -0.843137 // sell
							if( avg2 > 0.064076 )
								if( avg2 <= 0.065045 )
									ret := 0.104478
								if( avg2 > 0.065045 )
									ret := -0.800000 // sell
						if( avg > 0.06483 )
							if( avg <= 0.064882 )
								ret := -0.833333 // sell
							if( avg > 0.064882 )
								ret := -0.900000 // sell
				if( avg > 0.065017 )
					if( cr_down2Int <= 0.5 )
						if( avg2 <= 0.065767 )
							if( avg <= 0.065742 )
								if( avg <= 0.065376 )
									ret := 0.782609 // buy
								if( avg > 0.065376 )
									ret := 0.307692
							if( avg > 0.065742 )
								ret := 1.000000 // buy
						if( avg2 > 0.065767 )
							if( avg <= 0.067391 )
								if( avg <= 0.065326 )
									ret := 1.000000 // buy
								if( avg > 0.065326 )
									ret := -0.405714
							if( avg > 0.067391 )
								if( avg <= 0.068457 )
									ret := 0.725275 // buy
								if( avg > 0.068457 )
									ret := 0.027621
					if( cr_down2Int > 0.5 )
						if( avg <= 0.066342 )
							if( avg <= 0.065522 )
								ret := 0.789474 // buy
							if( avg > 0.065522 )
								if( avg <= 0.065936 )
									ret := 1.000000 // buy
								if( avg > 0.065936 )
									ret := 0.900000 // buy
						if( avg > 0.066342 )
							if( avg2 <= 0.066575 )
								ret := -1.000000 // sell
							if( avg2 > 0.066575 )
								if( avg <= 0.069165 )
									ret := 0.652174
								if( avg > 0.069165 )
									ret := -0.081140
		if( ma_upInt > 0.5 )
			if( avg2 <= 0.086457 )
				if( cr_down2Int <= 0.5 )
					if( cr_upInt <= 0.5 )
						if( avg2 <= 0.062337 )
							if( cr_downInt <= 0.5 )
								if( avg <= 0.062777 )
									ret := -0.307786
								if( avg > 0.062777 )
									ret := -0.016393
							if( cr_downInt > 0.5 )
								if( avg <= 0.062437 )
									ret := 0.178571
								if( avg > 0.062437 )
									ret := -0.153846
						if( avg2 > 0.062337 )
							if( avg <= 0.085192 )
								if( avg2 <= 0.062391 )
									ret := 0.525926
								if( avg2 > 0.062391 )
									ret := -0.044268
							if( avg > 0.085192 )
								if( cr_downInt <= 0.5 )
									ret := -0.298060
								if( cr_downInt > 0.5 )
									ret := -0.189189
					if( cr_upInt > 0.5 )
						if( avg2 <= 0.069183 )
							if( cr_up2Int <= 0.5 )
								if( avg <= 0.062602 )
									ret := -0.508772
								if( avg > 0.062602 )
									ret := 0.055080
							if( cr_up2Int > 0.5 )
								if( avg2 <= 0.062334 )
									ret := 0.909091 // buy
								if( avg2 > 0.062334 )
									ret := 0.000000
						if( avg2 > 0.069183 )
							if( avg2 <= 0.069722 )
								if( avg <= 0.069507 )
									ret := -0.411765
								if( avg > 0.069507 )
									ret := -0.800000 // sell
							if( avg2 > 0.069722 )
								if( avg2 <= 0.070007 )
									ret := 0.254902
								if( avg2 > 0.070007 )
									ret := -0.177353
				if( cr_down2Int > 0.5 )
					if( avg2 <= 0.063685 )
						if( cr_downInt <= 0.5 )
							if( avg2 <= 0.062395 )
								ret := -0.416667
							if( avg2 > 0.062395 )
								if( avg <= 0.062918 )
									ret := 0.652174
								if( avg > 0.062918 )
									ret := -0.034483
						if( cr_downInt > 0.5 )
							if( avg <= 0.063414 )
								if( avg2 <= 0.062517 )
									ret := 0.400000
								if( avg2 > 0.062517 )
									ret := -0.193548
							if( avg > 0.063414 )
								if( avg <= 0.063494 )
									ret := 0.846154 // buy
								if( avg > 0.063494 )
									ret := 0.785714 // buy
					if( avg2 > 0.063685 )
						if( avg <= 0.064855 )
							if( avg2 <= 0.064831 )
								if( avg <= 0.06424 )
									ret := -0.372881
								if( avg > 0.06424 )
									ret := 0.600000
							if( avg2 > 0.064831 )
								if( avg2 <= 0.065131 )
									ret := -0.687500
								if( avg2 > 0.065131 )
									ret := -0.904762 // sell
						if( avg > 0.064855 )
							if( cr_downInt <= 0.5 )
								if( avg2 <= 0.068718 )
									ret := 0.147826
								if( avg2 > 0.068718 )
									ret := -0.181406
							if( cr_downInt > 0.5 )
								if( avg <= 0.065859 )
									ret := 0.634921
								if( avg > 0.065859 )
									ret := -0.080000
			if( avg2 > 0.086457 )
				if( cr_upInt <= 0.5 )
					if( avg2 <= 0.087396 )
						ret := 0.661290
					if( avg2 > 0.087396 )
						if( avg2 <= 0.161152 )
							if( cr_up2Int <= 0.5 )
								if( cr_downInt <= 0.5 )
									ret := 0.063406
								if( cr_downInt > 0.5 )
									ret := -0.019308
							if( cr_up2Int > 0.5 )
								if( avg2 <= 0.12523 )
									ret := 0.282051
								if( avg2 > 0.12523 )
									ret := -0.082474
						if( avg2 > 0.161152 )
							if( cr_down2Int <= 0.5 )
								if( avg2 <= 0.164907 )
									ret := -0.394531
								if( avg2 > 0.164907 )
									ret := 0.131148
							if( cr_down2Int > 0.5 )
								ret := 0.923077 // buy
				if( cr_upInt > 0.5 )
					if( cr_up2Int <= 0.5 )
						if( avg2 <= 0.110792 )
							if( avg <= 0.100537 )
								if( avg <= 0.088905 )
									ret := 0.347826
								if( avg > 0.088905 )
									ret := -0.261905
							if( avg > 0.100537 )
								if( avg <= 0.104599 )
									ret := 0.448980
								if( avg > 0.104599 )
									ret := 0.068966
						if( avg2 > 0.110792 )
							if( avg <= 0.135839 )
								if( avg2 <= 0.120939 )
									ret := -0.373950
								if( avg2 > 0.120939 )
									ret := -0.092166
							if( avg > 0.135839 )
								if( avg2 <= 0.159184 )
									ret := 0.171806
								if( avg2 > 0.159184 )
									ret := -0.500000
					if( cr_up2Int > 0.5 )
						if( avg2 <= 0.099749 )
							ret := -0.900000 // sell
						if( avg2 > 0.099749 )
							if( avg2 <= 0.111297 )
								if( avg <= 0.108696 )
									ret := 0.117647
								if( avg > 0.108696 )
									ret := 0.900000 // buy
							if( avg2 > 0.111297 )
								if( avg2 <= 0.119698 )
									ret := -0.567568
								if( avg2 > 0.119698 )
									ret := 0.000000
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Ultimate_MA_MTF_V2 
//@version=5
//indicator title="CM_Ultimate_MA_MTF_V2", shorttitle="CM_Ultimate_MA_MTF_V2", overlay=true)

// Inputs
src = close
useCurrentRes = input(true, title="Use Current Chart Resolution?")
resCustom = input.timeframe(title="Use Different Timeframe? Uncheck Box Above", defval="D")
len = input.int(20, title="Moving Average Length - LookBack Period")
factorT3 = input.float(defval=7, title="Tilson T3 Factor - *.10 - so 7 = .7 etc.", minval=0)
atype = input.int(1, minval=1, maxval=8, title="1=SMA, 2=EMA, 3=WMA, 4=HullMA, 5=VWMA, 6=RMA, 7=TEMA, 8=Tilson T3")
spc = input(false, title="Show Price Crossing 1st Mov Avg - Highlight Bar?")
cc = input(true, title="Change Color Based On Direction?")
smoothe = input.int(2, minval=1, maxval=10, title="Color Smoothing - Setting 1 = No Smoothing")
doma2 = input(false, title="Optional 2nd Moving Average")
spc2 = input(false, title="Show Price Crossing 2nd Mov Avg?")
len2 = input.int(50, title="Moving Average Length - Optional 2nd MA")
sfactorT3 = input.float(defval=7, title="Tilson T3 Factor - *.10 - so 7 = .7 etc.", minval=0)
atype2 = input.int(1, minval=1, maxval=8, title="1=SMA, 2=EMA, 3=WMA, 4=HullMA, 5=VWMA, 6=RMA, 7=TEMA, 8=Tilson T3")
cc2 = input(true, title="Change Color Based On Direction 2nd MA?")
warn = input(false, title="***You Can Turn On The Show Dots Parameter Below Without Plotting 2nd MA to See Crosses***")
warn2 = input(false, title="***If Using Cross Feature W/O Plotting 2ndMA - Make Sure 2ndMA Parameters are Set Correctly***")
sd = input(false, title="Show Dots on Cross of Both MA's")

res = useCurrentRes ? timeframe.period : resCustom

// Hull MA definition
hullma = ta.wma(2 * ta.wma(src, len / 2) - ta.wma(src, len), math.round(math.sqrt(len)))

// TEMA definition
ema1 = ta.ema(src, len)
ema2 = ta.ema(ema1, len)
ema3 = ta.ema(ema2, len)
tema = 3 * (ema1 - ema2) + ema3

// Tilson T3 definition
factor = factorT3 * 0.10
gd(src, len, factor) => ta.ema(src, len) * (1 + factor) - ta.ema(ta.ema(src, len), len) * factor
t3(src, len, factor) => gd(gd(gd(src, len, factor), len, factor), len, factor)
tilT3 = t3(src, len, factor)

avg = atype == 1 ? ta.sma(src, len) : atype == 2 ? ta.ema(src, len) : atype == 3 ? ta.wma(src, len) : atype == 4 ? hullma : atype == 5 ? ta.vwma(src, len) : atype == 6 ? ta.rma(src, len) : atype == 7 ? tema : tilT3

// 2nd MA definitions
hullma2 = ta.wma(2 * ta.wma(src, len2 / 2) - ta.wma(src, len2), math.round(math.sqrt(len2)))
sema1 = ta.ema(src, len2)
sema2 = ta.ema(sema1, len2)
sema3 = ta.ema(sema2, len2)
stema = 3 * (sema1 - sema2) + sema3
sfactor = sfactorT3 * 0.10
sgd(src, len2, sfactor) => ta.ema(src, len2) * (1 + sfactor) - ta.ema(ta.ema(src, len2), len2) * sfactor
st3(src, len2, sfactor) => sgd(sgd(gd(src, len2, sfactor), len2, sfactor), len2, sfactor)
stilT3 = st3(src, len2, sfactor)

avg2 = atype2 == 1 ? ta.sma(src, len2) : atype2 == 2 ? ta.ema(src, len2) : atype2 == 3 ? ta.wma(src, len2) : atype2 == 4 ? hullma2 : atype2 == 5 ? ta.vwma(src, len2) : atype2 == 6 ? ta.rma(src, len2) : atype2 == 7 ? stema : stilT3

out1 = request.security(syminfo.tickerid, res, avg)
out2 = request.security(syminfo.tickerid, res, avg2)

// Formula for Price Crossing Moving Average #1
cr_up = open < out1 and close > out1
cr_down = open > out1 and close < out1

// Formula for Price Crossing Moving Average #2
cr_up2 = open < out2 and close > out2
cr_down2 = open > out2 and close < out2

// Barcolor Criteria for Price Crossing Moving Average #1
iscrossUp() => cr_up
iscrossDown() => cr_down

// Barcolor Criteria for Price Crossing Moving Average #2
iscrossUp2() => cr_up2
iscrossDown2() => cr_down2

ma_up = out1 >= ta.valuewhen(out1[smoothe] >= out1[1], out1[smoothe], 1)
ma_down = out1 < ta.valuewhen(out1[smoothe] < out1[1], out1[smoothe], 1)

col = cc ? (ma_up ? color.lime : ma_down ? color.red : color.aqua) : color.aqua
col2 = cc2 ? (ma_up ? color.lime : ma_down ? color.red : color.aqua) : color.white

plot(out1, title="Multi-Timeframe Moving Avg", linewidth=4, color=col)
plot(doma2 and out2 ? out2 : na, title="2nd Multi-TimeFrame Moving Average", linewidth=4, color=col2)
plot(sd and ta.crossover(out1, out2) ? out2 : na, style=plot.style_cross, linewidth=15, color=color.aqua)

// Barcolor Plot for Price Crossing Moving Average #1
barcolor(spc and iscrossUp() ? color.yellow : na)
barcolor(spc and iscrossDown() ? color.yellow : na)

// Barcolor Plot for Price Crossing Moving Average #2
barcolor(spc2 and iscrossUp2() ? color.yellow : na)
barcolor(spc2 and iscrossDown2() ? color.yellow : na)

cr_upInt = cr_up ? 1: 0    //Bool to int
cr_up2Int = cr_up2 ? 1: 0    //Bool to int
cr_downInt = cr_down ? 1: 0    //Bool to int
cr_down2Int = cr_down2 ? 1: 0    //Bool to int
ma_upInt = ma_up ? 1: 0    //Bool to int
ma_downInt = ma_down ? 1: 0    //Bool to int

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
float op_operation = decision_tree_0_TRXUSDT_15Min_8e5bd04c(avg2, cr_down2Int, avg, cr_up2Int, ma_downInt, ma_upInt, cr_upInt, cr_downInt)

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


