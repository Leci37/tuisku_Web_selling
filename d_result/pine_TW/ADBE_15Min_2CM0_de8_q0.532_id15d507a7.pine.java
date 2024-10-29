//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Money_Flow_Index
// ID_model: ADBE_15Min_2CM0_15d507a7 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ADBE_15Min_2CM0_15d507a7", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ADBE_15Min_15d507a7(ad, mf, ad_mf, Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ad <= 1e-06 )
		if( Raw_Money_Flow <= 3.67367e+06 )
			if( Negative_Money_Flow <= 487.795 )
				if( Negative_Money_Flow_Sum <= 3.40935e+08 )
					if( Negative_Money_Flow_Sum <= 2.73668e+08 )
						if( Negative_Money_Flow_Sum <= 2.09483e+08 )
							if( Positive_Money_Flow_Sum <= 7.96446e+08 )
								if( Negative_Money_Flow_Sum <= 1.431e+06 )
									ret := 0.160991
								if( Negative_Money_Flow_Sum > 1.431e+06 )
									ret := -0.083029
							if( Positive_Money_Flow_Sum > 7.96446e+08 )
								if( Positive_Money_Flow_Sum <= 1.0513e+09 )
									ret := 0.398230
								if( Positive_Money_Flow_Sum > 1.0513e+09 )
									ret := 0.018519
						if( Negative_Money_Flow_Sum > 2.09483e+08 )
							if( Positive_Money_Flow_Sum <= 3.77981e+08 )
								if( MFI <= 54.165 )
									ret := 0.127500
								if( MFI > 54.165 )
									ret := 0.432836
							if( Positive_Money_Flow_Sum > 3.77981e+08 )
								if( Positive_Money_Flow_Sum <= 4.44423e+08 )
									ret := -0.545455
								if( Positive_Money_Flow_Sum > 4.44423e+08 )
									ret := 0.023077
					if( Negative_Money_Flow_Sum > 2.73668e+08 )
						if( mf <= 0.299619 )
							if( MFI_High <= -74.1415 )
								if( mf <= -0.153218 )
									ret := -0.105263
								if( mf > -0.153218 )
									ret := 0.888889 // buy
							if( MFI_High > -74.1415 )
								if( Positive_Money_Flow_Sum <= 2.57576e+07 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow_Sum > 2.57576e+07 )
									ret := -0.270089
						if( mf > 0.299619 )
							if( ad_mf <= -23.2078 )
								if( ad <= -473.788 )
									ret := 0.272727
								if( ad > -473.788 )
									ret := -0.928571 // sell
							if( ad_mf > -23.2078 )
								if( Positive_Money_Flow <= 141028 )
									ret := 0.489796
								if( Positive_Money_Flow > 141028 )
									ret := -0.461538
				if( Negative_Money_Flow_Sum > 3.40935e+08 )
					if( Negative_Money_Flow_Sum <= 4.57512e+08 )
						if( Positive_Money_Flow_Sum <= 3.34816e+06 )
							if( mf <= -0.412186 )
								ret := 0.333333
							if( mf > -0.412186 )
								if( mf <= -0.092149 )
									ret := 0.947368 // buy
								if( mf > -0.092149 )
									ret := 0.600000
						if( Positive_Money_Flow_Sum > 3.34816e+06 )
							if( Typical_Price <= 298.807 )
								if( Positive_Money_Flow_Sum <= 4.04264e+07 )
									ret := -0.461538
								if( Positive_Money_Flow_Sum > 4.04264e+07 )
									ret := 0.101449
							if( Typical_Price > 298.807 )
								if( Typical_Price <= 496.692 )
									ret := 0.270742
								if( Typical_Price > 496.692 )
									ret := 0.000000
					if( Negative_Money_Flow_Sum > 4.57512e+08 )
						if( MFI_Low <= -11.4839 )
							if( Negative_Money_Flow_Sum <= 7.46109e+08 )
								if( mf <= -0.606482 )
									ret := 0.384615
								if( mf > -0.606482 )
									ret := -0.368000
							if( Negative_Money_Flow_Sum > 7.46109e+08 )
								if( MFI_Low <= -17.707 )
									ret := 0.833333 // buy
								if( MFI_Low > -17.707 )
									ret := -0.200000
						if( MFI_Low > -11.4839 )
							if( mf <= 0.16068 )
								if( mf <= -0.850953 )
									ret := -1.000000 // sell
								if( mf > -0.850953 )
									ret := 0.060393
							if( mf > 0.16068 )
								if( MFI_High <= -70.0168 )
									ret := 0.750000 // buy
								if( MFI_High > -70.0168 )
									ret := -0.137931
			if( Negative_Money_Flow > 487.795 )
				if( MFI <= 74.2926 )
					if( Typical_Price <= 515.686 )
						if( Positive_Money_Flow_Sum <= 7.04107e+07 )
							if( Negative_Money_Flow_Sum <= 4.35381e+08 )
								if( MFI_Low <= -18.8822 )
									ret := 0.517442
								if( MFI_Low > -18.8822 )
									ret := 0.173936
							if( Negative_Money_Flow_Sum > 4.35381e+08 )
								if( ad_mf <= -0.542355 )
									ret := -0.269565
								if( ad_mf > -0.542355 )
									ret := 0.101064
						if( Positive_Money_Flow_Sum > 7.04107e+07 )
							if( mf <= 0.426631 )
								if( MFI <= 15.425 )
									ret := 0.600917
								if( MFI > 15.425 )
									ret := 0.309109
							if( mf > 0.426631 )
								if( Negative_Money_Flow_Sum <= 7.44636e+08 )
									ret := 0.120000
								if( Negative_Money_Flow_Sum > 7.44636e+08 )
									ret := -0.842105 // sell
					if( Typical_Price > 515.686 )
						if( mf <= 0.518879 )
							if( Negative_Money_Flow_Sum <= 3.21744e+07 )
								if( Negative_Money_Flow_Sum <= 3.5869e+06 )
									ret := 0.254902
								if( Negative_Money_Flow_Sum > 3.5869e+06 )
									ret := -0.330827
							if( Negative_Money_Flow_Sum > 3.21744e+07 )
								if( MFI <= 0.110392 )
									ret := -0.909091 // sell
								if( MFI > 0.110392 )
									ret := 0.176050
						if( mf > 0.518879 )
							if( ad_mf <= -0.817936 )
								if( Positive_Money_Flow_Sum <= 1.21218e+08 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow_Sum > 1.21218e+08 )
									ret := -0.375000
							if( ad_mf > -0.817936 )
								if( Positive_Money_Flow_Sum <= 2.99202e+08 )
									ret := 0.363636
								if( Positive_Money_Flow_Sum > 2.99202e+08 )
									ret := -0.600000
				if( MFI > 74.2926 )
					if( Typical_Price <= 245.346 )
						if( MFI_High <= -3.10647 )
							if( mf <= 0.166098 )
								if( MFI_High <= -4.44812 )
									ret := 0.500000
								if( MFI_High > -4.44812 )
									ret := -0.187500
							if( mf > 0.166098 )
								if( Raw_Money_Flow <= 104399 )
									ret := -1.000000 // sell
								if( Raw_Money_Flow > 104399 )
									ret := 0.000000
						if( MFI_High > -3.10647 )
							if( MFI <= 85.3227 )
								if( Positive_Money_Flow_Sum <= 2.68527e+08 )
									ret := 0.119565
								if( Positive_Money_Flow_Sum > 2.68527e+08 )
									ret := 0.766667 // buy
							if( MFI > 85.3227 )
								if( Raw_Money_Flow <= 927920 )
									ret := 0.573770
								if( Raw_Money_Flow > 927920 )
									ret := 0.111111
					if( Typical_Price > 245.346 )
						if( Positive_Money_Flow <= 960195 )
							if( ad <= -2798.37 )
								if( MFI <= 92.4755 )
									ret := -0.061538
								if( MFI > 92.4755 )
									ret := -0.675000
							if( ad > -2798.37 )
								if( Negative_Money_Flow_Sum <= 2.48511e+08 )
									ret := 0.111602
								if( Negative_Money_Flow_Sum > 2.48511e+08 )
									ret := -0.350877
						if( Positive_Money_Flow > 960195 )
							if( Typical_Price <= 350.233 )
								if( MFI <= 86.8547 )
									ret := -0.714286 // sell
								if( MFI > 86.8547 )
									ret := 1.000000 // buy
							if( Typical_Price > 350.233 )
								if( MFI_High <= 17.4144 )
									ret := 1.000000 // buy
								if( MFI_High > 17.4144 )
									ret := 0.555556
		if( Raw_Money_Flow > 3.67367e+06 )
			if( ad <= -258774 )
				if( Positive_Money_Flow_Sum <= 6.62144e+07 )
					if( Negative_Money_Flow <= 1.57256e+08 )
						if( mf <= -0.463317 )
							if( Positive_Money_Flow_Sum <= 7.89161e+06 )
								if( ad_mf <= -280481 )
									ret := 0.857143 // buy
								if( ad_mf > -280481 )
									ret := 0.400000
							if( Positive_Money_Flow_Sum > 7.89161e+06 )
								ret := 0.000000
						if( mf > -0.463317 )
							if( Negative_Money_Flow <= 1.46188e+08 )
								if( MFI_Low <= -5.68826 )
									ret := -0.629630
								if( MFI_Low > -5.68826 )
									ret := 0.156250
							if( Negative_Money_Flow > 1.46188e+08 )
								if( Positive_Money_Flow_Sum <= 5.08333e+07 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow_Sum > 5.08333e+07 )
									ret := 0.500000
					if( Negative_Money_Flow > 1.57256e+08 )
						if( Negative_Money_Flow_Sum <= 1.06886e+09 )
							if( Typical_Price <= 432.448 )
								if( mf <= -0.462551 )
									ret := -0.333333
								if( mf > -0.462551 )
									ret := 0.541667
							if( Typical_Price > 432.448 )
								if( Negative_Money_Flow_Sum <= 3.34529e+08 )
									ret := -0.178571
								if( Negative_Money_Flow_Sum > 3.34529e+08 )
									ret := -0.816327 // sell
						if( Negative_Money_Flow_Sum > 1.06886e+09 )
							if( Negative_Money_Flow <= 4.82253e+08 )
								if( MFI <= 3.54611 )
									ret := 1.000000 // buy
								if( MFI > 3.54611 )
									ret := 0.750000 // buy
							if( Negative_Money_Flow > 4.82253e+08 )
								ret := -1.000000 // sell
				if( Positive_Money_Flow_Sum > 6.62144e+07 )
					if( Negative_Money_Flow_Sum <= 1.24048e+09 )
						if( Negative_Money_Flow_Sum <= 8.43375e+07 )
							if( mf <= 0.23765 )
								if( Raw_Money_Flow <= 3.7812e+08 )
									ret := -0.268293
								if( Raw_Money_Flow > 3.7812e+08 )
									ret := 0.500000
							if( mf > 0.23765 )
								ret := 0.500000
						if( Negative_Money_Flow_Sum > 8.43375e+07 )
							if( Negative_Money_Flow_Sum <= 1.68545e+08 )
								if( Negative_Money_Flow_Sum <= 1.24597e+08 )
									ret := 0.269841
								if( Negative_Money_Flow_Sum > 1.24597e+08 )
									ret := 0.637255
							if( Negative_Money_Flow_Sum > 1.68545e+08 )
								if( Raw_Money_Flow <= 1.12027e+08 )
									ret := -0.037037
								if( Raw_Money_Flow > 1.12027e+08 )
									ret := 0.338569
					if( Negative_Money_Flow_Sum > 1.24048e+09 )
						if( Money_Flow_Ratio <= 0.30332 )
							if( Typical_Price <= 585.842 )
								if( Raw_Money_Flow <= 1.35107e+09 )
									ret := 0.227273
								if( Raw_Money_Flow > 1.35107e+09 )
									ret := -0.750000 // sell
							if( Typical_Price > 585.842 )
								ret := 1.000000 // buy
						if( Money_Flow_Ratio > 0.30332 )
							if( Positive_Money_Flow <= 4.89388e+07 )
								if( MFI_Low <= 21.37 )
									ret := 0.000000
								if( MFI_Low > 21.37 )
									ret := -0.750000 // sell
							if( Positive_Money_Flow > 4.89388e+07 )
								if( Money_Flow_Ratio <= 0.55459 )
									ret := -1.000000 // sell
								if( Money_Flow_Ratio > 0.55459 )
									ret := -0.750000 // sell
			if( ad > -258774 )
				if( Negative_Money_Flow_Sum <= 2.11555e+08 )
					if( Positive_Money_Flow_Sum <= 1.11258e+09 )
						if( Money_Flow_Ratio <= 109.254 )
							if( Raw_Money_Flow <= 1.50396e+08 )
								if( Raw_Money_Flow <= 1.23118e+08 )
									ret := 0.060079
								if( Raw_Money_Flow > 1.23118e+08 )
									ret := -0.259259
							if( Raw_Money_Flow > 1.50396e+08 )
								if( Raw_Money_Flow <= 1.58301e+08 )
									ret := 0.695652
								if( Raw_Money_Flow > 1.58301e+08 )
									ret := 0.196970
						if( Money_Flow_Ratio > 109.254 )
							if( Raw_Money_Flow <= 5.38168e+07 )
								if( ad_mf <= -27803.4 )
									ret := 0.342857
								if( ad_mf > -27803.4 )
									ret := -0.211268
							if( Raw_Money_Flow > 5.38168e+07 )
								if( Positive_Money_Flow_Sum <= 2.41919e+08 )
									ret := 0.083333
								if( Positive_Money_Flow_Sum > 2.41919e+08 )
									ret := -0.651163
					if( Positive_Money_Flow_Sum > 1.11258e+09 )
						if( Typical_Price <= 466.354 )
							ret := -1.000000 // sell
						if( Typical_Price > 466.354 )
							ret := -0.571429
				if( Negative_Money_Flow_Sum > 2.11555e+08 )
					if( Typical_Price <= 285.606 )
						if( Money_Flow_Ratio <= 0.795706 )
							if( Positive_Money_Flow_Sum <= 4.02298e+07 )
								if( Positive_Money_Flow_Sum <= 2.37043e+07 )
									ret := -0.015504
								if( Positive_Money_Flow_Sum > 2.37043e+07 )
									ret := -0.482456
							if( Positive_Money_Flow_Sum > 4.02298e+07 )
								if( Positive_Money_Flow <= 2.5388e+07 )
									ret := -0.017804
								if( Positive_Money_Flow > 2.5388e+07 )
									ret := 0.287356
						if( Money_Flow_Ratio > 0.795706 )
							if( mf <= 0.102835 )
								if( ad_mf <= -177500 )
									ret := 0.300000
								if( ad_mf > -177500 )
									ret := -0.443787
							if( mf > 0.102835 )
								if( Positive_Money_Flow_Sum <= 6.91084e+08 )
									ret := 0.157895
								if( Positive_Money_Flow_Sum > 6.91084e+08 )
									ret := -0.800000 // sell
					if( Typical_Price > 285.606 )
						if( Money_Flow_Ratio <= 5.01068 )
							if( mf <= -0.023034 )
								if( Positive_Money_Flow_Sum <= 1.784e+08 )
									ret := 0.055141
								if( Positive_Money_Flow_Sum > 1.784e+08 )
									ret := -0.053290
							if( mf > -0.023034 )
								if( Positive_Money_Flow_Sum <= 1.34771e+09 )
									ret := 0.055570
								if( Positive_Money_Flow_Sum > 1.34771e+09 )
									ret := 0.750000 // buy
						if( Money_Flow_Ratio > 5.01068 )
							if( Typical_Price <= 390.005 )
								ret := 0.000000
							if( Typical_Price > 390.005 )
								ret := -1.000000 // sell
	if( ad > 1e-06 )
		if( Negative_Money_Flow_Sum <= 2.95397e+08 )
			if( Money_Flow_Ratio <= 5.03827 )
				if( Positive_Money_Flow <= 1.05662e+08 )
					if( Positive_Money_Flow_Sum <= 2.76042e+08 )
						if( Negative_Money_Flow <= 1.43829e+07 )
							if( Negative_Money_Flow_Sum <= 419016 )
								ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 419016 )
								if( Positive_Money_Flow <= 1.53615e+06 )
									ret := -0.028584
								if( Positive_Money_Flow > 1.53615e+06 )
									ret := 0.037987
						if( Negative_Money_Flow > 1.43829e+07 )
							if( Positive_Money_Flow_Sum <= 435031 )
								if( ad <= 109910 )
									ret := -0.800000 // sell
								if( ad > 109910 )
									ret := 0.250000
							if( Positive_Money_Flow_Sum > 435031 )
								if( Positive_Money_Flow_Sum <= 1.67911e+06 )
									ret := 0.447154
								if( Positive_Money_Flow_Sum > 1.67911e+06 )
									ret := 0.102151
					if( Positive_Money_Flow_Sum > 2.76042e+08 )
						if( mf <= -0.040245 )
							if( Typical_Price <= 466.241 )
								if( Negative_Money_Flow_Sum <= 9.44396e+07 )
									ret := 0.500000
								if( Negative_Money_Flow_Sum > 9.44396e+07 )
									ret := -0.188525
							if( Typical_Price > 466.241 )
								if( Negative_Money_Flow_Sum <= 2.79156e+08 )
									ret := 0.132075
								if( Negative_Money_Flow_Sum > 2.79156e+08 )
									ret := -0.652174
						if( mf > -0.040245 )
							if( Typical_Price <= 428.558 )
								if( Negative_Money_Flow <= 3.53674e+06 )
									ret := 0.276832
								if( Negative_Money_Flow > 3.53674e+06 )
									ret := -0.002985
							if( Typical_Price > 428.558 )
								if( MFI_Low <= 30.2021 )
									ret := 0.882353 // buy
								if( MFI_Low > 30.2021 )
									ret := 0.079245
				if( Positive_Money_Flow > 1.05662e+08 )
					if( Negative_Money_Flow_Sum <= 2.49767e+08 )
						if( Positive_Money_Flow_Sum <= 2.55956e+08 )
							if( Positive_Money_Flow <= 1.22803e+08 )
								if( Raw_Money_Flow <= 1.14298e+08 )
									ret := 0.055556
								if( Raw_Money_Flow > 1.14298e+08 )
									ret := 0.652174
							if( Positive_Money_Flow > 1.22803e+08 )
								if( MFI_Low <= 29.7472 )
									ret := -0.900000 // sell
								if( MFI_Low > 29.7472 )
									ret := -0.062500
						if( Positive_Money_Flow_Sum > 2.55956e+08 )
							if( Positive_Money_Flow_Sum <= 5.01433e+08 )
								if( Typical_Price <= 217.34 )
									ret := 0.333333
								if( Typical_Price > 217.34 )
									ret := -0.368732
							if( Positive_Money_Flow_Sum > 5.01433e+08 )
								if( MFI <= 79.8178 )
									ret := 0.158730
								if( MFI > 79.8178 )
									ret := -0.441176
					if( Negative_Money_Flow_Sum > 2.49767e+08 )
						if( mf <= 0.4701 )
							if( MFI_High <= -8.80634 )
								if( MFI <= 55.4022 )
									ret := 0.227273
								if( MFI > 55.4022 )
									ret := 0.591837
							if( MFI_High > -8.80634 )
								if( mf <= 0.387634 )
									ret := -0.333333
								if( mf > 0.387634 )
									ret := 0.600000
						if( mf > 0.4701 )
							ret := -0.500000
			if( Money_Flow_Ratio > 5.03827 )
				if( Money_Flow_Ratio <= 1531.1 )
					if( Negative_Money_Flow_Sum <= 403562 )
						if( mf <= 0.219703 )
							if( Positive_Money_Flow_Sum <= 3.79077e+06 )
								ret := 0.833333 // buy
							if( Positive_Money_Flow_Sum > 3.79077e+06 )
								if( Negative_Money_Flow_Sum <= 311918 )
									ret := -0.384615
								if( Negative_Money_Flow_Sum > 311918 )
									ret := 0.166667
						if( mf > 0.219703 )
							if( Positive_Money_Flow_Sum <= 9.75973e+07 )
								if( MFI_High <= 10.3133 )
									ret := 0.500000
								if( MFI_High > 10.3133 )
									ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 9.75973e+07 )
								if( mf <= 0.331812 )
									ret := 0.777778 // buy
								if( mf > 0.331812 )
									ret := -0.166667
					if( Negative_Money_Flow_Sum > 403562 )
						if( Raw_Money_Flow <= 2.22793e+07 )
							if( Negative_Money_Flow_Sum <= 4.53508e+07 )
								if( Raw_Money_Flow <= 562398 )
									ret := 0.074503
								if( Raw_Money_Flow > 562398 )
									ret := -0.143192
							if( Negative_Money_Flow_Sum > 4.53508e+07 )
								if( Positive_Money_Flow_Sum <= 6.77809e+08 )
									ret := -0.410989
								if( Positive_Money_Flow_Sum > 6.77809e+08 )
									ret := 0.040541
						if( Raw_Money_Flow > 2.22793e+07 )
							if( ad_mf <= 8259.24 )
								if( mf <= 0.411428 )
									ret := 0.383721
								if( mf > 0.411428 )
									ret := -0.166667
							if( ad_mf > 8259.24 )
								if( Raw_Money_Flow <= 3.79201e+07 )
									ret := 0.106383
								if( Raw_Money_Flow > 3.79201e+07 )
									ret := -0.080422
				if( Money_Flow_Ratio > 1531.1 )
					if( Typical_Price <= 335.694 )
						if( mf <= 0.366091 )
							if( MFI_High <= 19.9629 )
								ret := 1.000000 // buy
							if( MFI_High > 19.9629 )
								ret := 0.500000
						if( mf > 0.366091 )
							if( MFI <= 99.9439 )
								ret := 0.750000 // buy
							if( MFI > 99.9439 )
								ret := 0.000000
					if( Typical_Price > 335.694 )
						if( MFI <= 99.6188 )
							ret := 1.000000 // buy
						if( MFI > 99.6188 )
							if( Negative_Money_Flow_Sum <= 470880 )
								if( MFI_High <= 19.9486 )
									ret := 0.750000 // buy
								if( MFI_High > 19.9486 )
									ret := -0.272727
							if( Negative_Money_Flow_Sum > 470880 )
								ret := -0.750000 // sell
		if( Negative_Money_Flow_Sum > 2.95397e+08 )
			if( mf <= -0.066307 )
				if( Negative_Money_Flow_Sum <= 3.94853e+08 )
					if( Typical_Price <= 357.192 )
						if( Positive_Money_Flow <= 26.3061 )
							if( ad <= 42788.9 )
								if( ad <= 6215.8 )
									ret := -0.207547
								if( ad > 6215.8 )
									ret := 0.385714
							if( ad > 42788.9 )
								if( ad <= 145867 )
									ret := -0.606061
								if( ad > 145867 )
									ret := 0.222222
						if( Positive_Money_Flow > 26.3061 )
							if( Positive_Money_Flow <= 6.11952e+07 )
								if( Typical_Price <= 258.402 )
									ret := -0.213592
								if( Typical_Price > 258.402 )
									ret := -0.502392
							if( Positive_Money_Flow > 6.11952e+07 )
								if( Positive_Money_Flow <= 8.46386e+07 )
									ret := 0.733333 // buy
								if( Positive_Money_Flow > 8.46386e+07 )
									ret := -0.375000
					if( Typical_Price > 357.192 )
						if( Positive_Money_Flow_Sum <= 1.10735e+08 )
							if( Positive_Money_Flow <= 6.79695e+07 )
								if( Money_Flow_Ratio <= 0.075612 )
									ret := 0.180556
								if( Money_Flow_Ratio > 0.075612 )
									ret := -0.291498
							if( Positive_Money_Flow > 6.79695e+07 )
								if( Raw_Money_Flow <= 7.32626e+07 )
									ret := 1.000000 // buy
								if( Raw_Money_Flow > 7.32626e+07 )
									ret := 0.750000 // buy
						if( Positive_Money_Flow_Sum > 1.10735e+08 )
							if( Positive_Money_Flow_Sum <= 1.40714e+08 )
								if( mf <= -0.112101 )
									ret := 0.360000
								if( mf > -0.112101 )
									ret := 0.750000 // buy
							if( Positive_Money_Flow_Sum > 1.40714e+08 )
								if( MFI_Low <= 9.11621 )
									ret := -0.636364
								if( MFI_Low > 9.11621 )
									ret := 0.065574
				if( Negative_Money_Flow_Sum > 3.94853e+08 )
					if( Typical_Price <= 475.247 )
						if( Negative_Money_Flow_Sum <= 2.80329e+09 )
							if( Negative_Money_Flow_Sum <= 7.52145e+08 )
								if( Positive_Money_Flow <= 9.13192e+07 )
									ret := 0.164076
								if( Positive_Money_Flow > 9.13192e+07 )
									ret := 0.538462
							if( Negative_Money_Flow_Sum > 7.52145e+08 )
								if( Negative_Money_Flow <= 2.50527e+07 )
									ret := -0.011834
								if( Negative_Money_Flow > 2.50527e+07 )
									ret := -0.531915
						if( Negative_Money_Flow_Sum > 2.80329e+09 )
							if( Positive_Money_Flow <= 1.73622e+08 )
								if( Positive_Money_Flow_Sum <= 1.55968e+08 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow_Sum > 1.55968e+08 )
									ret := 0.750000 // buy
							if( Positive_Money_Flow > 1.73622e+08 )
								ret := 0.250000
					if( Typical_Price > 475.247 )
						if( Negative_Money_Flow_Sum <= 5.87291e+08 )
							if( mf <= -0.405395 )
								if( ad <= 1286.53 )
									ret := -0.038462
								if( ad > 1286.53 )
									ret := 0.583333
							if( mf > -0.405395 )
								if( Negative_Money_Flow_Sum <= 5.01184e+08 )
									ret := -0.122112
								if( Negative_Money_Flow_Sum > 5.01184e+08 )
									ret := 0.277228
						if( Negative_Money_Flow_Sum > 5.87291e+08 )
							if( MFI_Low <= 6.29446 )
								if( mf <= -0.392777 )
									ret := 0.070000
								if( mf > -0.392777 )
									ret := -0.336283
							if( MFI_Low > 6.29446 )
								if( Positive_Money_Flow <= 1.20194e+08 )
									ret := 0.227586
								if( Positive_Money_Flow > 1.20194e+08 )
									ret := -0.636364
			if( mf > -0.066307 )
				if( Negative_Money_Flow_Sum <= 1.641e+09 )
					if( MFI <= 15.0443 )
						if( Raw_Money_Flow <= 129080 )
							if( Negative_Money_Flow_Sum <= 5.23615e+08 )
								if( mf <= 0.415418 )
									ret := 0.814815 // buy
								if( mf > 0.415418 )
									ret := -0.250000
							if( Negative_Money_Flow_Sum > 5.23615e+08 )
								if( Typical_Price <= 380.551 )
									ret := 0.800000 // buy
								if( Typical_Price > 380.551 )
									ret := -1.000000 // sell
						if( Raw_Money_Flow > 129080 )
							if( Positive_Money_Flow_Sum <= 1.73855e+07 )
								if( Negative_Money_Flow_Sum <= 3.2183e+08 )
									ret := 0.923077 // buy
								if( Negative_Money_Flow_Sum > 3.2183e+08 )
									ret := -0.143836
							if( Positive_Money_Flow_Sum > 1.73855e+07 )
								if( Typical_Price <= 564.044 )
									ret := -0.405685
								if( Typical_Price > 564.044 )
									ret := -0.047059
					if( MFI > 15.0443 )
						if( MFI_High <= -57.4 )
							if( Raw_Money_Flow <= 497358 )
								if( Typical_Price <= 496.016 )
									ret := -0.083333
								if( Typical_Price > 496.016 )
									ret := -0.740741 // sell
							if( Raw_Money_Flow > 497358 )
								if( Positive_Money_Flow <= 4.48804e+07 )
									ret := 0.156627
								if( Positive_Money_Flow > 4.48804e+07 )
									ret := 0.687500
						if( MFI_High > -57.4 )
							if( Positive_Money_Flow_Sum <= 4.3151e+08 )
								if( Money_Flow_Ratio <= 0.99028 )
									ret := -0.110123
								if( Money_Flow_Ratio > 0.99028 )
									ret := -0.378788
							if( Positive_Money_Flow_Sum > 4.3151e+08 )
								if( Typical_Price <= 520.654 )
									ret := 0.096599
								if( Typical_Price > 520.654 )
									ret := -0.205882
				if( Negative_Money_Flow_Sum > 1.641e+09 )
					if( Typical_Price <= 512.889 )
						if( ad <= 302573 )
							if( ad <= 933.021 )
								ret := -0.750000 // sell
							if( ad > 933.021 )
								ret := -1.000000 // sell
						if( ad > 302573 )
							ret := -0.500000
					if( Typical_Price > 512.889 )
						if( ad_mf <= 194242 )
							if( Positive_Money_Flow <= 129757 )
								ret := -0.250000
							if( Positive_Money_Flow > 129757 )
								if( Raw_Money_Flow <= 1.4424e+08 )
									ret := -1.000000 // sell
								if( Raw_Money_Flow > 1.4424e+08 )
									ret := -0.750000 // sell
						if( ad_mf > 194242 )
							ret := 0.000000
	
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
float op_operation = decision_tree_0_ADBE_15Min_15d507a7(ad, mf, ad_mf, Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)

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


