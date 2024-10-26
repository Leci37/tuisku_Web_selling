//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Money_Flow_Index
// ID_model: UBER_1Min_2CM0_f0777b13 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UBER_1Min_2CM0_f0777b13", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UBER_1Min_f0777b13(ad_mf, mf, ad, Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( Positive_Money_Flow <= 5935.98 )
		if( Raw_Money_Flow <= 151487 )
			if( MFI_Low <= 23.0638 )
				if( ad_mf <= 27.2459 )
					if( Negative_Money_Flow_Sum <= 6.11621e+06 )
						if( mf <= -0.144329 )
							if( MFI_Low <= 10.2337 )
								if( Positive_Money_Flow_Sum <= 274798 )
									ret := 0.461664
								if( Positive_Money_Flow_Sum > 274798 )
									ret := 0.072340
							if( MFI_Low > 10.2337 )
								if( mf <= -0.233821 )
									ret := 0.447368
								if( mf > -0.233821 )
									ret := 0.655914
						if( mf > -0.144329 )
							if( MFI_Low <= -9.04082 )
								if( Negative_Money_Flow_Sum <= 337180 )
									ret := -0.857143 // sell
								if( Negative_Money_Flow_Sum > 337180 )
									ret := 0.538462
							if( MFI_Low > -9.04082 )
								if( Positive_Money_Flow_Sum <= 183143 )
									ret := 0.323092
								if( Positive_Money_Flow_Sum > 183143 )
									ret := 0.113413
					if( Negative_Money_Flow_Sum > 6.11621e+06 )
						if( Money_Flow_Ratio <= 0.000639 )
							ret := -0.833333 // sell
						if( Money_Flow_Ratio > 0.000639 )
							if( MFI_High <= -79.3935 )
								if( Typical_Price <= 73.0853 )
									ret := 0.460000
								if( Typical_Price > 73.0853 )
									ret := 0.000000
							if( MFI_High > -79.3935 )
								if( Positive_Money_Flow_Sum <= 5.41599e+06 )
									ret := -0.263158
								if( Positive_Money_Flow_Sum > 5.41599e+06 )
									ret := 0.186207
				if( ad_mf > 27.2459 )
					if( Positive_Money_Flow_Sum <= 127548 )
						if( MFI <= 29.6052 )
							if( ad <= 1313.51 )
								if( Negative_Money_Flow_Sum <= 407192 )
									ret := 0.000000
								if( Negative_Money_Flow_Sum > 407192 )
									ret := -0.500000
							if( ad > 1313.51 )
								ret := 0.400000
						if( MFI > 29.6052 )
							if( ad_mf <= 240.989 )
								ret := -1.000000 // sell
							if( ad_mf > 240.989 )
								ret := -0.818182 // sell
					if( Positive_Money_Flow_Sum > 127548 )
						if( Negative_Money_Flow_Sum <= 1.16018e+06 )
							if( MFI_High <= -52.8126 )
								if( Money_Flow_Ratio <= 0.219341 )
									ret := 1.000000 // buy
								if( Money_Flow_Ratio > 0.219341 )
									ret := 0.694444
							if( MFI_High > -52.8126 )
								if( ad <= 1070.5 )
									ret := 0.398438
								if( ad > 1070.5 )
									ret := -0.466667
						if( Negative_Money_Flow_Sum > 1.16018e+06 )
							if( mf <= -0.003807 )
								if( Negative_Money_Flow_Sum <= 1.08739e+08 )
									ret := -0.673469
								if( Negative_Money_Flow_Sum > 1.08739e+08 )
									ret := 0.187500
							if( mf > -0.003807 )
								if( Money_Flow_Ratio <= 0.11448 )
									ret := 0.857143 // buy
								if( Money_Flow_Ratio > 0.11448 )
									ret := -0.153846
			if( MFI_Low > 23.0638 )
				if( ad <= 15.0594 )
					if( Positive_Money_Flow_Sum <= 2.13383e+06 )
						if( MFI <= 47.7382 )
							if( ad_mf <= -1692.26 )
								ret := 0.933333 // buy
							if( ad_mf > -1692.26 )
								if( Negative_Money_Flow <= 131045 )
									ret := -0.061728
								if( Negative_Money_Flow > 131045 )
									ret := 1.000000 // buy
						if( MFI > 47.7382 )
							if( Negative_Money_Flow <= 108.533 )
								if( MFI_High <= 6.43105 )
									ret := -0.169154
								if( MFI_High > 6.43105 )
									ret := 0.431818
							if( Negative_Money_Flow > 108.533 )
								if( MFI_Low <= 53.0444 )
									ret := 0.285847
								if( MFI_Low > 53.0444 )
									ret := 0.079427
					if( Positive_Money_Flow_Sum > 2.13383e+06 )
						if( Positive_Money_Flow_Sum <= 3.27985e+06 )
							if( MFI <= 66.4903 )
								if( ad <= -664.333 )
									ret := 0.727273 // buy
								if( ad > -664.333 )
									ret := -0.375000
							if( MFI > 66.4903 )
								if( ad <= -805.104 )
									ret := 0.058824
								if( ad > -805.104 )
									ret := 0.769231 // buy
						if( Positive_Money_Flow_Sum > 3.27985e+06 )
							if( Positive_Money_Flow_Sum <= 3.51426e+06 )
								ret := -0.172414
							if( Positive_Money_Flow_Sum > 3.51426e+06 )
								if( Negative_Money_Flow_Sum <= 2.87771e+07 )
									ret := 0.353468
								if( Negative_Money_Flow_Sum > 2.87771e+07 )
									ret := 0.064815
				if( ad > 15.0594 )
					if( Negative_Money_Flow <= 61005.1 )
						if( Typical_Price <= 63.4352 )
							ret := -1.000000 // sell
						if( Typical_Price > 63.4352 )
							if( Positive_Money_Flow_Sum <= 450849 )
								if( Negative_Money_Flow <= 20642 )
									ret := 0.512821
								if( Negative_Money_Flow > 20642 )
									ret := -0.250000
							if( Positive_Money_Flow_Sum > 450849 )
								if( Positive_Money_Flow_Sum <= 1.57277e+06 )
									ret := -0.696970
								if( Positive_Money_Flow_Sum > 1.57277e+06 )
									ret := -0.158730
					if( Negative_Money_Flow > 61005.1 )
						if( MFI_Low <= 52.8158 )
							if( Negative_Money_Flow <= 71377.8 )
								if( Typical_Price <= 68.6949 )
									ret := 0.900000 // buy
								if( Typical_Price > 68.6949 )
									ret := 0.333333
							if( Negative_Money_Flow > 71377.8 )
								if( Positive_Money_Flow_Sum <= 1.07355e+06 )
									ret := 0.388235
								if( Positive_Money_Flow_Sum > 1.07355e+06 )
									ret := -0.441860
						if( MFI_Low > 52.8158 )
							if( MFI <= 83.4651 )
								if( Negative_Money_Flow <= 75147 )
									ret := -0.875000 // sell
								if( Negative_Money_Flow > 75147 )
									ret := -0.363636
							if( MFI > 83.4651 )
								if( MFI_Low <= 67.3242 )
									ret := 0.583333
								if( MFI_Low > 67.3242 )
									ret := 0.181818
		if( Raw_Money_Flow > 151487 )
			if( Negative_Money_Flow_Sum <= 1.13581e+08 )
				if( Positive_Money_Flow_Sum <= 405421 )
					if( Raw_Money_Flow <= 437841 )
						if( Negative_Money_Flow_Sum <= 719809 )
							if( Money_Flow_Ratio <= 0.234103 )
								if( mf <= -0.182518 )
									ret := -0.100000
								if( mf > -0.182518 )
									ret := 0.781818 // buy
							if( Money_Flow_Ratio > 0.234103 )
								if( Typical_Price <= 71.7937 )
									ret := -0.026786
								if( Typical_Price > 71.7937 )
									ret := 0.548387
						if( Negative_Money_Flow_Sum > 719809 )
							if( Negative_Money_Flow_Sum <= 1.38603e+06 )
								if( MFI_Low <= -8.89835 )
									ret := 0.500000
								if( MFI_Low > -8.89835 )
									ret := -0.456954
							if( Negative_Money_Flow_Sum > 1.38603e+06 )
								if( Typical_Price <= 64.8127 )
									ret := -0.250000
								if( Typical_Price > 64.8127 )
									ret := 0.704545 // buy
					if( Raw_Money_Flow > 437841 )
						if( Typical_Price <= 67.1324 )
							if( mf <= 0.243798 )
								if( Typical_Price <= 65.3301 )
									ret := 0.387097
								if( Typical_Price > 65.3301 )
									ret := 0.924242 // buy
							if( mf > 0.243798 )
								ret := -0.375000
						if( Typical_Price > 67.1324 )
							if( MFI_High <= -78.3331 )
								if( Negative_Money_Flow <= 5.15619e+06 )
									ret := 0.285714
								if( Negative_Money_Flow > 5.15619e+06 )
									ret := -0.677419
							if( MFI_High > -78.3331 )
								if( ad_mf <= -47352.4 )
									ret := -0.090909
								if( ad_mf > -47352.4 )
									ret := 0.648649
				if( Positive_Money_Flow_Sum > 405421 )
					if( MFI_Low <= 67.7182 )
						if( ad_mf <= -29871 )
							if( Raw_Money_Flow <= 2.47932e+06 )
								if( Money_Flow_Ratio <= 0.298878 )
									ret := 0.789474 // buy
								if( Money_Flow_Ratio > 0.298878 )
									ret := 0.178082
							if( Raw_Money_Flow > 2.47932e+06 )
								if( Negative_Money_Flow <= 7.74399e+06 )
									ret := 0.010381
								if( Negative_Money_Flow > 7.74399e+06 )
									ret := 0.152686
						if( ad_mf > -29871 )
							if( Typical_Price <= 61.9128 )
								if( Typical_Price <= 58.8452 )
									ret := 0.385542
								if( Typical_Price > 58.8452 )
									ret := 0.150901
							if( Typical_Price > 61.9128 )
								if( Money_Flow_Ratio <= 1.39669 )
									ret := -0.035594
								if( Money_Flow_Ratio > 1.39669 )
									ret := 0.036970
					if( MFI_Low > 67.7182 )
						if( Positive_Money_Flow_Sum <= 8.22224e+07 )
							if( MFI_High <= 14.3132 )
								if( ad <= -20590.1 )
									ret := 0.567568
								if( ad > -20590.1 )
									ret := -0.359223
							if( MFI_High > 14.3132 )
								ret := 0.812500 // buy
						if( Positive_Money_Flow_Sum > 8.22224e+07 )
							if( Negative_Money_Flow_Sum <= 2.16041e+07 )
								if( Typical_Price <= 70.1916 )
									ret := -0.745455 // sell
								if( Typical_Price > 70.1916 )
									ret := -0.190476
							if( Negative_Money_Flow_Sum > 2.16041e+07 )
								if( Money_Flow_Ratio <= 7.60642 )
									ret := -0.900000 // sell
								if( Money_Flow_Ratio > 7.60642 )
									ret := -1.000000 // sell
			if( Negative_Money_Flow_Sum > 1.13581e+08 )
				if( MFI_Low <= -4.33892 )
					if( Negative_Money_Flow_Sum <= 1.37178e+08 )
						if( Raw_Money_Flow <= 2.27342e+07 )
							if( MFI_High <= -72.0248 )
								if( MFI_High <= -75.0999 )
									ret := 1.000000 // buy
								if( MFI_High > -75.0999 )
									ret := 0.764706 // buy
							if( MFI_High > -72.0248 )
								ret := 1.000000 // buy
						if( Raw_Money_Flow > 2.27342e+07 )
							ret := 0.812500 // buy
					if( Negative_Money_Flow_Sum > 1.37178e+08 )
						if( Positive_Money_Flow_Sum <= 2.91078e+07 )
							if( MFI <= 10.133 )
								if( Negative_Money_Flow_Sum <= 1.73384e+08 )
									ret := 0.052632
								if( Negative_Money_Flow_Sum > 1.73384e+08 )
									ret := -0.375000
							if( MFI > 10.133 )
								ret := 0.555556
						if( Positive_Money_Flow_Sum > 2.91078e+07 )
							ret := 1.000000 // buy
				if( MFI_Low > -4.33892 )
					if( ad_mf <= 182278 )
						if( MFI <= 37.6511 )
							if( Positive_Money_Flow_Sum <= 9.19595e+07 )
								if( MFI <= 29.5466 )
									ret := 0.146667
								if( MFI > 29.5466 )
									ret := -0.513158
							if( Positive_Money_Flow_Sum > 9.19595e+07 )
								if( MFI_High <= -47.9816 )
									ret := 0.600000
								if( MFI_High > -47.9816 )
									ret := 0.909091 // buy
						if( MFI > 37.6511 )
							if( Negative_Money_Flow_Sum <= 1.64518e+08 )
								if( Negative_Money_Flow <= 788711 )
									ret := 0.363636
								if( Negative_Money_Flow > 788711 )
									ret := 0.831169 // buy
							if( Negative_Money_Flow_Sum > 1.64518e+08 )
								if( Positive_Money_Flow_Sum <= 2.43317e+08 )
									ret := 0.590909
								if( Positive_Money_Flow_Sum > 2.43317e+08 )
									ret := -0.733333 // sell
					if( ad_mf > 182278 )
						ret := -0.611111
	if( Positive_Money_Flow > 5935.98 )
		if( ad <= -29.4572 )
			if( Positive_Money_Flow_Sum <= 455939 )
				if( MFI_Low <= 0.346544 )
					if( MFI_Low <= -4.6358 )
						if( MFI_High <= -65.9581 )
							if( Positive_Money_Flow <= 12698.2 )
								ret := -0.714286 // sell
							if( Positive_Money_Flow > 12698.2 )
								if( Negative_Money_Flow_Sum <= 1.35158e+06 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow_Sum > 1.35158e+06 )
									ret := 0.047619
						if( MFI_High > -65.9581 )
							ret := 1.000000 // buy
					if( MFI_Low > -4.6358 )
						if( Negative_Money_Flow_Sum <= 995469 )
							ret := -0.777778 // sell
						if( Negative_Money_Flow_Sum > 995469 )
							ret := -0.090909
				if( MFI_Low > 0.346544 )
					if( Raw_Money_Flow <= 18322.9 )
						if( ad <= -151.619 )
							ret := -0.250000
						if( ad > -151.619 )
							ret := 0.636364
					if( Raw_Money_Flow > 18322.9 )
						if( ad <= -325.554 )
							if( Typical_Price <= 73.4346 )
								if( MFI_High <= -51.2658 )
									ret := 0.916667 // buy
								if( MFI_High > -51.2658 )
									ret := 0.459016
							if( Typical_Price > 73.4346 )
								if( MFI_High <= -45.707 )
									ret := 0.583333
								if( MFI_High > -45.707 )
									ret := -0.240000
						if( ad > -325.554 )
							if( Typical_Price <= 71.8639 )
								if( MFI_High <= -9.37893 )
									ret := 0.683544
								if( MFI_High > -9.37893 )
									ret := 0.285714
							if( Typical_Price > 71.8639 )
								ret := 1.000000 // buy
			if( Positive_Money_Flow_Sum > 455939 )
				if( Raw_Money_Flow <= 150342 )
					if( Positive_Money_Flow_Sum <= 480736 )
						if( ad <= -547.485 )
							ret := -0.705882 // sell
						if( ad > -547.485 )
							ret := -1.000000 // sell
					if( Positive_Money_Flow_Sum > 480736 )
						if( mf <= -0.690414 )
							if( Raw_Money_Flow <= 70709.2 )
								ret := -0.545455
							if( Raw_Money_Flow > 70709.2 )
								ret := -0.833333 // sell
						if( mf > -0.690414 )
							if( Money_Flow_Ratio <= 0.634478 )
								if( ad <= -181.37 )
									ret := -0.209877
								if( ad > -181.37 )
									ret := 0.714286 // buy
							if( Money_Flow_Ratio > 0.634478 )
								if( mf <= -0.402276 )
									ret := -0.363636
								if( mf > -0.402276 )
									ret := 0.404221
				if( Raw_Money_Flow > 150342 )
					if( Money_Flow_Ratio <= 156.17 )
						if( MFI_High <= -70.9623 )
							if( Typical_Price <= 63.5683 )
								ret := 0.800000 // buy
							if( Typical_Price > 63.5683 )
								if( MFI <= 5.65215 )
									ret := -0.500000
								if( MFI > 5.65215 )
									ret := -0.848485 // sell
						if( MFI_High > -70.9623 )
							if( Positive_Money_Flow <= 3.03497e+06 )
								if( Negative_Money_Flow_Sum <= 8.76649e+07 )
									ret := -0.028414
								if( Negative_Money_Flow_Sum > 8.76649e+07 )
									ret := 0.468750
							if( Positive_Money_Flow > 3.03497e+06 )
								if( MFI <= 90.5521 )
									ret := 0.140783
								if( MFI > 90.5521 )
									ret := -0.263514
					if( Money_Flow_Ratio > 156.17 )
						if( Positive_Money_Flow_Sum <= 6.04596e+07 )
							if( Raw_Money_Flow <= 2.97039e+06 )
								ret := -1.000000 // sell
							if( Raw_Money_Flow > 2.97039e+06 )
								ret := -0.400000
						if( Positive_Money_Flow_Sum > 6.04596e+07 )
							if( Positive_Money_Flow <= 830785 )
								ret := -1.000000 // sell
							if( Positive_Money_Flow > 830785 )
								ret := 1.000000 // buy
		if( ad > -29.4572 )
			if( Positive_Money_Flow_Sum <= 4.93829e+06 )
				if( Positive_Money_Flow_Sum <= 244395 )
					if( MFI_Low <= 9.80375 )
						if( mf <= 0.042758 )
							if( ad_mf <= -0.028221 )
								ret := 0.700000 // buy
							if( ad_mf > -0.028221 )
								if( MFI_Low <= -6.13279 )
									ret := -0.350195
								if( MFI_Low > -6.13279 )
									ret := -0.070388
						if( mf > 0.042758 )
							if( Positive_Money_Flow_Sum <= 167322 )
								if( Negative_Money_Flow_Sum <= 318099 )
									ret := -0.800000 // sell
								if( Negative_Money_Flow_Sum > 318099 )
									ret := -0.189655
							if( Positive_Money_Flow_Sum > 167322 )
								if( ad_mf <= -0.165421 )
									ret := -0.566667
								if( ad_mf > -0.165421 )
									ret := -0.894737 // sell
					if( MFI_Low > 9.80375 )
						if( ad <= 811 )
							if( MFI_High <= -21.6777 )
								if( ad_mf <= 308.853 )
									ret := 0.249655
								if( ad_mf > 308.853 )
									ret := -0.189189
							if( MFI_High > -21.6777 )
								if( Raw_Money_Flow <= 14100.1 )
									ret := -0.563492
								if( Raw_Money_Flow > 14100.1 )
									ret := -0.076433
						if( ad > 811 )
							if( MFI_High <= -40.3739 )
								if( ad_mf <= 1290.86 )
									ret := 0.235294
								if( ad_mf > 1290.86 )
									ret := -0.333333
							if( MFI_High > -40.3739 )
								if( Money_Flow_Ratio <= 1.39101 )
									ret := 0.833333 // buy
								if( Money_Flow_Ratio > 1.39101 )
									ret := 0.153846
				if( Positive_Money_Flow_Sum > 244395 )
					if( Raw_Money_Flow <= 55177.3 )
						if( MFI_High <= 13.99 )
							if( Negative_Money_Flow_Sum <= 258548 )
								if( MFI_Low <= 58.4693 )
									ret := 0.012346
								if( MFI_Low > 58.4693 )
									ret := -0.297131
							if( Negative_Money_Flow_Sum > 258548 )
								if( mf <= -0.14531 )
									ret := -0.228571
								if( mf > -0.14531 )
									ret := -0.380309
						if( MFI_High > 13.99 )
							if( Raw_Money_Flow <= 13600.1 )
								ret := -0.071429
							if( Raw_Money_Flow > 13600.1 )
								if( Positive_Money_Flow_Sum <= 3.26725e+06 )
									ret := 0.750000 // buy
								if( Positive_Money_Flow_Sum > 3.26725e+06 )
									ret := 0.250000
					if( Raw_Money_Flow > 55177.3 )
						if( Negative_Money_Flow_Sum <= 1.58946e+07 )
							if( MFI <= 21.6587 )
								if( Positive_Money_Flow_Sum <= 633513 )
									ret := 0.520325
								if( Positive_Money_Flow_Sum > 633513 )
									ret := -0.062500
							if( MFI > 21.6587 )
								if( Positive_Money_Flow_Sum <= 259903 )
									ret := -0.711864 // sell
								if( Positive_Money_Flow_Sum > 259903 )
									ret := -0.141675
						if( Negative_Money_Flow_Sum > 1.58946e+07 )
							if( Positive_Money_Flow <= 287047 )
								if( MFI_Low <= -17.3316 )
									ret := -0.647059
								if( MFI_Low > -17.3316 )
									ret := -0.892857 // sell
							if( Positive_Money_Flow > 287047 )
								if( MFI_Low <= -15.4074 )
									ret := 0.700000 // buy
								if( MFI_Low > -15.4074 )
									ret := -0.298429
			if( Positive_Money_Flow_Sum > 4.93829e+06 )
				if( ad <= 180573 )
					if( Typical_Price <= 60.8281 )
						if( Raw_Money_Flow <= 7.82053e+06 )
							if( Positive_Money_Flow_Sum <= 2.39546e+07 )
								if( ad <= 22095.7 )
									ret := -0.322581
								if( ad > 22095.7 )
									ret := 0.219512
							if( Positive_Money_Flow_Sum > 2.39546e+07 )
								if( Positive_Money_Flow_Sum <= 8.56027e+07 )
									ret := -0.591160
								if( Positive_Money_Flow_Sum > 8.56027e+07 )
									ret := 0.230769
						if( Raw_Money_Flow > 7.82053e+06 )
							ret := 0.750000 // buy
					if( Typical_Price > 60.8281 )
						if( Money_Flow_Ratio <= 4.69642 )
							if( Positive_Money_Flow_Sum <= 1.13892e+08 )
								if( Raw_Money_Flow <= 1.53543e+06 )
									ret := 0.022866
								if( Raw_Money_Flow > 1.53543e+06 )
									ret := -0.043619
							if( Positive_Money_Flow_Sum > 1.13892e+08 )
								if( mf <= 0.004595 )
									ret := 0.852273 // buy
								if( mf > 0.004595 )
									ret := 0.191406
						if( Money_Flow_Ratio > 4.69642 )
							if( Negative_Money_Flow_Sum <= 2.09682e+07 )
								if( ad <= 127534 )
									ret := -0.118310
								if( ad > 127534 )
									ret := -0.728395 // sell
							if( Negative_Money_Flow_Sum > 2.09682e+07 )
								if( MFI_High <= 7.6538 )
									ret := -0.394737
								if( MFI_High > 7.6538 )
									ret := -0.736842 // sell
				if( ad > 180573 )
					if( MFI_Low <= 8.23835 )
						ret := 0.533333
					if( MFI_Low > 8.23835 )
						if( Raw_Money_Flow <= 7.34313e+07 )
							if( Positive_Money_Flow <= 2.43083e+07 )
								if( Negative_Money_Flow_Sum <= 2.97179e+07 )
									ret := -0.713115 // sell
								if( Negative_Money_Flow_Sum > 2.97179e+07 )
									ret := -0.406250
							if( Positive_Money_Flow > 2.43083e+07 )
								if( MFI <= 96.4441 )
									ret := -0.084034
								if( MFI > 96.4441 )
									ret := 1.000000 // buy
						if( Raw_Money_Flow > 7.34313e+07 )
							if( MFI <= 64.8378 )
								ret := -0.363636
							if( MFI > 64.8378 )
								if( Positive_Money_Flow_Sum <= 1.34603e+08 )
									ret := 0.111111
								if( Positive_Money_Flow_Sum > 1.34603e+08 )
									ret := -0.972973 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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

//CODE associated with the technical indicator L_Money_Flow_Index 
//@version=5
//indicator title="Money Flow Index (MFI)", shorttitle="MFI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)

// Input parameters
length_MFI = input.int(14, minval=1, title="MFI Length")

// Calculate the Typical Price
Typical_Price = (high + low + close) / 3

// Calculate Raw Money Flow
Raw_Money_Flow = Typical_Price * volume

// Calculate Positive and Negative Money Flow
Positive_Money_Flow = Raw_Money_Flow * (Typical_Price > Typical_Price[1] ? 1 : 0)
Negative_Money_Flow = Raw_Money_Flow * (Typical_Price < Typical_Price[1] ? 1 : 0)

// Sum of Positive and Negative Money Flow over the given length
Positive_Money_Flow_Sum = ta.sma(Positive_Money_Flow, length_MFI) * length_MFI
Negative_Money_Flow_Sum = ta.sma(Negative_Money_Flow, length_MFI) * length_MFI

// Calculate Money Flow Ratio
Money_Flow_Ratio = Positive_Money_Flow_Sum / Negative_Money_Flow_Sum

// Calculate MFI
MFI = 100 - (100 / (1 + Money_Flow_Ratio))

// Calculate MFI high and low bands
MFI_High = MFI - 80
MFI_Low = MFI - 20

// Plot the MFI
plot(MFI, color=color.blue, title="MFI")

// Plot the MFI high and low bands
hline(80, "MFI High", color=color.red, linestyle=hline.style_dashed)
hline(20, "MFI Low", color=color.green, linestyle=hline.style_dashed)
plot(MFI_High, color=color.red, title="MFI High Band")
plot(MFI_Low, color=color.green, title="MFI Low Band")

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
float op_operation = decision_tree_0_UBER_1Min_f0777b13(ad_mf, mf, ad, Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow)

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


