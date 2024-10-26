//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Vortex_Indicator
// ID_model: SNAP_1Min_2MV0_79e4e201 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SNAP_1Min_2MV0_79e4e201", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SNAP_1Min_79e4e201(Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow, VIP_VIM, VIM, VIP)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( VIP_VIM <= 0.166636 )
		if( Negative_Money_Flow <= 1.13936 )
			if( VIM <= 1.14993 )
				if( MFI <= 72.8143 )
					if( Positive_Money_Flow <= 2.45263e+06 )
						if( VIP <= 0.865079 )
							if( Money_Flow_Ratio <= 0.22069 )
								if( Positive_Money_Flow_Sum <= 2.01338e+06 )
									ret := -0.259259
								if( Positive_Money_Flow_Sum > 2.01338e+06 )
									ret := -0.947368 // sell
							if( Money_Flow_Ratio > 0.22069 )
								if( Negative_Money_Flow_Sum <= 4.54562e+06 )
									ret := 0.036290
								if( Negative_Money_Flow_Sum > 4.54562e+06 )
									ret := 0.351598
						if( VIP > 0.865079 )
							if( VIM <= 0.92358 )
								if( MFI_High <= -41.3305 )
									ret := -0.440678
								if( MFI_High > -41.3305 )
									ret := 0.196568
							if( VIM > 0.92358 )
								if( MFI_High <= -24.4486 )
									ret := 0.007494
								if( MFI_High > -24.4486 )
									ret := -0.075188
					if( Positive_Money_Flow > 2.45263e+06 )
						if( Typical_Price <= 9.66335 )
							if( Negative_Money_Flow_Sum <= 1.64139e+07 )
								if( Raw_Money_Flow <= 3.20985e+06 )
									ret := -0.315789
								if( Raw_Money_Flow > 3.20985e+06 )
									ret := 0.600000
							if( Negative_Money_Flow_Sum > 1.64139e+07 )
								ret := 1.000000 // buy
						if( Typical_Price > 9.66335 )
							if( VIP_VIM <= -0.262711 )
								if( VIP_VIM <= -0.319866 )
									ret := -0.565217
								if( VIP_VIM > -0.319866 )
									ret := 0.396226
							if( VIP_VIM > -0.262711 )
								if( MFI_High <= -41.7222 )
									ret := -0.508621
								if( MFI_High > -41.7222 )
									ret := -0.232014
				if( MFI > 72.8143 )
					if( Positive_Money_Flow_Sum <= 3.36275e+06 )
						if( MFI_High <= -5.20199 )
							if( Positive_Money_Flow_Sum <= 2.16539e+06 )
								if( VIM <= 0.966331 )
									ret := -0.562500
								if( VIM > 0.966331 )
									ret := -0.941176 // sell
							if( Positive_Money_Flow_Sum > 2.16539e+06 )
								if( VIP <= 1.05883 )
									ret := -0.736842 // sell
								if( VIP > 1.05883 )
									ret := 0.285714
						if( MFI_High > -5.20199 )
							if( MFI <= 79.3969 )
								if( MFI_Low <= 55.8669 )
									ret := 0.083333
								if( MFI_Low > 55.8669 )
									ret := 0.666667
							if( MFI > 79.3969 )
								if( Positive_Money_Flow <= 92743.7 )
									ret := -0.425000
								if( Positive_Money_Flow > 92743.7 )
									ret := 0.236842
					if( Positive_Money_Flow_Sum > 3.36275e+06 )
						if( Positive_Money_Flow <= 1.14377e+07 )
							if( Positive_Money_Flow <= 2.81197e+06 )
								if( VIM <= 0.948003 )
									ret := -0.555556
								if( VIM > 0.948003 )
									ret := -0.178744
							if( Positive_Money_Flow > 2.81197e+06 )
								if( VIP <= 1.04725 )
									ret := -0.868852 // sell
								if( VIP > 1.04725 )
									ret := -0.333333
						if( Positive_Money_Flow > 1.14377e+07 )
							ret := 0.692308
			if( VIM > 1.14993 )
				if( VIM <= 5.27483 )
					if( Raw_Money_Flow <= 1.81892e+06 )
						if( VIP_VIM <= 0.034334 )
							if( Money_Flow_Ratio <= 0.270284 )
								if( MFI_High <= -62.2116 )
									ret := -0.124313
								if( MFI_High > -62.2116 )
									ret := -0.247387
							if( Money_Flow_Ratio > 0.270284 )
								if( Raw_Money_Flow <= 1.681e+06 )
									ret := -0.053843
								if( Raw_Money_Flow > 1.681e+06 )
									ret := -0.766667 // sell
						if( VIP_VIM > 0.034334 )
							if( VIP <= 2.11053 )
								if( Positive_Money_Flow_Sum <= 65325.3 )
									ret := 0.189189
								if( Positive_Money_Flow_Sum > 65325.3 )
									ret := -0.411765
							if( VIP > 2.11053 )
								if( MFI_Low <= 38.851 )
									ret := 0.165138
								if( MFI_Low > 38.851 )
									ret := -0.320755
					if( Raw_Money_Flow > 1.81892e+06 )
						if( MFI_Low <= 50.8492 )
							if( VIM <= 1.40416 )
								if( MFI_High <= -50.6516 )
									ret := -0.215686
								if( MFI_High > -50.6516 )
									ret := 0.368750
							if( VIM > 1.40416 )
								if( Money_Flow_Ratio <= 0.412401 )
									ret := 0.705882 // buy
								if( Money_Flow_Ratio > 0.412401 )
									ret := 0.941176 // buy
						if( MFI_Low > 50.8492 )
							if( MFI_Low <= 77.9393 )
								if( VIP <= 0.946453 )
									ret := -0.222222
								if( VIP > 0.946453 )
									ret := -0.954545 // sell
							if( MFI_Low > 77.9393 )
								ret := -0.352941
				if( VIM > 5.27483 )
					if( Negative_Money_Flow_Sum <= 16177.4 )
						if( MFI <= 74.2234 )
							if( VIM <= 7.74007 )
								ret := -0.666667
							if( VIM > 7.74007 )
								ret := 0.111111
						if( MFI > 74.2234 )
							if( VIP <= 9.55767 )
								ret := 0.285714
							if( VIP > 9.55767 )
								if( VIP <= 20.5584 )
									ret := 0.952381 // buy
								if( VIP > 20.5584 )
									ret := 0.583333
					if( Negative_Money_Flow_Sum > 16177.4 )
						if( Money_Flow_Ratio <= 1.43644 )
							if( Money_Flow_Ratio <= 0.563107 )
								if( Positive_Money_Flow <= 17673.8 )
									ret := -0.120427
								if( Positive_Money_Flow > 17673.8 )
									ret := 0.542857
							if( Money_Flow_Ratio > 0.563107 )
								if( VIM <= 1839.61 )
									ret := -0.275168
								if( VIM > 1839.61 )
									ret := 0.866667 // buy
						if( Money_Flow_Ratio > 1.43644 )
							if( Positive_Money_Flow <= 225.457 )
								if( Typical_Price <= 15.2241 )
									ret := 0.060976
								if( Typical_Price > 15.2241 )
									ret := -0.560976
							if( Positive_Money_Flow > 225.457 )
								if( VIP_VIM <= -1.22673 )
									ret := -0.076923
								if( VIP_VIM > -1.22673 )
									ret := -0.700000 // sell
		if( Negative_Money_Flow > 1.13936 )
			if( Positive_Money_Flow_Sum <= 387223 )
				if( VIM <= 1.43791 )
					if( Negative_Money_Flow <= 1.04603e+06 )
						if( MFI <= 47.3906 )
							if( VIP_VIM <= -0.235693 )
								if( VIM <= 1.18026 )
									ret := 0.508475
								if( VIM > 1.18026 )
									ret := 0.146586
							if( VIP_VIM > -0.235693 )
								if( MFI <= 35.0307 )
									ret := -0.047319
								if( MFI > 35.0307 )
									ret := -0.442478
						if( MFI > 47.3906 )
							if( MFI <= 67.7382 )
								if( Negative_Money_Flow_Sum <= 134556 )
									ret := 0.083333
								if( Negative_Money_Flow_Sum > 134556 )
									ret := 0.770588 // buy
							if( MFI > 67.7382 )
								if( Negative_Money_Flow <= 10290 )
									ret := -0.631579
								if( Negative_Money_Flow > 10290 )
									ret := 0.214286
					if( Negative_Money_Flow > 1.04603e+06 )
						if( VIP_VIM <= -0.281092 )
							if( VIM <= 1.16427 )
								ret := 0.230769
							if( VIM > 1.16427 )
								if( VIP <= 0.623794 )
									ret := -0.055556
								if( VIP > 0.623794 )
									ret := -0.795918 // sell
						if( VIP_VIM > -0.281092 )
							ret := -1.000000 // sell
				if( VIM > 1.43791 )
					if( Money_Flow_Ratio <= 1.42794 )
						if( Raw_Money_Flow <= 3.10816e+06 )
							if( Typical_Price <= 15.2292 )
								if( Negative_Money_Flow_Sum <= 25844.6 )
									ret := -0.141414
								if( Negative_Money_Flow_Sum > 25844.6 )
									ret := 0.389591
							if( Typical_Price > 15.2292 )
								if( VIM <= 2.38941 )
									ret := 0.357401
								if( VIM > 2.38941 )
									ret := 0.079893
						if( Raw_Money_Flow > 3.10816e+06 )
							if( MFI_Low <= -19.1696 )
								ret := 0.363636
							if( MFI_Low > -19.1696 )
								ret := -1.000000 // sell
					if( Money_Flow_Ratio > 1.42794 )
						if( MFI <= 65.2948 )
							if( Positive_Money_Flow_Sum <= 204203 )
								if( Typical_Price <= 9.04552 )
									ret := 0.195122
								if( Typical_Price > 9.04552 )
									ret := -0.282609
							if( Positive_Money_Flow_Sum > 204203 )
								if( MFI <= 62.104 )
									ret := 1.000000 // buy
								if( MFI > 62.104 )
									ret := 0.093750
						if( MFI > 65.2948 )
							if( MFI_High <= 4.50287 )
								if( MFI_High <= 0.51111 )
									ret := 0.352273
								if( MFI_High > 0.51111 )
									ret := -0.500000
							if( MFI_High > 4.50287 )
								if( MFI_Low <= 67.4137 )
									ret := 0.968750 // buy
								if( MFI_Low > 67.4137 )
									ret := 0.676471
			if( Positive_Money_Flow_Sum > 387223 )
				if( MFI_High <= -2.77886 )
					if( Positive_Money_Flow_Sum <= 3.45793e+07 )
						if( Negative_Money_Flow_Sum <= 1.29374e+07 )
							if( MFI_Low <= 51.9149 )
								if( VIP_VIM <= 0.032104 )
									ret := 0.011649
								if( VIP_VIM > 0.032104 )
									ret := 0.091466
							if( MFI_Low > 51.9149 )
								if( Typical_Price <= 16.05 )
									ret := -0.184290
								if( Typical_Price > 16.05 )
									ret := -0.900000 // sell
						if( Negative_Money_Flow_Sum > 1.29374e+07 )
							if( Money_Flow_Ratio <= 0.062366 )
								if( Negative_Money_Flow <= 2.82366e+07 )
									ret := 0.666667
								if( Negative_Money_Flow > 2.82366e+07 )
									ret := 0.000000
							if( Money_Flow_Ratio > 0.062366 )
								if( Typical_Price <= 15.885 )
									ret := 0.169417
								if( Typical_Price > 15.885 )
									ret := -0.065574
					if( Positive_Money_Flow_Sum > 3.45793e+07 )
						if( VIP <= 1.05749 )
							if( Negative_Money_Flow <= 619632 )
								ret := 0.750000 // buy
							if( Negative_Money_Flow > 619632 )
								if( Raw_Money_Flow <= 6.30924e+06 )
									ret := -0.912281 // sell
								if( Raw_Money_Flow > 6.30924e+06 )
									ret := -0.470588
						if( VIP > 1.05749 )
							if( Negative_Money_Flow <= 2.9758e+06 )
								ret := 0.565217
							if( Negative_Money_Flow > 2.9758e+06 )
								ret := -0.400000
				if( MFI_High > -2.77886 )
					if( Raw_Money_Flow <= 12013.8 )
						if( MFI_Low <= 62.803 )
							if( Positive_Money_Flow_Sum <= 853413 )
								ret := 0.500000
							if( Positive_Money_Flow_Sum > 853413 )
								ret := -0.111111
						if( MFI_Low > 62.803 )
							if( VIP_VIM <= -0.165045 )
								if( MFI_High <= 10.3458 )
									ret := 0.833333 // buy
								if( MFI_High > 10.3458 )
									ret := 0.313725
							if( VIP_VIM > -0.165045 )
								if( Raw_Money_Flow <= 4360.02 )
									ret := 0.550000
								if( Raw_Money_Flow > 4360.02 )
									ret := 0.792453 // buy
					if( Raw_Money_Flow > 12013.8 )
						if( VIP_VIM <= -0.274547 )
							if( MFI_Low <= 59.7093 )
								ret := 0.666667
							if( MFI_Low > 59.7093 )
								if( Typical_Price <= 15.1851 )
									ret := -0.085106
								if( Typical_Price > 15.1851 )
									ret := -0.615385
						if( VIP_VIM > -0.274547 )
							if( Raw_Money_Flow <= 508177 )
								if( Positive_Money_Flow_Sum <= 5.57337e+06 )
									ret := 0.545894
								if( Positive_Money_Flow_Sum > 5.57337e+06 )
									ret := 0.083916
							if( Raw_Money_Flow > 508177 )
								if( Positive_Money_Flow_Sum <= 2.28695e+07 )
									ret := 0.058824
								if( Positive_Money_Flow_Sum > 2.28695e+07 )
									ret := -0.545455
	if( VIP_VIM > 0.166636 )
		if( MFI_Low <= 48.457 )
			if( Negative_Money_Flow <= 653.865 )
				if( Raw_Money_Flow <= 17193.4 )
					if( MFI_Low <= 20.8039 )
						if( Typical_Price <= 9.32968 )
							if( VIM <= 5.45272 )
								if( VIP <= 1.71313 )
									ret := 0.666667
								if( VIP > 1.71313 )
									ret := -0.042735
							if( VIM > 5.45272 )
								ret := 0.800000 // buy
						if( Typical_Price > 9.32968 )
							if( Raw_Money_Flow <= 9813.4 )
								if( Negative_Money_Flow_Sum <= 54880 )
									ret := -0.784615 // sell
								if( Negative_Money_Flow_Sum > 54880 )
									ret := -0.041401
							if( Raw_Money_Flow > 9813.4 )
								if( Typical_Price <= 10.69 )
									ret := -0.103448
								if( Typical_Price > 10.69 )
									ret := 0.375000
					if( MFI_Low > 20.8039 )
						if( Negative_Money_Flow_Sum <= 93239 )
							if( MFI_Low <= 46.8526 )
								if( MFI_Low <= 41.5609 )
									ret := -0.158895
								if( MFI_Low > 41.5609 )
									ret := -0.404762
							if( MFI_Low > 46.8526 )
								if( VIP_VIM <= 0.436253 )
									ret := 0.666667
								if( VIP_VIM > 0.436253 )
									ret := 0.017544
						if( Negative_Money_Flow_Sum > 93239 )
							if( MFI_High <= -16.3985 )
								if( Negative_Money_Flow_Sum <= 930585 )
									ret := -0.594315
								if( Negative_Money_Flow_Sum > 930585 )
									ret := 0.034483
							if( MFI_High > -16.3985 )
								if( VIM <= 0.953736 )
									ret := 0.636364
								if( VIM > 0.953736 )
									ret := -0.325000
				if( Raw_Money_Flow > 17193.4 )
					if( Negative_Money_Flow_Sum <= 1.11101e+07 )
						if( VIM <= 0.80654 )
							if( MFI_Low <= 35.0545 )
								if( Positive_Money_Flow_Sum <= 6.18095e+06 )
									ret := 0.111801
								if( Positive_Money_Flow_Sum > 6.18095e+06 )
									ret := -0.576923
							if( MFI_Low > 35.0545 )
								if( Positive_Money_Flow <= 198008 )
									ret := -0.108911
								if( Positive_Money_Flow > 198008 )
									ret := 0.187148
						if( VIM > 0.80654 )
							if( Raw_Money_Flow <= 3.05456e+06 )
								if( Money_Flow_Ratio <= 2.16634 )
									ret := 0.013556
								if( Money_Flow_Ratio > 2.16634 )
									ret := 0.708333 // buy
							if( Raw_Money_Flow > 3.05456e+06 )
								if( MFI_Low <= 44.0306 )
									ret := -0.611111
								if( MFI_Low > 44.0306 )
									ret := -0.962963 // sell
					if( Negative_Money_Flow_Sum > 1.11101e+07 )
						if( Positive_Money_Flow <= 7.32953e+06 )
							if( Typical_Price <= 16.5723 )
								if( MFI <= 15.4167 )
									ret := 0.000000
								if( MFI > 15.4167 )
									ret := -0.551495
							if( Typical_Price > 16.5723 )
								ret := 0.222222
						if( Positive_Money_Flow > 7.32953e+06 )
							ret := 0.588235
			if( Negative_Money_Flow > 653.865 )
				if( Raw_Money_Flow <= 21021.1 )
					if( VIP <= 2.96231 )
						if( Negative_Money_Flow_Sum <= 193548 )
							if( Raw_Money_Flow <= 11007.5 )
								if( Positive_Money_Flow <= 790.896 )
									ret := 0.029126
								if( Positive_Money_Flow > 790.896 )
									ret := 0.888889 // buy
							if( Raw_Money_Flow > 11007.5 )
								if( VIP_VIM <= 0.432974 )
									ret := 0.733333 // buy
								if( VIP_VIM > 0.432974 )
									ret := 0.270270
						if( Negative_Money_Flow_Sum > 193548 )
							if( MFI_High <= -18.5775 )
								if( Money_Flow_Ratio <= 0.760744 )
									ret := 0.062112
								if( Money_Flow_Ratio > 0.760744 )
									ret := -0.178218
							if( MFI_High > -18.5775 )
								if( Typical_Price <= 13.4338 )
									ret := -1.000000 // sell
								if( Typical_Price > 13.4338 )
									ret := -0.333333
					if( VIP > 2.96231 )
						if( MFI <= 48.0914 )
							if( VIP <= 10.3389 )
								if( VIM <= 2.55629 )
									ret := 0.000000
								if( VIM > 2.55629 )
									ret := 0.745342 // buy
							if( VIP > 10.3389 )
								if( MFI <= 30.1188 )
									ret := 0.909091 // buy
								if( MFI > 30.1188 )
									ret := 0.073171
						if( MFI > 48.0914 )
							if( Positive_Money_Flow_Sum <= 173846 )
								if( Negative_Money_Flow <= 3893.43 )
									ret := 0.541667
								if( Negative_Money_Flow > 3893.43 )
									ret := 0.138122
							if( Positive_Money_Flow_Sum > 173846 )
								if( MFI_Low <= 44.8845 )
									ret := -0.880000 // sell
								if( MFI_Low > 44.8845 )
									ret := 0.500000
				if( Raw_Money_Flow > 21021.1 )
					if( Positive_Money_Flow <= 3513.96 )
						if( VIM <= 1.77187 )
							if( Negative_Money_Flow_Sum <= 1.44253e+07 )
								if( MFI_High <= -31.9737 )
									ret := 0.151134
								if( MFI_High > -31.9737 )
									ret := -0.046189
							if( Negative_Money_Flow_Sum > 1.44253e+07 )
								if( MFI <= 54.4628 )
									ret := -0.109091
								if( MFI > 54.4628 )
									ret := 0.697987
						if( VIM > 1.77187 )
							if( Typical_Price <= 16.2403 )
								if( Negative_Money_Flow <= 24582.2 )
									ret := 0.257143
								if( Negative_Money_Flow > 24582.2 )
									ret := 0.635762
							if( Typical_Price > 16.2403 )
								ret := -0.214286
					if( Positive_Money_Flow > 3513.96 )
						if( Positive_Money_Flow <= 470974 )
							if( MFI_Low <= 26.8546 )
								if( Positive_Money_Flow_Sum <= 4.91268e+06 )
									ret := -0.575758
								if( Positive_Money_Flow_Sum > 4.91268e+06 )
									ret := -1.000000 // sell
							if( MFI_Low > 26.8546 )
								if( Raw_Money_Flow <= 379113 )
									ret := -0.046154
								if( Raw_Money_Flow > 379113 )
									ret := -0.703704 // sell
						if( Positive_Money_Flow > 470974 )
							if( VIP <= 1.21635 )
								if( Positive_Money_Flow <= 1.1351e+06 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow > 1.1351e+06 )
									ret := 0.818182 // buy
							if( VIP > 1.21635 )
								ret := 0.000000
		if( MFI_Low > 48.457 )
			if( Negative_Money_Flow_Sum <= 555891 )
				if( Raw_Money_Flow <= 9152.39 )
					if( Positive_Money_Flow <= 19.29 )
						if( MFI_High <= -11.1841 )
							if( Positive_Money_Flow_Sum <= 94520.2 )
								ret := -0.071429
							if( Positive_Money_Flow_Sum > 94520.2 )
								ret := -0.750000 // sell
						if( MFI_High > -11.1841 )
							if( Negative_Money_Flow <= 14.8862 )
								if( Money_Flow_Ratio <= 4.45405 )
									ret := 0.110092
								if( Money_Flow_Ratio > 4.45405 )
									ret := -0.270677
							if( Negative_Money_Flow > 14.8862 )
								if( MFI <= 79.3002 )
									ret := 0.371648
								if( MFI > 79.3002 )
									ret := 0.109290
					if( Positive_Money_Flow > 19.29 )
						if( Negative_Money_Flow <= 1384.68 )
							if( Positive_Money_Flow <= 1585.62 )
								if( Positive_Money_Flow_Sum <= 98031.9 )
									ret := -0.258427
								if( Positive_Money_Flow_Sum > 98031.9 )
									ret := -0.657534
							if( Positive_Money_Flow > 1585.62 )
								if( Money_Flow_Ratio <= 2.56434 )
									ret := -0.478261
								if( Money_Flow_Ratio > 2.56434 )
									ret := -0.096601
						if( Negative_Money_Flow > 1384.68 )
							if( VIP_VIM <= 0.980409 )
								if( Negative_Money_Flow_Sum <= 116093 )
									ret := 0.448276
								if( Negative_Money_Flow_Sum > 116093 )
									ret := -0.600000
							if( VIP_VIM > 0.980409 )
								if( Positive_Money_Flow_Sum <= 194117 )
									ret := 0.294118
								if( Positive_Money_Flow_Sum > 194117 )
									ret := -1.000000 // sell
				if( Raw_Money_Flow > 9152.39 )
					if( Positive_Money_Flow <= 30.9867 )
						if( VIM <= 1.12249 )
							if( Money_Flow_Ratio <= 10.5828 )
								if( Negative_Money_Flow_Sum <= 216031 )
									ret := -0.391608
								if( Negative_Money_Flow_Sum > 216031 )
									ret := -0.121951
							if( Money_Flow_Ratio > 10.5828 )
								if( Positive_Money_Flow_Sum <= 4.22529e+06 )
									ret := 0.536585
								if( Positive_Money_Flow_Sum > 4.22529e+06 )
									ret := -0.212121
						if( VIM > 1.12249 )
							if( VIP <= 2.09285 )
								if( VIM <= 1.45888 )
									ret := 0.343434
								if( VIM > 1.45888 )
									ret := 0.693878
							if( VIP > 2.09285 )
								if( VIP <= 8.01409 )
									ret := 0.000000
								if( VIP > 8.01409 )
									ret := -0.520833
					if( Positive_Money_Flow > 30.9867 )
						if( VIP <= 1.37609 )
							if( MFI_Low <= 61.2329 )
								if( Positive_Money_Flow <= 92762.1 )
									ret := -0.633663
								if( Positive_Money_Flow > 92762.1 )
									ret := -0.280992
							if( MFI_Low > 61.2329 )
								if( Positive_Money_Flow <= 917116 )
									ret := 0.050269
								if( Positive_Money_Flow > 917116 )
									ret := -0.514286
						if( VIP > 1.37609 )
							if( VIP_VIM <= 1.03273 )
								if( VIP <= 6.29757 )
									ret := -0.414944
								if( VIP > 6.29757 )
									ret := -0.046154
							if( VIP_VIM > 1.03273 )
								if( Positive_Money_Flow <= 111032 )
									ret := -0.559322
								if( Positive_Money_Flow > 111032 )
									ret := -0.827586 // sell
			if( Negative_Money_Flow_Sum > 555891 )
				if( Positive_Money_Flow <= 2.58324e+06 )
					if( Negative_Money_Flow_Sum <= 851848 )
						if( MFI_High <= 14.4496 )
							if( Positive_Money_Flow_Sum <= 7.46609e+06 )
								if( MFI_Low <= 50.1443 )
									ret := 0.430380
								if( MFI_Low > 50.1443 )
									ret := 0.083260
							if( Positive_Money_Flow_Sum > 7.46609e+06 )
								if( Money_Flow_Ratio <= 10.8372 )
									ret := 1.000000 // buy
								if( Money_Flow_Ratio > 10.8372 )
									ret := 0.288136
						if( MFI_High > 14.4496 )
							if( VIM <= 0.666258 )
								if( VIP_VIM <= 0.685842 )
									ret := -1.000000 // sell
								if( VIP_VIM > 0.685842 )
									ret := -0.600000
							if( VIM > 0.666258 )
								if( MFI <= 95.5494 )
									ret := 0.384615
								if( MFI > 95.5494 )
									ret := -0.636364
					if( Negative_Money_Flow_Sum > 851848 )
						if( MFI <= 90.3919 )
							if( MFI_High <= -2.22966 )
								if( MFI_High <= -2.63557 )
									ret := -0.122582
								if( MFI_High > -2.63557 )
									ret := -0.431818
							if( MFI_High > -2.22966 )
								if( VIP_VIM <= 0.30181 )
									ret := -0.242762
								if( VIP_VIM > 0.30181 )
									ret := -0.008597
						if( MFI > 90.3919 )
							if( VIP <= 1.17354 )
								ret := -0.700000 // sell
							if( VIP > 1.17354 )
								if( Raw_Money_Flow <= 502491 )
									ret := 0.031250
								if( Raw_Money_Flow > 502491 )
									ret := 0.747368 // buy
				if( Positive_Money_Flow > 2.58324e+06 )
					if( VIM <= 0.604318 )
						if( VIP <= 1.40615 )
							if( VIP <= 1.34411 )
								ret := -0.111111
							if( VIP > 1.34411 )
								if( Typical_Price <= 14.1892 )
									ret := 0.400000
								if( Typical_Price > 14.1892 )
									ret := 1.000000 // buy
						if( VIP > 1.40615 )
							if( Positive_Money_Flow <= 2.91836e+06 )
								ret := -1.000000 // sell
							if( Positive_Money_Flow > 2.91836e+06 )
								ret := -0.384615
					if( VIM > 0.604318 )
						if( VIP <= 1.0315 )
							ret := 0.818182 // buy
						if( VIP > 1.0315 )
							if( Negative_Money_Flow_Sum <= 5.14717e+06 )
								if( Positive_Money_Flow <= 4.19218e+06 )
									ret := -0.532374
								if( Positive_Money_Flow > 4.19218e+06 )
									ret := 0.415385
							if( Negative_Money_Flow_Sum > 5.14717e+06 )
								if( MFI_High <= -4.02849 )
									ret := -0.388889
								if( MFI_High > -4.02849 )
									ret := -0.723404 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

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


//CODE associated with the technical indicator L_Vortex_Indicator 
//@version=5
//indicator title = "Vortex Indicator", shorttitle="VI", format=format.price, precision=4, timeframe="", timeframe_gaps=true)
period_ = input.int(14, title="Length", minval=2)
VMP = math.sum( math.abs( high - low[1]), period_ )
VMM = math.sum( math.abs( low - high[1]), period_ )
STR = math.sum( ta.atr(1), period_ )
VIP = VMP / STR
VIM = VMM / STR

VIP_VIM = VIP - VIM

plot(VIP, title="VI +", color=#2962FF)
plot(VIM, title="VI -", color=#E91E63)
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
float op_operation = decision_tree_0_SNAP_1Min_79e4e201(Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow, VIP_VIM, VIM, VIP)

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


