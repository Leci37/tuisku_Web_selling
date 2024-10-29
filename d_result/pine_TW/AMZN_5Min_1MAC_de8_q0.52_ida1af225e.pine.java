//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: MACD_ULT_MTF
// ID_model: AMZN_5Min_1MAC_a1af225e Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AMZN_5Min_1MAC_a1af225e", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AMZN_5Min_a1af225e(macd_IsAboveInt, histB_IsDownInt, histA_IsDownInt, histB_IsUpInt, signal, histA_IsUpInt, hist, macd_IsBelowInt, macd)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( signal <= 0.395803 )
		if( histB_IsUpInt <= 0.5 )
			if( histA_IsUpInt <= 0.5 )
				if( macd <= 0.389786 )
					if( hist <= 0.227762 )
						if( signal <= -0.194591 )
							if( signal <= -0.566769 )
								if( hist <= -0.037129 )
									ret := 0.090426
								if( hist > -0.037129 )
									ret := -0.206897
							if( signal > -0.566769 )
								if( hist <= 0.150212 )
									ret := 0.195104
								if( hist > 0.150212 )
									ret := -0.107383
						if( signal > -0.194591 )
							if( signal <= -0.026609 )
								if( hist <= -0.084671 )
									ret := -0.111205
								if( hist > -0.084671 )
									ret := 0.059918
							if( signal > -0.026609 )
								if( macd <= -0.003962 )
									ret := 0.161587
								if( macd > -0.003962 )
									ret := 0.061655
					if( hist > 0.227762 )
						if( hist <= 0.295669 )
							if( macd <= -0.336005 )
								if( signal <= -0.722581 )
									ret := 0.818182 // buy
								if( signal > -0.722581 )
									ret := -0.083333
							if( macd > -0.336005 )
								if( signal <= -0.383471 )
									ret := 1.000000 // buy
								if( signal > -0.383471 )
									ret := 0.543478
						if( hist > 0.295669 )
							if( signal <= -0.454578 )
								if( signal <= -0.72002 )
									ret := 0.205882
								if( signal > -0.72002 )
									ret := 0.947368 // buy
							if( signal > -0.454578 )
								if( macd <= 0.265349 )
									ret := -0.666667
								if( macd > 0.265349 )
									ret := 0.222222
				if( macd > 0.389786 )
					if( hist <= 0.171293 )
						if( macd <= 0.402988 )
							if( signal <= 0.287016 )
								if( hist <= 0.141923 )
									ret := -0.083333
								if( hist > 0.141923 )
									ret := 0.800000 // buy
							if( signal > 0.287016 )
								if( hist <= 0.047246 )
									ret := 0.333333
								if( hist > 0.047246 )
									ret := 0.875000 // buy
						if( macd > 0.402988 )
							if( hist <= 0.011529 )
								ret := -1.000000 // sell
							if( hist > 0.011529 )
								if( macd <= 0.508915 )
									ret := 0.155709
								if( macd > 0.508915 )
									ret := 0.545455
					if( hist > 0.171293 )
						if( signal <= 0.248344 )
							if( hist <= 0.295862 )
								if( macd <= 0.439188 )
									ret := 0.626866
								if( macd > 0.439188 )
									ret := 0.083333
							if( hist > 0.295862 )
								if( macd <= 0.828283 )
									ret := 1.000000 // buy
								if( macd > 0.828283 )
									ret := 0.500000
						if( signal > 0.248344 )
							if( hist <= 0.283822 )
								if( signal <= 0.253394 )
									ret := -1.000000 // sell
								if( signal > 0.253394 )
									ret := 0.465753
							if( hist > 0.283822 )
								if( hist <= 0.350675 )
									ret := -0.533333
								if( hist > 0.350675 )
									ret := 0.033333
			if( histA_IsUpInt > 0.5 )
				if( signal <= -0.320933 )
					if( macd <= -0.197868 )
						if( signal <= -0.33196 )
							if( hist <= 0.25419 )
								if( macd <= -1.22741 )
									ret := 0.756757 // buy
								if( macd > -1.22741 )
									ret := 0.122867
							if( hist > 0.25419 )
								if( macd <= -0.562495 )
									ret := 0.175676
								if( macd > -0.562495 )
									ret := 0.590164
						if( signal > -0.33196 )
							if( macd <= -0.214879 )
								if( signal <= -0.329631 )
									ret := 0.807692 // buy
								if( signal > -0.329631 )
									ret := 0.500000
							if( macd > -0.214879 )
								ret := -0.250000
					if( macd > -0.197868 )
						if( signal <= -0.323338 )
							if( hist <= 0.576199 )
								if( hist <= 0.21311 )
									ret := -0.627907
								if( hist > 0.21311 )
									ret := -0.279070
							if( hist > 0.576199 )
								if( hist <= 0.757546 )
									ret := 1.000000 // buy
								if( hist > 0.757546 )
									ret := -0.166667
						if( signal > -0.323338 )
							ret := 1.000000 // buy
				if( signal > -0.320933 )
					if( signal <= -0.166581 )
						if( macd <= -0.144639 )
							if( signal <= -0.275859 )
								if( hist <= 0.02285 )
									ret := 0.095238
								if( hist > 0.02285 )
									ret := -0.192575
							if( signal > -0.275859 )
								if( signal <= -0.239813 )
									ret := 0.235294
								if( signal > -0.239813 )
									ret := -0.048620
						if( macd > -0.144639 )
							if( macd <= -0.142823 )
								if( signal <= -0.271339 )
									ret := -1.000000 // sell
								if( signal > -0.271339 )
									ret := -0.588235
							if( macd > -0.142823 )
								if( macd <= -0.008563 )
									ret := -0.171091
								if( macd > -0.008563 )
									ret := -0.583333
					if( signal > -0.166581 )
						if( signal <= 0.002422 )
							if( hist <= 0.033194 )
								if( signal <= -0.006342 )
									ret := 0.077306
								if( signal > -0.006342 )
									ret := 0.310345
							if( hist > 0.033194 )
								if( signal <= -0.067655 )
									ret := -0.043990
								if( signal > -0.067655 )
									ret := 0.068293
						if( signal > 0.002422 )
							if( signal <= 0.047038 )
								if( macd <= 0.155734 )
									ret := -0.093562
								if( macd > 0.155734 )
									ret := 0.145374
							if( signal > 0.047038 )
								if( macd <= 0.097589 )
									ret := 0.147268
								if( macd > 0.097589 )
									ret := 0.001516
		if( histB_IsUpInt > 0.5 )
			if( signal <= -0.173812 )
				if( signal <= -0.194212 )
					if( hist <= -0.085174 )
						if( macd <= -0.712878 )
							if( macd <= -0.88509 )
								if( signal <= -1.17627 )
									ret := -0.447368
								if( signal > -1.17627 )
									ret := 0.144444
							if( macd > -0.88509 )
								if( hist <= -0.21892 )
									ret := -0.466667
								if( hist > -0.21892 )
									ret := -0.792683 // sell
						if( macd > -0.712878 )
							if( macd <= -0.661432 )
								if( hist <= -0.248708 )
									ret := 0.050000
								if( hist > -0.248708 )
									ret := 0.485714
							if( macd > -0.661432 )
								if( macd <= -0.56055 )
									ret := -0.289617
								if( macd > -0.56055 )
									ret := -0.016552
					if( hist > -0.085174 )
						if( macd <= -0.35981 )
							if( macd <= -0.568807 )
								if( macd <= -0.638105 )
									ret := 0.193676
								if( macd > -0.638105 )
									ret := -0.660714
							if( macd > -0.568807 )
								if( signal <= -0.482677 )
									ret := 0.700000 // buy
								if( signal > -0.482677 )
									ret := 0.242678
						if( macd > -0.35981 )
							if( signal <= -0.202596 )
								if( signal <= -0.305525 )
									ret := -0.274510
								if( signal > -0.305525 )
									ret := -0.073134
							if( signal > -0.202596 )
								if( macd <= -0.230892 )
									ret := 0.651163
								if( macd > -0.230892 )
									ret := 0.100000
				if( signal > -0.194212 )
					if( macd <= -0.197051 )
						if( hist <= -0.146649 )
							if( signal <= -0.190376 )
								ret := -0.200000
							if( signal > -0.190376 )
								if( signal <= -0.17965 )
									ret := 0.733333 // buy
								if( signal > -0.17965 )
									ret := 0.111111
						if( hist > -0.146649 )
							if( macd <= -0.263213 )
								if( signal <= -0.185734 )
									ret := -0.230769
								if( signal > -0.185734 )
									ret := -0.818182 // sell
							if( macd > -0.263213 )
								if( hist <= -0.075222 )
									ret := 0.727273 // buy
								if( hist > -0.075222 )
									ret := -0.135294
					if( macd > -0.197051 )
						if( macd <= -0.189982 )
							if( signal <= -0.17673 )
								if( hist <= -0.01353 )
									ret := -0.500000
								if( hist > -0.01353 )
									ret := -0.809524 // sell
							if( signal > -0.17673 )
								ret := -1.000000 // sell
						if( macd > -0.189982 )
							if( signal <= -0.176585 )
								if( hist <= -0.001434 )
									ret := -0.666667
								if( hist > -0.001434 )
									ret := 0.000000
							if( signal > -0.176585 )
								if( signal <= -0.17601 )
									ret := 0.600000
								if( signal > -0.17601 )
									ret := -0.400000
			if( signal > -0.173812 )
				if( hist <= -0.144218 )
					if( macd <= -0.27508 )
						if( hist <= -0.357154 )
							if( hist <= -0.366855 )
								if( signal <= -0.092625 )
									ret := 1.000000 // buy
								if( signal > -0.092625 )
									ret := -0.375000
							if( hist > -0.366855 )
								ret := -1.000000 // sell
						if( hist > -0.357154 )
							if( macd <= -0.314603 )
								if( hist <= -0.17333 )
									ret := 0.500000
								if( hist > -0.17333 )
									ret := -0.636364
							if( macd > -0.314603 )
								if( signal <= -0.146932 )
									ret := 0.904762 // buy
								if( signal > -0.146932 )
									ret := 0.661017
					if( macd > -0.27508 )
						if( signal <= 0.338325 )
							if( signal <= 0.284198 )
								if( macd <= -0.254014 )
									ret := -0.457143
								if( macd > -0.254014 )
									ret := 0.154696
							if( signal > 0.284198 )
								if( hist <= -0.183817 )
									ret := -0.250000
								if( hist > -0.183817 )
									ret := -0.736842 // sell
						if( signal > 0.338325 )
							if( macd <= 0.180061 )
								if( hist <= -0.206471 )
									ret := 0.250000
								if( hist > -0.206471 )
									ret := 1.000000 // buy
							if( macd > 0.180061 )
								if( signal <= 0.373074 )
									ret := 0.461538
								if( signal > 0.373074 )
									ret := -0.333333
				if( hist > -0.144218 )
					if( signal <= -0.145812 )
						if( hist <= -0.043841 )
							if( macd <= -0.278599 )
								if( hist <= -0.141791 )
									ret := -0.800000 // sell
								if( hist > -0.141791 )
									ret := 0.800000 // buy
							if( macd > -0.278599 )
								if( signal <= -0.157905 )
									ret := -0.218487
								if( signal > -0.157905 )
									ret := 0.255319
						if( hist > -0.043841 )
							if( hist <= -0.032304 )
								if( signal <= -0.157713 )
									ret := 0.729730 // buy
								if( signal > -0.157713 )
									ret := 0.437500
							if( hist > -0.032304 )
								if( hist <= -0.028954 )
									ret := -0.111111
								if( hist > -0.028954 )
									ret := 0.370370
					if( signal > -0.145812 )
						if( hist <= -0.085454 )
							if( macd <= 0.013543 )
								if( hist <= -0.095933 )
									ret := 0.060357
								if( hist > -0.095933 )
									ret := -0.206642
							if( macd > 0.013543 )
								if( hist <= -0.097552 )
									ret := -0.301775
								if( hist > -0.097552 )
									ret := 0.041379
						if( hist > -0.085454 )
							if( macd <= 0.270666 )
								if( signal <= 0.251905 )
									ret := 0.029525
								if( signal > 0.251905 )
									ret := -0.168831
							if( macd > 0.270666 )
								if( signal <= 0.330417 )
									ret := 0.500000
								if( signal > 0.330417 )
									ret := 0.185629
	if( signal > 0.395803 )
		if( hist <= -0.334309 )
			if( signal <= 0.827005 )
				if( signal <= 0.53866 )
					if( signal <= 0.458757 )
						ret := -0.500000
					if( signal > 0.458757 )
						ret := -0.250000
				if( signal > 0.53866 )
					if( macd <= 0.392221 )
						ret := -1.000000 // sell
					if( macd > 0.392221 )
						ret := -0.800000 // sell
			if( signal > 0.827005 )
				if( signal <= 1.18027 )
					ret := 0.210526
				if( signal > 1.18027 )
					if( histB_IsUpInt <= 0.5 )
						if( signal <= 1.51642 )
							if( hist <= -0.423096 )
								ret := -1.000000 // sell
							if( hist > -0.423096 )
								ret := -0.666667
						if( signal > 1.51642 )
							if( macd <= 2.60087 )
								ret := 0.000000
							if( macd > 2.60087 )
								ret := -1.000000 // sell
					if( histB_IsUpInt > 0.5 )
						if( signal <= 1.77409 )
							ret := -0.666667
						if( signal > 1.77409 )
							ret := -1.000000 // sell
		if( hist > -0.334309 )
			if( histA_IsDownInt <= 0.5 )
				if( signal <= 0.69739 )
					if( macd <= 0.475517 )
						if( hist <= -0.154406 )
							if( histB_IsUpInt <= 0.5 )
								if( signal <= 0.495864 )
									ret := 0.345455
								if( signal > 0.495864 )
									ret := 0.755102 // buy
							if( histB_IsUpInt > 0.5 )
								if( hist <= -0.157988 )
									ret := -0.223529
								if( hist > -0.157988 )
									ret := 1.000000 // buy
						if( hist > -0.154406 )
							if( macd <= 0.410611 )
								if( histB_IsUpInt <= 0.5 )
									ret := -0.303448
								if( histB_IsUpInt > 0.5 )
									ret := -0.027322
							if( macd > 0.410611 )
								if( signal <= 0.552424 )
									ret := 0.067093
								if( signal > 0.552424 )
									ret := 0.565217
					if( macd > 0.475517 )
						if( signal <= 0.409027 )
							if( signal <= 0.402715 )
								ret := 0.500000
							if( signal > 0.402715 )
								ret := 1.000000 // buy
						if( signal > 0.409027 )
							if( signal <= 0.473715 )
								if( hist <= 0.350942 )
									ret := -0.700000 // sell
								if( hist > 0.350942 )
									ret := 0.333333
							if( signal > 0.473715 )
								if( hist <= -0.04256 )
									ret := -0.120603
								if( hist > -0.04256 )
									ret := -0.378472
				if( signal > 0.69739 )
					if( histB_IsUpInt <= 0.5 )
						if( hist <= -0.131986 )
							if( macd <= 0.746497 )
								if( signal <= 0.757103 )
									ret := 0.588235
								if( signal > 0.757103 )
									ret := -0.073171
							if( macd > 0.746497 )
								if( macd <= 2.11853 )
									ret := 0.666667
								if( macd > 2.11853 )
									ret := -0.250000
						if( hist > -0.131986 )
							if( signal <= 0.990874 )
								if( hist <= -0.040117 )
									ret := -0.023256
								if( hist > -0.040117 )
									ret := 0.363636
							if( signal > 0.990874 )
								if( signal <= 2.03631 )
									ret := -0.640625
								if( signal > 2.03631 )
									ret := 0.200000
					if( histB_IsUpInt > 0.5 )
						if( hist <= -0.285178 )
							if( hist <= -0.303191 )
								ret := -0.400000
							if( hist > -0.303191 )
								if( signal <= 1.58011 )
									ret := -0.750000 // sell
								if( signal > 1.58011 )
									ret := -1.000000 // sell
						if( hist > -0.285178 )
							if( hist <= -0.231561 )
								if( signal <= 1.0942 )
									ret := 0.000000
								if( signal > 1.0942 )
									ret := 0.666667
							if( hist > -0.231561 )
								if( signal <= 0.715365 )
									ret := 0.428571
								if( signal > 0.715365 )
									ret := -0.298246
			if( histA_IsDownInt > 0.5 )
				if( signal <= 1.03001 )
					if( macd <= 0.688211 )
						if( hist <= 0.008428 )
							if( signal <= 0.464819 )
								if( hist <= 0.004335 )
									ret := 0.826087 // buy
								if( hist > 0.004335 )
									ret := 0.400000
							if( signal > 0.464819 )
								if( hist <= 0.006627 )
									ret := -0.083333
								if( hist > 0.006627 )
									ret := 0.800000 // buy
						if( hist > 0.008428 )
							if( signal <= 0.527644 )
								if( macd <= 0.418817 )
									ret := -0.900000 // sell
								if( macd > 0.418817 )
									ret := 0.055024
							if( signal > 0.527644 )
								if( macd <= 0.60299 )
									ret := -0.805556 // sell
								if( macd > 0.60299 )
									ret := -0.044776
					if( macd > 0.688211 )
						if( hist <= 0.0387 )
							if( signal <= 0.719169 )
								ret := 0.500000
							if( signal > 0.719169 )
								if( hist <= 0.018896 )
									ret := 1.000000 // buy
								if( hist > 0.018896 )
									ret := 0.818182 // buy
						if( hist > 0.0387 )
							if( hist <= 0.137016 )
								if( hist <= 0.073522 )
									ret := -0.312500
								if( hist > 0.073522 )
									ret := 0.608108
							if( hist > 0.137016 )
								if( macd <= 0.99766 )
									ret := -0.233333
								if( macd > 0.99766 )
									ret := 0.275862
				if( signal > 1.03001 )
					if( macd <= 1.62075 )
						if( signal <= 1.07936 )
							ret := -0.333333
						if( signal > 1.07936 )
							if( hist <= 0.254702 )
								if( macd <= 1.30309 )
									ret := -0.500000
								if( macd > 1.30309 )
									ret := -0.913043 // sell
							if( hist > 0.254702 )
								ret := -1.000000 // sell
					if( macd > 1.62075 )
						if( hist <= 0.188425 )
							ret := -0.666667
						if( hist > 0.188425 )
							if( macd <= 2.43266 )
								ret := 1.000000 // buy
							if( macd > 2.43266 )
								if( hist <= 1.03553 )
									ret := 0.230769
								if( hist > 1.03553 )
									ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator MACD_ULT_MTF 
//@version=5
//indicator title="CM_MacD_Ult_MTF", shorttitle="CM_Ult_MacD_MTF", overlay=false)

source = close
useCurrentRes = input(true, title="Use Current Chart Resolution?")
resCustom = input.timeframe(title="Use Different Timeframe? Uncheck Box Above", defval="60")
smd = input(true, title="Show MacD & Signal Line? Also Turn Off Dots Below")
sd = input(true, title="Show Dots When MacD Crosses Signal Line?")
sh = input(true, title="Show Histogram?")
macd_colorChange = input(true,title="Change MacD Line Color-Signal Line Cross?")
hist_colorChange = input(true,title="MacD Histogram 4 Colors?")

res = useCurrentRes ? timeframe.period : resCustom

fastLength = input.int(12, minval=1)
slowLength = input.int(26, minval=1)
signalLength = input.int(9, minval=1)

fastMA = ta.ema(source, fastLength)
slowMA = ta.ema(source, slowLength)

macd = fastMA - slowMA
signal = ta.sma(macd, signalLength)
hist = macd - signal

outMacD = request.security(syminfo.tickerid, res, macd)
outSignal = request.security(syminfo.tickerid, res, signal)
outHist = request.security(syminfo.tickerid, res, hist)

histA_IsUp = outHist > outHist[1] and outHist > 0
histA_IsDown = outHist < outHist[1] and outHist > 0
histB_IsDown = outHist < outHist[1] and outHist <= 0
histB_IsUp = outHist > outHist[1] and outHist <= 0

// MacD Color Definitions
macd_IsAbove = outMacD >= outSignal
macd_IsBelow = outMacD < outSignal

plot_color = hist_colorChange ? histA_IsUp ? color.aqua : histA_IsDown ? color.blue : histB_IsDown ? color.red : histB_IsUp ? color.maroon : color.yellow : color.gray
macd_color = macd_colorChange ? macd_IsAbove ? color.lime : color.red : color.red
signal_color = macd_colorChange ? macd_IsAbove ? color.yellow : color.yellow : color.lime

circleYPosition = outSignal

plot(smd and outMacD ? outMacD : na, title="MACD", color=macd_color, linewidth=4)
plot(smd and outSignal ? outSignal : na, title="Signal Line", color=signal_color, style=plot.style_line, linewidth=2)
plot(sh and outHist ? outHist : na, title="Histogram", color=plot_color, style=plot.style_histogram, linewidth=4)
plot(sd and ta.cross(outMacD, outSignal) ? circleYPosition : na, title="Cross", style=plot.style_circles, linewidth=4, color=macd_color)
hline(0, '0 Line', linestyle=hline.style_solid, linewidth=2, color=color.white)

histA_IsUpInt = histA_IsUp ? 1: 0
histA_IsDownInt = histA_IsDown ? 1: 0
histB_IsDownInt = histB_IsDown ? 1: 0
histB_IsUpInt = histB_IsUp ? 1: 0
macd_IsAboveInt = macd_IsAbove ? 1: 0
macd_IsBelowInt = macd_IsBelow ? 1: 0

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
float op_operation = decision_tree_0_AMZN_5Min_a1af225e(macd_IsAboveInt, histB_IsDownInt, histA_IsDownInt, histB_IsUpInt, signal, histA_IsUpInt, hist, macd_IsBelowInt, macd)

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


