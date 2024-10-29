//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Triple_EMA
// ID_model: PTON_15Min_2CT0_ebb50411 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_PTON_15Min_2CT0_ebb50411", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_PTON_15Min_ebb50411(mf, ad_mf, ad, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ad_mf <= -291.939 )
		if( ema1 <= 31.3243 )
			if( ema13 <= -0.562523 )
				if( ema13 <= -1.65686 )
					if( mf <= -0.174252 )
						ret := -0.200000
					if( mf > -0.174252 )
						if( ema2 <= 26.7767 )
							ret := -0.800000 // sell
						if( ema2 > 26.7767 )
							ret := -1.000000 // sell
				if( ema13 > -1.65686 )
					if( ad <= -1.55625e+06 )
						if( ema12 <= -0.365663 )
							if( ema2 <= 12.3045 )
								ret := 0.250000
							if( ema2 > 12.3045 )
								if( mf <= -0.349168 )
									ret := -0.285714
								if( mf > -0.349168 )
									ret := -1.000000 // sell
						if( ema12 > -0.365663 )
							ret := 0.800000 // buy
					if( ad > -1.55625e+06 )
						if( ema3 <= 22.1726 )
							if( tema <= 7.87158 )
								if( ad_mf <= -94014.5 )
									ret := 0.833333 // buy
								if( ad_mf > -94014.5 )
									ret := -0.500000
							if( tema > 7.87158 )
								if( ema13 <= -0.704194 )
									ret := 0.634146
								if( ema13 > -0.704194 )
									ret := 0.920000 // buy
						if( ema3 > 22.1726 )
							if( ema13 <= -1.18249 )
								ret := 1.000000 // buy
							if( ema13 > -1.18249 )
								if( ema3 <= 24.9424 )
									ret := 0.031250
								if( ema3 > 24.9424 )
									ret := 0.439189
			if( ema13 > -0.562523 )
				if( ad_mf <= -72884.1 )
					if( ad <= -83902.3 )
						if( ad_mf <= -2.36303e+06 )
							if( ema13 <= -0.322171 )
								if( tema <= 8.89878 )
									ret := -1.000000 // sell
								if( tema > 8.89878 )
									ret := 0.000000
							if( ema13 > -0.322171 )
								if( tema <= 23.41 )
									ret := 0.618421
								if( tema > 23.41 )
									ret := -0.250000
						if( ad_mf > -2.36303e+06 )
							if( ema3 <= 3.06186 )
								if( ad <= -204480 )
									ret := 0.619048
								if( ad > -204480 )
									ret := 0.162162
							if( ema3 > 3.06186 )
								if( ema13 <= 0.332365 )
									ret := 0.072618
								if( ema13 > 0.332365 )
									ret := 0.222482
					if( ad > -83902.3 )
						if( ad_mf <= -80047.9 )
							if( ad <= -80530.9 )
								if( mf <= 0.27132 )
									ret := -0.205882
								if( mf > 0.27132 )
									ret := 0.714286 // buy
							if( ad > -80530.9 )
								if( ema12 <= 0.100902 )
									ret := -0.733333 // sell
								if( ema12 > 0.100902 )
									ret := 0.000000
						if( ad_mf > -80047.9 )
							if( ad <= -76988.5 )
								if( tema <= 5.88244 )
									ret := -0.142857
								if( tema > 5.88244 )
									ret := 0.290323
							if( ad > -76988.5 )
								if( ema13 <= -0.00937 )
									ret := 0.152174
								if( ema13 > -0.00937 )
									ret := -0.248000
				if( ad_mf > -72884.1 )
					if( ema12 <= 0.007214 )
						if( ad <= -15938.9 )
							if( ad_mf <= -17580.8 )
								if( ema3 <= 4.7182 )
									ret := -0.022293
								if( ema3 > 4.7182 )
									ret := 0.168691
							if( ad_mf > -17580.8 )
								if( ema13 <= -0.011807 )
									ret := -0.542857
								if( ema13 > -0.011807 )
									ret := 0.210526
						if( ad > -15938.9 )
							if( ad_mf <= -13710.4 )
								if( ema12 <= -0.005726 )
									ret := 0.658120
								if( ema12 > -0.005726 )
									ret := 0.000000
							if( ad_mf > -13710.4 )
								if( mf <= 0.557899 )
									ret := 0.228927
								if( mf > 0.557899 )
									ret := -0.134146
					if( ema12 > 0.007214 )
						if( ad <= -28172.8 )
							if( ema13 <= 0.017135 )
								if( ema3 <= 28.3919 )
									ret := -0.287879
								if( ema3 > 28.3919 )
									ret := 1.000000 // buy
							if( ema13 > 0.017135 )
								if( ema13 <= 0.019065 )
									ret := 0.923077 // buy
								if( ema13 > 0.019065 )
									ret := 0.218204
						if( ad > -28172.8 )
							if( ad <= -27028 )
								if( ema12 <= 0.024856 )
									ret := -0.400000
								if( ema12 > 0.024856 )
									ret := -0.888889 // sell
							if( ad > -27028 )
								if( ema13 <= 0.848827 )
									ret := 0.019201
								if( ema13 > 0.848827 )
									ret := 0.923077 // buy
		if( ema1 > 31.3243 )
			if( mf <= -0.22158 )
				if( ad <= -1.23854e+06 )
					if( ema2 <= 111.632 )
						if( ema2 <= 92.4033 )
							if( ema12 <= -1.18393 )
								if( ema13 <= -4.64041 )
									ret := 0.000000
								if( ema13 > -4.64041 )
									ret := -0.888889 // sell
							if( ema12 > -1.18393 )
								if( ad <= -1.41978e+06 )
									ret := -0.033898
								if( ad > -1.41978e+06 )
									ret := -0.857143 // sell
						if( ema2 > 92.4033 )
							ret := -1.000000 // sell
					if( ema2 > 111.632 )
						if( ad <= -2.09858e+06 )
							ret := 1.000000 // buy
						if( ad > -2.09858e+06 )
							ret := -0.250000
				if( ad > -1.23854e+06 )
					if( ema3 <= 42.4452 )
						if( ema13 <= -0.795593 )
							if( ema3 <= 36.1943 )
								if( ema12 <= -0.471 )
									ret := 0.857143 // buy
								if( ema12 > -0.471 )
									ret := 0.000000
							if( ema3 > 36.1943 )
								if( ema3 <= 41.2612 )
									ret := 0.083333
								if( ema3 > 41.2612 )
									ret := -0.538462
						if( ema13 > -0.795593 )
							if( ad <= -856698 )
								if( ad <= -1.02347e+06 )
									ret := -0.222222
								if( ad > -1.02347e+06 )
									ret := -0.833333 // sell
							if( ad > -856698 )
								if( ema12 <= 0.07018 )
									ret := -0.148718
								if( ema12 > 0.07018 )
									ret := -0.545455
					if( ema3 > 42.4452 )
						if( ema13 <= -4.37568 )
							if( ema1 <= 76.2896 )
								if( ema1 <= 59.1584 )
									ret := -1.000000 // sell
								if( ema1 > 59.1584 )
									ret := -0.687500
							if( ema1 > 76.2896 )
								if( ad_mf <= -92925.4 )
									ret := 0.636364
								if( ad_mf > -92925.4 )
									ret := -0.714286 // sell
						if( ema13 > -4.37568 )
							if( ad_mf <= -947178 )
								if( ad <= -1.12345e+06 )
									ret := -0.066667
								if( ad > -1.12345e+06 )
									ret := 0.734694 // buy
							if( ad_mf > -947178 )
								if( ad_mf <= -930940 )
									ret := -0.800000 // sell
								if( ad_mf > -930940 )
									ret := 0.053490
			if( mf > -0.22158 )
				if( ad <= -1.96605e+06 )
					if( ad <= -2.55181e+06 )
						if( ad <= -2.93871e+06 )
							if( ad <= -3.30426e+06 )
								if( mf <= -0.05258 )
									ret := -1.000000 // sell
								if( mf > -0.05258 )
									ret := 0.454545
							if( ad > -3.30426e+06 )
								ret := 1.000000 // buy
						if( ad > -2.93871e+06 )
							if( tema <= 53.557 )
								ret := 0.000000
							if( tema > 53.557 )
								ret := -0.750000 // sell
					if( ad > -2.55181e+06 )
						if( ema3 <= 57.7006 )
							if( ema3 <= 51.6279 )
								ret := 0.500000
							if( ema3 > 51.6279 )
								ret := 0.500000
						if( ema3 > 57.7006 )
							if( ema12 <= 1.22787 )
								ret := 1.000000 // buy
							if( ema12 > 1.22787 )
								ret := 0.750000 // buy
				if( ad > -1.96605e+06 )
					if( ema12 <= 0.52671 )
						if( ad <= -883215 )
							if( ema1 <= 85.6331 )
								if( ema3 <= 43.2774 )
									ret := -0.458333
								if( ema3 > 43.2774 )
									ret := 0.142857
							if( ema1 > 85.6331 )
								if( ema12 <= -0.6541 )
									ret := 0.300000
								if( ema12 > -0.6541 )
									ret := -0.666667
						if( ad > -883215 )
							if( ad_mf <= -252081 )
								if( ema13 <= 0.894849 )
									ret := 0.144366
								if( ema13 > 0.894849 )
									ret := -0.421053
							if( ad_mf > -252081 )
								if( ad <= -247680 )
									ret := -0.514286
								if( ad > -247680 )
									ret := 0.045461
					if( ema12 > 0.52671 )
						if( ad <= -700288 )
							if( ad_mf <= -1.4255e+06 )
								ret := -0.400000
							if( ad_mf > -1.4255e+06 )
								if( ema3 <= 91.0875 )
									ret := 0.755102 // buy
								if( ema3 > 91.0875 )
									ret := 0.317073
						if( ad > -700288 )
							if( ad_mf <= -337144 )
								if( ema13 <= 1.40968 )
									ret := 0.222222
								if( ema13 > 1.40968 )
									ret := -0.311475
							if( ad_mf > -337144 )
								if( ad <= -308082 )
									ret := 0.702703 // buy
								if( ad > -308082 )
									ret := 0.144272
	if( ad_mf > -291.939 )
		if( ad_mf <= 14227.2 )
			if( ema12 <= 0.001046 )
				if( ad <= 0 )
					if( ema3 <= 4.6072 )
						if( tema <= 4.19769 )
							if( ema3 <= 3.63468 )
								if( mf <= 0.014039 )
									ret := 0.087719
								if( mf > 0.014039 )
									ret := 0.500000
							if( ema3 > 3.63468 )
								if( mf <= -0.024708 )
									ret := 0.159420
								if( mf > -0.024708 )
									ret := -0.333333
						if( tema > 4.19769 )
							if( ema3 <= 4.37908 )
								if( ema3 <= 4.3146 )
									ret := 0.220000
								if( ema3 > 4.3146 )
									ret := 0.657143
							if( ema3 > 4.37908 )
								if( ema2 <= 4.58728 )
									ret := 0.188571
								if( ema2 > 4.58728 )
									ret := 0.875000 // buy
					if( ema3 > 4.6072 )
						if( ema2 <= 5.02147 )
							if( tema <= 4.77686 )
								if( ema13 <= -0.013234 )
									ret := 0.231579
								if( ema13 > -0.013234 )
									ret := -0.200000
							if( tema > 4.77686 )
								if( ema13 <= -0.003663 )
									ret := -0.611111
								if( ema13 > -0.003663 )
									ret := 0.187500
						if( ema2 > 5.02147 )
							if( ema12 <= -0.013428 )
								if( ema13 <= -0.068874 )
									ret := 0.089744
								if( ema13 > -0.068874 )
									ret := 0.228208
							if( ema12 > -0.013428 )
								if( ema13 <= -0.029589 )
									ret := -0.145455
								if( ema13 > -0.029589 )
									ret := 0.093785
				if( ad > 0 )
					if( ema12 <= -0.040989 )
						if( tema <= 118.856 )
							if( ema13 <= -3.26172 )
								if( ema3 <= 108.631 )
									ret := -1.000000 // sell
								if( ema3 > 108.631 )
									ret := 0.000000
							if( ema13 > -3.26172 )
								if( ema12 <= -0.308573 )
									ret := 0.302663
								if( ema12 > -0.308573 )
									ret := 0.044382
						if( tema > 118.856 )
							if( ema13 <= -0.123513 )
								if( ad_mf <= 1370.6 )
									ret := -0.387097
								if( ad_mf > 1370.6 )
									ret := -0.139073
							if( ema13 > -0.123513 )
								if( ad_mf <= 3252.46 )
									ret := 0.250000
								if( ad_mf > 3252.46 )
									ret := -0.375000
					if( ema12 > -0.040989 )
						if( ad_mf <= 5174.84 )
							if( ema13 <= -0.001136 )
								if( ema2 <= 5.97578 )
									ret := -0.239686
								if( ema2 > 5.97578 )
									ret := -0.109800
							if( ema13 > -0.001136 )
								if( tema <= 28.8667 )
									ret := 0.014634
								if( tema > 28.8667 )
									ret := 0.244681
						if( ad_mf > 5174.84 )
							if( ad <= 6655.14 )
								if( ema2 <= 9.98862 )
									ret := 0.114286
								if( ema2 > 9.98862 )
									ret := 0.641791
							if( ad > 6655.14 )
								if( mf <= -0.079532 )
									ret := 0.103659
								if( mf > -0.079532 )
									ret := -0.203252
			if( ema12 > 0.001046 )
				if( ad <= 285.154 )
					if( ema2 <= 4.18843 )
						if( ema12 <= 0.005411 )
							if( ema2 <= 3.58116 )
								if( ema2 <= 3.46121 )
									ret := 0.118280
								if( ema2 > 3.46121 )
									ret := 0.580645
							if( ema2 > 3.58116 )
								if( mf <= -0.240259 )
									ret := 0.555556
								if( mf > -0.240259 )
									ret := -0.310345
						if( ema12 > 0.005411 )
							if( mf <= -0.545894 )
								if( tema <= 3.41272 )
									ret := 0.636364
								if( tema > 3.41272 )
									ret := -0.538462
							if( mf > -0.545894 )
								if( tema <= 3.15399 )
									ret := -0.650000
								if( tema > 3.15399 )
									ret := -0.334559
					if( ema2 > 4.18843 )
						if( ema3 <= 4.6426 )
							if( ad_mf <= -0.194197 )
								if( mf <= 0.525663 )
									ret := -0.365079
								if( mf > 0.525663 )
									ret := 0.529412
							if( ad_mf > -0.194197 )
								if( ema12 <= 0.006147 )
									ret := 0.054945
								if( ema12 > 0.006147 )
									ret := 0.382883
						if( ema3 > 4.6426 )
							if( mf <= 0.034842 )
								if( ema2 <= 85.0868 )
									ret := -0.059104
								if( ema2 > 85.0868 )
									ret := -0.210654
							if( mf > 0.034842 )
								if( ema1 <= 23.3747 )
									ret := -0.060030
								if( ema1 > 23.3747 )
									ret := 0.074442
				if( ad > 285.154 )
					if( tema <= 39.9224 )
						if( ema13 <= 0.799899 )
							if( mf <= -0.099397 )
								if( ema12 <= 0.011723 )
									ret := -0.150396
								if( ema12 > 0.011723 )
									ret := -0.318182
							if( mf > -0.099397 )
								if( ad_mf <= 500.067 )
									ret := -0.355030
								if( ad_mf > 500.067 )
									ret := -0.138223
						if( ema13 > 0.799899 )
							if( ad <= 4104.66 )
								ret := 0.000000
							if( ad > 4104.66 )
								if( tema <= 30.745 )
									ret := 1.000000 // buy
								if( tema > 30.745 )
									ret := 0.777778 // buy
					if( tema > 39.9224 )
						if( ad <= 1149.27 )
							if( mf <= -0.446053 )
								if( tema <= 70.1101 )
									ret := 0.000000
								if( tema > 70.1101 )
									ret := -0.840000 // sell
							if( mf > -0.446053 )
								if( mf <= 0.075559 )
									ret := 0.006734
								if( mf > 0.075559 )
									ret := -0.208955
						if( ad > 1149.27 )
							if( ema12 <= 0.795547 )
								if( ad <= 1171.8 )
									ret := 0.588235
								if( ad > 1171.8 )
									ret := 0.037955
							if( ema12 > 0.795547 )
								if( ad <= 1503.91 )
									ret := 0.500000
								if( ad > 1503.91 )
									ret := -0.403846
		if( ad_mf > 14227.2 )
			if( ema13 <= -4.03848 )
				if( ema3 <= 114.277 )
					if( ema13 <= -8.40266 )
						ret := -0.428571
					if( ema13 > -8.40266 )
						if( ad <= 1.55814e+06 )
							if( ema13 <= -4.50304 )
								if( ema3 <= 92.3125 )
									ret := -0.750000 // sell
								if( ema3 > 92.3125 )
									ret := -1.000000 // sell
							if( ema13 > -4.50304 )
								ret := -0.500000
						if( ad > 1.55814e+06 )
							ret := -1.000000 // sell
				if( ema3 > 114.277 )
					if( ad_mf <= 182136 )
						ret := -0.666667
					if( ad_mf > 182136 )
						ret := 0.400000
			if( ema13 > -4.03848 )
				if( ad <= 17119.3 )
					if( ema12 <= 0.11936 )
						if( tema <= 23.9822 )
							if( ad_mf <= 16673.2 )
								if( mf <= 0.320292 )
									ret := -0.108527
								if( mf > 0.320292 )
									ret := -0.750000 // sell
							if( ad_mf > 16673.2 )
								if( ema13 <= -0.062257 )
									ret := -0.600000
								if( ema13 > -0.062257 )
									ret := 0.696970
						if( tema > 23.9822 )
							if( ad <= 16921.7 )
								if( ad_mf <= 16501.9 )
									ret := 0.258929
								if( ad_mf > 16501.9 )
									ret := -0.400000
							if( ad > 16921.7 )
								if( ema3 <= 118.42 )
									ret := 1.000000 // buy
								if( ema3 > 118.42 )
									ret := 0.750000 // buy
					if( ema12 > 0.11936 )
						if( ema3 <= 99.8938 )
							if( ema3 <= 30.8072 )
								if( tema <= 17.0774 )
									ret := 0.857143 // buy
								if( tema > 17.0774 )
									ret := 1.000000 // buy
							if( ema3 > 30.8072 )
								if( ad_mf <= 16211.7 )
									ret := 0.763158 // buy
								if( ad_mf > 16211.7 )
									ret := -0.166667
						if( ema3 > 99.8938 )
							if( ema13 <= 1.37928 )
								if( ema12 <= 0.341383 )
									ret := 0.100000
								if( ema12 > 0.341383 )
									ret := -0.400000
							if( ema13 > 1.37928 )
								ret := 0.600000
				if( ad > 17119.3 )
					if( ad <= 17484.1 )
						if( ema3 <= 6.26539 )
							if( ema12 <= -0.002797 )
								ret := -0.500000
							if( ema12 > -0.002797 )
								ret := 0.285714
						if( ema3 > 6.26539 )
							if( ema12 <= -0.047144 )
								if( tema <= 78.454 )
									ret := -0.571429
								if( tema > 78.454 )
									ret := -0.200000
							if( ema12 > -0.047144 )
								if( tema <= 69.7836 )
									ret := -0.966667 // sell
								if( tema > 69.7836 )
									ret := -0.600000
					if( ad > 17484.1 )
						if( ema1 <= 94.8924 )
							if( ema3 <= 6.87077 )
								if( ad <= 254806 )
									ret := -0.033506
								if( ad > 254806 )
									ret := 0.104911
							if( ema3 > 6.87077 )
								if( ema13 <= 0.003918 )
									ret := 0.044061
								if( ema13 > 0.003918 )
									ret := 0.096805
						if( ema1 > 94.8924 )
							if( ema1 <= 95.5432 )
								if( ad_mf <= 54329.6 )
									ret := 0.400000
								if( ad_mf > 54329.6 )
									ret := -0.485714
							if( ema1 > 95.5432 )
								if( mf <= 0.839513 )
									ret := 0.002491
								if( mf > 0.839513 )
									ret := -0.538462
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Chaikin_Money_Flow 
 //@version=5
//indicator title="Chaikin Money Flow", shorttitle="CMF", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
var cumVol = 0.
cumVol += nz(volume)
if barstate.islast and cumVol == 0
    runtime.error("No volume is provided by the data vendor.")
length_CMF = input.int(20, minval=1)
ad = close==high and close==low or high==low ? 0 : ((2*close-low-high)/(high-low))*volume
mf = math.sum(ad, length_CMF) / math.sum(volume, length_CMF)
plot(mf, color=#43A047, title="MF")
hline(0, color=#787B86, title="Zero", linestyle=hline.style_dashed)


ad_mf = ad - mf

//CODE associated with the technical indicator L_Triple_EMA 
//@version=5
//indicator title="Triple EMA", shorttitle="TEMA", overlay=true, timeframe="", timeframe_gaps=true)
length_TEMA = input.int(9, minval=1)
ema1 = ta.ema(close, length_TEMA)
ema2 = ta.ema(ema1, length_TEMA)
ema3 = ta.ema(ema2, length_TEMA)
tema = 3 * (ema1 - ema2) + ema3
plot(tema, "TEMA", color=#2962FF)

ema12 = ema1 - ema2
ema13 = ema1 - ema3


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
float op_operation = decision_tree_0_PTON_15Min_ebb50411(mf, ad_mf, ad, ema12, ema3, ema13, tema, ema1, ema2)

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


